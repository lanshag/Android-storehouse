package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;
import com.example.login.Work.adapter.MyAdapter;
import com.example.login.Work.entity.Entity;
import com.example.login.Work.view.IReflashListener;

import java.util.ArrayList;

public class MemorandumActivity extends Activity implements IReflashListener {

    private ImageView mBack;

    ArrayList<Entity> reflash_apk_list = new ArrayList<Entity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorandum);

        mBack=findViewById(R.id.memorandum_left);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MemorandumActivity.this,WorkActivity.class);
                startActivity(intent);
                finish();
            }
        });
        setData();
        showReflashListView(reflash_apk_list);
    }
    MyAdapter reflash_adapter;
    com.example.login.Work.view.ReflashListView reflash_listview;
    public void showReflashListView(ArrayList<Entity> apk_list) {
        if (reflash_adapter == null) {
            reflash_listview = (com.example.login.Work.view.ReflashListView) findViewById(R.id.reflash_listview);
            reflash_listview.setInterface(this);
            reflash_adapter = new MyAdapter(this, apk_list);
            reflash_listview.setAdapter(reflash_adapter);
        } else {
            reflash_adapter.onDateChange(apk_list);
        }
    }

    public void setData() {
        for (int i = 0; i < 10; i++) {
            Entity entity = new Entity();
            entity.setName("下拉刷新");
            entity.setInfo("50w次测试");
            entity.setDes("测试好难！");
            reflash_apk_list.add(entity);
        }
    }

    private void setReflashData() {
        for (int i = 0; i < 2; i++) {
            Entity entity = new Entity();
            entity.setName("更多");
            entity.setInfo("50w次测试");
            entity.setDes("这是一个无聊的课设！");
            reflash_apk_list.add(0,entity);
        }
    }

    @Override
    public void onReflash() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //获取更多数据
                setReflashData();
                // 下拉
                showReflashListView(reflash_apk_list);
                //通知listview加载完毕
                reflash_listview.reflashComplete();
            }
        }, 2000);
    }




}

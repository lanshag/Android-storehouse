package com.example.login.Party_building;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.login.DBUtils;
import com.example.login.R;

import java.util.HashMap;

public class DangyuanxinxiActivity extends AppCompatActivity {
    private Button btn_01,btn_001;
    private EditText edText0;
    private EditText cxText;
    private EditText edText01;
    private EditText edText02;
    private EditText edText03;
    private Button btn_get_data;
    private TextView tv_data;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what){
                case 0x11:
                    String s = (String) msg.obj;
                    tv_data.setText(s);
                    break;
                case 0x12:
                    String ss = (String) msg.obj;
                    tv_data.setText(ss);
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangyuanxinxi);
        btn_get_data = findViewById(R.id.btn_get_data);
        tv_data = findViewById(R.id.tv_data);
        btn_01=findViewById(R.id.btn_01);
        btn_001=findViewById(R.id.btn_001);
        cxText=findViewById(R.id.cx_01);
        setListener();


    }

    private void setListener() {

        // 按钮点击事件
        btn_get_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cxText=findViewById(R.id.cx_01);
                final String vid;
                vid=cxText.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        HashMap<String, Object> map = DBUtils.getInfoByName(vid);
                        Message message = handler.obtainMessage();
                        if(map != null){
                            String s = "";
                            for (String key : map.keySet()) {
                                s += key + ":" + map.get(key) + "\n";
                            }
                message.what = 0x12;
                message.obj = s;
            }else {
                message.what = 0x11;
                message.obj = "查询结果为空";
            }
            // 发消息通知主线程更新UI
                        handler.sendMessage(message);
        }
    }).start();

            }
        });
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edText0 = findViewById(R.id.et_01);
                final String vid;
                vid= edText0.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        DBUtils.delUserData(vid);
                    }
                }).start();

            }
        });
        btn_001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edText01 = findViewById(R.id.ets_01);
                edText02 = findViewById(R.id.ets_02);
                edText03 = findViewById(R.id.ets_03);
                final String vid;
                vid= edText01.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        HashMap<String, Object> n;
                        DBUtils.delUserData(vid);
                    }
                }).start();

            }
        });

    }
}

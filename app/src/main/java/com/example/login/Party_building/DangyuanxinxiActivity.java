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
    private Button btn_01,btn_001,btn_002;
    private EditText edText0;
    private EditText cxText;
    private EditText edText01;
    private EditText edText02;
    private EditText edText03;
    private EditText edText04;
    private EditText edText05;
    private EditText edText06;
    private EditText edText07;
    private EditText edText08;
    private EditText edText09;
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
        btn_002=findViewById(R.id.btn_002);
        setListener();


    }

    private void setListener() {

        // 按钮点击事件
        btn_get_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数据查询
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
            //数据删除
            @Override
            public void onClick(View v) {
                edText0 = findViewById(R.id.et_01);
                final String vid;
                final Message message = handler.obtainMessage();
                vid= edText0.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String s="操作成功";
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        message.what = 0x12;
                        message.obj = s;
                        DBUtils.delUserData(vid);
                        handler.sendMessage(message);
                    }
                }).start();

            }
        });
        btn_001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数据增加
                edText01 = findViewById(R.id.ets_01);
                edText02 = findViewById(R.id.ets_02);
                edText03 = findViewById(R.id.ets_03);
                edText04 = findViewById(R.id.ets_04);
                edText05 = findViewById(R.id.ets_05);
                edText06 = findViewById(R.id.ets_06);
                edText07 = findViewById(R.id.ets_07);
                edText08 = findViewById(R.id.ets_08);
                edText09 = findViewById(R.id.ets_09);
                final String vid,aid,vname,sex,nativeplace,nation,edulevel,idcard,hhdidcard;
                final Message message = handler.obtainMessage();
                vid= edText01.getText().toString();
                aid= edText02.getText().toString();
                vname= edText03.getText().toString();
                sex=edText04.getText().toString();
                nativeplace=edText05.getText().toString();
                nation=edText06.getText().toString();
                edulevel=edText07.getText().toString();
               idcard=edText08.getText().toString();
                hhdidcard=edText09.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        String s="操作成功";
                        message.what = 0x12;
                        message.obj = s;
                        DBUtils.CreaseData(vid,aid,vname,sex,nativeplace,nation,edulevel,idcard,hhdidcard);
                        handler.sendMessage(message);
                    }
                }).start();

            }
        });
        btn_002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数据更新
                edText01 = findViewById(R.id.ets_01);
                edText02 = findViewById(R.id.ets_02);
                edText03 = findViewById(R.id.ets_03);
                edText04 = findViewById(R.id.ets_04);
                edText05 = findViewById(R.id.ets_05);
                edText06 = findViewById(R.id.ets_06);
                edText07 = findViewById(R.id.ets_07);
                edText08 = findViewById(R.id.ets_08);
                edText09 = findViewById(R.id.ets_09);
                final String vid,aid,vname,sex,nativeplace,nation,edulevel,idcard,hhdidcard;
                final Message message = handler.obtainMessage();
                vid= edText01.getText().toString();
                aid= edText02.getText().toString();
                vname= edText03.getText().toString();
                sex=edText04.getText().toString();
                nativeplace=edText05.getText().toString();
                nation=edText06.getText().toString();
                edulevel=edText07.getText().toString();
                idcard=edText08.getText().toString();
                hhdidcard=edText09.getText().toString();
                // 创建一个线程来连接数据库并获取数据库中对应表的数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // 调用数据库工具类DBUtils的getInfoByName方法获取数据库表中数据
                        String s="操作成功";
                        message.what = 0x12;
                        message.obj = s;
                        DBUtils.UpdData(vid,aid,vname,sex,nativeplace,nation,edulevel,idcard,hhdidcard);
                        handler.sendMessage(message);
                    }
                }).start();

            }
        });

    }
}

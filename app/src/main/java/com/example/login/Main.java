package com.example.login;
import android.os.Handler;
import android.os.Message;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.a;

import java.util.HashMap;
public class Main extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message message) {
            ((TextView)findViewById(R.id.tv_result)).setText((String)message.obj);
            String str = "查询不存在";
            if(message.what == 1) str = "查询成功";
            Toast.makeText(Main.this, str, Toast.LENGTH_SHORT).show();
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_name = findViewById(R.id.et_name);
        (findViewById(R.id.btn_01)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = et_name.getText().toString().trim();
                Log.e(TAG, name);
                if(name == null || name.equals("")) {
                    Toast.makeText(Main.this,"输入不能为空",Toast.LENGTH_SHORT).show();
                }
                else {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            TextView tv_result = findViewById(R.id.tv_result);
                            HashMap<String, String> mp =
                                    a.getUserInfoByName(name);
                            Message msg = new Message();
                            if(mp == null) {
                                msg.what = 0;
                                msg.obj =  "查询结果，空空如也";
                                //非UI线程不要试着去操作界面
                            }
                            else {
                                String ss = new String();
                                for (String key : mp.keySet()) {
                                    ss = ss + key + ":" + mp.get(key) + ";";
                                }
                                msg.what = 1;
                                msg.obj = ss;
                            }
                            handler.sendMessage(msg);
                        }
                    }).start();
                }
            }
        });

    }
}
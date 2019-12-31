package com.example.login.message.WxBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;
import com.example.login.message.MessageActivity;
import com.example.login.message.ZbBulid.ZbActivity;

public class WxActivity extends AppCompatActivity {
    private Button mBtnWx;
    private Button mBtnButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wx);
        mBtnWx=findViewById(R.id.Wxtn_1);
        mBtnWx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WxActivity.this,"发送成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
        mBtnButton1= findViewById(R.id.btn_message_back);
        mBtnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WxActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
    }
}

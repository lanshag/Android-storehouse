package com.example.login.message.ZbBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.MainActivity;
import com.example.login.R;
import com.example.login.message.MessageActivity;

public class ZbActivity extends AppCompatActivity {
    private Button mBtnZb;
    private Button mBtnButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zb);
        mBtnZb=findViewById(R.id.rb_1);
        mBtnZb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ZbActivity.this,"开始直播！",Toast.LENGTH_SHORT).show();
            }
        });
        mBtnButton1= findViewById(R.id.btn_message_back);
        mBtnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ZbActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.login.message.BjBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;
import com.example.login.message.MessageActivity;
import com.example.login.message.ZbBulid.ZbActivity;

public class BjActivity extends AppCompatActivity {
    private Button mRb_1;
    private Button mRb_2;
    private Button mRb_3;
    private Button mBtnButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bj);
        mRb_1=findViewById(R.id.rb_1);
        mRb_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BjActivity.this,"调音节目正在加载中，请稍后...",Toast.LENGTH_SHORT).show();
            }
        });
        mRb_2=findViewById(R.id.rb_2);
        mRb_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BjActivity.this,"正在打开后台节目库，请稍后...",Toast.LENGTH_SHORT).show();
            }
        });
        mRb_3=findViewById(R.id.rb_3);
        mRb_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BjActivity.this,"音频节目正在加载中，请稍后...",Toast.LENGTH_SHORT).show();
            }
        });
        mBtnButton1= findViewById(R.id.btn_message_back);
        mBtnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BjActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
    }
}

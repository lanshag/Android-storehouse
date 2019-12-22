package com.example.login.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.login.R;

public class MessageActivity extends AppCompatActivity {

    private Button mBtnButton1,mBtnButton2,mBtnButton3,mBtnButton4,mBtnButton5,mBtnButton6,mBtnButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        mBtnButton1= findViewById(R.id.btn_1);
        mBtnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton2= findViewById(R.id.btn_2);
        mBtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton3= findViewById(R.id.btn_3);
        mBtnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton4= findViewById(R.id.btn_4);
        mBtnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton5= findViewById(R.id.btn_5);
        mBtnButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton6= findViewById(R.id.btn_6);
        mBtnButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton7= findViewById(R.id.btn_7);
        mBtnButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessageActivity.this,ZbActivity.class);
                startActivity(intent);
            }
        });
        }
}

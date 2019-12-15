package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mbtn_1;
    private Button mbtn_2;
    private Button mbtn_3;
    private Button mbtn_4;
    private Button mbtn_5;
    private Button mbtn_6;
    private Button mbtn_7;
    private Button mbtn_8;
    private Button mbtn_9;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtn_1 = (Button) findViewById(R.id.btn_1);
        mbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_1演示界面
                Intent intent= new Intent(MainActivity.this, Button1Activity.class);
                startActivity(intent);
            }
        });
        mbtn_2= findViewById(R.id.btn_2);
        mbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_2演示界面
                Intent intent=new Intent(MainActivity.this,Button2Activity.class);
                startActivity(intent);
            }
        });
        mbtn_3= findViewById(R.id.btn_3);
        mbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_3演示界面
                Intent intent=new Intent(MainActivity.this,Button3Activity.class);
                startActivity(intent);
            }
        });
        mbtn_4= findViewById(R.id.btn_4);
        mbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_4演示界面
                Intent intent=new Intent(MainActivity.this,Button4Activity.class);
                startActivity(intent);
            }
        });
        mbtn_5= findViewById(R.id.btn_5);
        mbtn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_5演示界面
                Intent intent=new Intent(MainActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
        mbtn_6= findViewById(R.id.btn_6);
        mbtn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_6演示界面
                Intent intent=new Intent(MainActivity.this,Button6Activity.class);
                startActivity(intent);
            }
        });
        mbtn_7= findViewById(R.id.btn_7);
        mbtn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_7演示界面
                Intent intent=new Intent(MainActivity.this,Button7Activity.class);
                startActivity(intent);
            }
        });
        mbtn_8= findViewById(R.id.btn_8);
        mbtn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_8演示界面
                Intent intent=new Intent(MainActivity.this,Button8Activity.class);
                startActivity(intent);
            }
        });

        mbtn_9= findViewById(R.id.btn_9);
        mbtn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到btn_9演示界面
                Intent intent=new Intent(MainActivity.this,Button9Activity.class);
                startActivity(intent);
            }
        });
    }
}




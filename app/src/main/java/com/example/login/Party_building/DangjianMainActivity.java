package com.example.login.Party_building;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;

public class DangjianMainActivity extends AppCompatActivity {

    private Button back;
    private Button next1,next2,next3,next4,next5;

    private Button mBtnWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangjian_main);
        back = findViewById(R.id.c_1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        next1 = findViewById(R.id.c_2);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, DangjianxwActivity.class);
                startActivity(intent);
            }
        });
        next2 = findViewById(R.id.c_3);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, DangyuanxxActivity.class);
                startActivity(intent);
            }
        });
        next3 = findViewById(R.id.c_4);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, DangjianhdActivity.class);
                startActivity(intent);
            }
        });
        next4 = findViewById(R.id.c_5);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, FupinggzActivity.class);
                startActivity(intent);
            }
        });
        next5 = findViewById(R.id.c_6);
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangjianMainActivity.this, DangyuanxinxiActivity.class);
                startActivity(intent);
            }
        });

    }
}

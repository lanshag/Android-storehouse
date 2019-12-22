package com.example.login.System;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;

public class SystemActivity extends AppCompatActivity {
    private Button mBtn_1;
    private Button mBtn_2;
    private Button mBtn_3;
    private Button mBtn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        mBtn_1 = findViewById(R.id.btn_system_1);
        mBtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemActivity.this,xinxiActivity.class);
                startActivity(intent);
            }
        });
        mBtn_2 = findViewById(R.id.btn_system_2);
        mBtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemActivity.this,xiugaiActivity.class);
                startActivity(intent);
            }
        });
        mBtn_3 = findViewById(R.id.btn_system_3);
        mBtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemActivity.this,huanyinActivity.class);
                startActivity(intent);
            }
        });
        mBtn_back = findViewById(R.id.btn_system_back);
        mBtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

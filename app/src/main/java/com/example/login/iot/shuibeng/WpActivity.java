package com.example.login.iot.shuibeng;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.R;
import com.example.login.iot.Button2Activity;
import com.example.login.iot.huanjingcanshu.EpActivity;

public class WpActivity extends AppCompatActivity {
    private Button mbtnButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp);
        mbtnButton2 = findViewById(R.id.btn_iot_back);
        mbtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(WpActivity.this, Button2Activity.class);
                startActivity(intent);
            }
        });
    }
}

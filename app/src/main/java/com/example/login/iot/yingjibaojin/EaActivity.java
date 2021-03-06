package com.example.login.iot.yingjibaojin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.login.R;
import com.example.login.iot.Button2Activity;
import com.example.login.iot.huanjingcanshu.EpActivity;

public class EaActivity extends AppCompatActivity {
    private Button mbtnButton2;
    private TextView mbtnbaojing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea);
        mbtnButton2 = findViewById(R.id.btn_iot_back);
        mbtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(EaActivity.this, Button2Activity.class);
                startActivity(intent);
            }
        });
        mbtnbaojing = findViewById(R.id.bj_1);
        mbtnbaojing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(EaActivity.this, baojingActivity.class);
                startActivity(intent);
            }
        });

    }
}

package com.example.login.iot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;

public class IotActivity extends AppCompatActivity {

    private Button mBtnButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnButton2 = findViewById(R.id.btn_iot);
        mBtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(IotActivity.this,Button2Activity.class);
                startActivity(intent);

            }
        });
    }
}


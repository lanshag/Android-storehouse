package com.example.login.message.ZbBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;

public class ZbActivity extends AppCompatActivity {
    private Button mBtnZb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zb);
        mBtnZb=findViewById(R.id.Zbtn_1);
        mBtnZb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ZbActivity.this,"开始直播！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

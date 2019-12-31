package com.example.login.message.WxBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;

public class WxActivity extends AppCompatActivity {
    private Button mBtnWx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wx);
        mBtnWx=findViewById(R.id.Wxtn_1);
        mBtnWx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WxActivity.this,"发送成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

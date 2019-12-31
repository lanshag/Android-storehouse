package com.example.login.message.DxBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;

public class DxActivity extends AppCompatActivity {
    private Button mBtnDx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dx);
        mBtnDx=findViewById(R.id.Dxtn_1);
        mBtnDx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DxActivity.this,"发送成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

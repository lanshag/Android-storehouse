package com.example.login.message.DxTzBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.login.R;

public class DxTzActivity extends AppCompatActivity {
    private Button mBtnDxtz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dx_tz);
        mBtnDxtz=findViewById(R.id.DxTz_1);
        mBtnDxtz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DxTzActivity.this,"发送成功！！！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

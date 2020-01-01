package com.example.login.message.JjBulid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.login.R;
import com.example.login.message.MessageActivity;
import com.example.login.message.ZbBulid.ZbActivity;

public class JjActivity extends AppCompatActivity {
    private TextView mtv1;
    private TextView mtv2;
    private Button mBtnButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jj);
        mtv1=findViewById(R.id.tv_1);
        mtv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mtv1.getPaint().setAntiAlias(true);//去除锯齿

        mtv2=findViewById(R.id.tv_2);
        mtv2.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        mBtnButton1= findViewById(R.id.btn_message_back);
        mBtnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JjActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
    }
}

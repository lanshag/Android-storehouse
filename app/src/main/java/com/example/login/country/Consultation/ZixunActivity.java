package com.example.login.country.Consultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.login.R;
import com.example.login.country.Consultation.Zixun_1.Zixun_1Activity;
import com.example.login.country.Consultation.Zixun_2.Zixun_2Activity;
import com.example.login.country.Consultation.Zixun_3.Zixun_3Activity;

public class ZixunActivity extends AppCompatActivity {

    private RelativeLayout mRL_1, mRl_2, mRl_3;
    private TextView mTv_1,mTv_2,mTv_3;
    private ImageView mIv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zixun);
        mRL_1 = findViewById(R.id.rea_1);
        mRL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZixunActivity.this, Zixun_1Activity.class);
                startActivity(intent);
            }
        });

        mRl_2 = findViewById(R.id.rea_2);
        mRl_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZixunActivity.this, Zixun_2Activity.class);
                startActivity(intent);
            }
        });

        mRl_3 = findViewById(R.id.
                rea_3);
        mRl_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZixunActivity.this, Zixun_3Activity.class);
                startActivity(intent);
            }
        });
        mTv_1 = findViewById(R.id.Tv_1);
        mTv_1.setSelected(true);
        mTv_2 = findViewById(R.id.Tv_2);
        mTv_2.setSelected(true);
        mTv_3 = findViewById(R.id.Tv_3);
        mTv_3.setSelected(true);
        mIv_1 = (ImageView) findViewById(R.id.Iv_1);
        Glide.with(this).load("http://www.tianxin.gov.cn/tianxin/zwgk8/xxgkml9/qjxxgkml24/yaowendongtai/zwdt/1544581/2019012414173447270.png").into(mIv_1);
    }
}

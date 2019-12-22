package com.example.login.iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.R;
import com.example.login.iot.LED.LEDActivity;
import com.example.login.iot.huanjingcanshu.EpActivity;
import com.example.login.iot.huozaibaojin.FaActivity;
import com.example.login.iot.jiankong.CCActivity;
import com.example.login.iot.ludeng.RlActivity;
import com.example.login.iot.shapan.StActivity;
import com.example.login.iot.shuibeng.WpActivity;
import com.example.login.iot.yingjibaojin.EaActivity;
import com.example.login.iot.yingjiguangbo.EbActivity;
import com.example.login.iot.zhongduannengyuan.TemActivity;

public class Button2Activity extends AppCompatActivity {
    private Button mBtnCC;
    private Button mBtnEa;
    private Button mBtnEb;
    private Button mBtnEp;
    private Button mBtnFa;
    private Button mBtnLED;
    private Button mBtnRl;
    private Button mBtnSt;
    private Button mBtnTem;
    private Button mBtnWp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        mBtnEb = findViewById(R.id.btn_1);
        mBtnEb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, EbActivity.class);
                startActivity(intent);
            }
        });
        mBtnLED = findViewById(R.id.btn_2);
        mBtnLED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, LEDActivity.class);
                startActivity(intent);
            }
        });
        mBtnEp = findViewById(R.id.btn_3);
        mBtnEp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, EpActivity.class);
                startActivity(intent);
            }
        });
        mBtnSt = findViewById(R.id.btn_4);
        mBtnSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, StActivity.class);
                startActivity(intent);
            }
        });
        mBtnRl = findViewById(R.id.btn_5);
        mBtnRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, RlActivity.class);
                startActivity(intent);
            }
        });
        mBtnWp = findViewById(R.id.btn_6);
        mBtnWp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, WpActivity.class);
                startActivity(intent);
            }
        });
        mBtnEa = findViewById(R.id.btn_7);
        mBtnEa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, EaActivity.class);
                startActivity(intent);
            }
        });
        mBtnTem = findViewById(R.id.btn_8);
        mBtnTem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, TemActivity.class);
                startActivity(intent);
            }
        });
        mBtnCC = findViewById(R.id.btn_9);
        mBtnCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, CCActivity.class);
                startActivity(intent);
            }
        });
        mBtnFa = findViewById(R.id.btn_10);
        mBtnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(Button2Activity.this, FaActivity.class);
                startActivity(intent);
            }
        });


    }
}
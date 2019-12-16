package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.Data.DataActivity;
import com.example.login.Party.PartyActivity;
import com.example.login.System.SystemActivity;
import com.example.login.Weather.WeatherActivity;
import com.example.login.Work.WorkActivity;
import com.example.login.country.CountryActivity;
import com.example.login.iot.IotActivity;
import com.example.login.link.LinkActivity;
import com.example.login.message.MessageActivity;
import com.example.login.projectmanger.ProjectMangerActivity;

public class MainActivity extends AppCompatActivity {
    private Button mbtn_weather_1;
    private Button mbtn_weather_2;
    private Button mbtn_work;
    private Button mbtn_iot;
    private Button mbtn_data;
    private Button mbtn_system;
    private Button mbtn_Party;
    private Button mbtn_project;
    private Button mbtn_country;
    private Button mbtn_link;
    private Button mbtn_message;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtn_weather_1=findViewById(R.id.btn_weather_1);
        mbtn_weather_2=findViewById(R.id.btn_weather_2);
        mbtn_work = findViewById(R.id.btn_work);
        mbtn_iot = findViewById(R.id.btn_iot);
        mbtn_data = findViewById(R.id.btn_data);
        mbtn_system = findViewById(R.id.btn_system);
        mbtn_Party = findViewById(R.id.btn_party);
        mbtn_project = findViewById(R.id.btn_project);
        mbtn_country = findViewById(R.id.btn_country);
        mbtn_link = findViewById(R.id.btn_link);
        mbtn_message = findViewById(R.id.btn_message);
        setListeners();
    }

    // 监听器方法
    private void setListeners(){
        OnClick onClick = new OnClick();
        mbtn_weather_1.setOnClickListener(onClick);
        mbtn_weather_2.setOnClickListener(onClick);
        mbtn_work.setOnClickListener(onClick);
        mbtn_iot.setOnClickListener(onClick);
        mbtn_data.setOnClickListener(onClick);
        mbtn_system.setOnClickListener(onClick);
        mbtn_Party.setOnClickListener(onClick);
        mbtn_project.setOnClickListener(onClick);
        mbtn_country.setOnClickListener(onClick);
        mbtn_link.setOnClickListener(onClick);
        mbtn_message.setOnClickListener(onClick);
    }

    // 实现监听器接口
    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                // 跳转到Weather演示页面
                case R.id.btn_weather_1:
                    intent = new Intent(MainActivity.this, WeatherActivity.class);
                    break;
                // 跳转到Weather演示页面
                case R.id.btn_weather_2:
                    intent = new Intent(MainActivity.this, WeatherActivity.class);
                    break;
                // 跳转到我的工作演示页面
                case R.id.btn_work:
                    intent = new Intent(MainActivity.this, WorkActivity.class);
                    break;
                // 跳转到物联网管理演示页面
                case R.id.btn_iot:
                    intent = new Intent(MainActivity.this, IotActivity.class);
                    break;
                // 跳转到数据管理演示页面
                case R.id.btn_data:
                    intent = new Intent(MainActivity.this, DataActivity.class);
                    break;
                // 跳转到系统设置演示页面
                case R.id.btn_system:
                    intent = new Intent(MainActivity.this, SystemActivity.class);
                    break;
                // 跳转到党建管理演示页面
                case R.id.btn_party:
                    intent = new Intent(MainActivity.this, PartyActivity.class);
                    break;
                // 跳转到项目管理演示页面
                case R.id.btn_project:
                    intent = new Intent(MainActivity.this, ProjectMangerActivity.class);
                    break;
                // 跳转到美丽乡村演示页面
                case R.id.btn_country:
                    intent = new Intent(MainActivity.this, CountryActivity.class);
                    break;
                // 跳转到链接管理演示页面
                case R.id.btn_link:
                    intent = new Intent(MainActivity.this, LinkActivity.class);
                    break;
                // 跳转到信息管理演示页面
                case R.id.btn_message:
                    intent = new Intent(MainActivity.this, MessageActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}





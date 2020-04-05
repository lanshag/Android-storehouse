package com.example.login.iot.yingjiguangbo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;
import com.example.login.iot.Button2Activity;
import com.example.login.iot.huanjingcanshu.EpActivity;

public class EbActivity extends AppCompatActivity {
    private Intent intent;
    private Button mbtnButton2;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eb);
        mbtnButton2 = findViewById(R.id.btn_iot_back);
        mbtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(EbActivity.this, Button2Activity.class);
                startActivity(intent);
            }
        });
        // 启动服务播放背景音乐
        intent = new Intent(EbActivity.this, MyIntentService.class);
        String action = MyIntentService.ACTION_MUSIC;
        // 设置action
        intent.setAction(action);
        startService(intent);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        mediaPlayer.stop();
    }
}

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
    private Button mbtnButton2,mbtnplay,mbtnpause,mbtnstop,vido;
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
        vido = findViewById(R.id.vido);
        vido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Button2演示界面
                Intent intent = new Intent(EbActivity.this, VidoActivity.class);
                startActivity(intent);
            }
        });
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.test_520);
        mbtnplay =findViewById(R.id.btn_play);
        mbtnpause =findViewById(R.id.btn_pause);
        mbtnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        mbtnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

    }

}

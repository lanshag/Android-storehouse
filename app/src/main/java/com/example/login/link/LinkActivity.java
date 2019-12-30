package com.example.login.link;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.login.MainActivity;
import com.example.login.R;
import com.example.login.link.baidu.BaiduActivity;
import com.example.login.link.shebao.ShebaoActivity;
import com.example.login.link.tianxinzhengfuguanwang.TianxinzhengfuguanwangActivity;
import com.example.login.link.xiangyayiyuan.XiangyayiyuanActivity;
import com.example.login.link.zhufanggongjijin.ZhufanggongjijinActivity;
import com.example.login.link.caigouwang.CaigoueangActivity;

public class LinkActivity extends AppCompatActivity {
    private RelativeLayout mLL_1,mLL_2,mLL_3,mLL_4,mLL_5,mLL_6,mLL_7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        mLL_1=findViewById(R.id.link_1);
        mLL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("https://www.xyeyy.com/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });

        mLL_2=findViewById(R.id.link_2);
        mLL_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("http://gjjzx.changsha.gov.cn/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });

        mLL_3=findViewById(R.id.link_3);
        mLL_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("http://www.cs12333.com/revision/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });

        mLL_4=findViewById(R.id.link_4);
        mLL_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("http://www.tianxin.gov.cn/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });

        mLL_5=findViewById(R.id.link_5);
        mLL_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("https://www.baidu.com/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });
        mLL_6=findViewById(R.id.link_6);
        mLL_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("http://www.ccgp-hunan.gov.cn/");
                intent.setData(content_url);
                startActivity(intent);
            }
        });
      




    }

    public void onClick(View view) {
        Intent intent=new Intent();
        intent.setClass(LinkActivity.this,MainActivity.class);
        startActivity(intent);
    }
}

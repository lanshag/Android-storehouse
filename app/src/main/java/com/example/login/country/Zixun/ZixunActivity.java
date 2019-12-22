package com.example.login.country.Zixun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.login.R;
import com.example.login.country.Zixun.Zixun_1.Zixun_1Activity;
import com.example.login.country.Zixun.Zixun_2.Zixun_2Activity;
import com.example.login.country.Zixun.Zixun_3.Zixun_3Activity;

public class ZixunActivity extends AppCompatActivity {

    private RelativeLayout mRL_1, mRl_2, mRl_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
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

        mRl_3 = findViewById(R.id.rea_3);
        mRl_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZixunActivity.this, Zixun_3Activity.class);
                startActivity(intent);
            }
        });
    }
}

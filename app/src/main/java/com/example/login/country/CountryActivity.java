package com.example.login.country;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;
import com.example.login.country.Lvyou.LvyouActivity;
import com.example.login.country.Meili.MeiliActivity;
import com.example.login.country.Minsu.MinsuActivity;
import com.example.login.country.Wenhua.WenhuaActivity;
import com.example.login.country.Woai.WoaiActivity;
import com.example.login.country.Xuanchuan.XuanchuanActivity;
import com.example.login.country.Zixun.ZixunActivity;

public class CountryActivity extends AppCompatActivity {
    private Button c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        c1 = findViewById(R.id.c_1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        c2 = findViewById(R.id.c_2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, ZixunActivity.class);
                startActivity(intent);
            }
        });
        c3 = findViewById(R.id.c_3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, MeiliActivity.class);
                startActivity(intent);
            }
        });
        c4 = findViewById(R.id.c_4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, WoaiActivity.class);
                startActivity(intent);
            }
        });
        c5 = findViewById(R.id.c_5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, WenhuaActivity.class);
                startActivity(intent);
            }
        });
        c6 = findViewById(R.id.c_6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, LvyouActivity.class);
                startActivity(intent);
            }
        });
        c7 = findViewById(R.id.c_7);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, MinsuActivity.class);
                startActivity(intent);
            }
        });
        c8 = findViewById(R.id.c_8);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, XuanchuanActivity.class);
                startActivity(intent);
            }
        });
    }
}

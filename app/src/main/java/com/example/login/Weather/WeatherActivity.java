package com.example.login.Weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.login.R;

public class WeatherActivity extends AppCompatActivity {


    private WebView mWv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        mWv1 = findViewById(R.id.Wv_1);
        mWv1.getSettings().setJavaScriptEnabled(true);
        mWv1.setWebViewClient(new WebViewClient());
        mWv1.loadUrl("http://www.bilibili.com");
    }
}

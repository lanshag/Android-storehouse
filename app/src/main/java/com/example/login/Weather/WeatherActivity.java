package com.example.login.Weather;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.login.R;

public class WeatherActivity extends AppCompatActivity {

    // private WebView mWvMain;
    private WebView mTv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        mTv_1 = findViewById(R.id.Wv_1);
        mTv_1.loadUrl("https://widget-page.heweather.net/h5/index.html?bg=1&md=0123456&lc=auto&key=376802ac478a49199683efe5fea5fcc6");
        mTv_1.getSettings().setJavaScriptEnabled(true);
        mTv_1.setWebViewClient(new MyWebVBiewCilent());
        mTv_1.setWebChromeClient(new MyWebChromeClient());}

    class MyWebVBiewCilent extends WebViewClient {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }

    //         不离开软件时--返回上一级网页
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mTv_1.canGoBack()) {
            mTv_1.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);}

    class MyWebChromeClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }
}
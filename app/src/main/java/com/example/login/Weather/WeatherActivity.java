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


    private WebView mWvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        mWvMain = findViewById(R.id.Wv_1);
        //加载本地HTML
        //mWvMain.loadUrl("file:///android_asset/hello.html");
        //加载网络HTML,网页打不开就取消注释下面第一条的代码
        mWvMain.getSettings().setJavaScriptEnabled(true);
        //始终不离开软件
//        mWvMain.setWebViewClient(new MyWebVBiewCilent());
//        mWvMain.setWebChromeClient(new MyWebChromeClient());
        mWvMain.loadUrl("https://www.heweather.com");
    }
//    在软件内继续原网页跳转
//    class MyWebVBiewCilent extends WebViewClient{
//        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                view.loadUrl(url);
//            }
//            return true;
//        }
//    }

    // 不离开软件时--返回上一级网页
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK && mWvMain.canGoBack()) {
//            mWvMain.goBack();
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);}
//
//        class MyWebChromeClient extends WebChromeClient {
//            @Override
//            public void onProgressChanged(WebView view, int newProgress) {
//                super.onProgressChanged(view, newProgress);
//            }
//
//            @Override
//            public void onReceivedTitle(WebView view, String title) {
//                super.onReceivedTitle(view, title);
//                setTitle(title);
//            }
//    }
}

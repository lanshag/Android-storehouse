package com.example.login.link.baidu;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.login.R;


public class BaiduActivity extends AppCompatActivity {
    private WebView mBaidu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu);
        mBaidu = findViewById(R.id.link_wb_5);
        mBaidu.loadUrl("https://www.baidu.com/");
        mBaidu.getSettings().setJavaScriptEnabled(true);
        mBaidu.setWebViewClient(new BaiduActivity.MyWebVBiewCilent());
        mBaidu.setWebChromeClient(new BaiduActivity.MyWebChromeClient());}

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
        if (keyCode == KeyEvent.KEYCODE_BACK && mBaidu.canGoBack()) {
            mBaidu.goBack();
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

package com.example.login.link.shebao;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.login.R;
import com.example.login.link.baidu.BaiduActivity;

public class ShebaoActivity extends AppCompatActivity {
    private WebView mSB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shebao);
        mSB = findViewById(R.id.link_wb_3);
        mSB.loadUrl("http://www.cs12333.com/revision/");
        mSB.getSettings().setJavaScriptEnabled(true);
        mSB.setWebViewClient(new ShebaoActivity.MyWebVBiewCilent());
        mSB.setWebChromeClient(new ShebaoActivity.MyWebChromeClient());}
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
        if (keyCode == KeyEvent.KEYCODE_BACK && mSB.canGoBack()) {
            mSB.goBack();
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

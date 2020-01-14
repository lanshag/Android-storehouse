package com.example.login.link.shebao;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.login.R;
import com.example.login.link.baidu.BaiduActivity;

import static android.view.KeyEvent.KEYCODE_BACK;

public class ShebaoActivity extends AppCompatActivity {
    private WebView mSB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shebao);
        init();
    }
    private void init() {
        mSB = (WebView) findViewById(R.id.link_wb_3);
        //WebView加载web资源
        mSB.loadUrl("http://www.cs12333.com/revision/");
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        mSB.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        WebSettings webSettings = mSB.getSettings();//支持获取手势焦点，输入用户名、密码或其他
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);//支持自动加载图片
        webSettings.setUseWideViewPort(true);//设置webview推荐使用的窗口
        webSettings.setLoadWithOverviewMode(true);//设置webview加载的页面的模式
        webSettings.setAllowFileAccess(true); // 允许访问webview内部文件
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
        webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件









        //当应用程序(存在webview)被切换到后台时，这个方法不仅仅针对当前的webview而是全局的全应用程序的webview
        // 它会暂停所有webview的layout，parsing，javascripttimer。降低CPU功耗。
        mSB.pauseTimers();








    }



    //在不做任何处理前提下 ，浏览网页时点击系统的“Back”键,整个 Browser 会调用 finish()而结束自身
    //目标：点击返回后，是网页回退而不是推出浏览器
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KEYCODE_BACK) && mSB.canGoBack()) {
            mSB.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



    //在 Activity 销毁（ WebView ）的时候，先让 WebView 加载null内容，然后移除 WebView，再销毁 WebView，最后置空。
    @Override
    protected void onDestroy() {
        if (mSB != null) {
            mSB.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            mSB.clearHistory();

            ((ViewGroup) mSB.getParent()).removeView(mSB);
            mSB.destroy();
            mSB = null;
        }
        super.onDestroy();
    }



}
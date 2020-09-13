package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;


public class job_alio extends AppCompatActivity {

    private WebView aliopage;
    private String url = "https://job.alio.go.kr/home.do";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_alio);

    aliopage = (WebView)findViewById(R.id.alio);
    aliopage.getSettings().setJavaScriptEnabled(true);
    aliopage.loadUrl(url);
    aliopage.setWebChromeClient(new WebChromeClient());
    aliopage.setWebViewClient(new aliopageClinetClass());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
       if((keyCode == KeyEvent.KEYCODE_BACK) && aliopage.canGoBack())
       {
           aliopage.goBack();
           return true;
       }
       return super.onKeyDown(keyCode, event);
    }

    private class aliopageClinetClass extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}

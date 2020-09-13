package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class cleaneye extends AppCompatActivity {

    private WebView cleanpage;
    private String url = "http://www.cleaneye.go.kr/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaneye);

        cleanpage = (WebView)findViewById(R.id.cleaneye);
        cleanpage.getSettings().setJavaScriptEnabled(true);
        cleanpage.loadUrl(url);
        cleanpage.setWebChromeClient(new WebChromeClient());
        cleanpage.setWebViewClient(new cleanpageClientClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && cleanpage.canGoBack())
        {
            cleanpage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }

    private class cleanpageClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class jaso extends AppCompatActivity {

    private WebView jasopage;
    private String url = "https://jasoseol.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaso);

        jasopage = (WebView)findViewById(R.id.jaso);
        jasopage.getSettings().setJavaScriptEnabled(true);
        jasopage.loadUrl(url);
        jasopage.setWebChromeClient(new WebChromeClient());
        jasopage.setWebViewClient(new jasopageClientClass());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && jasopage.canGoBack()){
            jasopage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }

    private class jasopageClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

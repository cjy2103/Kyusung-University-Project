package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class nurimove extends AppCompatActivity {

    private WebView nuripage;
    private String url = "https://cms2.ks.ac.kr/nuri/main.do";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurimove);

        nuripage = (WebView) findViewById(R.id.nuripage);
        nuripage.getSettings().setJavaScriptEnabled(true);
        nuripage.loadUrl(url);
        nuripage.getSettings().setBuiltInZoomControls(true);
        nuripage.getSettings().setSupportZoom(true);
        nuripage.getSettings().setDisplayZoomControls(false);
        nuripage.setWebChromeClient(new WebChromeClient());
        nuripage.setWebViewClient(new Nuriclass());

        if(Build.VERSION.SDK_INT >= 21) {
            nuripage.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && nuripage.canGoBack()){
            nuripage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class Nuriclass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
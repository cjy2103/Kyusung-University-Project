package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class Schedule extends AppCompatActivity {

    private WebView schedulepage;
    private String url = "http://kscms.ks.ac.kr/haksa/CMS/HaksaScheduleMgr/list.do?mCode=MN104";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        schedulepage = (WebView)findViewById(R.id.schedulepage);
        schedulepage.getSettings().setJavaScriptEnabled(true);
        schedulepage.loadUrl(url);
        schedulepage.setWebChromeClient(new WebChromeClient());
        schedulepage.setWebViewClient(new ScheduleClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && schedulepage.canGoBack()){
            schedulepage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class ScheduleClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}


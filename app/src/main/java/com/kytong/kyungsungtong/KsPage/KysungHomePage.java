package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;


public class KysungHomePage extends AppCompatActivity {

    private WebView kshomepage;
    private String url = "https://kscms.ks.ac.kr/kor/Main.do";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kysung_home_page);

        kshomepage = (WebView)findViewById(R.id.kshomepage);
        kshomepage.getSettings().setJavaScriptEnabled(true);
        kshomepage.loadUrl(url);
        kshomepage.setWebChromeClient(new WebChromeClient());
        kshomepage.setWebViewClient(new KysungHomePageClientClass());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && kshomepage.canGoBack()){
            kshomepage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class KysungHomePageClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

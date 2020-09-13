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

public class libraypage extends AppCompatActivity {

    private WebView librarypage;
    private String url = "https://library.ks.ac.kr/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libraypage);

        librarypage = (WebView) findViewById(R.id.librarypage);
        librarypage.getSettings().setJavaScriptEnabled(true);
        librarypage.loadUrl(url);
        librarypage.getSettings().setBuiltInZoomControls(true);
        librarypage.getSettings().setSupportZoom(true);
        librarypage.getSettings().setDisplayZoomControls(false);
        librarypage.setWebChromeClient(new WebChromeClient());
        librarypage.setWebViewClient(new Library());


        if(Build.VERSION.SDK_INT >= 21) {
            librarypage.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && librarypage.canGoBack()){
            librarypage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class Library extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
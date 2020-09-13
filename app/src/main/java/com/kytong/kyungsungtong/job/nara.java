package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class nara extends AppCompatActivity {

    private WebView narapage;
    private String url = "https://www.gojobs.go.kr/mainIndex.do";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nara);

        narapage = (WebView)findViewById(R.id.nara);
        narapage.getSettings().setJavaScriptEnabled(true);
        narapage.loadUrl(url);
        narapage.setWebChromeClient(new WebChromeClient());
        narapage.setWebViewClient(new narapageClinetClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK) && narapage.canGoBack())
        {
            narapage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class narapageClinetClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

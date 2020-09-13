package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class jobkr extends AppCompatActivity {

    private WebView jobkrpage;
    private String url = "https://www.jobkorea.co.kr/";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobkr);

        jobkrpage = (WebView)findViewById(R.id.jobkr);
        jobkrpage.getSettings().setJavaScriptEnabled(true);
        jobkrpage.loadUrl(url);
        jobkrpage.setWebChromeClient(new WebChromeClient());
        jobkrpage.setWebViewClient(new jobkrpageClientClass());


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && jobkrpage.canGoBack()){
            jobkrpage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class jobkrpageClientClass extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class jobplanet extends AppCompatActivity {

    private WebView planetpage;
    private String url = "https://www.jobplanet.co.kr/welcome/index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobplanet);

        planetpage = (WebView)findViewById(R.id.jobplanet);
        planetpage.getSettings().setJavaScriptEnabled(true);
        planetpage.loadUrl(url);
        planetpage.setWebChromeClient(new WebChromeClient());
        planetpage.setWebViewClient(new jobplanetpageClientClass());

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && planetpage.canGoBack()){
            planetpage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    private class jobplanetpageClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

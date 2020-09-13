package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class peoplein extends AppCompatActivity {

    private WebView peoplepage;
    private String url = "https://www.saramin.co.kr/zf_user/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoplein);

        peoplepage = (WebView)findViewById(R.id.peolpepage);
        peoplepage.getSettings().setJavaScriptEnabled(true);
        peoplepage.loadUrl(url);
        peoplepage.setWebChromeClient(new WebChromeClient());
        peoplepage.setWebViewClient(new peopleinClientClass());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && peoplepage.canGoBack()){
            peoplepage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }




    private class peopleinClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

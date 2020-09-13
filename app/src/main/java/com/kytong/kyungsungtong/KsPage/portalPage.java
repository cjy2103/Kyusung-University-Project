package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class portalPage extends AppCompatActivity {

    private WebView portalpage;
    private String url = "http://apps.ks.ac.kr/ksu/mobile/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_page);

        portalpage = (WebView)findViewById(R.id.portalpage);
        portalpage.getSettings().setJavaScriptEnabled(true);
        portalpage.loadUrl(url);
        portalpage.setWebChromeClient(new WebChromeClient());
        portalpage.setWebViewClient(new portalPageClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && portalpage.canGoBack()){
            portalpage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class portalPageClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}




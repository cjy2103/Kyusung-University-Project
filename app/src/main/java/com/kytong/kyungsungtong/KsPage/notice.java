package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class notice extends AppCompatActivity {

    private WebView noticepage;
    private String url = "http://kscms.ks.ac.kr/haksa/CMS/Board/Board.do?mCode=MN137&searchCategory=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        noticepage = (WebView) findViewById(R.id.noticepage);
        noticepage.getSettings().setJavaScriptEnabled(true);
        noticepage.loadUrl(url);
        noticepage.getSettings().setBuiltInZoomControls(true);
        noticepage.getSettings().setSupportZoom(true);
        noticepage.getSettings().setDisplayZoomControls(false);
        noticepage.setWebChromeClient(new WebChromeClient());
        noticepage.setWebViewClient(new ReadingRoomClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && noticepage.canGoBack()){
            noticepage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class ReadingRoomClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

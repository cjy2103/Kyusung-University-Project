package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kytong.kyungsungtong.R;

public class ReadingRoom extends AppCompatActivity {

    private WebView roompage;
    private String url = "https://library.ks.ac.kr/main/readingroom/main.jsp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_room);

        roompage = (WebView) findViewById(R.id.roompage);
        roompage.getSettings().setJavaScriptEnabled(true);
        roompage.loadUrl(url);
        roompage.getSettings().setBuiltInZoomControls(true);
        roompage.getSettings().setSupportZoom(true);
        roompage.getSettings().setDisplayZoomControls(false);
        roompage.setWebChromeClient(new WebChromeClient());
        roompage.setWebViewClient(new ReadingRoomClass());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && roompage.canGoBack()){
            roompage.goBack();
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

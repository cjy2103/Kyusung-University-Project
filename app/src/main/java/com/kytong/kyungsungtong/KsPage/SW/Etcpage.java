package com.kytong.kyungsungtong.KsPage.SW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kytong.kyungsungtong.R;

public class Etcpage extends AppCompatActivity {

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    TextView textView;
    TextView page;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etcpage);

        imageView0 = (ImageView) findViewById(R.id.imageView0);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        textView = findViewById(R.id.etctext);
        page = findViewById(R.id.etcpage);

    }

    public void onButton1Clicked (View v) {

        int index = count % 4;

        if (index == 0) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            textView.setText("경성포탈 로그인후 교내 SW안내 클릭");
            page.setText("2 page");
        }
        if (index == 1) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            textView.setText("경성대에서 제공하는 SW목록들 1인당 최대 2개까지 대여가능");
            page.setText("3 page");
        }
        if (index == 2) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            textView.setText("대여할 SW를 다운받고 내용보기를 클릭");
            page.setText("4 page");
        }

        if (index == 3) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);
            textView.setText("다운받은 제품의 exe 파일 설치중 필요한 제품키를 입력");
            page.setText("5 page");
        }

        count++;
    }
}

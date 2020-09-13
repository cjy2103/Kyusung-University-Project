package com.kytong.kyungsungtong.KsPage.SW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kytong.kyungsungtong.R;

public class Winpage extends AppCompatActivity {

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    TextView textView;
    TextView page;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winpage);

        imageView0 = (ImageView) findViewById(R.id.imageView0);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        textView = findViewById(R.id.windowtext);
        page = findViewById(R.id.winpage);
    }

    public void onButton1Clicked (View v) {


        int index = count % 12;

        if (index == 0) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("구글에 윈도우 10 education 무료 설치 검색후 상단의 사이트 접속");
            page.setText("2 page");
        }
        if (index == 1) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("다음의 이미지가 나올때 까지 내용을 내린후 이미지의 사이트 접속");
            page.setText("3 page");
        }
        if (index == 2) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("사이트 접속후 학교 찾아보기 클릭");
            page.setText("4 page");
        }

        if (index == 3) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("다음 이미지의 Find your School 클릭");
            page.setText("5 page");
        }

        if (index == 4) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.VISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("Country에 Korea,(South) Republic Of 선택\nSchool에 Kyungsung University 기입후 나타나는 이미지중 " +
                    "windows 10 이미지 클릭");
            page.setText("6 page");
        }

        if (index == 5) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.VISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("Windows10 구매를 위해서는 사이트 회원가입이 필요");
            page.setText("7 page");
        }

        if (index == 6) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.VISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("회원가입을 마친후 로그인한 다음 Add to Cart 클릭");
            page.setText("8 page");
        }

        if (index == 7) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.VISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("Check Out 클릭");
            page.setText("9 page");
        }

        if (index == 8) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.VISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("계정을 등록하라고 나옴 검은색으로 칠해진 부분에 개인의 Username, Signature 모두 나와있음");
            page.setText("10 page");
        }

        if (index == 9) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.VISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("모든 절차를 마치면 다음과 같이 Windows10 Education 등록 제품키를 줌 Get Started 를 누른후 제품키를 등록");
            page.setText("11 page");
        }

        if (index == 10) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.VISIBLE);
            imageView12.setVisibility(View.INVISIBLE);
            textView.setText("제품키 등록법은 이미 windows10이 깔려있다면 제어판 ->시스템 및 보안->시스템 으로 이동후 다음과 같은 사진에서 변경하면 사용이 가능");
            page.setText("12 page");
        }

        if (index == 11) {
            imageView0.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
            imageView6.setVisibility(View.INVISIBLE);
            imageView7.setVisibility(View.INVISIBLE);
            imageView8.setVisibility(View.INVISIBLE);
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageView11.setVisibility(View.INVISIBLE);
            imageView12.setVisibility(View.VISIBLE);
            textView.setText("OS 내장 컴이 아닐시 공식홈페이지에서 Win10 을 USB에 설치후 설치된 USB를 OS내장이 안된 컴퓨터에 꽃아 부팅하면 win10 설치시작 -> 제품키 등록");
            page.setText("13 page");
        }


        count++;

    }
}
package com.kytong.kyungsungtong.KsPage.SW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kytong.kyungsungtong.R;

public class Mspage extends AppCompatActivity {

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
    TextView textView;
    TextView page;


    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mspage);

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
        textView = findViewById(R.id.mstext);
        page = findViewById(R.id.mspage);

    }

    public void onButton1Clicked (View v) {


        int index = count % 9;

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
            textView.setText("구글에 마이크로 소프트 검색후 공식홈페이지 클릭");
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
            textView.setText("상단 레이아웃의 Office 클릭");
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
            textView.setText("상단 레이아웃의 제품 -> 학생용 클릭");
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
            textView.setText("다음과 같은 페이지에서 학교 이메일 주소 입력 xxxx는 자신의 경성포탈 ID\n" +
                    "만약 이메일을 모르겠다면 경성포탈 로그인후 웹메일 접근후 자신의 학교 이메일 주소를 확인");
            page.setText("5 page");
        }

        if (index == 4) {
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
            textView.setText("학생이면 학생 교사면 교사를 클릭\n 등록된 아이디가 없으면 학교메일로 인증키가 전송됨");
            page.setText("6 page");
        }

        if (index == 5) {
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
            textView.setText("경성포탈 로그인후 상단의 웹메일 클릭");
            page.setText("7 page");
        }

        if (index == 6) {
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
            textView.setText("office 365에서 보낸 메일을 확인한후 인증키를 확인");
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
            textView.setText("인증키를 확인한후 계정 생성에 인증키를 입력하고 시작 클릭");
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
            textView.setText("Office 앱 설치를 클릭 -> office 365에서 제공하는 ppt,word,excel 등의 소프트웨어 사용 가능");
            page.setText("10 page");
        }


        count++;

    }

}
package com.kytong.kyungsungtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.kytong.kyungsungtong.KsPage.KySungPage;
import com.kytong.kyungsungtong.bus.busmain;
import com.kytong.kyungsungtong.foodmenu.foodmain;
import com.kytong.kyungsungtong.info.infomain;
import com.kytong.kyungsungtong.job.jobmain;
import com.kytong.kyungsungtong.ponNum.ponNummerPage;

public class MainActivity extends AppCompatActivity {

    private ImageButton kysung_move;
    private ImageButton ponnumer_move;
    private ImageButton bus_move;
    private ImageButton job_move;
    private ImageButton food_move;
    private ImageButton news_move;
    private ImageButton time_movesub;
    private ImageButton info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kysung_move = findViewById(R.id.kysung_move);
        kysung_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kysung = new Intent(MainActivity.this, KySungPage.class);
                startActivity(Kysung); // 액티비티 이동
            }
        });

        ponnumer_move = findViewById(R.id.ponnumer_move);
        ponnumer_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ponnumerpage = new Intent(MainActivity.this, ponNummerPage.class);
                startActivity(ponnumerpage);
            }
        });

        food_move = findViewById(R.id.food_move);
        food_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodpage = new Intent(MainActivity.this, foodmain.class);
                startActivity(foodpage);
            }
        });


        bus_move = findViewById(R.id.bus_move);
        bus_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buspage = new Intent(MainActivity.this, busmain.class);
                startActivity(buspage);
            }
        });


        job_move = findViewById(R.id.job_move);
        job_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jobpage = new Intent(MainActivity.this, jobmain.class);
                startActivity(jobpage);
            }
        });


        news_move = findViewById(R.id.news_move);
        news_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newspage = new Intent(MainActivity.this, newsPage.class);
                startActivity(newspage);
            }
        });

        info = findViewById(R.id.info_move);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infomain = new Intent(MainActivity.this, infomain.class);
                startActivity(infomain);
            }
        });

        time_movesub = findViewById(R.id.time_movesub);
        time_movesub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timetablesub = new Intent(MainActivity.this, timetablesub.class);
                startActivity(timetablesub);
                finish();
            }
        });



    }
}

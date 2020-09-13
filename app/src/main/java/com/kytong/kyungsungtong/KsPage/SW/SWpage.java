package com.kytong.kyungsungtong.KsPage.SW;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kytong.kyungsungtong.R;

public class SWpage extends AppCompatActivity {

    Button ms_move;
    Button win_move;
    Button etc_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_wpage);

        ms_move = findViewById(R.id.Ms_move);
        ms_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mspage = new Intent(SWpage.this, Mspage.class);
                startActivity(Mspage);
            }
        });

        win_move = findViewById(R.id.win_move);
        win_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent window = new Intent(SWpage.this,Winpage.class);
                startActivity(window);
            }
        });

        etc_move = findViewById(R.id.etc_move);
        etc_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent etc = new Intent(SWpage.this,Etcpage.class);
                startActivity(etc);
            }
        });

    }

}
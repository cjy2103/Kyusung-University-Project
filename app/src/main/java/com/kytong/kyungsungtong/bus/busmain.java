package com.kytong.kyungsungtong.bus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kytong.kyungsungtong.R;

public class busmain extends AppCompatActivity {

    private Button buspage_move;
    private Button normalpage_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busmain);

        buspage_move = findViewById(R.id.buspage_move);
        buspage_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buspage = new Intent(busmain.this,busPage.class);
                startActivity(buspage);
            }
        });

        normalpage_move = findViewById(R.id.normal_move);
        normalpage_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent normalpage = new Intent(busmain.this, normalbuspage.class);
                startActivity(normalpage);
            }
        });
    }



}

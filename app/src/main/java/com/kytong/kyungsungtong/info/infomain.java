package com.kytong.kyungsungtong.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kytong.kyungsungtong.R;

public class infomain extends AppCompatActivity {

    private Button leader_move;
    private Button team_move;
    private Button sou_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomain);

        leader_move = findViewById(R.id.leader);
        leader_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leader = new Intent(infomain.this,TeamLeader.class);
                startActivity(leader);
            }
        });

        team_move = findViewById(R.id.team);
        team_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent team = new Intent(infomain.this,Team.class);
                startActivity(team);
            }
        });

        sou_move = findViewById(R.id.sou_move);
        sou_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent team = new Intent(infomain.this,Source.class);
                startActivity(team);
            }
        });



    }
}
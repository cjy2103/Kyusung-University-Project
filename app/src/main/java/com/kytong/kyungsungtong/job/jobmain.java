package com.kytong.kyungsungtong.job;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kytong.kyungsungtong.R;

public class jobmain extends AppCompatActivity {

    private Button people_move;
    private Button jobkr_move;
    private Button jobpl_move;
    private Button jaso_move;
    private Button jabalio_move;
    private Button cleaneye_move;
    private Button nara_move;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobmain);

        people_move = findViewById(R.id.people_move);
        people_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent peoplein = new Intent(jobmain.this,peoplein.class);
                startActivity(peoplein);
            }
        });


        jobkr_move = findViewById(R.id.jobkr_move);
        jobkr_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent jobkr = new Intent(jobmain.this,jobkr.class);
                startActivity(jobkr);
            }
        });

        jobpl_move = findViewById(R.id.planet_move);
        jobpl_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent jobpl = new Intent(jobmain.this,jobplanet.class);
                startActivity(jobpl);
            }
        });

        jaso_move = findViewById(R.id.jaso_move);
        jaso_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent jaso = new Intent(jobmain.this,jaso.class);
                startActivity(jaso);
            }
        });

        jabalio_move = findViewById(R.id.alio_move);
        jabalio_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent alio = new Intent(jobmain.this, job_alio.class);
                startActivity(alio);
            }
        });

        cleaneye_move = findViewById(R.id.cleaneye_move);
        cleaneye_move.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent clean = new Intent(jobmain.this,cleaneye.class);
                startActivity(clean);
            }
        });

        nara_move = findViewById(R.id.nara_move);
        nara_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nara = new Intent(jobmain.this, nara.class);
                startActivity(nara);
            }
        });



    }
}

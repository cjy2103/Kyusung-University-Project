package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.kytong.kyungsungtong.KsPage.SW.SWpage;
import com.kytong.kyungsungtong.R;

public class KySungPage extends AppCompatActivity {

    private ImageButton kyhome_move;
    private ImageButton portal_move;
    private ImageButton schedule_move;
    private ImageButton room_move;
    private ImageButton notice_move;
    private ImageButton map_move;
    private ImageButton nuri_move;
    private ImageButton library_move;
    private ImageButton sw_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ky_sung_page);
        kyhome_move = findViewById(R.id.kyhome_move);
        kyhome_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepage = new Intent(KySungPage.this,KysungHomePage.class);
                startActivity(homepage); // 액티비티 이동
            }
        });

        portal_move = findViewById(R.id.portal_move);
        portal_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent portalpage = new Intent(KySungPage.this, portalPage.class);
                startActivity(portalpage); // 액티비티 이동
            }
        });

        schedule_move = findViewById(R.id.schedule_move);
        schedule_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent schedulepage = new Intent(KySungPage.this, Schedule.class);
                startActivity(schedulepage);
            }
        });

        room_move = findViewById(R.id.book_move);
        room_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roompage = new Intent(KySungPage.this, ReadingRoom.class);
                startActivity(roompage);
            }
        });

        notice_move = findViewById(R.id.notice_move);
        notice_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noticepage = new Intent(KySungPage.this, notice.class);
                startActivity(noticepage);
            }
        });

        map_move = findViewById(R.id.map_move);
        map_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mappage = new Intent(KySungPage.this,Campusmap.class);
                startActivity(mappage);
            }
        });

        nuri_move = findViewById(R.id.nuri_move);
        nuri_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuripage = new Intent(KySungPage.this,nurimove.class);
                startActivity(nuripage);
            }
        });

        library_move = findViewById(R.id.library_move);
        library_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent library = new Intent(KySungPage.this, libraypage.class);
                startActivity(library);
            }
        });

        sw_move = findViewById(R.id.SWmove);
        sw_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sw = new Intent(KySungPage.this, SWpage.class);
                startActivity(sw);
            }
        });


    }
}

package com.kytong.kyungsungtong;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class timetablesub extends AppCompatActivity {
    List<String> colorList = new ArrayList<>();
    HashMap<String, Integer> colorMap = new HashMap<>();
    HashMap<String, String> allday = new HashMap<>();
    int t = 0;
    private Button timesubmove;

    List<TextView> monday = new ArrayList<>();
    List<TextView> tuesday = new ArrayList<>();
    List<TextView> wednesday = new ArrayList<>();
    List<TextView> thursday = new ArrayList<>();
    List<TextView> friday = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetablesub);




        String sheard = "file";
        SharedPreferences sharedPreferences = getSharedPreferences(sheard, 0);

        colorList.add("#e6f5ff");
        colorList.add("#f9e6ff");
        colorList.add("#e6ffe6");
        colorList.add("#ffcccc");
        colorList.add("#fff5e6");
        colorList.add("#ffeecc");
        colorList.add("#d9d9f2");
        colorList.add("#ecc6d9");
        colorList.add("#ffff99");
        colorList.add("#b3ffff");

//------------------------------------------------------------------------------------
        //해시맵삽입 컬러넘버
        for (int x = 0; x <= 13; x++) {
            String key = "mon" + x;
            String value = sharedPreferences.getString(key, "");
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            allday.put(key, value);

        }
        for (int x = 0; x <= 13; x++) {
            String key = "tues" + x;
            String value = sharedPreferences.getString(key, "");
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            allday.put(key, value);

        }
        for (int x = 0; x <= 13; x++) {
            String key = "wednes" + x;
            String value = sharedPreferences.getString(key, "");
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            allday.put(key, value);

        }
        for (int x = 0; x <= 13; x++) {
            String key = "thurs" + x;
            String value = sharedPreferences.getString(key, "");
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            allday.put(key, value);

        }
        for (int x = 0; x <= 13; x++) {
            String key = "fri" + x;
            String value = sharedPreferences.getString(key, "");
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            allday.put(key, value);

        }

//------------------------------------------------------------------------------------
        //리스트에 아이디값 저장
        String packName = this.getPackageName();
        for (int x = 0; x <= 13; x++) {
            String text = "monday" + x;
            int setid = getResources().getIdentifier(text, "id", packName);
            monday.add(x, (TextView) findViewById(setid));
        }
        for (int x = 0; x <= 13; x++) {
            String text = "tuesday" + x;
            int setid = getResources().getIdentifier(text, "id", packName);
            tuesday.add(x, (TextView) findViewById(setid));
        }
        for (int x = 0; x <= 13; x++) {
            String text = "wednesday" + x;
            int setid = getResources().getIdentifier(text, "id", packName);
            wednesday.add(x, (TextView) findViewById(setid));
        }
        for (int x = 0; x <= 13; x++) {
            String text = "thursday" + x;
            int setid = getResources().getIdentifier(text, "id", packName);
            thursday.add(x, (TextView) findViewById(setid));
        }
        for (int x = 0; x <= 13; x++) {
            String text = "friday" + x;
            int setid = getResources().getIdentifier(text, "id", packName);
            friday.add(x, (TextView) findViewById(setid));
        }
//------------------------------------------------------------------------------------

        textViewIn("mon",monday);
        textViewIn("tues",tuesday);
        textViewIn("wednes",wednesday);
        textViewIn("thurs",thursday);
        textViewIn("fri",friday);


//------------------------------------------------------------------------------------
        timesubmove = findViewById(R.id.timesubmove);
        timesubmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent submove = new Intent(timetablesub.this, timetable.class);
                startActivity(submove); // 액티비티 이동
                timetablesub.this.finish();
            }
        });
//------------------------------------------------------------------------------------

    }
//oncreate끝


    @Override
    public void onBackPressed() {
        Intent submove = new Intent(timetablesub.this, MainActivity.class);
        startActivity(submove); // 액티비티 이동
        timetablesub.this.finish();
    }

    public void textViewIn(String string, List<TextView> list){

        for (int x = 0; x <= 13; x++) {
            String key = string + x;
            String value = allday.get(key);
            value.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
            list.get(x).setText(value);
            list.get(x).setBackgroundResource(R.drawable.cell_shape);
            if (colorCheck(value)) {
                list.get(x).setBackgroundColor(Color.parseColor(colorList.get(colorMap.get(value))));
            } else if (value != "" && value != null) {
                colorMap.put(value, t);
                list.get(x).setBackgroundColor(Color.parseColor(colorList.get(colorMap.get(value))));
                t++;
                if (t == 9) {
                    t = 0;
                }
            }
            if(value.length()==0){
                list.get(x).setBackgroundResource(R.drawable.cell_shape);
            }
        }

    }

    public boolean colorCheck(String string) {
        if (colorMap.containsKey(string) && string != null && string != "") {
            return true;
        }
        return false;
    }

}

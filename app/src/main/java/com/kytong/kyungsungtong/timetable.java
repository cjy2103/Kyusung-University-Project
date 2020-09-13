package com.kytong.kyungsungtong;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class timetable extends AppCompatActivity {

    List<EditText> monday = new ArrayList<>();
    List<EditText> tuesday = new ArrayList<>();
    List<EditText> wednesday = new ArrayList<>();
    List<EditText> thursday = new ArrayList<>();
    List<EditText> friday = new ArrayList<>();
    String sheard = "file";
    private Button timeonmove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);





        String packName = this.getPackageName();
        for (int x=0; x<=13; x++){
            String text = "monday"+x;
            int setid = getResources().getIdentifier(text,"id",packName);
            monday.add(x,(EditText)findViewById(setid));
        }
        for (int x=0; x<=13; x++){
            String text = "tuesday"+x;
            int setid = getResources().getIdentifier(text,"id",packName);
            tuesday.add(x,(EditText)findViewById(setid));
        }
        for (int x=0; x<=13; x++){
            String text = "wednesday"+x;
            int setid = getResources().getIdentifier(text,"id",packName);
            wednesday.add(x,(EditText)findViewById(setid));
        }
        for (int x=0; x<=13; x++){
            String text = "thursday"+x;
            int setid = getResources().getIdentifier(text,"id",packName);
            thursday.add(x,(EditText)findViewById(setid));
        }
        for (int x=0; x<=13; x++){
            String text = "friday"+x;
            int setid = getResources().getIdentifier(text,"id",packName);
            friday.add(x,(EditText)findViewById(setid));
        }
//리스트삽입과정


        SharedPreferences sharedPreferences = getSharedPreferences(sheard,0);
        for(int x=0; x<=13; x++){
            String key = "mon"+x;
            String value = sharedPreferences.getString(key,"");
            monday.get(x).setText(value);
        }
        for(int x=0; x<=13; x++){
            String key = "tues"+x;
            String value = sharedPreferences.getString(key,"");
            tuesday.get(x).setText(value);
        }
        for(int x=0; x<=13; x++){
            String key = "wednes"+x;
            String value = sharedPreferences.getString(key,"");
            wednesday.get(x).setText(value);
        }
        for(int x=0; x<=13; x++){
            String key = "thurs"+x;
            String value = sharedPreferences.getString(key,"");
            thursday.get(x).setText(value);
        }
        for(int x=0; x<=13; x++){
            String key = "fri"+x;
            String value = sharedPreferences.getString(key,"");
            friday.get(x).setText(value);
        }



        timeonmove = findViewById(R.id.timeonmove);
        timeonmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onmove = new Intent(timetable.this, MainActivity.class);
                startActivity(onmove); // 액티비티 이동
                timetable.this.finish();
            }
        });

    }
//불러오기

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(sheard,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        for (int x=0; x<=13; x++){
            String value= monday.get(x).getText().toString();
            String endkey = "mon"+x;
            editor.putString(endkey,value);
        }
        for (int x=0; x<=13; x++){
            String value= tuesday.get(x).getText().toString();
            String endkey = "tues"+x;
            editor.putString(endkey,value);
        }
        for (int x=0; x<=13; x++){
            String value= wednesday.get(x).getText().toString();
            String endkey = "wednes"+x;
            editor.putString(endkey,value);
        }
        for (int x=0; x<=13; x++){
            String value= thursday.get(x).getText().toString();
            String endkey = "thurs"+x;
            editor.putString(endkey,value);
        }
        for (int x=0; x<=13; x++){
            String value= friday.get(x).getText().toString();
            String endkey = "fri"+x;
            editor.putString(endkey,value);
        }


        editor.commit();


    }
    //꺼지면 저장하기
}

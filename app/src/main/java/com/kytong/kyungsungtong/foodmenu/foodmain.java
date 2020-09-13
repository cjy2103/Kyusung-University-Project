package com.kytong.kyungsungtong.foodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kytong.kyungsungtong.R;

public class foodmain extends AppCompatActivity {

    private Button food_move;
    private Button hkfood_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodmain);

        food_move = findViewById(R.id.food_move);
        food_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodpage = new Intent(foodmain.this, food.class);
                startActivity(foodpage);
            }
        });

        hkfood_move = findViewById(R.id.hk_move);
        hkfood_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hkpage = new Intent(foodmain.this, hkfood.class);
                startActivity(hkpage);
            }
        });

    }
}

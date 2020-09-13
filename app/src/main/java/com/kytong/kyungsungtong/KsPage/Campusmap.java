package com.kytong.kyungsungtong.KsPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kytong.kyungsungtong.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Campusmap extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campusmap);

        PhotoView photoView =  findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.img_ksmap);

    }
}

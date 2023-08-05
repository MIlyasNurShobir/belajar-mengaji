package com.ilyas.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HarokatActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);

        pindah = (ImageButton) findViewById(R.id.harokatfathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatFathahActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.harokatkasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatKasrohActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.harokatdhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatDhomahActivity.class);
                startActivity(intent);
            }

        });
    }
}
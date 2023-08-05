package com.ilyas.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        pindah = (ImageButton) findViewById(R.id.belajar1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,HijaiyahActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.belajar2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,HarokatActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.belajar3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,TanwinActivity.class);
                startActivity(intent);
            }

        });
    }
}
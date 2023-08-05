package com.ilyas.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton buttonBelajar;
    ImageButton buttonBermain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonBelajar=  findViewById(R.id.button1);
        buttonBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(intent);
            }
        });
        buttonBermain =  findViewById(R.id.button2);
        buttonBermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(intent);
            }

        });
    }
    }

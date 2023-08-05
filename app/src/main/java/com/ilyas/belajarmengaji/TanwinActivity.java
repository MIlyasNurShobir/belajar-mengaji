package com.ilyas.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class TanwinActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin);

        pindah = (ImageButton) findViewById(R.id.fathahtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TanwinActivity.this,FathahtainActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.kasrohtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TanwinActivity.this,KasrohtainActivity.class);
                startActivity(intent);
            }

        });
        pindah = (ImageButton) findViewById(R.id.dhomahtain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TanwinActivity.this,DhomahtainActivity.class);
                startActivity(intent);
            }

        });
    }
}

package com.ilyas.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_hijaiyah);
        show = (ImageButton) findViewById(R.id.aliff);
        show = (ImageButton) findViewById(R.id.baa);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }

        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }

        });

        //Untuk Menambah Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.aliff);//Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.taa);
        final MediaPlayer SuaraTsa = MediaPlayer.create(this, R.raw.tsa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraKha = MediaPlayer.create(this, R.raw.kha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzall);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.roo);
        final MediaPlayer SuaraZa = MediaPlayer.create(this, R.raw.za);
        final MediaPlayer Suarasin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShod = MediaPlayer.create(this, R.raw.shod);
        final MediaPlayer SuaraDhod = MediaPlayer.create(this, R.raw.dhod);
        final MediaPlayer SuaraTho = MediaPlayer.create(this, R.raw.tho);
        final MediaPlayer SuaraZho = MediaPlayer.create(this, R.raw.zho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGhin = MediaPlayer.create(this, R.raw.ghinn);
        final MediaPlayer SuaraFa = MediaPlayer.create(this, R.raw.faa);
        final MediaPlayer SuaraQof = MediaPlayer.create(this, R.raw.qoff);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaff);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.mim);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nunn);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.yaa);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.aliff);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.baa);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.taa);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tsaa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.jimm);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.khaa);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.dall);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.dzall);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.raa);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.zaa);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sinn);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.syinn);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.shadd);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.dhadd);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.thaa);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.zhaa);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ainn);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.ghin);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.faa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.qaff);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kaff);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lamm);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.mimm);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nunn);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.wawuu);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.haaa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.yaa);

        /*Menghidupkan Suara*/
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.aliff);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.baa);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.taa);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tsaa);
                TampilGambar.startAnimation(animScale);
                SuaraTsa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jimm);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.haa);
                TampilGambar.startAnimation(animScale);
                SuaraKha.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.khaa);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dall);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzall);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.raa);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zaa);
                TampilGambar.startAnimation(animScale);
                SuaraZa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sinn);
                TampilGambar.startAnimation(animScale);
                Suarasin.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.syinn);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.shadd);
                TampilGambar.startAnimation(animScale);
                SuaraShod.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dhadd);
                TampilGambar.startAnimation(animScale);
                SuaraDhod.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.thaa);
                TampilGambar.startAnimation(animScale);
                SuaraTho.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zhaa);
                TampilGambar.startAnimation(animScale);
                SuaraZho.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ainn);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ghainn);
                TampilGambar.startAnimation(animScale);
                SuaraGhin.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.faa);
                TampilGambar.startAnimation(animScale);
                SuaraFa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qaff);
                TampilGambar.startAnimation(animScale);
                SuaraQof.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kaff);
                TampilGambar.startAnimation(animScale);
                SuaraKaf.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lamm);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.mimm);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nunn);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.wawuu);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.haaa);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.yaa);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });






    }


    }

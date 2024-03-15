package com.example.thinkyou;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LevelThreeActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16;

    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15;

    // 4,7,2,10,15,5,3,8,1,6,9,11,14,12,16,13

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three);
        img1 = findViewById(R.id.img_lel3_1);
        img2 = findViewById(R.id.img_lel3_2);
        img3 = findViewById(R.id.img_lel3_3);
        img4 = findViewById(R.id.img_lel3_4);
        img5 = findViewById(R.id.img_lel3_5);
        img6 = findViewById(R.id.img_lel3_6);
        img7 = findViewById(R.id.img_lel3_7);
        img8 = findViewById(R.id.img_lel3_8);
        img9 = findViewById(R.id.img_lel3_9);
        img10 = findViewById(R.id.img_lel3_10);
        img11 = findViewById(R.id.img_lel3_11);
        img12 = findViewById(R.id.img_lel3_12);
        img13 = findViewById(R.id.img_lel3_13);
        img14 = findViewById(R.id.img_lel3_14);
        img15 = findViewById(R.id.img_lel3_15);
        img16 = findViewById(R.id.img_lel3_16);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x8 == 1){
                    img1.setVisibility(View.INVISIBLE);
                    x9 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x2 == 1){
                    img2.setVisibility(View.INVISIBLE);
                    x3 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x6 == 1){
                    img3.setVisibility(View.INVISIBLE);
                    x7 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               img4.setVisibility(View.INVISIBLE);
               x1 = 1;
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x5 == 1){
                    img5.setVisibility(View.INVISIBLE);
                    x6 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x9 == 1){
                    img6.setVisibility(View.INVISIBLE);
                    x10 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(x1 == 1){
                  img7.setVisibility(View.INVISIBLE);
                  x2 = 1;
              }
              else{
                  x1=0;
                  x2=0;
                  x3=0;
                  x4=0;
                  x5=0;
                  x6=0;
                  x7=0;
                  x8=0;
                  x9=0;
                  x10=0;
                  x11=0;
                  x12=0;
                  x13=0;
                  x14=0;
                  x15=0;
                  img1.setVisibility(View.VISIBLE);
                  img2.setVisibility(View.VISIBLE);
                  img3.setVisibility(View.VISIBLE);
                  img4.setVisibility(View.VISIBLE);
                  img5.setVisibility(View.VISIBLE);
                  img6.setVisibility(View.VISIBLE);
                  img8.setVisibility(View.VISIBLE);
                  img9.setVisibility(View.VISIBLE);
                  img10.setVisibility(View.VISIBLE);
                  img11.setVisibility(View.VISIBLE);
                  img12.setVisibility(View.VISIBLE);
                  img13.setVisibility(View.VISIBLE);
                  img14.setVisibility(View.VISIBLE);
                  img15.setVisibility(View.VISIBLE);
                  img16.setVisibility(View.VISIBLE);
              }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x7 == 1){
                    img8.setVisibility(View.INVISIBLE);
                    x8 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x10 == 1){
                    img9.setVisibility(View.INVISIBLE);
                    x11 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x3 == 1){
                    img10.setVisibility(View.INVISIBLE);
                    x4 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x11 == 1){
                    img11.setVisibility(View.INVISIBLE);
                    x12 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x13 == 1){
                    img12.setVisibility(View.INVISIBLE);
                    x14 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x15 == 1){
                    img13.setVisibility(View.INVISIBLE);
                    AlertDialog.Builder alertdialog = new AlertDialog.Builder(LevelThreeActivity.this, R.style.custom_yes);
                    alertdialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(LevelThreeActivity.this,HomeActivity.class);
                            SharedPreferences sharedPreferences = getSharedPreferences("data03",MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("valid03",1);
                            editor.apply();
                            startActivity(intent);
                        }
                    });
                    alertdialog.setMessage("YOU WON");
                    alertdialog.setTitle("THINK YOU");
                    alertdialog.setCancelable(false);
                    alertdialog.show();
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                }

            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x12 == 1){
                    img14.setVisibility(View.INVISIBLE);
                    x13 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x4 == 1){
                    img15.setVisibility(View.INVISIBLE);
                    x5 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img1.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);
                }

            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x14 == 1){
                    img16.setVisibility(View.INVISIBLE);
                    x15 = 1;
                }
                else{
                    x1=0;
                    x2=0;
                    x3=0;
                    x4=0;
                    x5=0;
                    x6=0;
                    x7=0;
                    x8=0;
                    x9=0;
                    x10=0;
                    x11=0;
                    x12=0;
                    x13=0;
                    x14=0;
                    x15=0;
                    img8.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img5.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img9.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img13.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alerdialogbuilder = new AlertDialog.Builder(LevelThreeActivity.this,R.style.custom_back);
        alerdialogbuilder.setTitle("Alert !").setCancelable(false).setMessage("do you want to exit ? ").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(LevelThreeActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("No",null).create().show();
    }
}


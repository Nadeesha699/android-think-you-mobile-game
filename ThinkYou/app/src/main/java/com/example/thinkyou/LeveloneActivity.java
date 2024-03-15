package com.example.thinkyou;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LeveloneActivity extends AppCompatActivity {

    ImageView img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9;
    int x1,x2,x3,x4,x5,x6,x7,x8;

    //2,5,7,9,1,3,6,8,4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        img_1 =findViewById(R.id.img_lel1_1);
        img_2 =findViewById(R.id.home_lel_3);
        img_3 =findViewById(R.id.img_lel1_3);
        img_4 =findViewById(R.id.img_lel1_4);
        img_5 =findViewById(R.id.img_lel1_5);
        img_6 =findViewById(R.id.img_lel1_6);
        img_7 =findViewById(R.id.img_lel1_7);
        img_8 =findViewById(R.id.img_lel1_8);
        img_9 =findViewById(R.id.img_lel1_9);

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x4 == 1 ){
                    img_1.setVisibility(View.INVISIBLE);
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
                    img_7.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }

            }
        });

        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_2.setVisibility(View.INVISIBLE);
                x1 = 1;
            }
        });

        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x5 == 1 ){
                    img_3.setVisibility(View.INVISIBLE);
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
                    img_7.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_1.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }
            }
        });

        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x8 == 1 ){
                    img_4.setVisibility(View.INVISIBLE);
                    AlertDialog.Builder alertdialog = new AlertDialog.Builder(LeveloneActivity.this, R.style.custom_yes);
                    alertdialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(LeveloneActivity.this,HomeActivity.class);
                            SharedPreferences sharedPreferences = getSharedPreferences("data01",MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("valid01",1);
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
                    img_7.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_1.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }
            }

        });

        img_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if( x1 == 1 ){
                  img_5.setVisibility(View.INVISIBLE);
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
                  img_1.setVisibility(View.VISIBLE);
                  img_2.setVisibility(View.VISIBLE);
                  img_3.setVisibility(View.VISIBLE);
                  img_4.setVisibility(View.VISIBLE);
                  img_6.setVisibility(View.VISIBLE);
                  img_7.setVisibility(View.VISIBLE);
                  img_8.setVisibility(View.VISIBLE);
                  img_9.setVisibility(View.VISIBLE);
              }
            }
        });

        img_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x6 == 1 ){
                    img_6.setVisibility(View.INVISIBLE);
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
                    img_7.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_1.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }
            }
        });

        img_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x2 == 1 ){
                    img_7.setVisibility(View.INVISIBLE);
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
                    img_1.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }
            }

        });

        img_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x7 == 1 ){
                    img_8.setVisibility(View.INVISIBLE);
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
                    img_7.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_1.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_9.setVisibility(View.VISIBLE);
                }
            }
        });

        img_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( x3 == 1 ){
                    img_9.setVisibility(View.INVISIBLE);
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
                    img_1.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_5.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);
                    img_7.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alerdialogbuilder = new AlertDialog.Builder(LeveloneActivity.this,R.style.custom_back);
        alerdialogbuilder.setTitle("Alert !").setCancelable(false).setMessage("do you want to exit ? ").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(LeveloneActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("No",null).create().show();
    }
}

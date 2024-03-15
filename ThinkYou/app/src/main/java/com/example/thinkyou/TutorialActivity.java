package com.example.thinkyou;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class TutorialActivity extends AppCompatActivity {

    ImageView img_tut1,img_tut2,img_tut3,img_tut4;

    TextView txt_intro,txt_tutorial;

    int x1,x2,x3;

    // 3,1,4,2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        AlertDialog.Builder alertdialog = new AlertDialog.Builder(TutorialActivity.this, R.style.custom_alert);


        img_tut1 = findViewById(R.id.img_tut_1);
        img_tut2 = findViewById(R.id.img_tut_2);
        img_tut3 = findViewById(R.id.img_tut_3);
        img_tut4 = findViewById(R.id.img_tut_4);

        txt_intro = findViewById(R.id.txt_introduction);
        txt_tutorial = findViewById(R.id.txt_tutorial);

        txt_tutorial.setVisibility(View.INVISIBLE);

        img_tut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x1 == 1){
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut1.setVisibility(View.INVISIBLE);
                    x2 = 1;
                    txt_tutorial.setVisibility(View.VISIBLE);
                    txt_tutorial.setText("had been selected right icon");
                    txt_tutorial.setTextColor(GREEN);
                }
                else {
                    x1=0;
                    x2=0;
                    x3=0;
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut2.setVisibility(View.VISIBLE);
                    img_tut3.setVisibility(View.VISIBLE);
                    img_tut4.setVisibility(View.VISIBLE);
                    txt_tutorial.setVisibility(View.VISIBLE);
                    txt_tutorial.setText("had been selected wrong icon");
                    txt_tutorial.setTextColor(RED);
                }
            }
        });

        img_tut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x3 == 1){
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut2.setVisibility(View.INVISIBLE);
                    txt_tutorial.setVisibility(View.INVISIBLE);
                    alertdialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(TutorialActivity.this,HomeActivity.class);
                            startActivity(intent);
                        }
                    });
                    alertdialog.setMessage("TUTORIAL COMPLETED");
                    alertdialog.setTitle("THINK YOU");
                    alertdialog.setCancelable(false);
                    alertdialog.show();
                }
                else {
                    x1=0;
                    x2=0;
                    x3=0;
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut4.setVisibility(View.VISIBLE);
                    img_tut3.setVisibility(View.VISIBLE);
                    img_tut1.setVisibility(View.VISIBLE);
                    txt_tutorial.setVisibility(View.VISIBLE);
                    txt_tutorial.setText("had been selected wrong icon");
                    txt_tutorial.setTextColor(RED);
                }
            }
        });

        img_tut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               img_tut3.setVisibility(View.INVISIBLE);
               x1 = 1;
               txt_intro.setVisibility(View.INVISIBLE);
                txt_tutorial.setVisibility(View.VISIBLE);
                txt_tutorial.setText("had been selected right icon");
                txt_tutorial.setTextColor(GREEN);
            }
        });

        img_tut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x2 == 1){
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut4.setVisibility(View.INVISIBLE);
                    x3 = 1;
                    txt_tutorial.setVisibility(View.VISIBLE);
                    txt_tutorial.setText("had been selected right icon");
                    txt_tutorial.setTextColor(GREEN);
                }
                else {
                    x1=0;
                    x2=0;
                    x3=0;
                    txt_intro.setVisibility(View.INVISIBLE);
                    img_tut2.setVisibility(View.VISIBLE);
                    img_tut3.setVisibility(View.VISIBLE);
                    img_tut1.setVisibility(View.VISIBLE);
                    txt_tutorial.setVisibility(View.VISIBLE);
                    txt_tutorial.setText("had been selected wrong icon");
                    txt_tutorial.setTextColor(RED);
                }
            }
        });


    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alerdialogbuilder = new AlertDialog.Builder(TutorialActivity.this,R.style.custom_back);
        alerdialogbuilder.setTitle("Alert !").setCancelable(false).setMessage("do you want to exit ? ").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(TutorialActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("No",null).create().show();
    }
}

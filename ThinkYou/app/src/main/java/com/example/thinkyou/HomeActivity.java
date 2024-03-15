package com.example.thinkyou;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {

    ImageView home_lel1,home_lel2,home_lel3,home_lel4,home_tutorial;
    ImageView home_lel1_star1,home_lel1_star2,home_lel1_star3,home_lel2_star1,home_lel2_star2,home_lel2_star3,home_lel3_star1,home_lel3_star2,home_lel3_star3;
    ImageView home_lel1_bStar,home_lel2_bStar,home_lel3_bStar;
    TextView home_lel1_txt,home_lel2_txt,home_lel3_txt,home_lel4_txt;

    int valid1 ,valid2, valid3;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home_lel1 = findViewById(R.id.home_lel_1);
        home_lel2 = findViewById(R.id.home_lel_2);
        home_lel3 = findViewById(R.id.home_lel_3);
        home_lel4 = findViewById(R.id.home_lels_4);
        home_tutorial = findViewById(R.id.home_tutorial);

        home_lel1_star1 = findViewById(R.id.home_lel1_star1);
        home_lel1_star2 = findViewById(R.id.home_lel1_star2);
        home_lel1_star3 = findViewById(R.id.home_lel1_star3);

        home_lel2_star1 = findViewById(R.id.home_lel2_star1);
        home_lel2_star2 = findViewById(R.id.home_lel2_star2);
        home_lel2_star3 = findViewById(R.id.home_lel2_star3);

        home_lel3_star1 = findViewById(R.id.home_lel3_star1);
        home_lel3_star2 = findViewById(R.id.home_lel3_star2);
        home_lel3_star3 = findViewById(R.id.home_lel3_star3);

        home_lel1_bStar = findViewById(R.id.home_lel1_bStart);
        home_lel2_bStar = findViewById(R.id.home_lel2_bStart);
        home_lel3_bStar = findViewById(R.id.home_lel3_bStart);

        home_lel1_txt = findViewById(R.id.home_lel1_txt);
        home_lel2_txt = findViewById(R.id.home_lel2_txt);
        home_lel3_txt = findViewById(R.id.home_lel3_txt);
        home_lel4_txt = findViewById(R.id.home_lel4_txt);


        home_lel2.setVisibility(View.INVISIBLE);
        home_lel3.setVisibility(View.INVISIBLE);
        home_lel4.setVisibility(View.INVISIBLE);

        home_lel2_star1.setVisibility(View.INVISIBLE);
        home_lel2_star2.setVisibility(View.INVISIBLE);
        home_lel2_star3.setVisibility(View.INVISIBLE);

        home_lel3_star1.setVisibility(View.INVISIBLE);
        home_lel3_star2.setVisibility(View.INVISIBLE);
        home_lel3_star3.setVisibility(View.INVISIBLE);

        home_lel1_bStar.setVisibility(View.INVISIBLE);
        home_lel2_bStar.setVisibility(View.INVISIBLE);
        home_lel3_bStar.setVisibility(View.INVISIBLE);

        home_lel2_txt.setVisibility(View.INVISIBLE);
        home_lel3_txt.setVisibility(View.INVISIBLE);
        home_lel4_txt.setVisibility(View.INVISIBLE);

        sharedPreferences = getSharedPreferences("data01",MODE_PRIVATE);
        valid1 = sharedPreferences.getInt("valid01",0);

        sharedPreferences = getSharedPreferences("data02",MODE_PRIVATE);
        valid2 = sharedPreferences.getInt("valid02",0);

        sharedPreferences = getSharedPreferences("data03",MODE_PRIVATE);
        valid3 = sharedPreferences.getInt("valid03",0);

        if(valid1 == 1 ){
            home_lel2.setVisibility(View.VISIBLE);

            home_lel2_star1.setVisibility(View.VISIBLE);
            home_lel2_star2.setVisibility(View.VISIBLE);
            home_lel2_star3.setVisibility(View.VISIBLE);

            home_lel1_bStar.setVisibility(View.VISIBLE);

            home_lel2_txt.setVisibility(View.VISIBLE);
        }

        if(valid2 == 1 ){
            home_lel3.setVisibility(View.VISIBLE);

            home_lel3_star1.setVisibility(View.VISIBLE);
            home_lel3_star2.setVisibility(View.VISIBLE);
            home_lel3_star3.setVisibility(View.VISIBLE);

            home_lel2_bStar.setVisibility(View.VISIBLE);

            home_lel3_txt.setVisibility(View.VISIBLE);
        }

        if(valid3 == 1 ){
            home_lel4.setVisibility(View.VISIBLE);

            home_lel3_bStar.setVisibility(View.VISIBLE);

            home_lel4_txt.setVisibility(View.VISIBLE);
        }

        home_lel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LeveloneActivity.class);
                startActivity(intent);
            }
        });

        home_lel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LevelTwoActivity.class);
                startActivity(intent);
            }
        });

        home_lel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LevelThreeActivity.class);
                startActivity(intent);
            }
        });

        home_tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,TutorialActivity.class);
                startActivity(intent);
            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alerdialogbuilder = new AlertDialog.Builder(HomeActivity.this,R.style.custom_back);
        alerdialogbuilder.setTitle("Alert !").setCancelable(false).setMessage("do you want to exit ? ").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("No",null).create().show();
    }
}

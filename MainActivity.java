package com.example.termaplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private ImageButton happy;
    private ImageButton angle;
    private ImageButton sad;
    private ImageButton christmas;
    private ImageButton summer;
    private ImageButton spring;
    ImageView pochun1;
    ImageView pochun2;
    Button btn;

    int index = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        happy = findViewById(R.id.happy);
        angle = findViewById(R.id.angle);
        sad = findViewById(R.id.sad);
        christmas = findViewById(R.id.christmas);
        summer = findViewById(R.id.summer);
        spring = findViewById(R.id.spring);
        pochun1 = findViewById(R.id.pochun1);
        pochun2 = findViewById(R.id.pochun2);
        btn = (Button) findViewById(R.id.btn);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);

            }

        });


       angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);

            }

        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent);
            }

        });

        christmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                startActivity(intent);

            }

        });



        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity4.class);
                startActivity(intent);

            }

        });

        spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity5.class);
                startActivity(intent);
            }

        });


        btn.setOnClickLisner(new View.OnClickListener() {
            @Override
            index = random.nextInt(2);

            switch (index) {
                case 0:
                    pochun1.setVisibility(View.VISIBLE);
                    pochun2.setVisibility(View.INVISIBLE);
                    break;

                case 1:
                    pochun1.setVisibility(View.VISIBLE);
                    pochun2.setVisibility(View.INVISIBLE);

                    break;




            }
        });






    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Random;
import java.util.Scanner;

public class SubActivity extends AppCompatActivity {

    Button click;
    Button btnTest;
    TextView generate;
    ImageView lucky1;
    ImageView lucky2;
    ImageView lucky3;
    ImageView lucky4;
    ImageView lucky5;
    int index = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        final Random myRandom= new Random();

        lucky1 = findViewById(R.id.lucky1);
        lucky2 = findViewById(R.id.lucky2);
        lucky3 = findViewById(R.id.lucky3);
        lucky4 = findViewById(R.id.lucky4);
        lucky5 = findViewById(R.id.lucky5);
        btnTest = (Button) findViewById(R.id.btnTest);
        click = (Button) findViewById(R.id.click);
        final TextView generate= (TextView)findViewById(R.id.generate);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate.setText(String.valueOf(myRandom.nextInt(100)));

            }


        btnTest.setOnClickLisner(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = random.nextInt(5);

                switch (index) {
                    case 0:
                        lucky1.setVisibility(View.VISIBLE);
                        lucky2.setVisibility(View.INVISIBLE);
                        lucky3.setVisibility(View.INVISIBLE);
                        lucky4.setVisibility(View.INVISIBLE);
                        lucky5.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        lucky2.setVisibility(View.VISIBLE);
                        lucky1.setVisibility(View.INVISIBLE);
                        lucky3.setVisibility(View.INVISIBLE);
                        lucky4.setVisibility(View.INVISIBLE);
                        lucky5.setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        lucky3.setVisibility(View.VISIBLE);
                        lucky2.setVisibility(View.INVISIBLE);
                        lucky1.setVisibility(View.INVISIBLE);
                        lucky4.setVisibility(View.INVISIBLE);
                        lucky5.setVisibility(View.INVISIBLE);
                        break;

                    case 3:
                        lucky4.setVisibility(View.VISIBLE);
                        lucky2.setVisibility(View.INVISIBLE);
                        lucky3.setVisibility(View.INVISIBLE);
                        lucky1.setVisibility(View.INVISIBLE);
                        lucky5.setVisibility(View.INVISIBLE);
                        break;

                    case 4:
                        lucky5.setVisibility(View.VISIBLE);
                        lucky2.setVisibility(View.INVISIBLE);
                        lucky3.setVisibility(View.INVISIBLE);
                        lucky4.setVisibility(View.INVISIBLE);
                        lucky1.setVisibility(View.INVISIBLE);
                        break;


                }
            }
        });
    }
}

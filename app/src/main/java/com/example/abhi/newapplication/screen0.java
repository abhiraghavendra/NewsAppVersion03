package com.example.abhi.newapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, Business.class));
            }
        });

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, topStories.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.button4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, entertainment.class));
            }
        });

        Button btn4 = (Button) findViewById(R.id.button5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, sports.class));
            }
        });

        Button btn5 = (Button) findViewById(R.id.button3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, Technology.class));
            }
        });

        Button btn6 = (Button) findViewById(R.id.back1);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(screen0.this, MainActivity.class));
            }
        });
    }
}

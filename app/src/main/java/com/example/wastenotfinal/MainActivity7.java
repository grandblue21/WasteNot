package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {

    ImageButton rewrite;
    ImageButton home;
    ImageButton menu;
    ImageButton inventory;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        rewrite = findViewById(R.id.imageButton5);
        home = findViewById(R.id.imageButton8);
        menu = findViewById(R.id.imageButton9);
        inventory = findViewById(R.id.imageButton10);
        back = findViewById(R.id.imageButton);

        rewrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, DummySettings.class);
                startActivity(intent);
            }
        });


    }
}
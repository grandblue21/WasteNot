package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    ImageButton home;
    ImageButton profile;
    ImageButton menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        home = findViewById(R.id.imageButton8);
        profile = findViewById(R.id.profilebutton);
        menu = findViewById(R.id.imageButton9);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, DummySettings.class);
                startActivity(intent);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}
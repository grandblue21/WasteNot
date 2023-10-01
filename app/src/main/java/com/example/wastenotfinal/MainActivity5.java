package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {

    ImageButton home;
    ImageButton profile;
    ImageButton inventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        home = findViewById(R.id.imageButton8);
        profile = findViewById(R.id.profilebutton);
        inventory = findViewById(R.id.imageButton10);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, DummySettings.class);
                startActivity(intent);
            }
        });

        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConsumerProfile extends AppCompatActivity {

    ImageButton editprof;
    ImageButton settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_profile);

        editprof = findViewById(R.id.imageButton5);
        settings = findViewById(R.id.imageButton);

        editprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerProfile.this, ConsumerEditProfile.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerProfile.this, ConsumerSettings.class);
                startActivity(intent);
            }
        });

    }
}
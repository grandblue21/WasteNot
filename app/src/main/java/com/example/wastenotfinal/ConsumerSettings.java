package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConsumerSettings extends AppCompatActivity {

    ImageButton profile;
    ImageButton homebutton;
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_settings);

        profile = findViewById(R.id.imageButton18);
        homebutton = findViewById(R.id.imageButton16);
        logout = findViewById(R.id.textView16);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerSettings.this, ConsumerProfile.class);
                startActivity(intent);
            }
        });

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerSettings.this, ConsumerHome.class);
                startActivity(intent);
            }
        });

        logout.setClickable(true);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerSettings.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
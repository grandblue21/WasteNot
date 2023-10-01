package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConsumerHome extends AppCompatActivity {

    ImageButton bell;
    ImageButton profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_home);

        bell = findViewById(R.id.bellNotif);
        profile = findViewById(R.id.profilebutton);

        bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerHome.this, ConsumerNotification.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerHome.this, ConsumerSettings.class);
                startActivity(intent);
            }
        });

    }
}
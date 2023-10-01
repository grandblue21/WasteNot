package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ConsumerEditProfile extends AppCompatActivity {

    ImageButton backbutton;
    ImageButton cancelbtn;
    ImageButton confirmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_edit_profile);

        backbutton = findViewById(R.id.imageButton14);
        cancelbtn = findViewById(R.id.imageButton15);
        confirmbtn = findViewById(R.id.imageButton17);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerEditProfile.this, ConsumerSettings.class);
                startActivity(intent);
            }
        });

        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerEditProfile.this, ConsumerProfile.class);
                startActivity(intent);
            }
        });

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConsumerEditProfile.this, "Successfully Modified User Profile.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ConsumerEditProfile.this, ConsumerProfile.class);
                startActivity(intent);
            }
        });
    }
}
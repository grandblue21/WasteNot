package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DummySettings extends AppCompatActivity {
    TextView logout;
    ImageButton profile;
    ImageButton backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_settings);

        logout = findViewById(R.id.textView16);
        profile = findViewById(R.id.imageButton18);
        backbutton = findViewById(R.id.imageButton16);

        logout.setClickable(true);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DummySettings.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DummySettings.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DummySettings.this, MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}
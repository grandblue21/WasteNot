package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton menu;
    ImageButton lumpia;
    ImageButton profile;
    ImageButton inventoryicon;
    ImageButton notify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        menu = findViewById(R.id.imageButton9);
        lumpia = findViewById(R.id.imageButton13);
        profile = findViewById(R.id.profilebutton);
        inventoryicon = findViewById(R.id.imageButton10);
        notify = findViewById(R.id.imageButton7);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        lumpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, DishDescription.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, DummySettings.class);
                startActivity(intent);
            }
        });

        inventoryicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, Notifications.class);
                startActivity(intent);
            }
        });
    }
}
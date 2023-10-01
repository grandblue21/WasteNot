package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ConsumerLogin extends AppCompatActivity {

    ImageButton registerbtn;
    ImageButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_login);

        registerbtn = findViewById(R.id.register);
        login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerLogin.this, ConsumerHome.class);
                startActivity(intent);
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerLogin.this, ConsumerRegistration.class);
                startActivity(intent);
            }
        });
    }
}
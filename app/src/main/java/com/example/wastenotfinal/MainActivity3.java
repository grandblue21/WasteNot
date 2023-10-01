package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
    ImageButton loginbtn;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);

        loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
//                String username = email.getText().toString().trim();
//                String passkey = password.getText().toString().trim();
//
//                if (username.isEmpty() || passkey.isEmpty()) {
//                    Toast.makeText(MainActivity3.this, "Please enter both username and password.", Toast.LENGTH_SHORT).show();
//                } else if (!username.equals("your_username") || !password.equals("your_password")) {
//                    // Validates the Credential inputs
//                    Toast.makeText(MainActivity3.this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
//                } else {
//                    // This means that if the Credentials are valid
//                    Toast.makeText(MainActivity3.this, "Login successful!", Toast.LENGTH_SHORT).show();
//
//                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
//                    startActivity(intent);
//                }
            }
        });

    }
}
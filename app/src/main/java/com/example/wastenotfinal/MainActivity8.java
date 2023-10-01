package com.example.wastenotfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    ImageButton backbtn, cancel, submit;
    ImageButton home;
    ImageButton menu;
    ImageButton inventory;
    EditText ownerName, emailOwner, phoneNumber, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ownerName = findViewById(R.id.ownerNameTextBox);
        emailOwner = findViewById(R.id.emailTextBox);
        phoneNumber = findViewById(R.id.phoneNumberTextBox);
        address = findViewById(R.id.addressTextBox);
        backbtn = findViewById(R.id.imageButton14);
        cancel = findViewById(R.id.imageButton15);
        submit = findViewById(R.id.imageButton17);
        home = findViewById(R.id.imageButton8);
        menu = findViewById(R.id.imageButton9);
        inventory = findViewById(R.id.imageButton10);


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Error! Invalid Input", Toast.LENGTH_SHORT).show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String owner = ownerName.getText().toString().trim();
                String email = emailOwner.getText().toString().trim();
                String phone = phoneNumber.getText().toString().trim();
                String location = address.getText().toString().trim();

                if (owner.isEmpty() && email.isEmpty() && phone.isEmpty() && location.isEmpty()) {
                    Toast.makeText(MainActivity8.this, "Fill In Missing Fields", Toast.LENGTH_SHORT).show();
                } else {
                    // This means that if the Credentials are valid
                    Toast.makeText(getApplicationContext(), "Restaurant Profile Successfully Modified", Toast.LENGTH_SHORT).show();
                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}
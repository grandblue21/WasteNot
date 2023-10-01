package com.example.wastenotfinal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.database.FirebaseDatabase;

public class ConsumerRegistration extends AppCompatActivity {

    ImageButton login;
    ImageButton registrationbtn;
    EditText displayName;
    EditText firstName;
    EditText lastName;
    EditText address;
    EditText email;
    EditText password;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_registration);

        login = findViewById(R.id.botbot);
        registrationbtn = findViewById(R.id.registration);
        displayName = findViewById(R.id.editTextTextPersonName);
        firstName = findViewById(R.id.editTextTextPersonName2);
        lastName = findViewById(R.id.editTextTextPersonName3);
        address = findViewById(R.id.editTextTextPersonName4);
        email = findViewById(R.id.editTextTextPersonName6);
        password = findViewById(R.id.editTextTextPersonName7);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("users");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConsumerRegistration.this, ConsumerLogin.class);
                startActivity(intent);
            }
        });

        registrationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }
    private void registerUser() {
        final String userName = displayName.getText().toString(); //This is the value for the User's Username/Display Name
        final String fName = firstName.getText().toString(); // This is the value for the User's First Name
        final String lName = lastName.getText().toString(); // This is the value for the User's Last Name
        final String place = address.getText().toString(); // This is the value for the User's Address
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();


        mAuth.createUserWithEmailAndPassword(userEmail, userPassword) //This is the setter for the User Email and Password
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Registration successful, create user profile in the database
                            String userId = mAuth.getCurrentUser().getUid();
                            DatabaseReference currentUserDb = mDatabase.child(userId);
                            currentUserDb.child("first_name").setValue(firstName);
                            currentUserDb.child("last_name").setValue(lastName);
                            currentUserDb.child("address").setValue(address);

                            Toast.makeText(ConsumerRegistration.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                            // You can navigate to the next activity or perform any other actions here.
                        } else {
                            // Registration failed, display an error message
                            Toast.makeText(ConsumerRegistration.this, "Registration failed. Please try again.", Toast.LENGTH_SHORT).show();
                        }
                    }

                });
    }

}
package com.example.sweetapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sweetapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class ChaletOwnerSingupActivity extends AppCompatActivity {

    EditText chaletOwnerName, chaletOwnerPhone, chaletOwnerEmail, chaletOwnerPassword;
    Button chaletOwnerRegister;
    FirebaseAuth mAuth;
    String Email, Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalet_owner_singup);
        chaletOwnerName = findViewById(R.id.chaletOwnerName);
        chaletOwnerPhone = findViewById(R.id.chaletOwnerPhone);
        chaletOwnerEmail = findViewById(R.id.chaletOwnerEmail);
        chaletOwnerPassword = findViewById(R.id.chaletOwnerPassword);
        chaletOwnerRegister = findViewById(R.id.chaletOwnerRegister);
        mAuth = FirebaseAuth.getInstance();


        chaletOwnerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerChaletOwner();
            }
        });


    }

    private void registerChaletOwner() {
        Email = chaletOwnerEmail.getText().toString().trim();
        Password = chaletOwnerPassword.getText().toString().trim();
        if (Email.isEmpty()) {
            chaletOwnerEmail.setError("Please Enter Email");
            chaletOwnerEmail.requestFocus();
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (Password.isEmpty()) {
            chaletOwnerPassword.setError("Please Enter Password");
            chaletOwnerPassword.requestFocus();
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (Password.length() < 6) {
            chaletOwnerPassword.setError("Minimum length of password should be 6");
            chaletOwnerPassword.requestFocus();
            Toast.makeText(this, "Minimum length of password should be 6", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    finish();
                    startActivity(new Intent(ChaletOwnerSingupActivity.this, ChaletOwnerMainActivity.class));
                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }


        });
    }
}
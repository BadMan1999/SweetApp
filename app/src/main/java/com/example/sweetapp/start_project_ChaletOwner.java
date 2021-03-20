package com.example.sweetapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class start_project_ChaletOwner extends AppCompatActivity {
    Button btn_sgin_up_ChaletOwner, btn_Login_ChaletOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_project_chaletowner);
        btn_Login_ChaletOwner = findViewById(R.id.btn_Login_ChaletOwner);
        btn_sgin_up_ChaletOwner = findViewById(R.id.btn_sgin_up_ChaletOwner);

        btn_Login_ChaletOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(start_project_ChaletOwner.this,Login_Chalet_Owner.class);
                startActivity(intent);
                finish();
            }
        });
                btn_sgin_up_ChaletOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(start_project_ChaletOwner.this,sign_up_ChaletOwner.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
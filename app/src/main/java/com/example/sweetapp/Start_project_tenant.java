package com.example.sweetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_project_tenant extends AppCompatActivity {
    Button btn_sgin_up_tenant, btn_Login_Chalettenant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_project_tenant);


        btn_Login_Chalettenant = findViewById(R.id.btn_Login_tenant);
        btn_sgin_up_tenant = findViewById(R.id.btn_sgin_up_tenant);

        btn_Login_Chalettenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(Start_project_tenant.this,);
//                startActivity(intent);
//                finish();
            }
        });
        btn_sgin_up_tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Start_project_tenant.this,sign_up_tenant.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
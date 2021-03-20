package com.example.sweetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selctor_in_human extends AppCompatActivity {
    Button btn_Chalet_Owner,btn_tenant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selctor_in_human);

        btn_Chalet_Owner=findViewById(R.id.btn_Chalet_Owner);
        btn_tenant=findViewById(R.id.btn_tenant);


        btn_Chalet_Owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Selctor_in_human.this, start_project_ChaletOwner.class);
                startActivity(intent);
                finish();
            }
        });


        btn_tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Selctor_in_human.this, Start_project_tenant.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
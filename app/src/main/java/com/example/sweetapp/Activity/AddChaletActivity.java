package com.example.sweetapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sweetapp.R;

public class AddChaletActivity extends AppCompatActivity {

    Button Services ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chalet);

        Services=findViewById(R.id.Services);

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPopUpWindow();
            }
        });







    }

    private void openPopUpWindow() {

        Intent PopUpWindow=new Intent(AddChaletActivity.this,PopUpWindowChalet.class);
    }


}
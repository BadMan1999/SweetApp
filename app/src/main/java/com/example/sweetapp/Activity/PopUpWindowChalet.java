package com.example.sweetapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;

import com.example.sweetapp.R;

public class PopUpWindowChalet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_window_chalet);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int Width=dm.widthPixels;
        int hight=dm.heightPixels;


        getWindow().setLayout((int)(Width*.7),(int)(hight*.5));

        WindowManager.LayoutParams params =getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y=-20;


        getWindow().setAttributes(params);




    }
}
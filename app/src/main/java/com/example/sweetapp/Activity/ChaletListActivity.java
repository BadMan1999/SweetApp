package com.example.sweetapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sweetapp.Adapter.AdapterChaletlistOwner;
import com.example.sweetapp.Adapter_Iteam.AdapterIteamChaletList;
import com.example.sweetapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ChaletListActivity extends AppCompatActivity {
    FloatingActionButton AddChalet;
    RecyclerView recyclerView;

    ArrayList<AdapterIteamChaletList>adapterIteamChaletLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalet_list);

        recyclerView=findViewById(R.id.rec_chalitlist);

        AddChalet = findViewById(R.id.AddChalet);
        AddChalet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });












        AdapterChaletlistOwner adapterChaletlistOwner=new AdapterChaletlistOwner(adapterIteamChaletLists);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapterChaletlistOwner);

    }
}
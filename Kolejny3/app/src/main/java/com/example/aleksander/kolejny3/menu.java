package com.example.aleksander.kolejny3;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by aleksander on 01.10.2017.
 */

public class menu extends AppCompatActivity {

    private Button br;
    private Button bo;
    private Button bw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.przycisk1212);

        br = (Button) findViewById(R.id.abc);
        bo = (Button) findViewById(R.id.cba);
        bw = (Button) findViewById(R.id.zad3);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Aktywnosc_2.class);
                startActivity(intent);

            }
        });

        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), google.class);
                startActivity(intent);
            }
        });

        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mail.class);
                startActivity(intent);
            }
        });


    }
}

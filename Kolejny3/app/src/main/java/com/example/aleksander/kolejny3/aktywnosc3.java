package com.example.aleksander.kolejny3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by aleksander on 01.10.2017.
 */

public class aktywnosc3 extends AppCompatActivity {

    private TextView tak;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.druga);

        tak = (TextView) findViewById(R.id.text3);
       Intent intent = getIntent();
        if(intent != null) {
            String text = intent.getStringExtra("cos");
            tak.setText(text);
        }



    }
}

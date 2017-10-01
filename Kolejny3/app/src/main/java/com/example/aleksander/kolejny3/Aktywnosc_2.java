package com.example.aleksander.kolejny3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Aktywnosc_2 extends AppCompatActivity {

    private EditText tak;
    private Button br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pierwsza);

        tak = (EditText) findViewById(R.id.edit);
        br = (Button) findViewById(R.id.gu);

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String napis = tak.getText().toString();
                Intent intent = new Intent(getApplicationContext(),aktywnosc3.class);
                intent.putExtra("cos", napis);
                startActivity(intent);

            }
        });



    }
}

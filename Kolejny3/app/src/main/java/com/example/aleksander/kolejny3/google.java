package com.example.aleksander.kolejny3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by aleksander on 01.10.2017.
 */

public class google extends AppCompatActivity {

    private EditText ET;
    private Button BT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google);

        ET = (EditText) findViewById(R.id.ka);
        BT = (Button) findViewById(R.id.bton);

        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sr = ET.getText().toString();
                openWebPage(sr);
            }
        });
    }
        public void openWebPage(String url) {
            Uri webpage = Uri.parse("https://www.google.pl/search?q=" + url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);

        }
    }
}

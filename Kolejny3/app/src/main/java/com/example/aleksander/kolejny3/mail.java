package com.example.aleksander.kolejny3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.Subject;

/**
 * Created by aleksander on 01.10.2017.
 */

public class mail extends AppCompatActivity {

    private EditText adres;
    private EditText temat;
    private EditText wiadomosc;
    private Button przy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail);

        adres = (EditText) findViewById(R.id.mail1);
        temat = (EditText) findViewById(R.id.temat1);
        wiadomosc = (EditText)findViewById(R.id.wiadomosc);
        przy = (Button)findViewById(R.id.btn);

        przy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = adres.getText().toString();
                String sub = temat.getText().toString();
                String text = wiadomosc.getText().toString();

                String[] tabAdres ={email};

                composeEmail(tabAdres, sub, text);

            }
        });
    }

    public void composeEmail(String[] addresses, String subject, String text) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }else{
            Toast.makeText(this, "Nie masz aplikacji mailowej", Toast.LENGTH_SHORT).show();
        }

    }
}

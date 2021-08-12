package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class Jaqueta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button jaquetaP = findViewById(R.id.jaquetaP);
        Button jaquetaM = findViewById(R.id.jaquetaM);
        Button jaquetaG = findViewById(R.id.jaquetaG);

    jaquetaP.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.9 metros", Toast.LENGTH_LONG).show();

            }
        });
    jaquetaM.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "2.2 metros", Toast.LENGTH_LONG).show();

            }
        });
    jaquetaG.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "2.7 metros", Toast.LENGTH_LONG).show();

            }
        });
    }
}
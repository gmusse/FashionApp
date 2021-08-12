package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Regata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regata);

        Button regataP = findViewById(R.id.regataP);
        Button regataM = findViewById(R.id.regataM);
        Button regataG = findViewById(R.id.regataG);

        regataP.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "0.9 metros", Toast.LENGTH_LONG).show();

            }
        });
        regataM.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.5 metros", Toast.LENGTH_LONG).show();

            }
        });
        regataG.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.7 metros", Toast.LENGTH_LONG).show();

            }
        });
    }
}
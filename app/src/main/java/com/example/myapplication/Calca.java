package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Calca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calca);

        Button calcaP = findViewById(R.id.calcaP);
        Button calcaM = findViewById(R.id.calcaM);
        Button calcaG = findViewById(R.id.calcaG);

        calcaP.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.4 metros", Toast.LENGTH_LONG).show();

            }
        });
        calcaM.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.7 metros", Toast.LENGTH_LONG).show();

            }
        });
        calcaG.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "2.2 metros", Toast.LENGTH_LONG).show();

            }
        });
    }
}
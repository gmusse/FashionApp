package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Camisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisa);

        Button camisaP = findViewById(R.id.camisaP);
        Button camisaM = findViewById(R.id.camisaM);
        Button camisaG = findViewById(R.id.camisaG);

        camisaP.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.4 metros", Toast.LENGTH_LONG).show();

            }
        });
        camisaM.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1.7 metros", Toast.LENGTH_LONG).show();

            }
        });
        camisaG.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "2.0 metros", Toast.LENGTH_LONG).show();

            }
        });
    }
}
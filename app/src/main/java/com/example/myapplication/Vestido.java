package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Vestido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vestido);

        Button vestidoP = findViewById(R.id.vestidoP);
        Button vestidoM = findViewById(R.id.vestidoM);
        Button vestidoG = findViewById(R.id.vestidoG);

        vestidoP.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "3.2 metros", Toast.LENGTH_LONG).show();

            }
        });
        vestidoM.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "3.7 metros", Toast.LENGTH_LONG).show();

            }
        });
        vestidoG.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "5.2 metros", Toast.LENGTH_LONG).show();

            }
        });
    }
}

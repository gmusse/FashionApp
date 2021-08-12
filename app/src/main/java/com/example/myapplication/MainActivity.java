package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoJaqueta = findViewById(R.id.botaoJaqueta);
        Button botaoCamisa = findViewById(R.id.botaoCamisa);
        Button botaoRegata = findViewById(R.id.botaoRegata);
        Button botaoCalca = findViewById(R.id.botaoCalca);
        Button botaoVestido = findViewById(R.id.botaoVestido);

        botaoJaqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jaqueta = new Intent(MainActivity.this, Jaqueta.class);
                startActivity(jaqueta);
            }
        });

        botaoCamisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camisa = new Intent(MainActivity.this, Camisa.class);
                startActivity(camisa);
            }
        });
        botaoRegata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regata = new Intent(MainActivity.this, Regata.class);
                startActivity(regata);
            }
        });

        botaoCalca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calca = new Intent(MainActivity.this, Calca.class);
                startActivity(calca);
            }
        });

        botaoVestido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vestido = new Intent(MainActivity.this, Vestido.class);
                startActivity(vestido);
            }
        });
    }
}

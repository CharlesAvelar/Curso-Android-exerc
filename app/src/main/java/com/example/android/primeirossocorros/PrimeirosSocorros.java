package com.example.android.primeirossocorros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class PrimeirosSocorros extends AppCompatActivity {

    private Button botao;
    private Button botao2;
    private Button botao3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros);
        botao = (Button) findViewById(R.id.button2);
        botao2 = (Button) findViewById(R.id.button7);
        botao3 = (Button) findViewById(R.id.button5);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimeirosSocorros.this, desmaio.class);
                startActivity(intent);
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimeirosSocorros.this, Epilepsia.class);
                startActivity(intent);
            }
        });
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimeirosSocorros.this, ParadaCardiaca.class);
                startActivity(intent);
            }
        });
    }




    }


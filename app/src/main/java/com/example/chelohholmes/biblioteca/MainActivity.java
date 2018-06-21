package com.example.chelohholmes.biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Iniciar(View view) {
        Intent i = new Intent (this, Busqueda.class);
        startActivity(i);
    }

    public void Registrar(View view) {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}
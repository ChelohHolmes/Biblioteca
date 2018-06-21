package com.example.chelohholmes.biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrado);
    }

    public void Volver(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}

package com.example.chelohholmes.biblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);

        TextView nombre = (TextView) findViewById(R.id.Nombre);
        TextView autor = (TextView) findViewById(R.id.Autor);
        TextView descripcion = (TextView) findViewById(R.id.Descripcion);
        ImageView imagen = (ImageView) findViewById(R.id.Imagens);

        Intent recieve = getIntent();

        String Noms = recieve.getStringExtra("Nombre");
        String Auts = recieve.getStringExtra("Autor");
        String Descs = recieve.getStringExtra("Descripcion");
        String Ims = recieve.getStringExtra("Imagen");

        nombre.setText(Noms);
        autor.setText(Auts);
        descripcion.setText(Descs);
        Picasso.get().load(Ims).into(imagen);


    }
}
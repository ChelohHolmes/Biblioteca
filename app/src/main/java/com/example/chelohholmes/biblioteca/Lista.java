package com.example.chelohholmes.biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Lista extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);
        ListView Jorge = (ListView) findViewById(R.id.list);
        Adapter buenas = new Adapter();
        Origen noches = new Origen();
        buenas.context=this;
        buenas.ListaArreglo=noches.showAll();
        Jorge.setAdapter(buenas);

        Jorge.setOnItemClickListener (new AdapterView.OnItemClickListener()
              {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                      Intent ElIntent = new Intent(Lista.this, Resultados.class);
                      Libro x = (Libro) parent.getItemAtPosition(i);
                      ElIntent.putExtra("Nombre", x.Nombre);
                      ElIntent.putExtra("Autor", x.Autor);
                      ElIntent.putExtra("Descripcion", x.Descripcion);
                      ElIntent.putExtra("Imagen", x.Imagen);

                      startActivity(ElIntent);

                  }
              }
        );

    }
}
package com.example.chelohholmes.biblioteca;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Clase de pantalla de búsqueda.

public class Busqueda extends AppCompatActivity {
    BaseDatos myDb;
    Button Ham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busqueda);
        //Ham = (Button)findViewById(R.id.Buscar);
        //vers();
    }

    public void Buscar(View view) {
        Intent i = new Intent(this, Lista.class);
        startActivity(i); //Botón que manda a resultados
    }

   /* public void vers()
    {
        Ham.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Cursor res = myDb.info();
                        if(res.getCount() == 0){
                            mostrar("Error", "No data");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()){
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Nombre :"+ res.getString(1)+ "\n");
                            buffer.append("Apellido :"+ res.getString(1)+ "\n");
                            buffer.append("Hamana :"+ res.getString(1)+ "\n\n");
                            mostrar("Data", buffer.toString());
                        }
                    }
                }
        );
    }*/

  /*  public void mostrar(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }*/

    public void Cerrar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i); //Botón que regresa a inicio.
        Toast cs = Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT);
        cs.show(); //Mensaje de sesión cerrada.
    }
}
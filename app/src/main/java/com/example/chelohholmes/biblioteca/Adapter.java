package com.example.chelohholmes.biblioteca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends BaseAdapter{
    public ArrayList<Libro> ListaArreglo;
    Context context;

    @Override
    public int getCount() {
        return ListaArreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return ListaArreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaArreglo.get(i).ID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflate;
        inflate = LayoutInflater.from(context);
        View v = inflate.inflate(R.layout.resultados, null);
        TextView nombre = (TextView) v.findViewById(R.id.Nombre);
        TextView autor = (TextView) v.findViewById(R.id.Autor);
        TextView descripion = (TextView) v.findViewById(R.id.Descripcion);
        nombre.setText(ListaArreglo.get(i).Nombre);
        autor.setText(ListaArreglo.get(i).Autor);
        descripion.setText(ListaArreglo.get(i).Descripcion);
        ImageView imagen=(ImageView)v.findViewById(R.id.Imagens);
        Picasso.get().load(ListaArreglo.get(i).Imagen).into(imagen);
        return v;
    }
}

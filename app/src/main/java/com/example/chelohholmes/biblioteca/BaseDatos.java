package com.example.chelohholmes.biblioteca;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Biblioteca.db";
    public static final String TABLE_NAME = "libros";
    public static final String COL_1 = "Clave";
    public static final String COL_2 = "Nombre";
    public static final String COL_3 = "ISBN";
    public static final String COL_4 = "Año";
    public static final String COL_5 = "Categoria";
    public static final String COL_6 = "Tipo";
    public static final String COL_7 = "Editorial";

    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Cursor info(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * from " + TABLE_NAME, null);
        return res;
    }

}

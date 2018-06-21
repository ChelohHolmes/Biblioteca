package com.example.chelohholmes.biblioteca;

import com.example.chelohholmes.biblioteca.Libro;

import java.util.ArrayList;

public class Origen {
    public Origen() {
    }

    public ArrayList<Libro> showAll()
    {
        ArrayList<Libro> resultado = new ArrayList<Libro>();

        Libro uno = new Libro();
        Libro dos = new Libro();
        Libro tres = new Libro();
        Libro cuatro = new Libro();
        Libro cinco = new Libro();
        Libro seis = new Libro();
        Libro siete = new Libro();
        Libro ocho = new Libro();
        Libro nueve = new Libro();
        Libro diez = new Libro();


        uno.Nombre = "Harry Potter y la piedra filosofal";
        uno.Autor = "J.K. Rowling";
        uno.Descripcion = "Primera entrega de la famosa saga Harry Potter.";
        uno.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/0/00/Tipoisso.png/revision/latest/scale-to-width-down/285");
        uno.ID=0;

        dos.Nombre = "The Fellowship of the Ring";
        dos.Autor = "J.R.R. Tolkien";
        dos.Descripcion = "Primera entrega de la famosa saga El Señor de los Anillos.";
        dos.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/e/e2/Red_Puffle_Old_Look.png/revision/latest/scale-to-width-down/282");
        dos.ID=1;

        tres.Nombre = "The Two Towers";
        tres.Autor = "J.R.R. Tolkien";
        tres.Descripcion = "Segunda entrega de la famosa saga El Señor de los Anillos.";
        tres.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/8/83/IMG_0880.PNG/revision/latest/scale-to-width-down/283");
        tres.ID=2;

        cuatro.Nombre = "Puffle";
        cuatro.Autor = "Rosa";
        cuatro.Descripcion = "Le gustan las burbujas.";
        cuatro.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/d/d5/Old_Pink_Puffle_old_look.png/revision/latest/scale-to-width-down/285");
        cuatro.ID=3;

        cinco.Nombre = "Puffle";
        cinco.Autor = "Morado";
        cinco.Descripcion = "Es muy cool y le gusta bailar.";
        cinco.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/b/b8/Lolz_icon.png/revision/latest/scale-to-width-down/283");
        cinco.ID=4;

        seis.Nombre = "Puffle";
        seis.Autor = "Negro";
        seis.Descripcion = "Está enojadito.";
        seis.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/3/3d/Puffle_negro_fdp.png/revision/latest/scale-to-width-down/280");
        seis.ID=5;

        siete.Nombre = "Puffle";
        siete.Autor = "Amarillo";
        siete.Descripcion = "Es artístico.";
        siete.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/f/f3/Yellowpuffleold.png/revision/latest/scale-to-width-down/284");
        siete.ID=6;

        ocho.Nombre = "Puffle";
        ocho.Autor = "Blanco";
        ocho.Descripcion = "Es frío.";
        ocho.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/3/3d/White_Puffle.png/revision/latest/scale-to-width-down/283");
        ocho.ID=7;

        nueve.Nombre = "Puffle";
        nueve.Autor = "Naranja";
        nueve.Descripcion = "Tiene la lengua morada jeje.";
        nueve.Imagen =("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/d/d2/Orangepuffleold.png/revision/latest/scale-to-width-down/270");
        nueve.ID=8;

        diez.Nombre = "Puffle";
        diez.Autor = "Café";
        diez.Descripcion = "Le gustan los carritos, y tiene unos lentes padres :D";
        diez.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/9/9e/Brown_Puffle_Old_Look.png/revision/latest/scale-to-width-down/282");
        diez.ID=9;

        resultado.add(uno);
        resultado.add(dos);
        resultado.add(tres);
        resultado.add(cuatro);
        resultado.add(cinco);
        resultado.add(seis);
        resultado.add(siete);
        resultado.add(ocho);
        resultado.add(nueve);
        resultado.add(diez);

        return resultado;
    }
}

package dawn.test;

import daw.biblioteca.Biblioteca;
import daw.biblioteca.Libro;
import daw.biblioteca.Autor;

public class test {
    public static void main(String[] args) {
        Libro li;
        Autor autor;
        Biblioteca biblioteca = new Biblioteca("Las 3 benditas");
        autor = new Autor("Eustakio", "Torroxeño");

        li = new Libro("Programa java en 10 clases", "1234", autor, 500);
        biblioteca.agregarLibro(li);

        li = new Libro("Programa java en 20 clases", "5678", autor, 50);
        biblioteca.agregarLibro(li);

        System.out.println(biblioteca.getNombre());
        biblioteca.imprimeBiblioteca();
    }
}


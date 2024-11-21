package daw.biblioteca;

public class Biblioteca {
    private String nombre;
    private Libro libro1;
    private Libro libro2;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libro1 = null;
        this.libro2 = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(Libro libro) {
        if (this.libro1 == null) {
            libro1 = libro;
        } else if (this.libro2 == null) {
            libro2 = libro;
        } else {
            System.out.println("Mi loco ta' al maximo");
        }
    }

    public void imprimeBiblioteca() {
        if (this.libro1 != null) {
            System.out.println(libro1.getInfoLibro());
        }
        if (this.libro2 != null) {
            System.out.println(libro2.getInfoLibro());
        }
        if (libro1 == null && libro2 == null) {
            System.out.println("Mi loco esta vacio");
        }
    }
}

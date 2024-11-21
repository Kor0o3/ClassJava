package daw.biblioteca;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String N, String Na) {
        this.nombre = N;
        this.nacionalidad = Na;
    }

    public String getInfoAutor() {
        return this.nombre + " - " + this.nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}






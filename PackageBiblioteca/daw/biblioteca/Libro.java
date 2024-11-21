package daw.biblioteca;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private int paginas;

    public Libro(String tit, String isbn, Autor aut, int pag) {
        this.titulo = tit;
        this.isbn = isbn;
        this.autor = aut;
        this.paginas = pag;
    }

    public String getInfoLibro() {
        return this.titulo + " - " + this.isbn + " - " + this.autor.getInfoAutor() + " - " + this.paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int anio;

    public Libro(String isbn, String titulo, String autor, String genero, int anio) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }
}

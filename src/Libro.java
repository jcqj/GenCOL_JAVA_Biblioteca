public class Libro extends Material{
    private String autor;
    private String isbn;

    public Libro() {}

    public Libro(String codigoUnico, String titulo, int anioPublicacion, boolean estadoDisponibilidad, String autor, String isbn) {
        super(codigoUnico, titulo, anioPublicacion, estadoDisponibilidad);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String getTipo() {
        return "Libro";
    };

}

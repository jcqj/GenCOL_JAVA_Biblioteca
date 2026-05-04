public class Revista extends Material {
    private int edicion;
    private String tematica;

    public Revista() {};

    public Revista(String codigoUnico, String titulo, int anioPublicacion, boolean estadoDisponibilidad, int edicion, String tematica) {
        super(codigoUnico, titulo, anioPublicacion, estadoDisponibilidad);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    };
}

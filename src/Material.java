



public abstract class Material implements Catalogable{
    private String codigoUnico;
    private String titulo;
    private int anioPublicacion;
    private boolean estadoDisponibilidad;

    public Material() {};

    public Material(String codigoUnico, String titulo, int anioPublicacion, boolean estadoDisponibilidad) {
        this.codigoUnico = codigoUnico;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    //! Getters y Setters propios.
    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    //! Metodo abstracto getTipo().
    public abstract String getTipo();

    //! Metodo que implementa de clase abstracta.
    @Override
    public String getCodigo() {
        return "";
    }

    //! Metodo Concreto.
    public void mostrarInfo()
    {
        System.out.println("\nTipo: " + getTipo() + "\nTitulo: " + getTitulo() + "\nAnio: " + getAnioPublicacion() + "\nDisponible: " + isEstadoDisponibilidad() + "\n");
    }
}

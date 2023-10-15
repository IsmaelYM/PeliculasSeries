package es.studium.PeliculasSeries;

public class InformacionPelicula {
    private int id;
    private String titulo;
    private int anio;
    private String reparto;
    private String director;
    private String genero;
    private String duracion;
    private String descripcion;

    public InformacionPelicula(int id, String titulo, int anio, String reparto, String director, String genero, String duracion, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.reparto = reparto;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

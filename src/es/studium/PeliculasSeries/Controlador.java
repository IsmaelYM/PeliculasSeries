package es.studium.PeliculasSeries;

public class Controlador {
    Modelo modelo;
    Vista vista;
    Conexion conexion;

    public Controlador(Modelo modelo, Vista vista, Conexion conexion) {
        this.modelo = modelo;
        this.vista = vista;
        this.conexion = conexion;

        vista.agregarListenerAnterior(e -> {
            modelo.retroceder();
            actualizarVista();
        });

        vista.agregarListenerSiguiente(e -> {
            modelo.avanzar();
            actualizarVista();
        });

        actualizarVista();
    }

    private void actualizarVista() {
        vista.setImagen(modelo.obtenerImagenActual());
        int indicePelicula = modelo.obtenerIndicePeliculaActual();
        InformacionPelicula informacion = conexion.obtenerInformacionPelicula(indicePelicula);

        vista.setId(informacion.getId());
        vista.setTitulo(informacion.getTitulo());
        vista.setAnio(String.valueOf(informacion.getAnio()));
        vista.setDuracion(informacion.getDuracion());
        vista.setGenero(informacion.getGenero());
        vista.setDirector(informacion.getDirector());
        vista.setReparto(informacion.getReparto());
        vista.setTextoArea(informacion.getDescripcion());
    }
}



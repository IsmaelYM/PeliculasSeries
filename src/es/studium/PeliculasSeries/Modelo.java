package es.studium.PeliculasSeries;


public class Modelo {
    private String[] imagenes = {
        "imagenes/matrix.jpg",
        "imagenes/scarface.jpg",
        "imagenes/dexter.jpg",
        "imagenes/fg.jpg"
    };
    private int indiceActual = 0;

    public String obtenerImagenActual() {
        return imagenes[indiceActual];
    }

    public void avanzar() {
        indiceActual = (indiceActual + 1) % imagenes.length;
    }

    public void retroceder() {
        indiceActual = (indiceActual - 1 + imagenes.length) % imagenes.length;
    }

	public int obtenerIndicePeliculaActual() {
		return indiceActual + 1;
	}
}


package es.studium.PeliculasSeries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Conexion {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/peliculas";
    String login = "ismael";
    String password = "Studium2023;";
    
    public Conexion() {
        try {
            // Cargar el controlador de la base de datos
            Class.forName(driver);
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException("Error al cargar el controlador de la base de datos: " + cnfe.getMessage());
        }
    }

    public InformacionPelicula obtenerInformacionPelicula(int indice) {
        InformacionPelicula informacion = null;

        try (Connection connection = DriverManager.getConnection(url, login, password)) {
            String sentencia = "SELECT idPeliculaSerie, nombrePeliculaSerie, anioPeliculaSerie, repartoPeliculaSerie, directorPeliculaSerie, generoPeliculaSerie, duracionPeliculaSerie, descripcionPeliculaSerie FROM peliculasseries WHERE idPeliculaSerie = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sentencia);
            preparedStatement.setInt(1, indice);

            ResultSet resultado = preparedStatement.executeQuery();

            if (resultado.next()) {
                informacion = new InformacionPelicula(
                    resultado.getInt("idPeliculaSerie"),
                    resultado.getString("nombrePeliculaSerie"),
                    resultado.getInt("anioPeliculaSerie"),
                    resultado.getString("repartoPeliculaSerie"),
                    resultado.getString("directorPeliculaSerie"),
                    resultado.getString("generoPeliculaSerie"),
                    resultado.getString("duracionPeliculaSerie"),
                    resultado.getString("descripcionPeliculaSerie")
                );
            } else {
                System.out.println("No se encontraron datos para el índice: " + indice);
            }
        } catch (SQLException sqle) {
            throw new RuntimeException("Error al obtener información de la base de datos: " + sqle.getMessage());
        }

        return informacion;
    }
}
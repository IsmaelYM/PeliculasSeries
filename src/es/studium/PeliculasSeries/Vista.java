package es.studium.PeliculasSeries;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;

public class Vista {
    JFrame ventana = new JFrame("Catálogo");
    JLabel lblImagen = new JLabel();
    JLabel txtTitulo = new JLabel();
    JLabel txtAnio = new JLabel();
    JLabel txtDuracion = new JLabel();
    JLabel txtGenero = new JLabel();
    JLabel txtDirector = new JLabel();
    JLabel txtReparto = new JLabel();
    JTextArea txtAreaGrande = new JTextArea();
    JButton btnAnterior = new JButton("Anterior");
    JButton btnSiguiente = new JButton("Siguiente");

    public Vista() {
        ventana.setLayout(new BorderLayout());

        Color izqPanelColor = new Color(51, 0, 0); 
        Color derPanelColor = new Color(255, 255, 204); 

        JPanel panelCentral = new JPanel(new GridLayout(1, 2));
      
        JPanel panelImagen = new JPanel(new BorderLayout());
        panelImagen.setBackground(izqPanelColor);
        panelImagen.add(lblImagen, BorderLayout.CENTER);

        JPanel panelTextos = new JPanel(new BorderLayout());
        panelTextos.setBackground(derPanelColor); 

        JPanel panelTextosSuperior = new JPanel(new GridLayout(6, 1, 0, 10));
        panelTextosSuperior.setBackground(derPanelColor);
        panelTextosSuperior.add(txtTitulo);
        panelTextosSuperior.add(txtReparto);
        panelTextosSuperior.add(txtAnio);
        panelTextosSuperior.add(txtDuracion);
        panelTextosSuperior.add(txtGenero);
        panelTextosSuperior.add(txtDirector);

        panelTextos.add(panelTextosSuperior, BorderLayout.NORTH);

        // Configura el JTextArea
        txtAreaGrande.setWrapStyleWord(true); // Rompe las palabras para ajustarse al ancho
        txtAreaGrande.setLineWrap(true); // Activa el ajuste de línea
        txtAreaGrande.setEditable(false); // Deshabilita la edición
        JScrollPane scrollPane = new JScrollPane(txtAreaGrande);
        panelTextos.add(scrollPane, BorderLayout.CENTER);

        panelCentral.add(panelImagen);
        panelCentral.add(panelTextos);

        int margen = 10;
        panelTextos.setBorder(new EmptyBorder(margen, margen, margen, margen));
        panelTextosSuperior.setBorder(new EmptyBorder(margen, margen, margen, margen));
        panelImagen.setBorder(new EmptyBorder(margen, margen, margen, margen));

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAnterior);
        panelBotones.add(btnSiguiente);

        ventana.add(panelBotones, BorderLayout.SOUTH);
        ventana.add(panelCentral, BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public void setImagen(String rutaImagen) {
        ImageIcon imageIcon = new ImageIcon(rutaImagen);
        Image image = imageIcon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(image));
    }

    public void agregarListenerAnterior(ActionListener listener) {
        btnAnterior.addActionListener(listener);
    }
    public void agregarListenerSiguiente(ActionListener listener) {
        btnSiguiente.addActionListener(listener);
    }
    public void mostrar() {
        ventana.setVisible(true);
    }
    public void setTitulo(String titulo) {
        txtTitulo.setText(titulo);
    }
    public void setAnio(String anio) {
        txtAnio.setText(anio);
    }
    public void setDuracion(String duracion) {
        txtDuracion.setText(duracion);
    }
    public void setGenero(String genero) {
        txtGenero.setText(genero);
    }
    public void setDirector(String director) {
        txtDirector.setText(director);
    }
    public void setReparto(String reparto) {
        txtReparto.setText(reparto);
    }
    public void setTextoArea(String texto) {
        txtAreaGrande.setText(texto);
    }
    public void setId(Object id) {
        // TODO Auto-generated method stub
    }
}

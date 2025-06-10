/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojpanel;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Daniel
 */
public class EjemploJPanel {

    public static void main(String[] args) {
        // Crear ventana
        JFrame ventana = new JFrame("Ejemplo JPanel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);

        // Crear un JPanel y establecer layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        // Agregar componentes al panel
        JButton boton = new JButton("Click");
        JLabel etiqueta = new JLabel("Hola, soy un JLabel");
        panel.add(etiqueta);
        panel.add(boton);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
    


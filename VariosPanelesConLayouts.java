/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Daniel
 */
public class VariosPanelesConLayouts {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Varios JPanel con Diferentes Layouts");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 400);
        ventana.setLayout(new BorderLayout());

        // Panel superior con FlowLayout
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.setBackground(Color.CYAN);
        panelSuperior.add(new JLabel("Panel Superior (FlowLayout)"));
        panelSuperior.add(new JButton("Botón 1"));

        // Panel central con GridLayout
        JPanel panelCentral = new JPanel(new GridLayout(2, 2));
        panelCentral.setBackground(Color.LIGHT_GRAY);
        for (int i = 1; i <= 4; i++) {
            panelCentral.add(new JButton("Botón " + i));
        }

        // Panel inferior con BorderLayout
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBackground(Color.YELLOW);
        panelInferior.add(new JLabel("Izquierda"), BorderLayout.WEST);
        panelInferior.add(new JLabel("Centro"), BorderLayout.CENTER);
        panelInferior.add(new JLabel("Derecha"), BorderLayout.EAST);

        // Agregar paneles a la ventana principal
        ventana.add(panelSuperior, BorderLayout.NORTH);
        ventana.add(panelCentral, BorderLayout.CENTER);
        ventana.add(panelInferior, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}


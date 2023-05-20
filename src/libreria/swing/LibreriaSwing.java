/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.swing;

/**
 *
 * @author HUAWEI
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Creamos una clase que extiende de JFrame
public class LibreriaSwing extends JFrame {

    // Creamos un constructor que recibe el título de la ventana
    public LibreriaSwing(String titulo) {
        // Llamamos al constructor de la superclase
        super(titulo);
        // Establecemos el tamaño de la ventana
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        for (int a = 0; a < 10; a++) {
        JButton boton = new JButton("Hola"  + (a + 1));
        panel.add(boton);
        add(panel);
        }
    }

    // Creamos un método principal para ejecutar el programa
    public static void main(String[] args) {
        // Creamos un objeto de la clase Random para generar números aleatorios
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            LibreriaSwing ventana = new LibreriaSwing("Ventana " + (i + 1));
            ventana.setLocation(random.nextInt(800), random.nextInt(600));
      
            ventana.setVisible(true);
        }
    }
}

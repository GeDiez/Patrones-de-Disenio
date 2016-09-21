/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author gediez
 */
public class pruebaTexto {
    public static void main (String [] args){
        JFrame v = new JFrame();
        Texto label = new Texto("hola Mundo");
        v.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        v.getContentPane().setLayout(null);  
        v.setSize(new Dimension(500, 500));
        v.setLocationRelativeTo(null);
        
        v.getContentPane().add(label);
        
        label.setPosicion(15, 250);
        label.setGrados(45);
        
        label.setText("Adios ");
        v.setVisible(true);
    }
}

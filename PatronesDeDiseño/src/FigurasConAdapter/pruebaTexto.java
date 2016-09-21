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
        //label.repaint();
        label.setPosicion(10, 10);    
        
        //label.setBounds(10, 10, 200, 100);
        label.setGrados(0);
        
        v.getContentPane().add(label); 
                
        //v.pack();
        v.setVisible(true);
    }
}

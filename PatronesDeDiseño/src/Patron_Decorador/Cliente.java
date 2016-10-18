/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Decorador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gediez
 */
public class Cliente {
    public static void main(String[] args){
        JLabel titulo = new JLabel("Mi pantalla Decorada");
        titulo.setFont(new Font("TimesRoman", Font.ITALIC, 16));
        titulo.setForeground(Color.white);        
        JFrame miVentana = new JFrame("Una ventana azul");
        
        JPanel panel = new JPanel();
        panel.add(titulo);
        VentanaColorida panelDecorado = new VentanaColorida(new VentanaTamaño(panel, 300, 300), Color.BLUE);
        
        miVentana.add(panelDecorado.getComponent());
        miVentana.pack();
        miVentana.setVisible(true);
    }
}

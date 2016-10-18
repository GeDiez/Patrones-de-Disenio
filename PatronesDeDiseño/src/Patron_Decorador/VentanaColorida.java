/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Decorador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author gediez
 */
public class VentanaColorida extends Decorador{

    VentanaColorida(Component miComponente, Color c){
        super(miComponente);
        setBackground(c);
    }

    @Override
    public void setBackground(Color c) {
        super.setBackground(c);
    }

    @Override
    public void setPreferredSize(Dimension d) {
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Decorador;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author gediez
 */
public class VentanaTamaño extends Decorador{
    
    public VentanaTamaño(Component v, int x, int y) {
        super(v);
        setPreferredSize(new Dimension(x, y));
    }
    
    @Override
    public void setPreferredSize(Dimension d){
        super.setPreferredSize(d);
    }
}

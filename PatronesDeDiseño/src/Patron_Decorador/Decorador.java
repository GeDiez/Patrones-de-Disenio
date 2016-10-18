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
import javax.swing.JFrame;

/**
 *
 * @author gediez
 */
public abstract class Decorador extends Component{
    private Component componente;
        
    Decorador (Component v){
        componente = v;
    }
    
    public void setBackground(Color c){
        componente.setBackground(c);
    }
    
    public void setPreferredSize(Dimension d){
        componente.setPreferredSize(d);
    }
    
    public Component getComponent(){
        return componente;
    }
    
    public void setVisible(){
        componente.setVisible(true);
    }
}

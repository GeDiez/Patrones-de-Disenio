/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gediez
 */
public class TextoAdapter implements Forma{

    Texto texto;
    
    TextoAdapter(Texto tx, JPanel p){
        texto = tx;
        p.add(texto);
    }
    
    @Override
    public void pintar(Graphics2D g, int x, int y) {
        texto.setPosicion(x, y);
    }

    @Override
    public void rotar(Graphics2D g, int grados, int x, int y) {
        texto.setGrados(grados);
        System.out.println("Aqui debe rotar el texto");
    }

    @Override
    public void trasladar(Graphics g, int x2, int y2) {
        
    }
    
}

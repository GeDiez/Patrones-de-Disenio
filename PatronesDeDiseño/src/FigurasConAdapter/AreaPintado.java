/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

/**
 *
 * @author gediez
 */
public class AreaPintado extends javax.swing.JPanel{
    private Forma figura;
    private int x = 150, y = 150, grados = 0;
    
    AreaPintado(){
        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Area de Pintado"));
        setToolTipText("Area de Pintado");
        setLayout(new FlowLayout());
    }
    
    public void setFigura(Forma fg){
        figura = fg;
    }
    
    public void setPosicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getPosicionx(){
        return x;
    }
    
    public int getPosiciony(){
        return y;
    }
    
    public void setGrados(int gr){
        this.grados = gr;
    }
    
    public int getGrados(){
        return grados;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        if(figura != null){               
            //figura.trasladar(g, x2, y2);
            figura.pintar(g2d, x, y);
            figura.rotar(g2d, grados, x, y);
        }
    }
    
}

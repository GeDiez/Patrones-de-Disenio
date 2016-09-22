/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;
/**
 *
 * @author gediez
 */
public class Texto extends JLabel{
    
    private int grados = 0, ejeRotacionX = 0, ejeRotacionY = 0;
    
    Texto(String tx){
        super(tx);   
        //setOpaque(true);
        //setBackground(Color.GRAY);
        setHorizontalAlignment(JLabel.LEFT);
        setVerticalAlignment(JLabel.BOTTOM);
        setFont(new Font("Helvetica", Font.BOLD, 18));
    }
    
    public void setPosicion(int x, int y){
        setBounds(x, y, 200, 200);
        ejeRotacionX = 100;
        ejeRotacionY = 100;
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        System.out.println("Posicion en X: "+x);
        System.out.println("Posicion en Y: "+y);
    }
    
    public void setGrados(int gr){
        grados = gr;
    }
    
    public int getGrados(){
        return grados;
    }

    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        /*AffineTransform at = new AffineTransform();
        at.rotate((Math.PI * grados)/180, ejeRotacionX, ejeRotacionY);
        g2d.setTransform(at);*/        
        System.out.println("llego aqui "+ grados);
        g2d.setColor(Color.RED);        
        System.out.println("Metodo paint de Texto");
        g2d.rotate((Math.PI * grados)/180, ejeRotacionX, ejeRotacionY);        
        super.paint(g);
        g2d.fillOval(ejeRotacionX, ejeRotacionY, 3, 3);
    }

}

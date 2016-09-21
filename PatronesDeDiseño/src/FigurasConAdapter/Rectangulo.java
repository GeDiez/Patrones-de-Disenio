/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

/**
 *
 * @author gediez
 */
public class Rectangulo implements Forma{
    
    GeneralPath Rectangulo;

    @Override
    public void pintar(Graphics2D g2d, int x, int y) {
        Rectangulo = new GeneralPath();
        Rectangulo.moveTo(x, y);
        Rectangulo.lineTo(x + 100, y);
        Rectangulo.lineTo(x + 100, y + 80);
        Rectangulo.lineTo(x , y + 80);
        Rectangulo.closePath();
        g2d.setColor(java.awt.Color.BLUE);
        g2d.fill(Rectangulo);
        System.out.println("Pinta Rectangulo "); 
    }

    @Override
    public void rotar(Graphics2D g2d, int grados, int x, int y) {
        g2d.rotate((Math.PI * grados)/180 , x, y);
    }

    @Override
    public void trasladar(Graphics g2d, int x, int y) {
        g2d.translate(x, y);
    }
    
}

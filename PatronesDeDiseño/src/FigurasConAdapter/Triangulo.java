/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

/**
 *
 * @author gediez
 */
public class Triangulo implements Forma{

    private GeneralPath triangulo;
    
    @Override
    public void pintar(Graphics2D g2d, int x, int y) {
        triangulo = new GeneralPath();
        triangulo.moveTo(x, y);
        triangulo.lineTo(x + 100, y + 200);
        triangulo.lineTo(x - 100, y + 200);
        triangulo.closePath();
        g2d.setColor(Color.GREEN);
        g2d.fill(triangulo);
    }

    @Override
    public void rotar(Graphics2D g2d, int grados, int x, int y) {
        g2d.rotate((Math.PI * grados)/180 , x , y + 100);
    }

    @Override
    public void trasladar(Graphics g, int x, int y) {
        
    }
    
}

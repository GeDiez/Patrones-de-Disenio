/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author gediez
 */
public interface Forma {
    
    public abstract void pintar(Graphics2D g, int x, int y);
    public abstract void rotar(Graphics2D g, int grados, int x, int y);
    public abstract void trasladar(Graphics g, int x2, int y2);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionesLineales;

/**
 *
 * @author gediez
 */
public abstract class Ecuacion {
    Solucion solucionar;
    float[] resultado;
    
    public Ecuacion(){}
    
    public abstract void display();
}

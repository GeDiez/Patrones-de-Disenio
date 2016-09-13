/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patitos;

/**
 *
 * @author gediez
 */
public class PatosEnAccion
{
    // instance variables - replace the example below with your own
  public static void main (String[] args){
    Pato real = new Real();
    real.display();
    real.realizarVuelo();
    real.realizarGrasnar();
    real.realizarNado();
    
    Pato plastico = new Plastico();
    plastico.display();
    plastico.realizarVuelo();
    plastico.realizarGrasnar();
    plastico.realizarNado();
    }
}

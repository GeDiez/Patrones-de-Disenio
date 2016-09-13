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
public class Plastico extends Pato
{
    public  Plastico(){
    comportamientoVolar = new NoVuela();
    comportamientoGrasnar = new Silvar();
    comportamientoNadar = new NadoSimple();
    
}
    
public void display(){
System.out.println("Soy un Pato de Plastico");
}
}

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
public class Madera extends Pato
{
    public  Madera(){
        comportamientoVolar = new NoVuela();
        comportamientoGrasnar = new Mute();
   
}
public void display(){
System.out.println("Pato de madera");
}
}
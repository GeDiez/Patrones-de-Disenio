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
public abstract class Pato
{
    ComportamientoVolar comportamientoVolar;
    ComportamientoGrasnar comportamientoGrasnar ;
    ComportamientoNadar comportamientoNadar;
    public Pato(){
    }
    
    public abstract void display();
    
    public void realizarVuelo(){
        comportamientoVolar.volar();
    }
    
    public void realizarGrasnar(){
       comportamientoGrasnar.grasnar();
    }
    
    public void realizarNado(){
    comportamientoNadar.nadar();
}
    public void flotar(){
        System.out.println("Patos Flotando");
    }
    
}
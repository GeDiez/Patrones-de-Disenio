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
public class GradoUno extends Ecuacion{
    
    public GradoUno(float [] coef){
        solucionar = new SGrado1();
        resultado = solucionar.resolver(coef);
        System.out.println("Soy una Ecuacion de Grado 1");
    }
    
    public void display(){        
        System.out.println("El resultado es x1 = " + resultado[0]);
    }
}

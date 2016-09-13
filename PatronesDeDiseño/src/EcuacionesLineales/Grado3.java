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
public class Grado3 extends Ecuacion{

    public Grado3(float[] coef){
        solucionar = new SGrado3();
        resultado = solucionar.resolver(coef);
    }

    @Override
    public void display() {
        if (resultado[3] == 1){
            System.out.println("Existen 2 Raices Imaginarias y 1 Real");
            System.out.println("Raiz real en x1: " + resultado[0]);
            System.out.println("Raiz Imginaria en x2: " + resultado[1] + "+" + resultado[2]);
            System.out.println("Raiz Imginaria en x2: " + resultado[1] + "-" + resultado[2]);
        }
        else{
            System.out.println("Existen 3 Raices Reales");
            System.out.println("Raiz real en x1: " + resultado[0]);
            System.out.println("Raiz real en x2: " + resultado[1]);
            System.out.println("Raiz real en x3: " + resultado[2]);
        }
    }
}

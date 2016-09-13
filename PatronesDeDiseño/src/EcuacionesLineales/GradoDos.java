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
public class GradoDos extends Ecuacion{
    private float [] coef;
    
    public GradoDos(float [] coeficientes){
        solucionar = new SGrado2();
        resultado = solucionar.resolver(coeficientes);
        coef = coeficientes;
        System.out.println("Soy una Ecuacion de Grado 2");
    }
    
    @Override
    public void display(){
        if ((float) (Math.pow(coef[1], 2) - 4 * coef[0] * coef[2]) >= 0){
            System.out.println("El resultado es x1 = " + resultado[0] + " x2: "+ resultado[1]);
        }
        else{
            System.out.println("El resultado es x1 = " + resultado[0] + " + "+ resultado[1] + "i");
            System.out.println("El resultado es x2 = " + resultado[0] + " - "+ resultado[1] + "i");
        }
    }
}

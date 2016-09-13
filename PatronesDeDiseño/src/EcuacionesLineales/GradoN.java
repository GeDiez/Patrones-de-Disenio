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
public class GradoN extends Ecuacion{

    public GradoN(float[] coef){
        solucionar = new SGradoN();
        resultado = solucionar.resolver(coef);
    }

    @Override
    public void display() {
        
    }
}

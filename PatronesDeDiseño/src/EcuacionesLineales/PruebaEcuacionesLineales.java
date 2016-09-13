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
public class PruebaEcuacionesLineales {
    public static void main (String[] args){
        float[] coefPrimerGrado = {1, 2};        
        System.out.println("Prueba de Ecuacion Lineal 1er Grado");        
        Ecuacion grado_uno = new GradoUno(coefPrimerGrado);
        grado_uno.display();
        float[] coefSegundoGrado = {1, 2, 3}; 
        System.out.println("Prueba de Ecuacion Lineal 2do Grado");
        Ecuacion grado_dos = new GradoDos(coefSegundoGrado);
        grado_dos.display();
    }
}

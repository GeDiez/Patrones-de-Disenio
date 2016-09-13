/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraSingleton;

/**
 *
 * @author gediez
 */
public class Sumadora {
    private static Sumadora instancia;
    static VistaCalculadora vc = new VistaCalculadora();
    
    private Sumadora(){}
    
    public static Sumadora getInstancia(){
        if(instancia == null){
            instancia = new Sumadora();
        }
        return instancia;
    }
    
    public static void mostrar(){
        vc.setVisible(true);
    }
}

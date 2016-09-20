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
    static VistaCalculadora vc;
    
    private Sumadora(){}
  
    public static Sumadora getInstancia(){
        System.out.println(instancia);
        if(instancia == null){
            instancia = new Sumadora();
            vc = new VistaCalculadora();
            System.out.println(instancia);
        }
        return instancia;
    }
    
    public static void mostrar(){
        vc.setVisible(true);
    }
    
    public static void cerrar(){
        vc.dispose();
        instancia = null;
        System.out.println(instancia);
    }
}

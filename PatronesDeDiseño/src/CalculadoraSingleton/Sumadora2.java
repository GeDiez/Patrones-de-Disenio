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
public class Sumadora2 {
    VistaCalculadora vc;
    
    Sumadora2(){
        vc = new VistaCalculadora();
    }
    
    public void mostrar(){
        vc.setVisible(true);
    }
}

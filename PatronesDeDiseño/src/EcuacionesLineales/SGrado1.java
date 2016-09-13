/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionesLineales;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gediez
 */
public class SGrado1 implements Solucion{
    
    public float[] resolver(float [] coef){
        float [] resultado = new float[1];
        resultado[0] = (float) ((coef[1] * -1)/coef[0]);
        return resultado;
    }
}

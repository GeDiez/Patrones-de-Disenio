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
public class SGrado2 implements Solucion{
    float discriminante;
    
    @Override
    public float[] resolver(float [] coef){
        float [] resultado = new float[4];
        discriminante = discriminante(coef[1], coef[0], coef[2]);
        if(discriminante == 0){
            resultado[0] = (float) ((-1 * coef[1]) / (2 * coef[0]));
            resultado[1] = resultado[0];
        }
        if (discriminante > 0){
            resultado[0] = (float) (((-1 * coef[1])+(float) Math.sqrt(discriminante)) / (2 * coef[0]));
            resultado[1] = (float) (((-1 * coef[1])-(float) Math.sqrt(discriminante)) / (2 * coef[0]));
        }
        if (discriminante < 0){
            System.out.println(discriminante);
            resultado[0] = (float) ((-1 * coef[1]) / (2 * coef[0]));
            resultado[1] = (float) (Math.sqrt(-1 * discriminante) / (2 * coef[0]));
            //Devolvemos en resultado[0] la parte real de la solucion
            //y en resultado[1] la parte imaginaria, los resultados son la suma algebraica de ambos cambiando el signo
        }
        return resultado;
    }
    
    private float discriminante(float b, float a, float c){
        return (float) (Math.pow(b, 2) - 4 * a * c);
    }
}

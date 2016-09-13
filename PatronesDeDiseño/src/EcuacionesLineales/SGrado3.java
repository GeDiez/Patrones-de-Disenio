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
public class SGrado3 implements Solucion{

    @Override
    public float[] resolver(float[] coef) {
        float [] resultado = new float[4];
        double a = (double) coef[0], b = (double) coef[1], c = (double) coef[2];
        Double q = (Math.pow(a, 2) - (3 * b)) / 9;
        Double r = ( (2 * Math.pow(a, 3)) - (9 * a * b) + (27 * c)) / 54;
        Double r2 = Math.pow(r, 2);
        Double q3 = Math.pow(q, 3);
        if (r2 < q3){
            double teta = Math.acos(r/Math.pow(q, 3));
            resultado[0] = (float) (-2 * Math.pow(q, 2) * Math.cos(teta/3) - (a/3)); //Raiz x1
            resultado[1] = (float) (-2 * Math.pow(q, 2) * Math.cos((teta + 2 * Math.PI)/3) - (a/3));//Raiz x2
            resultado[2] = (float) (-2 * Math.pow(q, 2) * Math.cos((teta - 2 * Math.PI)/3) - (a/3));// Raiz x3
            resultado[3] = 0; //BAndera que indica que los resultados son Reales
        }
        if (r2 >= q3) {
            double A = (-1 * Math.signum(r) * (Math.abs(r) + Math.pow((r2 -q3), (1/3))));
            double B;
            if(A == 0){
                B = q/a;
            }
            else{
                B = 0.0;
            }
            resultado[0] = (float)((A + B) - (a/3));
            resultado[1] = (float)((-1/2) * (A + B) - (a/3)); //Parte Real
            resultado[2] = (float)((Math.pow(3, 1/3) * (A - B))); //Parte Imaginaria
            
            resultado[3] = 1; //Agregamos una bandera que indica que hay raices imaginarias
        }   
        return resultado;
    }
    
    
    
}

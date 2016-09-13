/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author gediez
 */
public class SingletonClasico {
    private static SingletonClasico instancia;
    private static int numIns = 0;
    static{
        instancia = new SingletonClasico();
    }
    protected SingletonClasico(){
        //Existe solo para evitar que se cree con un new fuera de aqui
        numIns ++;
    }
    
    public static SingletonClasico getInstancia(){
        if(instancia == null){
            instancia = new SingletonClasico();
        }
        System.out.println("\n Se creo una instancia");
        return instancia;
    }
    public int numIns(){
        return numIns;
    }
}
    
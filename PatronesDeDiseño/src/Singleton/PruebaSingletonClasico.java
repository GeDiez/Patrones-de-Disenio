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
public class PruebaSingletonClasico {
    public static void main(String[] args){
        SingletonClasico instancia0 = SingletonClasico.getInstancia();
        System.out.println("Numero de instancias creadas "+ instancia0.numIns());
        SingletonClasico instancia1 = SingletonClasico.getInstancia();
        System.out.println("Numero de instancias creadas "+ instancia1.numIns());
        SingletonClasico instancia2 = SingletonClasico.getInstancia();
        System.out.println("Numero de instancias creadas "+ instancia2.numIns());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploIterator;

/**
 *
 * @author gediez
 */
public class ListaFabrica implements ListaMetodoFabrica{

    @Override
    public Lista creaLista(int numElementos) {
        if(numElementos == 0){
            return new ListaArrayList();
        }
        else{
            return new ListaArreglo(numElementos);
        }
    }    
}

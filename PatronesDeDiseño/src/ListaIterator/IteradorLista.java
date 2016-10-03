/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaIterator;

import java.util.ArrayList;

/**
 *
 * @author gediez
 */
public class IteradorLista implements Iterator{
private int indice;
private ArrayList lista;

    IteradorLista(ArrayList e){ lista = e; }

    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public Object next() {
        return lista.get(indice++);
    }

    @Override
    public Object first() {
        return lista.get(1);
    }

    @Override
    public Object last() {
        return lista.get(lista.size()-1);
    }
    
    @Override
    public int getIndice(){
        return indice;
    }
}

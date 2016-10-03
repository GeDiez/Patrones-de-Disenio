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
public class IteradorListaRango implements Iterator{
    private int indice, min, max;
    private ArrayList lista;
    
    IteradorListaRango(ArrayList e, int min, int max){
        lista = e;
        this.min = indice = min;
        this.max = max;
    }
    
    @Override
    public Object next() {
        return lista.get(indice++);
    }

    @Override
    public boolean hasNext() {
        return indice < max;
    }

    @Override
    public Object first() {
        return lista.get(min);
    }

    @Override
    public Object last() {
        return lista.get(max);
    }

    @Override
    public int getIndice() {
        return indice;
    }
}

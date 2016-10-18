/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploIterator;

import java.util.ArrayList;

/**
 *
 * @author gediez
 */
public class IteratorListaDinamica implements Iterator{
    private int indice = 0, min, max;
    private ListaArrayList lista;
    
    IteratorListaDinamica(ListaArrayList e){
        lista = e;
        min = indice = 0;
        max = e.getTamaño();
    }
    
    IteratorListaDinamica(ListaArrayList e, int min, int max){
        lista = e;
        this.min = indice = min;
        this.max = max;
    }
    
    @Override
    public Object next() {
        return lista.getElemento(indice++);
    }

    @Override
    public boolean hasNext() {
        return indice < max;
    }

    @Override
    public Object first() {
        return lista.getElemento(min);
    }

    @Override
    public Object last() {
        return lista.getElemento(max-1);
    }
}

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
public class ListaArrayList implements Lista{
    int indice = 0;
    private ArrayList lista;
    
    ListaArrayList(){
        lista = new ArrayList();
    }
    
    @Override
    public Iterator getIterator(){
        return new IteratorListaDinamica(this);
    }
    
    @Override
    public Iterator getIterator(int min, int max){
        return new IteratorListaDinamica(this, min, max);
    }
    
    @Override
    public void agregar(Object o){
        lista.add(o);
    }
    
    @Override
    public Object getElemento(int i){
        return lista.get(i);
    }
    
    @Override
    public int getTamaño(){
        return lista.size();
    }
}

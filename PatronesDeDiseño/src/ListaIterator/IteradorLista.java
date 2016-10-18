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
private int indice = 0;
private ArrayList <ElementoFechado> lista;

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
        return lista.get(0);
    }

    @Override
    public Object last() {
        return lista.get(lista.size()-1);
    }
    
    @Override
    public int getIndice(){
        return indice;
    }
    
    @Override
    public void sort() {
        System.out.println("Ordenando---");
      boolean swapped = true;
      int j = 0;
      ElementoFechado tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < lista.size() - j; i++) {
                if(lista.get(i).getAño() > lista.get((i + 1)).getAño()){
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i+1, tmp);
                    swapped = true;
                }
                else if(lista.get(i).getAño() == lista.get((i + 1)).getAño()){
                    if(lista.get(i).getMes() > lista.get((i + 1)).getMes()){
                        tmp = lista.get(i);
                        lista.set(i, lista.get(i + 1));
                        lista.set(i+1, tmp);
                        swapped = true;
                    } 
                    else if(lista.get(i).getMes() == lista.get((i + 1)).getMes()){
                        if(lista.get(i).getDia() > lista.get((i + 1)).getDia()){
                            tmp = lista.get(i);
                            lista.set(i, lista.get(i + 1));
                            lista.set(i+1, tmp);
                            swapped = true;
                        }
                    }
                }
            }
        }
    }
}

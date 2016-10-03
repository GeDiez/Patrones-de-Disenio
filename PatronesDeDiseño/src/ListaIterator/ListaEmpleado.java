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
public class ListaEmpleado {
    private ArrayList<Empleado> lista;
    
    ListaEmpleado(){
        lista = new ArrayList<Empleado>();
    }
    
    public void agregar(Empleado e){
        lista.add(e);
    }
    
    public Iterator creaIterator(){
        return new IteradorLista(lista);
    }
    
    public Iterator creaIteratorRango(int min, int max){
        return new IteradorListaRango(lista, min, max);
    }
}

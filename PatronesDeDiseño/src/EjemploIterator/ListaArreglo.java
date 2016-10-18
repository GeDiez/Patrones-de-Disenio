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
public class ListaArreglo implements Lista{
    private Object[] lista;
    private int numElementos;
    private int apuntador = 0;
    
    ListaArreglo(int ne){
        numElementos = ne;
        lista = new Object[ne];
    }
    
    @Override
    public void agregar(Object o){
        lista[apuntador++] = o;
    }
    
    @Override
    public Object getElemento(int indice){
        return lista[indice];
    }
    
    @Override
    public int getTamaño(){
        return apuntador;
    }
    
    @Override
    public Iterator getIterator(){
        return new IteratorListaEstatica(this);
    }
    
    @Override
    public Iterator getIterator(int min, int max){
        return new IteratorListaEstatica(this, min, max);
    }
}

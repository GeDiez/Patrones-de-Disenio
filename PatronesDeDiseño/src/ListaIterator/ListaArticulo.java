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
public class ListaArticulo {
    private ArrayList <Articulo> articulos;
    
    ListaArticulo(){
        articulos = new ArrayList<Articulo>();
    }
    
    public void agregar(Articulo art){
        articulos.add(art);
    }
    
    public void imprimir(){
        Iterator itera = creaIterador();
        itera.sort();
        while(itera.hasNext()){
            Articulo a = (Articulo)(itera.next());
            System.out.println(a.toString());
        }
    }
    
    public Iterator creaIterador(){
        return new IteradorLista(articulos);
    }
    
    public Iterator creaIteratorRango(int min, int max){
        return new IteradorListaRango(articulos, min, max);
    }
}

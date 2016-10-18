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
public class Prueba {
    ListaMetodoFabrica fabrica;
    Lista lista;
    
    Prueba(){
        fabrica = new ListaFabrica();        
        lista = fabrica.creaLista(0);
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(50);
        lista.agregar(60);
        lista.agregar(80);
    }
    
    public void recorrer(){
        Iterator iterador = lista.getIterator();
        System.out.println("Lista de elementos en el arreglo");        
        while(iterador.hasNext()){
            System.out.println((Integer)iterador.next());
        }
        
        System.out.println("Primer Elemento: "+iterador.first());
        System.out.println("Ultimo Elemento: "+iterador.last());
        
        System.out.println("Listar un Rango del arreglo");        
        Iterator iteradorRango = lista.getIterator(2, 4);
        while(iteradorRango.hasNext()){
            System.out.println((Integer)iteradorRango.next());
        }
    }
    
    public static void main (String[] args){
        Prueba p = new Prueba();
        p.recorrer();
    }
}

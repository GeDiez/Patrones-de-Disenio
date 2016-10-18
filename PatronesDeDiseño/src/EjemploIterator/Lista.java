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
public interface Lista {
    public void agregar(Object o);
    public Object getElemento(int indice);
    public int getTamaño();
    public Iterator getIterator();
    public Iterator getIterator(int min, int max);
}

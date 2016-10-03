/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaIterator;

/**
 *
 * @author gediez
 */
public interface Iterator {
    public Object next();
    public boolean hasNext();
    public Object first();
    public Object last();
    public int getIndice();
}

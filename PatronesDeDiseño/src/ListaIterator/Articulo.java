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
public class Articulo extends ElementoFechado{
    private String descripcion;
    private int cantidad;
    private double precio;
    
    Articulo(String d, int c, double p, int aa, int mm, int dd ){
        descripcion = d;
        cantidad = c;
        precio = p;
        setAño(aa);
        setMes(mm);
        setDia(dd);
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
        return "\nDescripcion: "+descripcion+"\nPrecio: "+precio+"\nCantidad: "+cantidad;
    }
}

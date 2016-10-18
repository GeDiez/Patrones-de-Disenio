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
public class Empleado extends ElementoFechado{
    private String nombre;
    private String puesto;
    
    Empleado(String n, String p, int aa, int mm, int dd){
        nombre = n;
        puesto = p;
        setAño(aa);
        setMes(mm);
        setDia(dd);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    public String toString(){
        return nombre+" "+puesto;
    }
}

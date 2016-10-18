/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploPatronComposite;

/**
 *
 * @author gediez
 */
public abstract class Archivo {
    private String nombre;
    private String descripcion;
    private int tamaño;
    
    Archivo(String nombre, String des, int t){
        this.nombre = nombre;
        descripcion = des;
        tamaño = t;
    }
    
    public abstract boolean isCarpeta();
    
    public abstract void imprimir(String espacio);

    public void setTamaño(int t){
        tamaño = t;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

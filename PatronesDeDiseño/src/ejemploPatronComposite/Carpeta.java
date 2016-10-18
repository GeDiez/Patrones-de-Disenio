/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploPatronComposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author gediez
 */
public class Carpeta extends Archivo{
    private ArrayList<Archivo> elementos = new ArrayList();
    
    Carpeta(String nombre, String descripcion, int tamaño){
        super(nombre, descripcion, tamaño);
    }
    
    public void agregar(Archivo a){
        elementos.add(a);
    }
    
    public Archivo getArchivo(int i){
        return elementos.get(i);
    }
    
    public void eliminarArchivo(int i){
        elementos.remove(i);
    }

    public int getElementos(){
        return elementos.size();
    }
    
    @Override
    public int getTamaño(){
        Iterator<Archivo> itera = elementos.iterator();
        int peso = 0;
        while(itera.hasNext()){
            peso = peso + itera.next().getTamaño();
        }
        return peso;
    }
    
    public void imprimir(String espacio){
        Iterator<Archivo> itera = elementos.iterator();
        while(itera.hasNext()){
            Archivo arch = itera.next();
            if(arch.isCarpeta()){
                System.out.println(espacio+"L "+arch.getNombre()+", "+getTamaño()+"kb");
                arch.imprimir((espacio+"    "));
            }
            else{
                arch.imprimir(espacio);
            }            
        }
    }
    
    @Override
    public boolean isCarpeta(){
        return true;
    }
}

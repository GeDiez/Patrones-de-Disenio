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
public class TextoPlano extends Archivo{

    TextoPlano(String nombre, String descripcion, int tamaño){
        super(nombre, descripcion, tamaño);
    }

    @Override
    public boolean isCarpeta() {
        return false;
    }

    @Override
    public void imprimir(String espacio) {
        System.out.println(espacio+"|"+getNombre()+", "+getTamaño()+"kb");
    }
    
}

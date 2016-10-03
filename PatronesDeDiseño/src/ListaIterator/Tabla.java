/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaIterator;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gediez
 */
public abstract class Tabla{
    JTable tabla;
    DefaultTableModel modelo;
    
    Tabla(JTable t){
        tabla = t;
        modelo = (DefaultTableModel) t.getModel();
    }
    
    public void vaciar(){
        for(int i=0; i< tabla.getRowCount() ;i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    public abstract void volcarDatos(Iterator iterador);
    
}

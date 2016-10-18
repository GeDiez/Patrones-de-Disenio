/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaIterator;

import javax.swing.JTable;

/**
 *
 * @author gediez
 */
public class TablaArticulos extends Tabla{
    
    TablaArticulos(JTable tabla){
        super(tabla);
    }
    
    @Override
    public void volcarDatos(Iterator iterador){
        iterador.sort();
        while(iterador.hasNext()){
            Articulo a = (Articulo) iterador.next();
            modelo.addRow(new Object[]{
                iterador.getIndice(),
                a.getDescripcion(),
                a.getCantidad(),
                a.getPrecio(),
                a.getAño(),
                a.getMes(),
                a.getDia()
            });
        }
    }
}

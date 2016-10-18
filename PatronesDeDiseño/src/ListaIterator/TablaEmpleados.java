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
public class TablaEmpleados extends Tabla{

    public TablaEmpleados(JTable t) {
        super(t);
    }

    @Override
    public void volcarDatos(Iterator iterador) {
        iterador.sort();
        while(iterador.hasNext()){
            Empleado e = (Empleado) iterador.next();
            modelo.addRow(new Object[]{
                e.getNombre(),
                e.getPuesto(),
                e.getAño(),
                e.getMes(),
                e.getDia()
            });
        }
    }
    
}

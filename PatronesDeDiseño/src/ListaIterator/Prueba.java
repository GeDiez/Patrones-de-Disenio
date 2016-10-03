/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaIterator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gediez
 */
public class Prueba implements ActionListener{
    public static void main(String [] args){
        new Prueba();
    }
    
    VistaPrincipal vp;
    ListaArticulo la;
    ListaEmpleado le;
    
    
    Prueba(){
        la = new ListaArticulo();
        la.agregar(new Articulo("Coca Cola", 12, 15));
        la.agregar(new Articulo("Barritas", 8, 7));
        la.agregar(new Articulo("Chetos", 6, 10));
        la.agregar(new Articulo("Sabritas :)", 10, 11));
        
        le = new ListaEmpleado();        
        le.agregar(new Empleado("Jorge", "Almacenista"));
        le.agregar(new Empleado("Mario", "vendedor"));
        le.agregar(new Empleado("Noe", "Dueño"));
        le.agregar(new Empleado("Veronica", "vendedor"));
        le.agregar(new Empleado("Miguel", "Conductor"));
        
        vp = new VistaPrincipal();
        vp.getJbtn_guardar().addActionListener(this);
        vp.getJbtn_recargar().addActionListener(this);
        vp.getJbtn_verificar().addActionListener(this);
        vp.getJbtn_ebuscar().addActionListener(this);
        vp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vp.getJbtn_guardar()){            
            if(
                    vp.getJtf_des().getText().equals("") || 
                    vp.getJtf_cant().getText().equals("") || 
                    vp.getJtf_precio().getText().equals("")
               ){
                vp.getJl_advertencia().setText("* Faltan rellenar datos");
            }
            else{
                la.agregar(
                        new Articulo(
                            vp.getJtf_des().getText(),
                            Integer.parseInt(vp.getJtf_cant().getText()),
                            Double.parseDouble(vp.getJtf_precio().getText())
                        ));
                vp.getJl_advertencia().setText("* Datos almacenados");
            }
        }
        if(ae.getSource() == vp.getJbtn_recargar()){
            System.out.println("****");
            int min = Integer.parseInt(vp.getJtf_rmin().getText())-1;
            int max = Integer.parseInt(vp.getJtf_rmax().getText());
            Tabla tablaArticulos = new TablaArticulos(vp.getJt_lista());
            tablaArticulos.vaciar();
            if(vp.getJckb_rango().isSelected()){
                tablaArticulos.volcarDatos(la.creaIteratorRango(min, max));                
            }
            else{
                tablaArticulos.volcarDatos(la.creaIterador());
            }
        }
        if(ae.getSource() == vp.getJbtn_verificar()){
            Iterator itera = la.creaIterador();
            Articulo primero = (Articulo)itera.first();
            Articulo ultimo = (Articulo)itera.last();
            vp.getJl_descp().setText(primero.getDescripcion());
            vp.getJl_cantp().setText(Integer.toString(primero.getCantidad()));
            vp.getJl_preciop().setText(Double.toString(primero.getPrecio()));
            
            vp.getJl_descu().setText(ultimo.getDescripcion());
            vp.getJl_cantu().setText(Integer.toString(ultimo.getCantidad()));
            vp.getJl_preciou().setText(Double.toString(ultimo.getPrecio()));
        }
        if(ae.getSource() == vp.getJbtn_ebuscar()){
            int min = Integer.parseInt(vp.getJtf_ermin().getText())-1;
            int max = Integer.parseInt(vp.getJtf_ermax().getText());
            Tabla tablaEmpleados = new TablaEmpleados(vp.getJt_empleado());
            tablaEmpleados.vaciar();
            if(vp.getJckb_erango().isSelected()){
                tablaEmpleados.volcarDatos(le.creaIteratorRango(min, max));                
            }
            else{
                tablaEmpleados.volcarDatos(le.creaIterator());
            }
        }
    }
}

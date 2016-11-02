/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_ColorChooser;

import java.awt.Color;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author gediez
 */
public class colorChosser {
    public static void main (String []args){
        VentanaPrincipal ventana = new VentanaPrincipal("Ejemplo del Componente Color Chooser");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
        ColorSelectionModel selector = ventana.getjColorChooser1().getSelectionModel();
        
        selector.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                Color cambioColor = selector.getSelectedColor();
                if(ventana.getFuente().isSelected()){
                    ventana.getjLabel2().setForeground(cambioColor);
                }
                else{
                    ventana.getjLabel2().setBackground(cambioColor);                    
                }
            }
            
        });
    }
}

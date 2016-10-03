/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeLibrosPatronAdaptador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author gediez
 */
public class BookCellRenderer2 implements ListCellRenderer {
    private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);
    private JCheckBox comboBook;

    public BookCellRenderer2( ) {}

    public Component getListCellRendererComponent(
        JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus)
    {
        comboBook = new JCheckBox();
        BookEntry entry = (BookEntry)value;
        comboBook.setText(entry.getTitle());//Linea Agregada
        if(isSelected) {
            comboBook.setSelected(true);
        } else {
            comboBook.setSelected(false);
        }
        return comboBook;
    }
}

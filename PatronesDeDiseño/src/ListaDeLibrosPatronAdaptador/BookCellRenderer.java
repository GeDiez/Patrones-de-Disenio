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
public class BookCellRenderer implements ListCellRenderer {
    private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);
    private JLabel labelBook;

    public BookCellRenderer( ) {}

    public Component getListCellRendererComponent(
        JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus)
    {
        labelBook = new JLabel();
        labelBook.setOpaque(true);
        labelBook.setIconTextGap(12);
        BookEntry entry = (BookEntry)value;
        labelBook.setText(entry.getTitle( ));
        labelBook.setIcon(entry.getImage( ));
        if(isSelected) {
            labelBook.setBackground(HIGHLIGHT_COLOR);
            labelBook.setForeground(Color.white);
        } else {
            labelBook.setBackground(Color.white);
            labelBook.setForeground(Color.black);
        }
        return labelBook;
    }
}

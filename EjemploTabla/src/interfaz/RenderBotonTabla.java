package interfaz;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenderBotonTabla extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
    private JButton button;
    private int fila;
    private JTable table;

    public RenderBotonTabla() {
        button = new JButton();
        button.setText("Ver");
        button.addActionListener(this);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.table = table;
        fila = row;
        return button;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        fila = row;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return fila;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtenemos el valor de una columna específica (por ejemplo, la columna 1)
        int columnaEspecifica = 1; // Cambia este valor a la columna que necesites
        Object valor = table.getValueAt(fila, columnaEspecifica); // Obtener el valor de la columna específica
        System.out.println("Botón en la fila " + fila + " presionado. Valor de la columna " + columnaEspecifica + ": " + valor);
        // Detener la edición
        fireEditingStopped();
    }
}

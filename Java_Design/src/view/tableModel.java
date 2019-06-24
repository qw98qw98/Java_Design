/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class tableModel implements TableModel {

    @Override
    public int getRowCount() {
         return 29;
    }

    @Override
    public int getColumnCount() {
         return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
         return " 第"+columnIndex+"列名";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return false;
        }
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rowIndex + "--" + columnIndex;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        String s = "Change at: " + rowIndex + "--- " + columnIndex + " newValue: " + aValue;
        System.out.println(s);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}
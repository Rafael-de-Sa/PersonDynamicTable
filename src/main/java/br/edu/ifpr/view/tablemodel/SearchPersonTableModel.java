/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.view.tablemodel;

import br.edu.ifpr.model.Person;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class SearchPersonTableModel extends AbstractTableModel {

    private List<Person> data = new LinkedList<>();
    private String[] columns = {"Nome", "Idade", "CPF", "Endereço"};

    public void setData(List<Person> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Person person = data.get(row);
        switch (column) {
            case 0:
                return person.getName();
            case 1:
                return person.getAge();
            case 2:
                return person.getCpf();
            case 3:
                return person.getAddress();
            default:
                return null;
        }
    }

}

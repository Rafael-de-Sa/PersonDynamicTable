/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.view.tablemodel;

import br.edu.ifpr.model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.management.modelmbean.ModelMBean;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author rafae
 */
public class SearchComboBoxModel extends DefaultComboBoxModel<String> {

    public static final String NAME = "Nome";
    public static final String AGE = "Idade";
    public static final String CPF = "CPF";
    public static final String ADDRESS = "Endereço";

    public SearchComboBoxModel() {
        addElement(NAME);
        addElement(AGE);
        addElement(CPF);
        addElement(ADDRESS);
    }

    public static String getFieldName(String selectedItem) {
        if (selectedItem == null) {
            return null;
        }
        switch (selectedItem) {
            case NAME:
                return "name";
            case AGE:
                return "age";
            case CPF:
                return "cpf";
            case ADDRESS:
                return "address";
            default:
                return null;
        }
    }

}

package org.proyect.Controladores.Algoritmos.Funciones;

import org.proyect.Controladores.Algoritmos.Ordenamiento.FactorySort;
import org.proyect.Modelos.Atributo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FuncionesTabla {
    private DefaultTableModel modeloTable = new DefaultTableModel();
    //INSTANCIARCLASES


    public void actualizarTabla(JTable tabla, Atributo[] lista, String[] caracteristicas) {
        modeloTable = (DefaultTableModel) tabla.getModel();
        modeloTable.setRowCount(0);
        Object[] ob = new Object[caracteristicas.length];
        for (Atributo atributo : lista) {
            for (int j = 0; j < caracteristicas.length; j++) {
                ob[j] = atributo.ObtenerAtributo(caracteristicas[j]);
            }
            modeloTable.addRow(ob);
        }
        tabla.setModel(modeloTable);
    }
    public void vaciarTabla(JTable tabla) {
        modeloTable = (DefaultTableModel) tabla.getModel();
        modeloTable.setRowCount(0);
        tabla.setModel(modeloTable);
    }
    public void ordenarTabla(JTable tabla,Atributo[] lista, String metodo, String parametro, String[] caracteristicas) throws Exception {
        FactorySort algoritmos = new FactorySort();
        lista = (Atributo[]) algoritmos.ordenarLista(metodo,lista,parametro);
        actualizarTabla(tabla,lista,caracteristicas);
    }
}

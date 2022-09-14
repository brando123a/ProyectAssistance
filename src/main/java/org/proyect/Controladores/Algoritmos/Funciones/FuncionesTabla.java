package org.proyect.Controladores.Algoritmos.Funciones;

import org.proyect.Modelos.Atributo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FuncionesTabla {
    private DefaultTableModel modeloTable = new DefaultTableModel();

    public void actualizarTabla(JTable tabla, Atributo[] lista, String[] caracteristicas) {
        modeloTable = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[caracteristicas.length];
        for (Atributo atributo : lista) {
            for (int j = 0; j < caracteristicas.length; j++) {
                ob[j] = atributo.ObtenerAtributo(caracteristicas[j]);
            }
            modeloTable.addRow(ob);
        }
        tabla.setModel(modeloTable);
    }
    /*public final void listarUsuarios(){
        List<Usuario> listaUsuario = listar();
        modeloTablaUsuario = (DefaultTableModel)ventanaUsuarios.usuariosJTable.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < listaUsuario.size(); i++) {
            ob[0] = listaUsuario.get(i).getId();
            ob[1] = listaUsuario.get(i).getUsuario();
            ob[2] = listaUsuario.get(i).getTipoUsuario();
            modeloTablaUsuario.addRow(ob);

        }
        ventanaUsuarios.usuariosJTable.setModel(modeloTablaUsuario);
    }*/
    public void vaciarTabla(JTable table) {

    }
}

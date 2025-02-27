package org.proyect.Controladores.ControladoresVentanas;

import org.proyect.Controladores.Algoritmos.Funciones.FuncionesTabla;
import org.proyect.Controladores.Controlador;
import org.proyect.GenerarEmpleadosAsistencias;
import org.proyect.Modelos.Atributo;
import org.proyect.Vistas.VentanasListar.VentanaRegistroAsistencias;

import javax.swing.*;
import java.awt.*;

public class ControladorListarAsistencias extends Controlador {
    GenerarEmpleadosAsistencias generador = new GenerarEmpleadosAsistencias();
    Atributo[] listaInicial = generador.generarAsistencias();

    FuncionesTabla funcionesTabla = new FuncionesTabla();
    //Componentes de la ventana
    JTable jTablePrincipal;
    JTable jTableOrdenada;
    JComboBox<String> jCBAlgoritmo;
    JComboBox<String> jCBBuscar;
    JComboBox<String> jCBCriterio;
    JComboBox<String> jCBMetodo;
    JTextField jTFIngresar;
    JTable jTableBusqueda;
    String[] caracteristicas = {"id","empleado","fechaformateada","horaformateada"};

    public ControladorListarAsistencias(VentanaRegistroAsistencias ventana) {
        super(ventana);
        jTablePrincipal = ventana.jTablePrincipal;
        jTableOrdenada = ventana.jTableOrdenada;
        jTableBusqueda = ventana.jTableBusqueda;
        jCBAlgoritmo = ventana.jCBAlgoritmo;
        jCBBuscar = ventana.jCBBuscar;
        jCBCriterio = ventana.jCBCriterio;
        jCBMetodo = ventana.jCBMetodo;
        jTFIngresar = ventana.jTFIngresar;

        ventana.jButtonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {listarAsistencias();}
        });

        ventana.jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    bucarAsistencias();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        ventana.jButtonOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    ordenamientoTabla();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public void iniciarVentana() {
        ventana.iniciar();
    }

    private void listarAsistencias(){
        funcionesTabla.actualizarTabla(jTablePrincipal,listaInicial,caracteristicas);
    }

    private void ordenamientoTabla() throws Exception {
        String algoritmo = (String) jCBAlgoritmo.getSelectedItem();
        String criterio = (String) jCBCriterio.getSelectedItem();
        criterio = criterio.toLowerCase();
        algoritmo = algoritmo.trim();
        System.out.println("+++"+algoritmo+"+++");
        if (criterio.equals("dni")){
            funcionesTabla.ordenarTabla(jTableOrdenada,listaInicial,algoritmo,"id",caracteristicas);
            return;
        }
        funcionesTabla.ordenarTabla(jTableOrdenada,listaInicial,algoritmo,criterio,caracteristicas);
    }


    private void bucarAsistencias() throws Exception {
        String tipoParametroBuscar = (((String) jCBBuscar.getSelectedItem()).trim()).toLowerCase();
        String algoritmoBusqueda = ((String) jCBMetodo.getSelectedItem()).trim();
        String parametroBuscar = (jTFIngresar.getText()).trim();
        if(parametroBuscar.equals("")){
            javax.swing.JOptionPane.showMessageDialog((Component) ventana,"Ingrese un parametro al buscar");
            return;
        }
        funcionesTabla.buscarTabla(jTableBusqueda,listaInicial,caracteristicas,tipoParametroBuscar,algoritmoBusqueda,parametroBuscar);
    }
}

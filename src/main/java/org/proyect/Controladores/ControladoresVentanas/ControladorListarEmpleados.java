package org.proyect.Controladores.ControladoresVentanas;

import org.proyect.Controladores.Algoritmos.Funciones.FuncionesTabla;
import org.proyect.GenerarEmpleadosAsistencias;
import org.proyect.Modelos.Atributo;
import org.proyect.Vistas.VentanasListar.VentanaRegistroEmpleados;
import org.proyect.Controladores.Controlador;

import javax.swing.*;


public class ControladorListarEmpleados extends Controlador{
    GenerarEmpleadosAsistencias generador = new GenerarEmpleadosAsistencias();
    Atributo[] listaInicial = generador.generarEmpleados();

    FuncionesTabla funcionesTabla = new FuncionesTabla();
    //Componentes de la ventana
    JTable jTablePrincipal;
    String[] caracteristicas = {"id","nombre","email","departamento"};

    public ControladorListarEmpleados(VentanaRegistroEmpleados ventana) {
        super(ventana);
        jTablePrincipal = ventana.jTablePrincipal;
        ventana.jButtonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarEmpleados();
            }
        });
        ventana.jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //FUNCION DE ...
            }
        });
        ventana.jButtonOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //FUNCION DE ...
            }
        });
    }

    @Override
    public void iniciarVentana() {
        ventana.iniciar();
    }

    private void listarEmpleados(){
        funcionesTabla.actualizarTabla(jTablePrincipal,listaInicial,caracteristicas);
    }
}

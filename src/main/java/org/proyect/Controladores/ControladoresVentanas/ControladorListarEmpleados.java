package org.proyect.Controladores.ControladoresVentanas;

import org.proyect.Vistas.VentanasListar.VentanaRegistroEmpleados;
import org.proyect.Controladores.Controlador;

public class ControladorListarEmpleados extends Controlador{

    public ControladorListarEmpleados(VentanaRegistroEmpleados ventana) {
        super(ventana);
        ventana.jButtonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //FUNCION DE ...
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


}

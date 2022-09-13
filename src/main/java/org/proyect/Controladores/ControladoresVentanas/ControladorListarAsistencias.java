package org.proyect.Controladores.ControladoresVentanas;

import org.proyect.Controladores.Controlador;
import org.proyect.Vistas.VentanasListar.VentanaRegistroAsistencias;

public class ControladorListarAsistencias extends Controlador {

    public ControladorListarAsistencias(VentanaRegistroAsistencias ventana) {
        super(ventana);
        ventana.jButtonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //FUNCION DE LISTAR
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

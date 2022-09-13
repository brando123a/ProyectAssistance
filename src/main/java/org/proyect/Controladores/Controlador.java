package org.proyect.Controladores;

import org.proyect.Vistas.Ventana;

public abstract class Controlador {
    protected final Ventana ventana;

    public Controlador(Ventana ventana) {
        this.ventana = ventana;
    }

    public abstract void iniciarVentana();
}

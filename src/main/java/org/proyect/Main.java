package org.proyect;

import org.proyect.Controladores.ControladoresVentanas.ControladorListarAsistencias;
import org.proyect.Controladores.ControladoresVentanas.ControladorListarEmpleados;
import org.proyect.Vistas.VentanasListar.VentanaRegistroAsistencias;
import org.proyect.Vistas.VentanasListar.VentanaRegistroEmpleados;

import org.proyect.GenerarEmpleadosAsistencias;
import org.proyect.Modelos.Atributo;
import org.proyect.Controladores.Algoritmos.Ordenamiento.BubbleSort;


public class Main {
    /*static VentanaRegistroEmpleados ventana1 = new VentanaRegistroEmpleados();
    static ControladorListarEmpleados controlador1 = new ControladorListarEmpleados(ventana1);

    static VentanaRegistroAsistencias ventana2 = new VentanaRegistroAsistencias();
    static ControladorListarAsistencias controlador2 = new ControladorListarAsistencias(ventana2);*/

    public static void main(String[] args) throws Exception {
        //SE GENERA UNA LISTA DE 10 DE CADA CLASE PARA PROBAR LOS METODOS
        GenerarEmpleadosAsistencias generador = new GenerarEmpleadosAsistencias();
        Atributo[] Employes = generador.generarEmpleados();
        Atributo[] Assistances = generador.generarAsistencias();

        for (Atributo a: Assistances) {
            System.out.println(a.ObtenerAtributo("fecha"));
        }
        System.out.println("---------------------------------");
        BubbleSort SB = new BubbleSort();
        SB.ordenamiento(Assistances,"fecha");
        for (Atributo a: Assistances) {
            System.out.println(a.ObtenerAtributo("fecha"));
        }
    }
}
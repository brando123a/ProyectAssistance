package org.proyect;

import org.proyect.Controladores.Algoritmos.Busqueda.LinealSearch;
import org.proyect.Controladores.Algoritmos.Ordenamiento.BubbleSort;
import org.proyect.Controladores.Algoritmos.Ordenamiento.SelecctionSort;
import org.proyect.Controladores.ControladoresVentanas.ControladorListarAsistencias;
import org.proyect.Controladores.ControladoresVentanas.ControladorListarEmpleados;
import org.proyect.Modelos.Atributo;
import org.proyect.Vistas.VentanasListar.VentanaRegistroAsistencias;
import org.proyect.Vistas.VentanasListar.VentanaRegistroEmpleados;

public class Main {
    static VentanaRegistroEmpleados ventana1 = new VentanaRegistroEmpleados();
    static ControladorListarEmpleados controlador1 = new ControladorListarEmpleados(ventana1);

    static VentanaRegistroAsistencias ventana2 = new VentanaRegistroAsistencias();
    static ControladorListarAsistencias controlador2 = new ControladorListarAsistencias(ventana2);

    public static void main(String[] args) throws Exception {
        controlador1.iniciarVentana();
        controlador2.iniciarVentana();
        GenerarEmpleadosAsistencias gn = new GenerarEmpleadosAsistencias();
        BubbleSort BS = new BubbleSort();
        SelecctionSort SS = new SelecctionSort();
        Atributo[] lista = gn.generarAsistencias();
        LinealSearch LS = new LinealSearch();
        int respuesta = LS.busqueda(lista,"empleado","Curry");

        System.out.println("sin ordenar");
        for (Atributo atributo : lista) {
            System.out.println(atributo.ObtenerAtributo("fecha"));
        }
        SS.ordenamiento(lista,"fecha");
        System.out.println("ordenado");
        for (Atributo atributo : lista) {
            System.out.println(atributo.ObtenerAtributo("fecha"));
        }
    }
}
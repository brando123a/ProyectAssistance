package org.proyect.Controladores.Algoritmos.Busqueda;

import org.proyect.Modelos.Atributo;

public class BinarySearch implements Buscar {

    //IMPORTANTEEEEEEEEEEEEEEEEEEE: NO OLVIDES QUE PARA EL BINARYSEARCH PRIMERO ORDENAS LA LISTA
    //lo podrias ordenar asi:
        // primero importas el metodo: import org.proyect.Controladores.Algoritmos.Ordenamiento.BubbleSort;
        //luego creas la clase: BubbleSort SB = new BubbleSort();
        //y al final ordenas la lista: SB.ordenamiento(Assistances,"X"); en X pondrias el parametro por el que buscas para
            //que lo ordenes por esa forma, en minuscula.

    //Se busca en la lista en base al atributo de la clase ingresado como objetivo
    //en dado caso no se encuentre devolver -1
    @Override
    public int busqueda(Atributo[] lista, String tipoObjetivo, String objetivo) throws Exception {
        Object tipo = lista[0].ObtenerAtributo(tipoObjetivo);
        return switch (((Object) tipo).getClass().getSimpleName()) {
            case "String" -> buscarString(lista, objetivo);
            case "Integer" -> buscarInt(lista, objetivo);
            case "Date" -> buscarDate(lista, objetivo);
            default -> throw new Exception("Error al programar los parametros");
        };
    }

    private int buscarInt(Atributo[] lista, String objetivo){
        //implementas el codigo para buscar, guiate de los codigos para ordenar el como
        //comparamos los int, String y Date y tambien como los convertimos
        return 0;
    }
    private int buscarString(Atributo[] lista, String objetivo){
        return 0;
    }
    private int buscarDate(Atributo[] lista, String objetivo){
        return 0;
    }
}

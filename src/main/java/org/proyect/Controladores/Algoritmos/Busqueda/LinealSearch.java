package org.proyect.Controladores.Algoritmos.Busqueda;

import org.proyect.Modelos.Atributo;

public class LinealSearch implements Buscar{
    //en dado caso no se encuentre devolver -1
    @Override
    public int busqueda(Atributo[] lista, String objetivo) throws Exception {
        Object tipo = lista[0].ObtenerAtributo(objetivo);
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

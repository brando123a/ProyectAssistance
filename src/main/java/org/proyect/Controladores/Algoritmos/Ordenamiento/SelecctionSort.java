package org.proyect.Controladores.Algoritmos.Ordenamiento;

import org.proyect.Modelos.Atributo;

public class SelecctionSort implements Ordenar{
    @Override
    public Object[] ordenamiento(Atributo[] lista, String parametro) throws Exception {
        Object tipo = lista[0].ObtenerAtributo(parametro);
        return switch (((Object) tipo).getClass().getSimpleName()) {
            case "String" -> ordenarString(lista, parametro);
            case "Integer" -> ordenarInt(lista, parametro);
            case "Date" -> ordenarDate(lista, parametro);
            default -> throw new Exception("Error al programar los parametros");
        };
    }

    private Object[] ordenarDate(Atributo[] lista, String parametro) {

        return lista;
    }

    private Object[] ordenarInt(Atributo[] lista, String parametro) {

        return lista;
    }

    private Object[] ordenarString(Atributo[] lista, String parametro) {

        return lista;
    }
}

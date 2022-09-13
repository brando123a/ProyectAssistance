package org.proyect.Controladores.Algoritmos.Ordenamiento;

import org.proyect.Modelos.Atributo;

import java.util.Date;

public class ShellSort implements Ordenar{

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
    private Object[] ordenarString(Atributo[] lista, String parametro){
        int largo = lista.length;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < largo - 1; j++) {
                String primerString = String.valueOf(lista[j].ObtenerAtributo(parametro));
                String segundoString = String.valueOf(lista[j+1].ObtenerAtributo(parametro));
                if (primerString.compareTo(segundoString)>0) {
                    Atributo temp = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }
    private Object[] ordenarInt(Atributo[] lista, String parametro){
        int largo = lista.length;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < largo - 1; j++) {
                if ((Integer)lista[j].ObtenerAtributo(parametro) > (Integer)lista[j+1].ObtenerAtributo(parametro)) {
                    Atributo temp = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }
    private Object[] ordenarDate(Atributo[] lista, String parametro){
        int largo = lista.length;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < largo - 1; j++) {
                Date primerString = (Date) lista[j].ObtenerAtributo(parametro);
                Date segundoString = (Date) lista[j+1].ObtenerAtributo(parametro);
                if (primerString.compareTo(segundoString)>0) {
                    Atributo temp = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        return lista;
    }
}

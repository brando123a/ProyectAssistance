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
        int salto, i;
        Atributo aux;
        boolean cambios;
        for (salto = lista.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < lista.length; i++){
                    //Guardamos los atributos de las clases en la lista
                    String primerString = String.valueOf(lista[i - salto].ObtenerAtributo(parametro));
                    String segundoString = String.valueOf(lista[i].ObtenerAtributo(parametro));
                    if (primerString.compareTo(segundoString)>0) {
                        aux = lista[i];
                        lista[i] = lista[i - salto];
                        lista[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        return lista;
    }
    private Object[] ordenarInt(Atributo[] lista, String parametro){
            int salto, i;
            Atributo aux;
            boolean cambios;
            for (salto = lista.length / 2; salto != 0; salto /= 2) {
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (i = salto; i < lista.length; i++){
                        //Guardamos los atributos de las clases en la lista
                        int anterior = (Integer) lista[i - salto].ObtenerAtributo(parametro);
                        int posterior = (Integer) lista[i].ObtenerAtributo(parametro);
                        if (anterior > posterior) {
                            aux = lista[i];
                            lista[i] = lista[i - salto];
                            lista[i - salto] = aux;
                            cambios = true;
                        }
                    }
                }
            }
        return lista;
    }
    private Object[] ordenarDate(Atributo[] lista, String parametro){
        int salto, i;
        Atributo aux;
        boolean cambios;
        for (salto = lista.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < lista.length; i++){
                    //Guardamos los atributos de las clases en la lista
                    Date primerString = (Date) lista[i - salto].ObtenerAtributo(parametro);
                    Date segundoString = (Date) lista[i].ObtenerAtributo(parametro);
                    if (primerString.compareTo(segundoString)>0) {
                        aux = lista[i];
                        lista[i] = lista[i - salto];
                        lista[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        return lista;
    }
}

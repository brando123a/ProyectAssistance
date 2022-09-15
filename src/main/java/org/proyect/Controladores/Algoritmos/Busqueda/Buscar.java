package org.proyect.Controladores.Algoritmos.Busqueda;

import org.proyect.Modelos.Atributo;

public interface Buscar {
    int busqueda(Atributo[] lista, String tipoObjetivo, String objetivo) throws Exception;
    //esta interfaz devolveria el numero de indice buscado
}

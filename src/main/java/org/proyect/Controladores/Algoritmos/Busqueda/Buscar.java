package org.proyect.Controladores.Algoritmos.Busqueda;

import org.proyect.Modelos.Atributo;

public interface Buscar {
    int busqueda(Atributo[] lista, String objetivo) throws Exception;
    //esta interfaz devolveria el numero de indice buscado
}

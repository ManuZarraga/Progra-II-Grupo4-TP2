package main.java.org.structure.definition;

import main.java.org.structure.aerolinea.Vuelo;

// Esta interfaz representa el TDA para Vuelos.
public interface VueloADT {

    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene
     */
    void add(Vuelo value);
    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene.
     */
    void insert(int index, Vuelo value);

    /**
     * Descripcion: Elimina el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    Vuelo remove(int index);

    /**
     * Descripcion: Retorna el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    Vuelo get(int index);

    /**
     * Descripcion: Retorna el tamaño de la lista.
     * Precondición: No tiene.
     */
    int size();

    /**
     * Descripcion: Debe comprobar si la estructura tiene o no valores.
     * Precondición: No tiene.
     */
    boolean isEmpty();
}

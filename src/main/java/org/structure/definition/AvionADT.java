package main.java.org.structure.definition;

import main.java.org.structure.aerolinea.Avion;
import main.java.org.structure.aerolinea.Vuelo;

// Esta interfaz representa el TDA para Avion.
public interface AvionADT {

    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene
     */
    void add(Avion value);
    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene.
     */
    void insert(int index, Avion value);

    /**
     * Descripcion: Elimina el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    void remove(int index);

    /**
     * Descripcion: Retorna el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    Avion get(int index);

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
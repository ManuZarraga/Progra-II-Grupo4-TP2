package main.java.org.structure.definition;

import main.java.org.structure.aerolinea.Aeropuerto;
import main.java.org.structure.aerolinea.Avion;

// Esta interfaz representa el TDA para Aeropuerto.
public interface AeropuertoADT {

    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene
     */
    void add(Aeropuerto value);
    /**
     * Descripcion: Agrega el elemento a un indice.
     * Precondición: No tiene.
     */
    void insert(int index, Aeropuerto value);

    /**
     * Descripcion: Elimina el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    void remove(int index);

    /**
     * Descripcion: Retorna el elemento de un indice.
     * Precondición: El indice debe existir.
     */
    Aeropuerto get(int index);

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
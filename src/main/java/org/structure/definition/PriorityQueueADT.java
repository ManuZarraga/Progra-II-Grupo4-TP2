package main.java.org.structure.definition;

import main.java.org.structure.aerolinea.Vuelo;

// Esta interfaz representa el TDA Cola con Prioridad.
public interface PriorityQueueADT {
    /**
     * Descripcion: Devuelve el primer elemento de la estructura. Precondición: La estructura debe tener elementos.
     */
    Vuelo getElement();

    /**
     * Descripcion: Devuelve la prioridad del primer elemento de la estructura. Precondición: La estructura debe tener
     * elementos.
     */
    String getPriority();

    /**
     * Descripcion: Agrega un elemento al final de la estructura. Precondición: La estructura no debe sobrepasar la
     * capacidad.
     */
    void add(Vuelo value, String priority);

    /**
     * Descripcion: Elimina el primer elemento que existe. Precondición: La estructura debe tener elementos.
     */
    void remove();

    /**
     * Descripcion: Debe comprobar si la estructura tiene o no valores. Precondición: No tiene.
     */
    boolean isEmpty();
}

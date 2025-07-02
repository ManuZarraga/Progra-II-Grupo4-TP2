package main.java.org.structure.fixed;

import main.java.org.structure.aerolinea.Vuelo;
import main.java.org.structure.definition.QueueADT;
import main.java.org.structure.exceptions.ColaCompletaException;
import main.java.org.structure.exceptions.ColaVaciaException;

public class ColaVuelosDespegados implements QueueADT {

    private static final int CAPACIDAD = 50;
    private Vuelo[] colaVuelosDespegados = new Vuelo[CAPACIDAD];
    private int primerValor = 0;
    private int ultimoValor = -1;
    private int size = 0;

    @Override
    public Vuelo getElement() {
        if (isEmpty()) {
            throw new ColaVaciaException("La cola está vacía");
        }
        return colaVuelosDespegados[primerValor];
    }

    @Override
    public void add(Vuelo value) {
        if (size == CAPACIDAD) {
            throw new ColaCompletaException("La cola está completa");
        }
        ultimoValor = (ultimoValor + 1) % CAPACIDAD;
        colaVuelosDespegados[ultimoValor] = value;
        size++;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new ColaVaciaException("La cola está vacía");
        }
        primerValor = (primerValor + 1) % CAPACIDAD;
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

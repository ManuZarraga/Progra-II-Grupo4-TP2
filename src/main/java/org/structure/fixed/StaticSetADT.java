package main.java.org.structure.fixed;

import main.java.org.structure.definition.SetADT;

import java.util.Random;

public class StaticSetADT implements SetADT {

    private final int MAX = 100; // Capacidad máxima del conjunto
    private int[] elements;
    private int size;
    private Random rand;

    public StaticSetADT() {
        elements = new int[MAX];
        size = 0;
        rand = new Random();
    }

    @Override
    public boolean exist(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int choose() {
        if (isEmpty()) {
            throw new IllegalStateException("El conjunto está vacío");
        }
        int index = rand.nextInt(size);
        return elements[index];
    }

    @Override
    public void add(int value) {
        if (size >= MAX) {
            throw new IllegalStateException("El conjunto alcanzó su capacidad máxima");
        }
        if (!exist(value)) {
            elements[size] = value;
            size++;
        }
    }

    @Override
    public void remove(int value) {
        if (isEmpty()) return;

        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                // Mover el último elemento al lugar del eliminado
                elements[i] = elements[size - 1];
                size--;
                return;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Método auxiliar: obtener todos los elementos (no parte de la interfaz, opcional)
    public int[] getAllElements() {
        int[] result = new int[size];
        System.arraycopy(elements, 0, result, 0, size);
        return result;
    }

    // Método auxiliar: obtener el índice de un valor (opcional)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) return i;
        }
        return -1;
    }

    // Método auxiliar: obtener el valor en un índice
    public int getAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public int size() {
        return size;
    }
}
package main.java.org.structure.fixed;

import main.java.org.structure.definition.Set2ADT;

import java.util.Random;

public class StaticSetADT implements Set2ADT {

    private final int MAX = 100; // Capacidad máxima del conjunto
    private String[] elements;
    private int size;
    private Random rand;

    public StaticSetADT() {
        elements = new String[MAX];
        size = 0;
        rand = new Random();
    }

    @Override
    public boolean exist(String value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String choose() {
        if (isEmpty()) {
            throw new IllegalStateException("El conjunto está vacío");
        }
        int index = rand.nextInt(size);
        return elements[index];
    }

    @Override
    public void add(String value) {
        if (size >= MAX) {
            throw new IllegalStateException("El conjunto alcanzó su capacidad máxima");
        }
        if (!exist(value)) {
            elements[size] = value;
            size++;
        }
    }

    @Override
    public void remove(String value) {
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

}
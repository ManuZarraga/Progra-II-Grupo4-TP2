package main.java.org.structure.fixed;

import main.java.org.structure.definition.Set2ADT;
import main.java.org.structure.exceptions.SetVacioException;

import java.util.Random;

public class StaticSetADT implements Set2ADT {

    private final int MAX = 100;
    private String[] elements;
    private int size;
    private Random rand = new Random();

    public StaticSetADT() {
        elements = new String[MAX];
        size = 0;
    }

    @Override
    public boolean exist(String value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String choose() {
        if (isEmpty()) {
            throw new SetVacioException("El conjunto está vacío");
        }
        int randomPos = rand.nextInt(size);
        return elements[randomPos];
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
    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(element)) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
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
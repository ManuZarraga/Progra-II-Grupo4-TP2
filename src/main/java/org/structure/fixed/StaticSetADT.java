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
            if (elements[i] == value) {
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
        int validCount = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                validCount++;
            }
        }
        int randomPos = rand.nextInt(validCount);
        int seen = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                if (seen == randomPos) {
                    return elements[i];
                }
                seen++;
            }
        }
        throw new RuntimeException("Error inesperado en choose()");
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
    public void remove(String element) {if (exist(element)) {
        if (!exist(element)) {
            throw new IllegalStateException("No se puede eliminar un elemento que no existe");
        }
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return;
            }
        }
    }}

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
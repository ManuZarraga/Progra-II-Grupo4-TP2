package main.java.org.structure.implementation;

import main.java.org.structure.aerolinea.Aeropuerto;
import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.definition.SetADT;
import main.java.org.structure.fixed.StaticSetADT;

public class GrafoAeropuertos implements GraphADT {

    private int[][] matrizAdyacencia;
    private SetADT vertices;
    private Aeropuerto[] aeropuertos;
    private int cantidad;

    public GrafoAeropuertos() {
        this.vertices = new StaticSetADT();
        this.cantidad = cantidad;
        aeropuertos = new Aeropuerto[20];
        matrizAdyacencia = new int[15][15];
    }

    @Override
    public SetADT getVertxs() {
        return vertices;
    }

    @Override
    public void addVertx(int vertex) {
        vertices.add(vertex);
    }

    @Override
    public void removeVertx(int vertex) {
        vertices.remove(vertex);
        for (int i = 0; i < 100; i++) {
            matrizAdyacencia[vertex][i] = 0;
            matrizAdyacencia[i][vertex] = 0;
        }
    }

    @Override
    public void addEdge(int vertxOne, int vertxTwo, int weight) {
        matrizAdyacencia[vertxOne][vertxTwo] = weight;
        matrizAdyacencia[vertxTwo][vertxOne] = weight;
    }

    @Override
    public void removeEdge(int vertxOne, int vertxTwo) {
        matrizAdyacencia[vertxOne][vertxTwo] = 0;
        matrizAdyacencia[vertxTwo][vertxOne] = 0;
    }

    @Override
    public boolean existsEdge(int vertxOne, int vertxTwo) {
        return matrizAdyacencia[vertxOne][vertxTwo] > 0;
    }

    @Override
    public int edgeWeight(int vertxOne, int vertxTwo) {
        return matrizAdyacencia[vertxOne][vertxTwo];
    }

    @Override
    public boolean isEmpty() {
        return vertices.isEmpty();
    }
}

package main.java.org.structure.implementation;

import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.fixed.StaticSetADT;

public class Grafo implements GraphADT {
    private StaticSetADT vertices; // Conjunto de vértices (aeropuertos)
    private StaticSetADT[] edges;  // Aristas (conexiones entre aeropuertos)

    public Grafo(int numberOfVertices) {
        vertices = new StaticSetADT();
        edges = new StaticSetADT[numberOfVertices];

        // Inicializamos los conjuntos de aristas
        for (int i = 0; i < numberOfVertices; i++) {
            edges[i] = new StaticSetADT();
        }
    }

    @Override
    public StaticSetADT getVertxs() {
        return vertices;
    }

    @Override
    public void addVertx(int vertex) {
        if (!vertices.exist(vertex)) {
            vertices.add(vertex);
        }
    }

    @Override
    public void removeVertx(int vertex) {
        if (vertices.exist(vertex)) {
            vertices.remove(vertex);
            // Eliminar también las rutas asociadas al vértice
            for (StaticSetADT edge : edges) {
                edge.remove(vertex);
            }
            edges[vertex] = null;
        }
    }

    @Override
    public void addEdge(int vertxOne, int vertxTwo, int weight) {
        if (vertices.exist(vertxOne) && vertices.exist(vertxTwo)) {
            edges[vertxOne].add(vertxTwo);
            edges[vertxTwo].add(vertxOne); // Grafo no dirigido
        }
    }

    @Override
    public void removeEdge(int vertxOne, int vertxTwo) {
        if (vertices.exist(vertxOne) && vertices.exist(vertxTwo)) {
            edges[vertxOne].remove(vertxTwo);
            edges[vertxTwo].remove(vertxOne); // Grafo no dirigido
        }
    }

    @Override
    public boolean existsEdge(int vertxOne, int vertxTwo) {
        return vertices.exist(vertxOne) && vertices.exist(vertxTwo) &&
                edges[vertxOne].exist(vertxTwo);
    }

    @Override
    public int edgeWeight(int vertxOne, int vertxTwo) {
        // Este ejemplo no usa pesos concretos para las aristas
        return 1; // Simplemente asignamos un peso fijo para ilustrar el funcionamiento
    }

    @Override
    public boolean isEmpty() {
        return vertices.isEmpty();
    }
}

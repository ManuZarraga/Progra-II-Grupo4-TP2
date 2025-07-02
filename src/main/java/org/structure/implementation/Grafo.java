package main.java.org.structure.implementation;

import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.definition.Set2ADT;
import main.java.org.structure.exceptions.AristaYaCreada;
import main.java.org.structure.fixed.StaticSetADT;


public class Grafo implements GraphADT {
    private String[] vertices;
    private String[][] edges;
    private int cantVert=0;

    public Grafo() {
        vertices = new String[50];
        edges = new String[50][50];
    }

    @Override
    public Set2ADT getVertxs() {
        Set2ADT aux = new StaticSetADT();
        for (String elemento : vertices) {
            if (elemento != null) {
                aux.add(elemento);
            }
        }
        return aux;
    }

    @Override
    public void addVertx(String vertex) {
        Set2ADT aux = getVertxs();
        if (!aux.exist(vertex)) {
            vertices[cantVert]=vertex;
            cantVert++;
        }
    }

    @Override
    public void removeVertx(String vertex) {
        int aux1 = 0;
        Set2ADT aux = getVertxs();
        if (aux.exist(vertex)) {
            for (int i = 0; i < cantVert; i++) {
                if (vertices[i] != null && vertices[i].equals(vertex)) {
                    aux1 = i;
                }
            }
            vertices[aux1] = null;
            for (int i = 0; i < cantVert; i++) {
                if (edges[i] != null && edges[i].equals(vertex)) {
                    aux1 = i;
                }
            }
            edges[aux1] = null;
        }
    }

    @Override
    public void addEdge(String vertxOne, String vertxTwo, int weight) {
        if (exist(vertices,vertxOne) && exist(vertices,vertxTwo)) {
            int aux=pos(vertices,vertxOne);
            int aux1=pos(vertices,vertxTwo);
            if (edges[aux1][aux]==null){
                edges[aux][aux1] = vertxOne;
            }
            else {
                throw new AristaYaCreada("La arista ya fue creada");
            }
        }
    }

    @Override
    public void removeEdge(String  vertxOne, String vertxTwo) {
        if (exist(vertices,vertxOne) && exist(vertices,vertxTwo)) {
            int aux=pos(vertices,vertxOne);
            int aux1=pos(vertices,vertxTwo);
            edges[aux][aux1] = null;
        }
    }

    @Override
    public boolean existsEdge(String vertxOne, String vertxTwo) {
        int aux=pos(vertices,vertxOne);
        int aux1=pos(vertices,vertxTwo);
        return edges[aux][aux1] != null;
    }

    @Override
    public int edgeWeight(String vertxOne, String vertxTwo) {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return getVertxs().isEmpty();
    }

    private boolean exist(String[] array, String value) {
        for (String elemento : array) {
            if (elemento != null && elemento.equals(value)) {
                return true;
            }
        }
        return false;
    }

    private int pos(String[] array,String value){
        for (int i=0;i<cantVert;i++){
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public int getCantVert() {
        return cantVert;
    }

    public void setCantVert(int cantVert) {
        this.cantVert = cantVert;
    }
}
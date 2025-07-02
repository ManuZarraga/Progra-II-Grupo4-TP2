package main.java.org.structure;

import main.java.org.structure.aerolinea.Menu;
import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.exceptions.AristaYaCreada;
import main.java.org.structure.implementation.Grafo;

public class Main {
    public static void main(String[] args) {
        GraphADT grafo = new Grafo(10);
        grafo.addVertx("uno");
        grafo.addVertx("dos");
        grafo.addEdge("uno","dos",4);
        try {
            grafo.addEdge("dos","uno",4);
        }catch (AristaYaCreada e){System.out(e.)}



        Menu menu = new Menu();
        menu.iniciar();
    }
}
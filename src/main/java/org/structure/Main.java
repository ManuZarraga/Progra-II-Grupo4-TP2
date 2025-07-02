package main.java.org.structure;

import main.java.org.structure.aerolinea.Menu;
import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.definition.Set2ADT;
import main.java.org.structure.exceptions.AristaYaCreada;
import main.java.org.structure.fixed.StaticSetADT;
import main.java.org.structure.implementation.Grafo;
import main.java.org.structure.utils.GrafoUtil;

public class Main {
    public static void main(String[] args) {
        GraphADT grafo = new Grafo();
        grafo.addVertx("uno");
        grafo.addVertx("dos");
        grafo.addVertx("tres");
        grafo.addVertx("cuatro");
        grafo.addEdge("uno","dos",4);
        grafo.addEdge("dos","tres",4);
        grafo.addEdge("uno","cuatro",4);
        grafo.addEdge("tres","uno",4);
        grafo.addEdge("uno","cuatro",4);
        grafo.addEdge("cuatro","tres",4);

        GrafoUtil.dfs(grafo, "uno", "tres");

        Menu menu = new Menu();
        menu.iniciar();

        Set2ADT set = new StaticSetADT();
        set.add("asd");
        set.add("as124213d");
        set.add("assadd");
        set.add("as2222d");
        while (!set.isEmpty()){
            String aux = set.choose();
            set.remove(aux);
        }
    }
}
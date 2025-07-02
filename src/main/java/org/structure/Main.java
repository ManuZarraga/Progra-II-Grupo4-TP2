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
        Menu menu = new Menu();
        menu.iniciar();
    }
}
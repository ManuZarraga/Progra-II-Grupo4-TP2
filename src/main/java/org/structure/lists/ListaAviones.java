package main.java.org.structure.lists;

import main.java.org.structure.aerolinea.Avion;
import main.java.org.structure.definition.AvionADT;
import main.java.org.structure.exceptions.FueraDeRangoException;
import main.java.org.structure.exceptions.ListaCompletaException;
import main.java.org.structure.exceptions.ListaVaciaException;

public class ListaAviones implements AvionADT {

    private static Avion[] listaAviones = new Avion[10];
    private int contador = 0;

    public void  mostrarLista(){
        for(int i = 0; i < contador; i++){
            System.out.println(listaAviones[i]);
        }
    }

    @Override
    public void add(Avion value) {
        if (contador == 30) {
            throw new ListaCompletaException("La lista de turnos esta completa.");
        } else {
            listaAviones[contador] = value;
            contador++;
        }
    }

    @Override
    public void insert(int index, Avion value) {
        if (index >= 0 && index <30){
            listaAviones[index] = null;
        } else {
            throw new FueraDeRangoException("Indice fuera de rango.");
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()){
            throw new ListaVaciaException("La lista de turnos esta vacia.");
        } if (index >= 0 && index <30){
            listaAviones[index] = null;
            contador--;
        } else {
            throw new FueraDeRangoException("Indice fuera de rango.");
        }
    }

    @Override
    public Avion get(int index) {
        if (index >= 0 && index <30){
            return listaAviones[index];
        } else {
            throw new FueraDeRangoException("Indice fuera de rango");
        }
    }

    @Override
    public int size() {
        return contador;
    }

    @Override
    public boolean isEmpty() {
        return contador == 0;
    }
}

package main.java.org.structure.lists;

import main.java.org.structure.aerolinea.Aeropuerto;
import main.java.org.structure.definition.AeropuertoADT;
import main.java.org.structure.exceptions.FueraDeRangoException;
import main.java.org.structure.exceptions.ListaCompletaException;
import main.java.org.structure.exceptions.ListaVaciaException;

public class ListaAeropuertos implements AeropuertoADT {

    private static Aeropuerto[] listaAeropuertos = new Aeropuerto[30];
    private int contador = 0;

    public void  mostrarLista(){
        for(int i = 0; i < contador; i++){
            System.out.println(listaAeropuertos[i].getCodigo());
        }
    }

    @Override
    public void add(Aeropuerto value) {
        if (contador == 30) {
            throw new ListaCompletaException("La lista de turnos esta completa.");
        } else {
            listaAeropuertos[contador] = value;
            contador++;
        }
    }

    @Override
    public void insert(int index, Aeropuerto value) {
        if (index >= 0 && index <30){
            listaAeropuertos[index] = null;
        } else {
            throw new FueraDeRangoException("Indice fuera de rango.");
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()){
            throw new ListaVaciaException("La lista de turnos esta vacia.");
        } if (index >= 0 && index <30){
            listaAeropuertos[index] = null;
            contador--;
        } else {
            throw new FueraDeRangoException("Indice fuera de rango.");
        }
    }

    @Override
    public Aeropuerto get(int index) {
        if (index >= 0 && index <30){
            return listaAeropuertos[index];
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

    public boolean existeAeropuerto(String codigo){
        for(int i = 0; i < contador; i++){
            if(listaAeropuertos[i].getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
}

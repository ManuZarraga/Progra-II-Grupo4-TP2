package main.java.org.structure.fixed;

import main.java.org.structure.aerolinea.Vuelo;
import main.java.org.structure.definition.PriorityQueueADT;
import main.java.org.structure.exceptions.ColaCompletaException;
import main.java.org.structure.exceptions.ColaVaciaException;
import main.java.org.structure.exceptions.VueloInexistenteException;

public class ColaVuelos implements PriorityQueueADT {

    private int tamanioCola;
    private static Vuelo[] colaVuelos = new Vuelo[75];
    private static int[] colaVuelosXPrioridad = new int[75];
    private int contador = 0;

    public void mostrarColaVuelos(){
        System.out.println("=== VUELOS PROGRAMADOS ===");

        System.out.println("Vuelos pendientes:");
        for(int i = 0; i < contador; i++){
            System.out.println("ID: " + colaVuelos[i].getIDVuelo() + " ORIGEN: " + colaVuelos[i].getOrigen() + " | DESTINO: " + colaVuelos[i].getDestino());
        }
    }

    @Override
    public Vuelo getElement() {
        if(isEmpty()){
            throw new ColaVaciaException("La cola está vacia.");
        }
        return colaVuelos[0];
    }

    @Override
    public int getPriority() {
        if(isEmpty()){
            throw new ColaVaciaException("La cola está vacia, no existen prioridades.");
        }
        return colaVuelosXPrioridad[0];
    }

    @Override
    public void add(Vuelo value, int condicion) {
        if (contador == 50) {
            throw new ColaCompletaException("La cola de vuelos está completa.");
        }

        if (contador == 0) {
            colaVuelos[0] = value;
            colaVuelosXPrioridad[0] = condicion;
        } else {
            int i;
            for (i = contador -1; i >= 0; i--) {
                int tipoVuelo = condicion;
                int prioridadEnCola = colaVuelosXPrioridad[i];

                if (tipoVuelo >= prioridadEnCola) {
                    break;
                }
                colaVuelos[i + 1] = colaVuelos[i];
                colaVuelosXPrioridad[i + 1] = colaVuelosXPrioridad[i];
            }
            colaVuelos[i + 1] = value;
            colaVuelosXPrioridad[i + 1] = condicion;
        }
        contador++;
        tamanioCola++;
    }

    @Override
    public void remove() {
        if(isEmpty()){
            throw new ColaVaciaException("La cola está vacia, no hay elementos para borrar");
        }
        for (int i = 0; i < contador - 1; i++){
            colaVuelos[i] = colaVuelos[i+1];
            colaVuelosXPrioridad[i] = colaVuelosXPrioridad[i+1];
        }
        colaVuelos[contador-1] = null;
        colaVuelosXPrioridad[contador-1] = 0;
        contador--;
        tamanioCola--;
    }

    public Vuelo buscarPorId(int id){
        for (int i = 0; i < contador - 1; i++){
            if (colaVuelos[i].getIDVuelo() == id){
                return colaVuelos[i];
            }
        }
        return null;
    }

    public void quitarPorId(Vuelo vuelo){
        if(isEmpty()){
            throw new ColaVaciaException("La cola está vacia, no hay elementos para borrar");
        }
        for(int j = 0; j < contador; j++){
            if(vuelo.getIDVuelo() == colaVuelos[j].getIDVuelo()){
                for (int i = j; i < contador - 1; i++){
                    colaVuelos[i] = colaVuelos[i+1];
                    colaVuelosXPrioridad[i] = colaVuelosXPrioridad[i+1];
                }
                colaVuelos[contador-1] = null;
                colaVuelosXPrioridad[contador-1] = 0;
                contador--;
                tamanioCola--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return tamanioCola == 0;
    }
}

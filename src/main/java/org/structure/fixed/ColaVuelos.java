package main.java.org.structure.fixed;

import main.java.org.structure.aerolinea.Vuelo;
import main.java.org.structure.definition.PriorityQueueADT;
import main.java.org.structure.exceptions.ColaCompletaException;
import main.java.org.structure.exceptions.ColaVaciaException;

public class ColaVuelos implements PriorityQueueADT {

    private int tamanioCola;
    private static Vuelo[] colaVuelos = new Vuelo[50];
    private static String[] colaVuelosXPrioridad = new String[50];
    private int contador = 0;

    public void mostrarLista(){
        System.out.println("=== VUELOS PROGRAMADOS ===");

        System.out.println("Vuelos pendientes:");
        for(int i = 0; i < contador; i++){
            System.out.println(colaVuelos[i]);
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
    public String getPriority() {
        if(isEmpty()){
            throw new ColaVaciaException("La cola está vacia, no existen prioridades.");
        }
        return colaVuelosXPrioridad[0];
    }

    @Override
    public void add(Vuelo value, String condicion) {
        if (contador == 20) {
            throw new ColaCompletaException("La cola de vuelos está completa.");
        }

        value.setCondicion(condicion);

        if (contador == 0) {
            colaVuelos[0] = value;
            colaVuelosXPrioridad[0] = condicion;
        } else {
            int i;
            for (i = contador -1; i >= 0; i--) {
                int urgenciaActual = value.medirUrgencia(condicion);
                int urgenciaEnCola = colaVuelos[i].medirUrgencia(colaVuelosXPrioridad[i]);

                if (urgenciaActual >= urgenciaEnCola) {
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
        colaVuelosXPrioridad[contador-1] = null;
        contador--;
        tamanioCola--;
    }

    @Override
    public boolean isEmpty() {
        return tamanioCola == 0;
    }
}

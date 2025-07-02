package main.java.org.structure.aerolinea;

import main.java.org.structure.fixed.ColaVuelos;
import main.java.org.structure.implementation.Grafo;
import main.java.org.structure.lists.ListaAeropuertos;
import main.java.org.structure.lists.ListaAviones;

import java.util.Scanner;

public class Menu {

    private String opcion;
    private String consulta;
    private int id;
    private ColaVuelos colaVuelos;
    private int cantVuelos = 0;
    Scanner myObj = new Scanner(System.in);
    Grafo grafo = new Grafo();
    Avion avion;
    ListaAviones listaAviones = new ListaAviones();
    ListaAeropuertos listaAeropuertos = new ListaAeropuertos();

    Aeropuerto aer1 = new Aeropuerto("ATL", "Hartsfield-Jackson Atlanta Intl. (EE. UU.)");
    Aeropuerto aer2 = new Aeropuerto("PEK", "Beijing Capital Intl. (China)");
    Aeropuerto aer3 = new Aeropuerto("LHR", "London Heathrow (Reino Unido)");
    Aeropuerto aer4 = new Aeropuerto("CDG", "Charles de Gaulle (Francia)");
    Aeropuerto aer5 = new Aeropuerto("HND", "Tokyo Haneda (Japón)");
    Aeropuerto aer6 = new Aeropuerto("DXB", "Dubai International (Emiratos Árabes Unidos)");
    Aeropuerto aer7 = new Aeropuerto("LAX", "Los Angeles Intl. (EE. UU.)");
    Aeropuerto aer8 = new Aeropuerto("SIN", "Singapore Changi (Singapur)");
    Aeropuerto aer9 = new Aeropuerto("FRA", "Frankfurt am Main (Alemania)");
    Aeropuerto aer10 = new Aeropuerto("AMS", "Amsterdam Schiphol (Países Bajos)");
    Aeropuerto aer11 = new Aeropuerto("GRU", "São Paulo/Guarulhos (Brasil)");
    Aeropuerto aer12 = new Aeropuerto("SYD", "Sydney Kingsford Smith (Australia)");
    Aeropuerto aer13 = new Aeropuerto("JFK", "John F. Kennedy (EE. UU.)");
    Aeropuerto aer14 = new Aeropuerto("ICN", "Incheon Intl. (Corea del Sur)");
    Aeropuerto aer15 = new Aeropuerto("MAD", "Adolfo Suárez Madrid–Barajas (España)");

    Avion avion1 = new Avion(111, "Boeign 737");
    Avion avion2 = new Avion(222, "Airbus A320");
    Avion avion3 = new Avion(333, "Boeign 767");
    Avion avion4 = new Avion(444, "Embraer E190");
    Avion avion5 = new Avion(555, "Boeing 777");
    Avion avion6 = new Avion(666, "Airbus A350");
    Avion avion7 = new Avion(777, "Airbus A330");
    Avion avion8 = new Avion(888, "Embraer E195");
    Avion avion9 = new Avion(999, "Bombardier CRJ900");
    Avion avion10 = new Avion(1000, "Airbus A380");

    public Menu() {
        grafo.addVertx(aer1.getCodigo());
        grafo.addVertx(aer2.getCodigo());
        grafo.addVertx(aer3.getCodigo());
        grafo.addVertx(aer4.getCodigo());
        grafo.addVertx(aer5.getCodigo());
        grafo.addVertx(aer6.getCodigo());
        grafo.addVertx(aer7.getCodigo());
        grafo.addVertx(aer8.getCodigo());
        grafo.addVertx(aer9.getCodigo());
        grafo.addVertx(aer10.getCodigo());
        grafo.addVertx(aer11.getCodigo());
        grafo.addVertx(aer12.getCodigo());
        grafo.addVertx(aer13.getCodigo());
        grafo.addVertx(aer14.getCodigo());
        grafo.addVertx(aer15.getCodigo());

        grafo.addEdge(aer1.getCodigo(),aer2.getCodigo(),1);
        grafo.addEdge(aer3.getCodigo(),aer4.getCodigo(),1);
        grafo.addEdge(aer5.getCodigo(),aer3.getCodigo(),1);
        grafo.addEdge(aer6.getCodigo(),aer2.getCodigo(),1);
        grafo.addEdge(aer4.getCodigo(),aer1.getCodigo(),1);
        grafo.addEdge(aer1.getCodigo(),aer5.getCodigo(),1);
        grafo.addEdge(aer2.getCodigo(),aer5.getCodigo(),1);
        grafo.addEdge(aer7.getCodigo(),aer1.getCodigo(),1);
        grafo.addEdge(aer15.getCodigo(),aer12.getCodigo(),1);
        grafo.addEdge(aer10.getCodigo(),aer4.getCodigo(),1);
        grafo.addEdge(aer13.getCodigo(),aer9.getCodigo(),1);
        grafo.addEdge(aer8.getCodigo(),aer2.getCodigo(),1);
        grafo.addEdge(aer7.getCodigo(),aer13.getCodigo(),1);
        grafo.addEdge(aer9.getCodigo(),aer2.getCodigo(),1);
        grafo.addEdge(aer9.getCodigo(),aer4.getCodigo(),1);
        grafo.addEdge(aer14.getCodigo(),aer1.getCodigo(),1);
        grafo.addEdge(aer15.getCodigo(),aer1.getCodigo(),1);
        grafo.addEdge(aer9.getCodigo(),aer12.getCodigo(),1);
        grafo.addEdge(aer1.getCodigo(),aer5.getCodigo(),1);
        grafo.addEdge(aer1.getCodigo(),aer8.getCodigo(),1);

        listaAviones.add(avion1);
        listaAviones.add(avion2);
        listaAviones.add(avion3);
        listaAviones.add(avion4);
        listaAviones.add(avion5);
        listaAviones.add(avion6);
        listaAviones.add(avion7);
        listaAviones.add(avion8);
        listaAviones.add(avion9);
        listaAviones.add(avion10);

        listaAeropuertos.add(aer1);
        listaAeropuertos.add(aer2);
        listaAeropuertos.add(aer3);
        listaAeropuertos.add(aer4);
        listaAeropuertos.add(aer5);
        listaAeropuertos.add(aer6);
        listaAeropuertos.add(aer7);
        listaAeropuertos.add(aer8);
        listaAeropuertos.add(aer9);
        listaAeropuertos.add(aer10);
        listaAeropuertos.add(aer11);
        listaAeropuertos.add(aer12);
        listaAeropuertos.add(aer13);
        listaAeropuertos.add(aer14);
        listaAeropuertos.add(aer15);
    }

    public void iniciar() {
        System.out.println("""
                \n
                ==============================================
                          SISTEMA DE GESTIÓN DE VUELOS       
                ==============================================
                Opciones disponibles:
                1. Agregar nuevo Vuelo
                2. Agregar un nuevo Avion
                3. Agregar nueva Ruta
                4. Retrasar Vuelo
                5. Cancelar Vuelo
                6. Reportes
                """);
        System.out.println("Ingrese una opción: ");
        opcion = myObj.nextLine();

        switch (opcion) {
            case "1":
                agregarVuelo();
                iniciar();
            case "2":
                agregarAvion();
                iniciar();
            case "3":
                agregarRuta();
                iniciar();
            case "4":
                retrasarVuelo();
                iniciar();
            case "5":
                cancelarVuelo();
                iniciar();
            case "6":
                break;
            default:
                System.out.println("Opción incorrecta.");
                iniciar();
        }
    }

    // VALIDAR NO REPETIDO
    public void agregarRuta(){
        System.out.println("Ingrese el codigo del primer aeropuerto: ");
        listaAeropuertos.mostrarLista();
        String codigo1 = myObj.nextLine();
        while (!listaAeropuertos.existeAeropuerto(codigo1)) {
            System.out.println("Código no válido, ingresar nuevamente: ");
            listaAeropuertos.mostrarLista();
            codigo1 = myObj.nextLine();
        }

        System.out.println("Ingrese el codigo del segundo aeropuerto: ");
        listaAeropuertos.mostrarLista();
        String codigo2 = myObj.nextLine();
        while (!listaAeropuertos.existeAeropuerto(codigo2)) {
            System.out.println("Código no válido, ingresar nuevamente: ");
            listaAeropuertos.mostrarLista();
            codigo2 = myObj.nextLine();
        }

        grafo.addEdge(codigo1, codigo2, 1);
    }

    // FALTA VALIDAR SI ESTA DISPONIBLE O NO ??? (NI IDEA DESPUES VEMOS)
    public void agregarVuelo() {
        while (avion == null) {
            for (int i = 0; i < listaAviones.getContador(); i++) {
                if (listaAviones.get(i).isDisponible()) {
                    avion = listaAviones.get(i);
                    listaAviones.get(i).setDisponible(false);
                    listaAviones.get(i).setCantViajes(listaAviones.get(i).getCantViajes() + 1);
                }
            }
        }

        System.out.println("Ingrese Origen del Vuelo: ");
        listaAeropuertos.mostrarLista();
        String origen = myObj.nextLine();
        while (!listaAeropuertos.existeAeropuerto(origen)) {
            System.out.println("Código no válido, ingresar nuevamente: ");
            listaAeropuertos.mostrarLista();
            origen = myObj.nextLine();
        }

        System.out.println("Ingrese Destino del Vuelo: ");
        listaAeropuertos.mostrarLista();
        String destino = myObj.nextLine();
        while (!listaAeropuertos.existeAeropuerto(origen)) {
            System.out.println("Código no válido, ingresar nuevamente: ");
            listaAeropuertos.mostrarLista();
            destino = myObj.nextLine();
        }

        System.out.println("Ingrese Tipo de Vuelo: " +
                "1 - INTERNACIONAL" +
                "2 - NACIONAL" +
                "3 - CARGA" +
                " ");
        int tipoVuelo = myObj.nextInt();
        cantVuelos++;
        Vuelo vuelo = new Vuelo(avion, origen, destino, tipoVuelo, cantVuelos);
        colaVuelos.add(vuelo, tipoVuelo);
    }

    // FALTA VALIDAR
    public void retrasarVuelo(){
        System.out.println("Ingrese el ID del Vuelo a retrasar: ");
        int idVuelo = myObj.nextInt();
        Vuelo vueloARetrasar = colaVuelos.buscarPorId(idVuelo);
        if(vueloARetrasar.getTipoVuelo() == 3){
            colaVuelos.add(vueloARetrasar, vueloARetrasar.getTipoVuelo());
        } else {
            colaVuelos.quitarPorId(vueloARetrasar, vueloARetrasar.getTipoVuelo());
            colaVuelos.add(vueloARetrasar, vueloARetrasar.getTipoVuelo() + 1);
        }
    }

    // FALTA VALIDAR
    public void cancelarVuelo(){
        System.out.println("Ingrese el ID del Vuelo a cancelar: ");
        int idVuelo = myObj.nextInt();
        Vuelo vueloACancelar = colaVuelos.buscarPorId(idVuelo);
        colaVuelos.quitarPorId(vueloACancelar, vueloACancelar.getTipoVuelo());
    }

    // FALTA VALIDAR SOLO NUMEROS LA MATRICULAAAAAAAA me quiero m
    public void agregarAvion(){
        System.out.println("Ingrese Matricula del nuevo Avion: ");
        int matricula = myObj.nextInt();

        System.out.println("Ingrese el Tipo de Avion: ");
        String tipoAvion = myObj.nextLine();

        Avion nuevoAvion =  new Avion(matricula, tipoAvion);
        listaAviones.add(nuevoAvion);
    }

}

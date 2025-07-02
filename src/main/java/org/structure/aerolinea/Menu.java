package main.java.org.structure.aerolinea;

import main.java.org.structure.exceptions.AristaYaCreada;
import main.java.org.structure.exceptions.ColaVaciaException;
import main.java.org.structure.exceptions.NoHayAvionesDisponiblesException;
import main.java.org.structure.fixed.ColaVuelos;
import main.java.org.structure.fixed.ColaVuelosDespegados;
import main.java.org.structure.implementation.Grafo;
import main.java.org.structure.lists.ListaAeropuertos;
import main.java.org.structure.lists.ListaAviones;
import main.java.org.structure.utils.GrafoUtil;

import java.util.Scanner;

public class Menu {

    private String opcion;
    private ColaVuelos colaVuelos;
    private ColaVuelosDespegados colaVuelosDespegados;
    Scanner myObj = new Scanner(System.in);
    Grafo grafo = new Grafo();
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
        this.colaVuelos = new ColaVuelos();
        this.colaVuelosDespegados = new ColaVuelosDespegados();
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

        precargar();
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
                4. Despegar Vuelo
                5. Terminar Vuelo
                6. Retrasar Vuelo
                7. Cancelar Vuelo
                8. Listar Aviones con mayor asignación
                9. Listar Aeropuertos con más vuelos entrantes/salientes
                10. Utilización promedio de aviones
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
                despegarVuelo();
                iniciar();
            case "5":
                terminarVuelo();
                iniciar();
            case "6":
                retrasarVuelo();
                iniciar();
            case "7":
                cancelarVuelo();
                iniciar();
            case "8":
                listaAviones.avionesConMasAsignaciones();
                iniciar();
            case "9":
                GrafoUtil.mostrarVuelosEntradaSalida(grafo);
                iniciar();
            case "10":
                listaAviones.promedioAsignaciones();
                iniciar();
            default:
                System.out.println("Opción incorrecta.");
                iniciar();
        }
    }

    public void despegarVuelo(){
        try {
            Vuelo aux = colaVuelos.getElement();
            if (aux == null){
                throw new ColaVaciaException("No hay vuelos planificados");
            }
            System.out.println("Despegando el vuelo de prioridad " + aux.getTipoVuelo() + " ID : " + aux.getIDVuelo());
            colaVuelos.remove();

            colaVuelosDespegados.add(aux);

        } catch (ColaVaciaException e) {
            System.out.println(e.getMessage());
            iniciar();
        }
    }

    public void terminarVuelo(){
        try {
            Vuelo aux = colaVuelosDespegados.getElement();
            colaVuelosDespegados.remove();
            aux.getAvion().setDisponible(true);
        } catch (ColaVaciaException e) {
            System.out.println(e.getMessage());
            iniciar();
        }
    }

    public void agregarRuta(){
        try {
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

            if (grafo.existsEdge(codigo1, codigo2)){
                throw new AristaYaCreada("Esa ruta ya existe");
            }

            grafo.addEdge(codigo1, codigo2, 1);
            System.out.println("Nueva Ruta creada: " + codigo1 + " - " + codigo2);

        } catch (AristaYaCreada e) {
            System.out.println(e.getMessage());
            iniciar();
        }
    }

    public void agregarVuelo() {
        Avion avion = null;
        int i = 0;
        try {
            while(avion == null){
                if (listaAviones.get(i).isDisponible()) {
                    avion = listaAviones.get(i);
                    listaAviones.get(i).setDisponible(false);
                    listaAviones.get(i).setCantViajes(listaAviones.get(i).getCantViajes() + 1);
                }
                if (i == listaAviones.size()) {
                    throw new NoHayAvionesDisponiblesException("No hay aviones disponibles.");
                }
                i++;
            }
        } catch (NoHayAvionesDisponiblesException e) {
            System.out.println(e.getMessage());
            iniciar();
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
        while (!listaAeropuertos.existeAeropuerto(destino)) {
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
        while (tipoVuelo < 1 || tipoVuelo > 3) {
            System.out.println("Opción incorrecta, elija un tipo válido: " +
                    "1 - INTERNACIONAL" +
                    " 2 - NACIONAL" +
                    " 3 - CARGA" +
                    " ");
            tipoVuelo = myObj.nextInt();
        }

        System.out.println("Vuelo creado con éxito!");

        Vuelo vuelo = new Vuelo(avion, origen, destino, tipoVuelo);
        colaVuelos.add(vuelo, tipoVuelo);
    }

    public void retrasarVuelo(){
        try {
            System.out.println("Ingrese el ID del Vuelo a retrasar: ");
            colaVuelos.mostrarColaVuelos();
            int idVuelo = myObj.nextInt();
            while (colaVuelos.buscarPorId(idVuelo) == null ) {
                System.out.println("Ingrese un ID correcto: ");
                colaVuelos.mostrarColaVuelos();
                idVuelo = myObj.nextInt();
            }

            Vuelo vueloARetrasar = colaVuelos.buscarPorId(idVuelo);
            if(vueloARetrasar.getTipoVuelo() == 3){
                colaVuelos.add(vueloARetrasar, vueloARetrasar.getTipoVuelo());
                System.out.println("Vuelo retrasado!");
            } else {
                colaVuelos.quitarPorId(vueloARetrasar);
                colaVuelos.add(vueloARetrasar, vueloARetrasar.getTipoVuelo() + 1);
                System.out.println("Vuelo retrasado!");
            }
        } catch (ColaVaciaException e){
            System.out.println(e.getMessage());
            iniciar();
        }

    }

    public void cancelarVuelo(){
        try {
            System.out.println("Ingrese el ID del Vuelo a cancelar: ");
            colaVuelos.mostrarColaVuelos();
            int idVuelo = myObj.nextInt();
            while (colaVuelos.buscarPorId(idVuelo) == null ) {
                System.out.println("Ingrese un ID correcto: ");
                colaVuelos.mostrarColaVuelos();
                idVuelo = myObj.nextInt();
            }

            Vuelo vueloACancelar = colaVuelos.buscarPorId(idVuelo);
            vueloACancelar.getAvion().setDisponible(true);
            colaVuelos.quitarPorId(vueloACancelar);
            System.out.println("Vuelo Cancelado!");
        } catch (ColaVaciaException e){
            System.out.println(e.getMessage());
            iniciar();
        }

    }

    public void agregarAvion(){
        System.out.println("Ingrese Matricula del nuevo Avion: ");
        int matricula = myObj.nextInt();

        while (listaAviones.buscarAvionXMatricula(matricula) != null) {
            System.out.println("El Avion ya existe, ingresar otra matricula: ");
            matricula = myObj.nextInt();
        }
        myObj.nextLine();

        System.out.println("Ingrese el Tipo de Avion: ");
        String tipoAvion = myObj.nextLine();

        Avion nuevoAvion =  new Avion(matricula, tipoAvion);
        listaAviones.add(nuevoAvion);
    }

    private void precargar() {
        Vuelo vuelo1 = new Vuelo(avion1, aer1.getCodigo(), aer2.getCodigo(), 1);
        Vuelo vuelo2 = new Vuelo(avion2, aer2.getCodigo(), aer3.getCodigo(), 1);
        Vuelo vuelo3 = new Vuelo(avion3, aer4.getCodigo(), aer7.getCodigo(), 1);
        Vuelo vuelo4 = new Vuelo(avion4, aer1.getCodigo(), aer8.getCodigo(), 2);
        Vuelo vuelo5 = new Vuelo(avion5, aer5.getCodigo(), aer2.getCodigo(), 3);
        Vuelo vuelo6 = new Vuelo(avion6, aer12.getCodigo(), aer4.getCodigo(), 2);
        Vuelo vuelo7 = new Vuelo(avion7, aer13.getCodigo(), aer2.getCodigo(), 2);
        Vuelo vuelo8 = new Vuelo(avion8, aer6.getCodigo(), aer9.getCodigo(), 3);
        Vuelo vuelo9 = new Vuelo(avion9, aer3.getCodigo(), aer12.getCodigo(), 3);
        Vuelo vuelo10 = new Vuelo(avion10, aer7.getCodigo(), aer15.getCodigo(), 2);

        Vuelo vuelo11 = new Vuelo(avion1, aer2.getCodigo(), aer1.getCodigo(), 1);
        Vuelo vuelo12 = new Vuelo(avion2, aer3.getCodigo(), aer5.getCodigo(), 2);
        Vuelo vuelo13 = new Vuelo(avion3, aer7.getCodigo(), aer6.getCodigo(), 3);
        Vuelo vuelo14 = new Vuelo(avion4, aer8.getCodigo(), aer9.getCodigo(), 2);
        Vuelo vuelo15 = new Vuelo(avion5, aer10.getCodigo(), aer4.getCodigo(), 1);
        Vuelo vuelo16 = new Vuelo(avion6, aer11.getCodigo(), aer3.getCodigo(), 2);
        Vuelo vuelo17 = new Vuelo(avion7, aer2.getCodigo(), aer13.getCodigo(), 1);
        Vuelo vuelo18 = new Vuelo(avion8, aer9.getCodigo(), aer6.getCodigo(), 3);
        Vuelo vuelo19 = new Vuelo(avion9, aer12.getCodigo(), aer5.getCodigo(), 2);
        Vuelo vuelo20 = new Vuelo(avion10, aer15.getCodigo(), aer14.getCodigo(), 1);

        Vuelo vuelo21 = new Vuelo(avion1, aer11.getCodigo(), aer10.getCodigo(), 2);
        Vuelo vuelo22 = new Vuelo(avion2, aer14.getCodigo(), aer12.getCodigo(), 3);
        Vuelo vuelo23 = new Vuelo(avion3, aer1.getCodigo(), aer5.getCodigo(), 1);
        Vuelo vuelo24 = new Vuelo(avion4, aer4.getCodigo(), aer3.getCodigo(), 1);
        Vuelo vuelo25 = new Vuelo(avion5, aer2.getCodigo(), aer6.getCodigo(), 2);
        Vuelo vuelo26 = new Vuelo(avion6, aer7.getCodigo(), aer8.getCodigo(), 2);
        Vuelo vuelo27 = new Vuelo(avion7, aer5.getCodigo(), aer1.getCodigo(), 3);
        Vuelo vuelo28 = new Vuelo(avion8, aer3.getCodigo(), aer9.getCodigo(), 1);
        Vuelo vuelo29 = new Vuelo(avion9, aer10.getCodigo(), aer11.getCodigo(), 3);
        Vuelo vuelo30 = new Vuelo(avion10, aer6.getCodigo(), aer4.getCodigo(), 2);

        Vuelo vuelo31 = new Vuelo(avion1, aer1.getCodigo(), aer14.getCodigo(), 1);
        Vuelo vuelo32 = new Vuelo(avion2, aer13.getCodigo(), aer12.getCodigo(), 2);
        Vuelo vuelo33 = new Vuelo(avion3, aer11.getCodigo(), aer2.getCodigo(), 1);
        Vuelo vuelo34 = new Vuelo(avion4, aer5.getCodigo(), aer7.getCodigo(), 3);
        Vuelo vuelo35 = new Vuelo(avion5, aer8.getCodigo(), aer10.getCodigo(), 1);
        Vuelo vuelo36 = new Vuelo(avion6, aer4.getCodigo(), aer15.getCodigo(), 2);
        Vuelo vuelo37 = new Vuelo(avion7, aer9.getCodigo(), aer3.getCodigo(), 3);
        Vuelo vuelo38 = new Vuelo(avion8, aer12.getCodigo(), aer13.getCodigo(), 2);
        Vuelo vuelo39 = new Vuelo(avion9, aer6.getCodigo(), aer1.getCodigo(), 1);
        Vuelo vuelo40 = new Vuelo(avion10, aer7.getCodigo(), aer9.getCodigo(), 2);

        Vuelo vuelo41 = new Vuelo(avion1, aer2.getCodigo(), aer8.getCodigo(), 3);
        Vuelo vuelo42 = new Vuelo(avion2, aer3.getCodigo(), aer4.getCodigo(), 1);
        Vuelo vuelo43 = new Vuelo(avion3, aer5.getCodigo(), aer11.getCodigo(), 2);
        Vuelo vuelo44 = new Vuelo(avion4, aer6.getCodigo(), aer13.getCodigo(), 1);
        Vuelo vuelo45 = new Vuelo(avion5, aer7.getCodigo(), aer3.getCodigo(), 2);
        Vuelo vuelo46 = new Vuelo(avion6, aer9.getCodigo(), aer5.getCodigo(), 3);
        Vuelo vuelo47 = new Vuelo(avion7, aer8.getCodigo(), aer1.getCodigo(), 1);
        Vuelo vuelo48 = new Vuelo(avion8, aer10.getCodigo(), aer2.getCodigo(), 3);
        Vuelo vuelo49 = new Vuelo(avion9, aer14.getCodigo(), aer15.getCodigo(), 2);
        Vuelo vuelo50 = new Vuelo(avion10, aer15.getCodigo(), aer13.getCodigo(), 1);

        Vuelo[] vuelos = {
                vuelo1, vuelo2, vuelo3, vuelo4, vuelo5, vuelo6, vuelo7, vuelo8, vuelo9, vuelo10,
                vuelo11, vuelo12, vuelo13, vuelo14, vuelo15, vuelo16, vuelo17, vuelo18, vuelo19, vuelo20,
                vuelo21, vuelo22, vuelo23, vuelo24, vuelo25, vuelo26, vuelo27, vuelo28, vuelo29, vuelo30,
                vuelo31, vuelo32, vuelo33, vuelo34, vuelo35, vuelo36, vuelo37, vuelo38, vuelo39, vuelo40,
                vuelo41, vuelo42, vuelo43, vuelo44, vuelo45, vuelo46, vuelo47, vuelo48, vuelo49, vuelo50
        };

        for (Vuelo vuelo : vuelos) {
            Avion avion = vuelo.getAvion();
            avion.setDisponible(false);
            avion.setCantViajes(avion.getCantViajes() + 1);
            colaVuelos.add(vuelo, vuelo.getTipoVuelo());
        }
    }
}

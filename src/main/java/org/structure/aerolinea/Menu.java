package main.java.org.structure.aerolinea;

import main.java.org.structure.implementation.GrafoAeropuertos;

import java.util.Scanner;

public class Menu {

    private String opcion;
    private String consulta;
    private int id;
    Scanner myObj = new Scanner(System.in);
    GrafoAeropuertos grafoAeropuertos = new GrafoAeropuertos();
    grafoAeropuertos.addVertx(1);


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
    }

    public void iniciar(){
        System.out.println("""
        \n
        ==============================================
                  SISTEMA DE GESTIÓN DE VUELOS       
        ==============================================
        Opciones disponibles:
        1.
        2. 
        3. 
        4. 
        5. 
        6. 
        """);
        System.out.println("Ingrese una opción: ");
        opcion = myObj.nextLine();

        switch (opcion){
            case "1":
                iniciar();
                break;
            case "2":
                iniciar();
                break;
            case "3":
                iniciar();
                break;
            case "4":
                iniciar();
                break;
            case "5":
                iniciar();
                break;
            case "6":
                break;
            default:
                System.out.println("Opción incorrecta.");
                iniciar();
        }
    }
    public void terminarVuelo(){

    }

}

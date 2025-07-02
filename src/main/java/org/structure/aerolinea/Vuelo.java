package main.java.org.structure.aerolinea;

public class Vuelo {

    private String origen;
    private int IDVuelo = 0;
    private int tipoVuelo;
    private String destino;
    private Avion avion;
    private static int contradorId = 0;

    public Vuelo(Avion avion,String origen, String destino, int tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
        this.IDVuelo = contradorId++;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public int getIDVuelo() {
        return IDVuelo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(int tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
}

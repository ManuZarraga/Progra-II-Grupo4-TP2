package main.java.org.structure.aerolinea;

public class Ruta {
    private Aeropuerto origen;
    private Aeropuerto destino;

    public Ruta(Aeropuerto origen, Aeropuerto destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return origen.getCodigo() + " -> " + destino.getCodigo();
    }
}

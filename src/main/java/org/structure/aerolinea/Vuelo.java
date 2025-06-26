package main.java.org.structure.aerolinea;

public class Vuelo {

    private String origen;
    private TipoVuelo tipoVuelo;
    private String destino;
    private String condicion;
    private Avion avion;

    public Vuelo(Avion avion,String origen, String destino, TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.condicion = "En Horario";
        this.avion = avion;
    }

    public int medirUrgencia(String urgencia){
        switch (urgencia.toUpperCase()){
            case "INTERNACIONALES":
                return 1;
            case "CARGA":
                return 2;
            case "NACIONALES":
                return 3;
            default:
                return 3;
        }
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

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
}

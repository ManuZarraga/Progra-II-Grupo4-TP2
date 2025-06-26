package main.java.org.structure.aerolinea;

public class Avion {

    private int matricula;
    private TipoVuelo tipoVuelo;
    private int cantViajes;
    private boolean isDisponible;

    public Avion(int matricula, TipoVuelo tipoVuelo) {
        this.matricula = matricula;
        this.tipoVuelo = tipoVuelo;
        this.cantViajes = 0;
        this.isDisponible = true;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public int getCantViajes() {
        return cantViajes;
    }

    public void setCantViajes(int cantViajes) {
        this.cantViajes = cantViajes;
    }
}

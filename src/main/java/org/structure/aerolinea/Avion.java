package main.java.org.structure.aerolinea;

public class Avion {

    private int matricula;
    private TipoVuelo tipoVuelo;
    private boolean isDisponible;

    public Avion(int matricula, TipoVuelo tipoVuelo, boolean isDisponible) {
        this.matricula = matricula;
        this.tipoVuelo = tipoVuelo;
        this.isDisponible = isDisponible;
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
}

package main.java.org.structure.aerolinea;

public class Avion {

    private int matricula;
    private int cantViajes;
    private boolean isDisponible;
    private String tipoAvion;

    public Avion(int matricula, String tipoAvion) {
        this.tipoAvion = tipoAvion;
        this.matricula = matricula;
        this.cantViajes = 0;
        this.isDisponible = true;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }
}


package Entidades;

public class Meses {
private String anio[]=new String[12];    
private String mesSecreto;
private String buscar;

    public Meses() {
    }

    public Meses(String mesSecreto, String buscar) {
        this.mesSecreto = mesSecreto;
        this.buscar = buscar;
    }

    public String[] getAnio() {
        return anio;
    }

    public void setAnio(String[] anio) {
        this.anio = anio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    
}

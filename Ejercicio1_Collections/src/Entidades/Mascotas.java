
package Entidades;

public class Mascotas {
    private String raza;

    public Mascotas() {
    }

    public Mascotas(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
     @Override
    public String toString() {
        return "Mascotas{" + "raza=" + raza + '}';
    }
    
}

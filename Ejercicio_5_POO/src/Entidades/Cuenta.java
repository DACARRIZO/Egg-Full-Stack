package Entidades;

public class Cuenta {
    private int cuenta;
    private int numcuenta;
    private long dni;
    private int saldoActual;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int cuenta, int numcuenta, long dni, int saldoActual) {
        this.cuenta = cuenta;
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", numcuenta=" + numcuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
  
}

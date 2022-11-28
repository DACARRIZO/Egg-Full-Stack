
package Entidades;

public class Fraccion {
    private byte num1;
    private byte den1;
    private byte num2;
    private byte den2;

    public Fraccion() {
    }

    public Fraccion(byte num1, byte den1, byte num2, byte den2) {
        this.num1 = num1;
        this.den1 = den1;
        this.num2 = num2;
        this.den2 = den2;
    }

    public byte getNum1() {
        return num1;
    }

    public void setNum1(byte num1) {
        this.num1 = num1;
    }

    public byte getDen1() {
        return den1;
    }

    public void setDen1(byte den1) {
        this.den1 = den1;
    }

    public byte getNum2() {
        return num2;
    }

    public void setNum2(byte num2) {
        this.num2 = num2;
    }

    public byte getDen2() {
        return den2;
    }

    public void setDen2(byte den2) {
        this.den2 = den2;
    }

   
    
}

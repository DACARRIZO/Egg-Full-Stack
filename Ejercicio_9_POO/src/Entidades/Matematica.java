
package Entidades;

public class Matematica {
    private double num1;
    private double num2;
    private double mayor;
    private double menor;

    public Matematica() {
    }

    public Matematica(double num1, double num2, double mayor, double menor) {
        this.num1 = num1;
        this.num2 = num2;
        this.mayor = mayor;
        this.menor = menor;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

  
}

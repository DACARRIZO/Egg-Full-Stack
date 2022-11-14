
package Contructores;

public class Radio {
    private double radio;
  

    public Radio() {
    }

    @Override
    public String toString() {
        return "Radio{" + "radio=" + radio + '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Radio(double radio) {
        this.radio = radio;
    }

 
    
}

package Entidades;

public class Cafetera {
    private int capmaxima;
    private int cantactual;

    public Cafetera() {
    }

    public Cafetera(int capmaxima, int cantactual) {
        this.capmaxima = capmaxima;
        this.cantactual = cantactual;
    }

    public int getCapmaxima() {
        return capmaxima;
    }

    public void setCapmaxima(int capmaxima) {
        this.capmaxima = capmaxima;
    }

    public int getCantactual() {
        return cantactual;
    }

    public void setCantactual(int cantactual) {
        this.cantactual = cantactual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capmaxima=" + capmaxima + ", cantactual=" + cantactual + '}';
    }
    
}

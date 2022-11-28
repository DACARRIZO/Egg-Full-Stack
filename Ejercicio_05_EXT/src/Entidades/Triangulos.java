
package Entidades;

public class Triangulos {
  private float area;
  private float perim;
  private float maysup;
  private int tamtri;
  private int cantTri;
  


    public Triangulos() {
    }

    public Triangulos(float area, float perim, float maysup, int tamtri, int cantTri) {
        this.area = area;
        this.perim = perim;
        this.maysup = maysup;
        this.tamtri = tamtri;
        this.cantTri = cantTri;
    }

    public int getCantTri() {
        return cantTri;
    }

    public void setCantTri(int cantTri) {
        this.cantTri = cantTri;
    }
    

    public int getTamtri() {
        return tamtri;
    }

    public void setTamtri(int tamtri) {
        this.tamtri = tamtri;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerim() {
        return perim;
    }

    public void setPerim(float perim) {
        this.perim = perim;
    }

    public float getMaysup() {
        return maysup;
    }

    public void setMaysup(float maysup) {
        this.maysup = maysup;
    }
  
}

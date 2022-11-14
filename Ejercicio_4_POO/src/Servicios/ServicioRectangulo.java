
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    Scanner leer=new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rg=new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        rg.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rg.setAltura(leer.nextInt());
        
    return rg;
    }
    public void DibujarRectangulo(Rectangulo rg){
        
        for (int i=0;i<rg.getAltura();i++){
            for (int j=0;j<rg.getBase();j++){
                if (i==0 || i==(rg.getAltura()-1)||j==0 || j==(rg.getBase()-1)){
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println("");
        }
        
    }
    public void CalculoPerimetro(Rectangulo rg){
        int perimetro = (rg.getBase()+rg.getAltura())*2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);        
    }
    public void CalculoSuperficie(Rectangulo rg){
        int superficie = (rg.getBase()*rg.getAltura());
                System.out.println("La superficie del rectangulo es: "+superficie);
    }
    
}

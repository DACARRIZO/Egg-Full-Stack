
package ejercicio_1_poo;

import Contructores.Libros;
import ServicioEjercicio_1_POO.LibrosServicio;

public class Ejercicio_1_POO {
 
    public static void main(String[] args) {
       LibrosServicio LS=new LibrosServicio();
       Libros L1=LS.altaLibro();
        System.out.println(L1.toString());
    }
    
}

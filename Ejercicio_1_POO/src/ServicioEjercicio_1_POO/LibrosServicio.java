
package ServicioEjercicio_1_POO;

import Contructores.Libros;
import java.util.Scanner;

public class LibrosServicio {
    public Libros altaLibro(){
        Libros L1 = new Libros();
      
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el codigo del Libro");
        L1.setISBN(leer.next());
        System.out.println("Ingrese el titulo del Libro");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor");
        L1.setAutor(leer.next());
        System.out.println("Detalle la cantidad de paginas del libro");
        L1.setNumPag(leer.nextInt());
        return L1;
    }
    
}

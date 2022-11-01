package primera_guia;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Ejercicio_3 {

   
    public static void main(String[] args) {
        String Frase;
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba una Frase");
        Frase=leer.nextLine();
        
       System.out.println("Su Frase en minusculas es:"+toLowerCase(Frase));
       System.out.println("Su Frase en Mayusculas es:"+toUpperCase(Frase));
    }
    
}

package primera_guia;
import java.util.Scanner;
public class Ejercicio_11_Ppio_guia {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    cambioValor(frase);
    cambioValor(leer.nextLine());
    }
    public static void cambioValor(String frase){
                       
        
    String nuevafrase=frase.replace("a", "@").replace("e","#").replace("i","$").replace("o","%").replace("u","*");
    System.out.println(nuevafrase);

    }

    
}
    
    


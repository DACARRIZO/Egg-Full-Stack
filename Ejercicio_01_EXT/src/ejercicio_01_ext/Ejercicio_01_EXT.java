/*
 Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). CrCrear una clase llamada fracción que contenga 4 atributos (denominador y numerador deear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicio_01_ext;

import Entidades.Fraccion;
import Servicios.ServiciosFraccion;
import java.util.Scanner;

public class Ejercicio_01_EXT {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiciosFraccion sf=new ServiciosFraccion();
        Fraccion fr = sf.crearFraccion();
        int op=0;
        do{
        System.out.println("Ingrese la opción que desea:\n"
                + "1-Sumar\n"
                + "2-Restar\n"
                + "3-Multiplicar\n"
                + "4-Restar\n"
                + "5-Salir\n");
        op=leer.nextInt();
        
        switch (op) {
            case 1:
                sf.sumaFraccion(fr);
                
                break;
            case 2:
                sf.restaFraccion(fr);
                break;
            case 3:
                sf.Multiplicacion(fr);
                break;
            case 4:
                sf.Division(fr);
                break;
        }
        }while (op!=5);
        System.out.println("Saliendo del sistema que tenga buen día");
    }
    
}

/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_9 {

    public static void main(String[] args) {
        int cont = 0;
        int resto = 0;
        int val1 = 0;
        int val2 = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese los valores a dividir");
            val1 = leer.nextInt();
            val2 = leer.nextInt();

        } while (val1 <= val2);
        resto = val1;
        while (val1 >= val2) {
            resto = resto - val2;
            cont++;
            if (resto<val2){
                break;
            }
        }
        System.out.println("para la operación se resto: "+cont+" veces");
        System.out.println("El resto de la división es: "+resto);
    }
}

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //DecimalFormat df = DecimalFormat("#.00");
        int cont = 0;
        int aprom = 0;
        int amenor = 0;
        int amayor = 0;
        float prom = 0;
        float prom2 = 0;
        System.out.println("Ingrese la cantidad de personas");
        int Pers = leer.nextInt();
        do {
            System.out.println("Ingrese la altura de las personas");
            int alt = leer.nextInt();
            cont++;
            prom = (alt + prom);
            if (alt > 160) {
                amayor++;

            } else {
                amenor++;
            }
            prom2 = alt + prom2;
        } while (Pers > cont);

        System.out.println("la cantidad de personas por debajo de 1,60 es: " + (prom2 / amenor));
        System.out.println("El promedio de altura general es de: " + (prom / cont));

    }

}

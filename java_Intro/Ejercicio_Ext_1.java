/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min;
        System.out.print("Ingrese la cantidad de minutos");
        min = leer.nextInt();
        calcular(min);
    }

    public static void calcular(int m) {
        int horas;
        int dias, min;
        
        horas = m / 60;
        if (horas > 24) {
            dias = horas / 24;
            if (dias>=1){
                horas=horas-(24*dias);
            }
        } else {
            dias = 0;
        }
        min=m%60;
        System.out.println(dias+" Días "+horas+" horas "+min+" Min");
    }

}

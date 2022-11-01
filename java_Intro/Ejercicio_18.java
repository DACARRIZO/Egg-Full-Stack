/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz1 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(matriz1[i][j] + " ");
            }
        }
        System.out.println(" ");

    }

}

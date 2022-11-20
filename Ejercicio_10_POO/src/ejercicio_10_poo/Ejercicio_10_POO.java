/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio_10_poo;



import java.util.Arrays;

public class Ejercicio_10_POO {

    public static void main(String[] args) {
        double arregloA[]=new double[50];
        double arregloB[]=new double[20];
        double arregloc[]=new double[20];
        llenadoArreglos(arregloA);
        pruebaimp(arregloA);
        ordenarArregloA(arregloA);
        llenadoarregloB(arregloA,arregloB,arregloc);
        impArregloB(arregloB);
        arregloOrd (arregloA);
        
        
    }
    public static void llenadoArreglos(double arregloA[]){
        System.out.println("Se llena el arreglo A");
        for (int i = 0; i < 50; i++) {
            arregloA[i]=Math.round(Math.random()*100);
            
        }
      
    }
    public static void pruebaimp(double arregloA[]){
        System.out.println("Los 50 valores desordenados del arreglo A son: ");
        for (int i = 0; i < 50; i++) {
            System.out.println(arregloA[i]+" ");
            
        }
    }
    public static void ordenarArregloA(double arregloA[]){
        System.out.println("Se ordenan de menor a mayor los valores del arreglo A ");
        Arrays.sort(arregloA); 
    }
    public static void llenadoarregloB(double arregloA[], double arregloB[], double arregloc[]){
        System.out.println("Se procede a llenar el Arreglo B con las especificaciones dadas");
        Arrays.fill(arregloc, 0.5);
        
        for (int i = 0; i < 20; i++) {
            if (i<=9) {
                arregloB[i]=arregloA[i];
            }else{
                arregloB[i]=arregloc[i];
            }
            
        }
        
    }
    public static void impArregloB(double arregloB[]){
        System.out.println("Se imprime el arreglo B con los valores especificados");
        for (int i = 0; i < 20; i++) {
            System.out.println(arregloB[i]+" ");
            
        }
    }
    public static void arregloOrd(double arregloA[]){
        System.out.println("Arreglo A ordenado de menor a mayor");
        for (int i = 0; i < 50; i++) {
            System.out.println(arregloA[i]+" ");
            
        }
    }
}

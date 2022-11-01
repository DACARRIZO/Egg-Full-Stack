/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente
 */
package primera_guia;


public class Ejercicio_15 {

    public static void main(String[] args) {
       int [] vector=new int[101];
       LlenaVec(vector);
       MostrarVec(vector);
       MostrarDesVec(vector);
    }
    public static void LlenaVec(int[] vector){
        for (int i=1;i<=vector.length-1;i++){
            vector[i]=i;
        }
            
        
    }
     public static void MostrarVec(int[] vector){
        for (int i=1;i<=vector.length-1;i++){
            System.out.print(vector[i]);
            System.out.print(" ");
        }
            
        System.out.println(" ");
    }
        
     public static void MostrarDesVec(int[] vector){
        for (int i=vector.length-1;i>0;i--){
            System.out.print(vector[i]);
            System.out.print(" ");
        }
            
        
    }
}


package primera_guia;


public class Ejercicio_19 {

   
    public static void main(String[] args) {
        int value;
        java.util.Scanner leer=new java.util.Scanner(System.in);
        int[] [] matriz1 = new int [3][3];
        int[] [] matriz2 = new int [3][3];
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++ ){
               
         System.out.println("Ingrese el valor de la posicion" + i + j);  
         value = leer.nextInt();
                
        matriz1[i][j] =  value;
        matriz2[i][j] = matriz1[i][j];
            }
            
        }
        
                
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++ ){
               
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("  ");
        System.out.println("  ");
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++ ){
               
                System.out.print(matriz2[j][i] + " ");
            }
            System.out.println(" ");
        }
       
        int counter = 0;
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++ ){
            if (matriz1[i][j] + matriz2[j][i] == 0){
                counter++;

//System.out.println("Anti Simetrico");
            }else {
                //System.out.println("Es simetrico");
            }
            }
        }
        System.out.println(counter );
        if (counter == 9){
            System.out.println("Es anti simetrico");
        }else {
            System.out.println("Es simetrico");
        }
    }
}

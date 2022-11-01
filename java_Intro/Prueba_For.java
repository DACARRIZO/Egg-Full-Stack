package primera_guia;

public class Prueba_For {

    public static void main(String[] args) {
        int [][]matriz=new int [4][4];
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print("[ " +matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}

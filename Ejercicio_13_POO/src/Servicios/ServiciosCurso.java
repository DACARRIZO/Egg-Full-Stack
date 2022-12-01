
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class ServiciosCurso {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        public Curso cargarAlumnos (){
            Curso c=new Curso();
            String v1[]=new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el nombre de los alumnos");
                v1[i]=leer.next();
                
            }
            c.setAlumnos(v1);
            return c;
        }
        public void crearCurso (Curso c){
            System.out.println("Indique el valor por hora");
            c.setPrecHora(leer.nextDouble());
            System.out.println("Indique la cantidad de dias de cursado semanal");
            c.setCantDiaxSem(leer.nextInt());
            System.out.println("Indique la cantidad de horas por día");
            c.setCantHorDia(leer.nextInt());
            
        }
        public void calcularGananciaSemanal (Curso c){
            double ganSem=((c.getCantHorDia()*c.getPrecHora()*c.getCantDiaxSem())*5);
            System.out.println("La ganancia semanal es de: "+ganSem);
          
        }
}

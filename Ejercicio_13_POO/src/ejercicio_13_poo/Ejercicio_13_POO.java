
package ejercicio_13_poo;

import Entidades.Curso;
import Servicios.ServiciosCurso;



public class Ejercicio_13_POO {

    public static void main(String[] args) {
      ServiciosCurso sc=new ServiciosCurso();
      Curso c= sc.cargarAlumnos();
      
      sc.crearCurso(c);
      sc.calcularGananciaSemanal(c);
      
    }
    
}

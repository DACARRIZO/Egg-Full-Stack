
package ejercicio_05_ext;

import Entidades.Triangulos;
import Servicios.ServiciosTriangulos;


public class Ejercicio_05_EXT {

  
    public static void main(String[] args) {
        ServiciosTriangulos st=new ServiciosTriangulos();
        Triangulos tr=st.CrearTriangulo();
        st.dibujar(tr);
        st.calcularArea(tr);
        st.calcularPerim(tr);
        st.MayorSup(tr);
    }
    
}

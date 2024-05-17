
package universidadgrupo18;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo18.accesoADatos.AlumnoData;
import universidadgrupo18.accesoADatos.Conexion;
import universidadgrupo18.entidadess.Alumno;

public class UniversidadGrupo18 {

    
    public static void main(String[] args) {
       
       // Connection con = Conexion.getConexion();
       
       Alumno jose = new Alumno(4567890, "zuniga", "jose enrique", LocalDate.of(1982, 04, 01), true);
       Alumno mauro = new Alumno(50523698, "ZUÑIGA", "MAURO ENRIQUE", LocalDate.of(2004, 07, 15), true);
      
       AlumnoData aD1 = new AlumnoData();
      
       //aD1.guardarAlumno(jose);
      // aD1.guardarAlumno(mauro);
       
       aD1.buscarAlumno(2);
    }
    
}

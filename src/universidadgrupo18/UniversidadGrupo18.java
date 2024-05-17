
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
       Alumno esme = new Alumno(51523123, "Castro", "esmeralda", LocalDate.of(2000, 03, 25), false);
       
       AlumnoData aD1 = new AlumnoData();
       
       //acceso a todos los get y set
       Alumno alumnoEncontrado = aD1.buscarAlumno(2);
       System.out.println(alumnoEncontrado.getApellido());
       
      // insert alumnos
      
       //aD1.guardarAlumno(jose);
      // aD1.guardarAlumno(mauro);
      // aD1.guardarAlumno(esme);
       
      // busqueda de alumno idAlumno
       //System.out.println(aD1.buscarAlumno(8));
        //aD1.buscarAlumno(8);
        
        //busqueda por dni
        //System.out.println(""+aD1.buscarAlumnoPorDni(50523698));
        
        //listar alumnos
        //System.out.println(""+aD1.listarAlumnos());
        
    }
    
}

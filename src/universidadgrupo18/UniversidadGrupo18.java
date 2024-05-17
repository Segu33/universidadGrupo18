
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
       Alumno luis = new Alumno(11886719, "Segura", "Luis", LocalDate.of(1789, 3, 3), true);
       AlumnoData aD1 = new AlumnoData();
       aD1.guardarAlumno(luis);
       
       
    }
    
}

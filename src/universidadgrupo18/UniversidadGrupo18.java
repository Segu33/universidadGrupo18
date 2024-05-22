
package universidadgrupo18;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo18.accesoADatos.AlumnoData;
import universidadgrupo18.accesoADatos.Conexion;
import universidadgrupo18.accesoADatos.InscripcionData;
import universidadgrupo18.accesoADatos.MateriaData;
import universidadgrupo18.entidadess.Alumno;
import universidadgrupo18.entidadess.Inscripcion;
import universidadgrupo18.entidadess.Materia;

public class UniversidadGrupo18 {

    
    public static void main(String[] args) {
       
       // Connection con = Conexion.getConexion();
       
       Alumno jose = new Alumno(4567890, "zuniga", "jose enrique", LocalDate.of(1982, 04, 01), true);
       Alumno mauro = new Alumno(50523698, "ZUÑIGA", "MAURO ENRIQUE", LocalDate.of(2004, 07, 15), true);
       Alumno esme = new Alumno(8,330303456, "Castroman", "Gigoberta", LocalDate.of(2002, 07, 22), true);
       
       AlumnoData aD1 = new AlumnoData();
       
       
       
       Materia laboratorio2= new Materia (7,"Laboratorio 3", 2023, false);
       Materia programacion = new Materia ("Programacion", 2024, true);
       
       MateriaData mD = new MateriaData ();
       
       //GUARDANDO INSCRIPCION
       
//       Alumno jo = aD1.buscarAlumno(6);
//       Materia progra = mD.buscarMateria(6);
//       
//       Inscripcion insc = new Inscripcion(8.5 ,jo, progra);
//       
       InscripcionData iD = new InscripcionData();
//       
//       iD.guardarInscripcion(insc);
       
       //ACTUALIZANDO NOTA 
       
       //iD.actualizarNota(9.5, 6, 6);
       
       
       
       
       
       
       
       
       
       
       
  //Guardado de Materias     
//       mD.guardarMateria(laboratorio2);
//       mD.guardarMateria(programacion);

//Busqueda de Materias
//System.out.println("" + mD.buscarMateria(6));


// Modificacion y eliminacion de materia

//mD.eliminarMateria(1);
//mD.modificarMateria(laboratorio2);


//Listar Materias 
//System.out.println(""+mD.listarMaterias());
 
       
       
       //acceso a todos los get y set
//       Alumno alumnoEncontrado = aD1.buscarAlumno(2);
//       System.out.pintln(alumnoEncontrado.getApellido());
       
      // insert alumnos
      
//       aD1.guardarAlumno(jose);
//       aD1.guardarAlumno(mauro);
//       aD1.guardarAlumno(esme);
       
      // busqueda de alumno idAlumno
      //System.out.println(aD1.buscarAlumno(8));
      //aD1.buscarAlumno(8);
        
      //busqueda por dni
      //System.out.println(""+aD1.buscarAlumnoPorDni(50523698));
        
      //listar alumnos
      //System.out.println(""+aD1.listarAlumnos());
        
      //Modificar y eliminar alumnos
      //aD1.modificarAlumno(esme);
      //aD1.eliminarAlumno(8);
      
      
       
        
        
    }
    
}

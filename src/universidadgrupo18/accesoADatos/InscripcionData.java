
package universidadgrupo18.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo18.entidadess.Alumno;
import universidadgrupo18.entidadess.Inscripcion;
import universidadgrupo18.entidadess.Materia;

public class InscripcionData {
    private Connection con = null;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();
    

    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if(resultado.next()){
                inscripcion.setIdInscripto(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion realizada!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        
    }
    
    public void actualizarNota(double nota, int idAlumno, int idMateria){
    
        String sql = "UPDATE inscripcion SET nota = ?  WHERE idMateria = ? AND idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if(filas == 1){
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
        }
        
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if(filas == 1){
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");
            }
            else{
                JOptionPane.showMessageDialog(null, "Esta inscripcion no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
        }
      
    }
    
    public List<Alumno> obtenerAlumnosPorMateria (int idMateria){
        ArrayList <Alumno> alumnosPorMateria = new ArrayList<>();
        
        String sql = "SELECT a.* FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno " +
            "AND idMateria = ? AND a.estado = 1;";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet resultado = ps.executeQuery();
            
            
            while(resultado.next()){
                
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setDni(resultado.getInt("dni"));
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(resultado.getBoolean("estado"));
                alumnosPorMateria.add(alumno);
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
        }
        
        return alumnosPorMateria;
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> inscripciones= new ArrayList<>();
        
        try {
            String sql= "SELECT * FROM inscripcion";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                Inscripcion ins=new Inscripcion();
                ins.setIdInscripto(resultado.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(resultado.getInt("idAlumno"));
                Materia mat= matData.buscarMateria(resultado.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(resultado.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
       
        return inscripciones;
    }
    
    public List<Inscripcion> InscripcionesxAlumno(int idAlumno){
        ArrayList<Inscripcion> inscripciones= new ArrayList<>();
        
        String sql= "SELECT * FROM inscripcion WHERE idAlumno= ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                Inscripcion ins=new Inscripcion();
                ins.setIdInscripto(resultado.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(resultado.getInt("idAlumno"));
                Materia mat= matData.buscarMateria(resultado.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(resultado.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
       
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia> materias= new ArrayList<>();    
        String sql="SELECT i.idMateria,nombre,año FROM inscripcion i, materias m WHERE i.idMateria = m.idMateria AND i.idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Materia mat= new Materia();
                mat.setIdMateria(resultado.getInt("idMateria"));
                mat.setNombre(resultado.getString("nombre"));
                mat.setAño(resultado.getInt("año"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
        ArrayList<Materia> materias= new ArrayList<>();
          // materias en donde no esta inscripto /que esten activas las materias pero el id no este en la subconsulta los ID de todas las materias en donde esta inscripto un determinado alumno
                                                                                 //subconsulta    
        String sql="SELECT * FROM materias WHERE estado = 1 AND idMateria not in(SELECT idMateria FROM inscripcion WHERE idAlumno =?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Materia mat= new Materia();
                mat.setIdMateria(resultado.getInt("idMateria"));
                mat.setNombre(resultado.getString("nombre"));
                mat.setAño(resultado.getInt("año"));
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return materias;
    }
    
}

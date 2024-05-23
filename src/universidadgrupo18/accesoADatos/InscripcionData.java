
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

public class InscripcionData {
    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;
    

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
    
        String sql = "UPDATE inscripcion SET nota = ? , idAlumno = ? WHERE idMateria = ?";
        
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
    
}

package universidadgrupo18.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo18.entidadess.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();

    }

    public void guardarAlumno(Alumno alumno) {
        try {
            String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());

            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                alumno.setIdAlumno(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla alumno");
        }

    }

    public Alumno buscarAlumno(int id) {

        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(resultado.getInt("dni"));
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "no existe el alumno!");
                ps.close();
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

        return alumno;

    }
}

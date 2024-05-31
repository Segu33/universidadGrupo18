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
import universidadgrupo18.entidadess.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materias(nombre, año, estado) VALUES (?, ?, ?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());

            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                materia.setIdMateria(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia. ");
        }

    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String sql = "SELECT nombre, año, estado FROM materias WHERE idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(resultado.getString("nombre"));
                materia.setAño(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Materia. ");

        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        try {
            String sql = "UPDATE materias SET nombre= ?, año = ?, estado= ? WHERE idMateria= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada exitosamente. ");
            } else {

                JOptionPane.showMessageDialog(null, " Materia no encontrada ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public void eliminarMateria(int idMateria) {
        try {
            String sql = "UPDATE materias SET estado= 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada con exito. ");

            } else {
                JOptionPane.showMessageDialog(null, " Materia no encontrada ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        try {

            String sql = "SELECT * FROM materias ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre"));
                materia.setAño(resultado.getInt("año"));
                materia.setEstado(resultado.getBoolean("estado"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return materias;

    }

   
}

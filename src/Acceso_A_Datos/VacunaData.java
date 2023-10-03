
package Acceso_A_Datos;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class VacunaData {

    private Connection con = null;

    public VacunaData() {
        con = Conexion.getConexion();
    }
        public void GuardarVacuna(Vacuna vacuna) {
        String sql = "INSERT INTO vacuna(marca,medida,fechaCaduca,colocada,nroSerieDosis,cuitLaboratorio)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.NO_GENERATED_KEYS);
            ps.setString(1, vacuna.getMarca());
            ps.setDouble(2, vacuna.getMedida());
            ps.setDate(3, Date.valueOf(vacuna.getFechaCaduc()));
            ps.setBoolean(4, vacuna.isColocada());
            ps.setInt(5, vacuna.getNumSerieDosis());
            ps.setInt(6, vacuna.getLaboratorio().getCuit());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla laboratorio" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
        }
}
}

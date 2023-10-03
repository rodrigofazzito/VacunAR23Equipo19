
package Acceso_A_Datos;

import Entidades.CitaVacunacion;
import Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class LaboratorioData {
    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.getConexion();
    }

    public void GuardarLaboratorio(Laboratorio lab) {
        String sql = "INSERT INTO laboratorio(cuit,nomLaboratorio,pais,domComercial)values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.NO_GENERATED_KEYS);
            ps.setInt(1, lab.getCuit());
            ps.setString(2, lab.getNomLaboratorio());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomComercial());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla laboratorio" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
        }
    }
}

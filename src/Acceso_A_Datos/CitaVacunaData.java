
package Acceso_A_Datos;

import Entidades.CitaVacunacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class CitaVacunaData {

    private Connection con = null;

    public CitaVacunaData() {
        con = Conexion.getConexion();
    }
    public void GuardarCita(CitaVacunacion cita){
       String sql = "INSERT INTO citavacunacion(persona,codRefuerzo,fechaHoraCita,centroVacunacion,fechaHoraColoca,dosis)values(?,?,?,?,?,?)";
       try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cita.getCiudadano().getDni());
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setString(3, cita.getHoraCita());
            ps.setString(4, cita.getCentroVacuna());
            ps.setDate(5, Date.valueOf(cita.getFechaColoca()));
            ps.setInt(6, cita.getVacuna().getNumSerieDosis());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cita.setCodcita(rs.getInt(1));
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla cita"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cita " + ex.getMessage());
        }
    
    }
    
}

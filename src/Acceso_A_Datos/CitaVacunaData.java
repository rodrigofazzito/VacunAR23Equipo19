
package Acceso_A_Datos;

import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class CitaVacunaData {

    private Connection con = null;
    CiudadanoData ciuData = new CiudadanoData();
    VacunaData vacData = new VacunaData();

    public CitaVacunaData() {
        con = Conexion.getConexion();
    }

    public void GuardarCita(CitaVacunacion cita) {
        String sql = "INSERT INTO citavacunacion(persona,fechaHoraCita,centroVacunacion,fechaHoraColoca,dosis,nroSerie)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cita.getCiudadano().getDni());
            ps.setString(2, cita.getHoraCita());
            ps.setString(3, cita.getCentroVacuna());
            ps.setDate(4, Date.valueOf(cita.getFechaColoca()));
            ps.setInt(5, cita.getDosis());
            ps.setInt(6, cita.getVacuna().getNumSerie());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cita.setCodcita(rs.getInt(1));
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla cita" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cita " + ex.getMessage());
        }
    }

    public List<CitaVacunacion> listaCitas() {
        String sql = "Select * from citavacunacion";
        ArrayList<CitaVacunacion> citas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodcita(rs.getInt("codCita"));
                cita.setCiudadano(ciuData.buscarCiudadano(rs.getInt("persona")));
                cita.setDosis(rs.getInt("dosis"));
                cita.setHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacuna(rs.getString("centroVacunacion"));
                cita.setFechaColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setVacuna(vacData.buscarVacuna(rs.getInt("nroSerie")));
                citas.add(cita);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
        return citas;
    }
    public CitaVacunacion modificarCita(CitaVacunacion cita){
     String sql = "Update citavacunacion set fechaHoraCita = ?,centroVacunacion = ?,fechaHoraColoca = ? where codCita = ?";
     try{
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1,cita.getHoraCita());
         ps.setString(2,cita.getCentroVacuna());
         ps.setDate(3, Date.valueOf(cita.getFechaColoca()));
         ps.executeUpdate();
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
        return cita;
    }
    public CitaVacunacion modificardosis(CitaVacunacion cita){
     String sql = "Update citavacunacion set dosis = ? where codCita = ?";
     try{
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1,(cita.getDosis()+1));
         ps.setInt(2, cita.getCodcita());
         ps.executeUpdate();
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
        return cita;
    }
    public CitaVacunacion cancelarCita(CitaVacunacion cita){
        String sql = "Update citavacunacion set cancelada = ? where codCita = ?";
     try{
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setBoolean(1, cita.isCancelada());
         ps.setInt(2, cita.getCodcita());
         ps.executeUpdate();
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
        return cita;
    }
    public List<CitaVacunacion> obtenerCita(int dni){
        String sql = "select * from citavacunacion where persona = ?";
        ArrayList<CitaVacunacion> citas = new ArrayList();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodcita(rs.getInt("codCita"));
                cita.setCiudadano(ciuData.buscarCiudadano(rs.getInt("persona")));
                cita.setDosis(rs.getInt("dosis"));
                cita.setHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacuna(rs.getString("centroVacunacion"));
                cita.setFechaColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setVacuna(vacData.buscarVacuna(rs.getInt("nroSerie")));
                cita.setCancelada(rs.getBoolean("cancelada"));
                citas.add(cita);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
        return citas;
    }
}

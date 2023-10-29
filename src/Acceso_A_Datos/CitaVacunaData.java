
package Acceso_A_Datos;

import Acceso_A_Datos.CiudadanoData;
import Acceso_A_Datos.Conexion;
import Acceso_A_Datos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            ps.setLong(6, cita.getVacuna().getNumSerie());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cita.setCodcita(rs.getInt(1));
                ps.close();
            }
        } catch (SQLException ex) {

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
                cita.setCancelada(rs.getBoolean("cancelada"));
                cita.setCodcita(rs.getInt("codCita"));
                cita.setCiudadano(ciuData.buscarCiudadano(rs.getInt("persona")));
                cita.setDosis(rs.getInt("dosis"));
                cita.setHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacuna(rs.getString("centroVacunacion"));
                cita.setFechaColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setVacuna(vacData.buscarVacuna(rs.getLong("nroSerie")));
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
         ps.setInt(4, cita.getCodcita());
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
    public CitaVacunacion obtenerCita (int dni){
        String sql = "select * from citavacunacion where persona = ?";
        CitaVacunacion cita = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cita = new CitaVacunacion();
                cita.setCodcita(rs.getInt("codCita"));
                cita.setCiudadano(ciuData.buscarCiudadano(rs.getInt("persona")));
                cita.setDosis(rs.getInt("dosis"));
                cita.setHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacuna(rs.getString("centroVacunacion"));
                cita.setFechaColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setVacuna(vacData.buscarVacuna(rs.getLong("nroSerie")));
                cita.setCancelada(rs.getBoolean("cancelada"));
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla cita");
        }
       return cita;
    }
    public List<CitaVacunacion> listaAplicadasCitaVacunacion(String centroNombre, boolean colocada) {
    String sql = "SELECT v.marca, c.nroSerie, c.persona FROM citavacunacion c "
            + "INNER JOIN vacuna v ON v.nroSerie = c.nroSerie "
            + "INNER JOIN ciudadano ci ON ci.dni = c.persona "
            + "WHERE v.colocada = ? AND c.centroVacunacion = ?";  

    ArrayList<CitaVacunacion> citas = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBoolean(1, colocada);
        ps.setString(2, centroNombre);  // Asigna el nombre del centro como parámetro
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            CitaVacunacion cita = new CitaVacunacion();
            Vacuna vacuna = new Vacuna();
            Ciudadano ciudadano = new Ciudadano();

            vacuna.setMarca(rs.getString("marca"));
            vacuna.setNumSerie(rs.getLong("nroSerie"));
            ciudadano.setDni(rs.getInt("persona"));

            cita.setVacuna(vacuna);
            cita.setCiudadano(ciudadano);

            citas.add(cita);
        }
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacuna");
    }
    return citas;
}

  public List<CitaVacunacion> listaCentroCitaVacunacion() {
    List<CitaVacunacion> citasPorCentro = new ArrayList<>();
    String sql = "SELECT c.centroVacunacion AS centroVacunacion, SUM(v.colocada) AS totalDosisAplicadas "
            + "FROM citavacunacion c "
            + "INNER JOIN vacuna v ON c.nroSerie = v.nroSerie "
            + "WHERE v.colocada = 1 "
            + "GROUP BY c.centroVacunacion;"; 

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            CitaVacunacion cita = new CitaVacunacion();
            cita.setCentroVacuna(rs.getString("centroVacunacion"));
            cita.setDosis(rs.getInt("totalDosisAplicadas"));
            citasPorCentro.add(cita);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna: " + ex.getMessage());
    }
    return citasPorCentro;
}
    
}

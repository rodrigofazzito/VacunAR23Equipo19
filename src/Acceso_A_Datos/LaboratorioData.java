
package Acceso_A_Datos;

import Entidades.CitaVacunacion;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class LaboratorioData {
    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.getConexion();
    }

    public void GuardarLaboratorio(Laboratorio lab) {
        String sql = "INSERT INTO laboratorio(cuit,nomLaboratorio,pais,domComercial,Stock)values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lab.getCuit());
            ps.setString(2, lab.getNomLaboratorio());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomComercial());
            ps.setInt(5, lab.getStockVacuna());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla laboratorio" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
        }
    }
     public List<Laboratorio> listaLaboratorio(){
             String sql="Select * from laboratorio";
              ArrayList<Laboratorio> laboratorios = new ArrayList<>();
             try {
                  PreparedStatement ps = con.prepareStatement(sql);
                  ResultSet rs = ps.executeQuery();
                   while(rs.next()){
                Laboratorio labo = new Laboratorio();
                labo.setIdLaboratorio(rs.getInt("idLaboratorio"));
                labo.setCuit(rs.getInt("cuit"));
                labo.setNomLaboratorio(rs.getString("nomLaboratorio"));
                labo.setPais(rs.getString("pais"));
                labo.setDomComercial(rs.getString("domComercial"));
                labo.setStockVacuna(rs.getInt("Stock"));
                laboratorios.add(labo);
            }
            ps.close();
                 
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla laboratorio");
             }
            return laboratorios;
    }

    public Laboratorio buscarLaboratorio(int idLab) {
        String sql = "select cuit,nomLaboratorio,pais,domComercial,Stock from laboratorio where idLaboratorio = ?";
        Laboratorio lab = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLab);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lab = new Laboratorio();
                lab.setIdLaboratorio(idLab);
                lab.setCuit(rs.getInt("cuit"));
                lab.setNomLaboratorio(rs.getString("nomLaboratorio"));
                lab.setPais(rs.getString("pais"));
                lab.setDomComercial(rs.getString("domComercial"));
                lab.setStockVacuna(rs.getInt("Stock"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio");
        }
        return lab;
    }
    public Laboratorio modificarLaboratorio(Laboratorio lab){
        //UPDATE alumno set apellido = ? ,nombre = ?, fechaNacimiento = ?, estado = ? WHERE idAlumno = ?
        String sql = "Update laboratorio set cuit = ?, nomLaboratorio = ?, pais = ?,domComercial = ?,Stock = ? where idLaboratorio = ?";
        try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, lab.getCuit());
                ps.setString(2, lab.getNomLaboratorio());
                ps.setString(3, lab.getPais());
                ps.setString(4, lab.getDomComercial());
                ps.setInt(5, lab.getStockVacuna());
                ps.setInt(6, lab.getIdLaboratorio());
                ps.executeUpdate();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio");
        }
        return lab;
    }
    public Laboratorio ReducirStock(Laboratorio lab){
        String sql = "Update laboratorio set Stock = ? where idLaboratorio = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (lab.getStockVacuna()-1));
            ps.setInt(2, lab.getIdLaboratorio());
            ps.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio");
        }
        return lab;
    }

}


package Acceso_A_Datos;

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
public class VacunaData {

    private Connection con = null;
    LaboratorioData labData = new LaboratorioData();
    public VacunaData() {
        con = Conexion.getConexion();
        
    }
        public void GuardarVacuna(Vacuna vacuna) {
        String sql = "INSERT INTO vacuna(marca,medida,fechaCaduca,colocada,nroSerie,idLaboratorio)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.NO_GENERATED_KEYS);
            ps.setString(1, vacuna.getMarca());
            ps.setDouble(2, vacuna.getMedida());
            ps.setDate(3, Date.valueOf(vacuna.getFechaCaduca()));
            ps.setBoolean(4, vacuna.isColocada());
            ps.setInt(5, vacuna.getNumSerie());
            ps.setInt(6, vacuna.getLaboratorio().getIdLaboratorio());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna " + ex.getMessage());
        }
}
         public List<Vacuna> listaVacunas(){
             String sql="Select marca,medida,fechaCaduca,colocada,nroSerie,idLaboratorio from vacuna";
              ArrayList<Vacuna> vacunas = new ArrayList<>();
             try {
                  PreparedStatement ps = con.prepareStatement(sql);
                  ResultSet rs = ps.executeQuery();
                   while(rs.next()){
                Vacuna vacu = new Vacuna();
                vacu.setMarca(rs.getString("marca"));
                vacu.setMedida(rs.getDouble("medida"));
                vacu.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vacu.setColocada(rs.getBoolean("colocada"));
                vacu.setNumSerie(rs.getInt("nroSerie"));
                vacu.setLaboratorio(labData.buscarLaboratorio(rs.getInt("idLaboratorio")));
                vacunas.add(vacu);
            }
            ps.close();
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla vacuna");
             }
            return vacunas;
         }
       public Vacuna buscarVacuna(int numSerie) {
        String sql = "select marca,medida,fechaCaduca,colocada,idLaboratorio from vacuna where nroSerie = ?";
        Vacuna vacuna = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vacuna = new Vacuna();
                vacuna.setNumSerie(numSerie);
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vacuna.setColocada(rs.getBoolean("colocada"));
                vacuna.setLaboratorio(labData.buscarLaboratorio(rs.getInt("idLaboratorio")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna");
        }
        return vacuna;
    }
       public Vacuna modificarColocada(Vacuna vac){
           String sql = "Update Vacuna set colocada = ? where nroSerie = ?";
           try{
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setBoolean(1, vac.isColocada());
               ps.setInt(2,vac.getNumSerie());
               ps.executeUpdate();
           }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna");
        }return vac;
       }
       public Vacuna modificarVacuna(Vacuna vac){
           String sql = "Update Vacuna set marca = ? , medida = ? ,fechaCaduca = ? where nroSerie = ?";
           try{
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, vac.getMarca());
               ps.setDouble(2, vac.getMedida());
               ps.setDate(3, Date.valueOf(vac.getFechaCaduca()));
               ps.setInt(4, vac.getNumSerie());
               ps.executeUpdate();
           }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna");
        }return vac;
       }
}

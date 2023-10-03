
package Acceso_A_Datos;

import Entidades.Vacuna;
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
            System.out.println("error al acceder a la tabla vacuna" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna " + ex.getMessage());
        }
    
}
         public List<Vacuna> listaVacunas(){
             String sql="Select marca, medida,fechaCaduca,nroSerieDosis,cuitLaboratorio from vacuna where colocada=1";
              ArrayList<Vacuna> vacunas = new ArrayList<>();
             try {                               
                  PreparedStatement ps= con.prepareStatement(sql);
                  ResultSet rs = ps.executeQuery();
                   while(rs.next()){
                Vacuna vacu = new Vacuna();
                vacu.setMarca(rs.getString("marca"));
                vacu.setMedida(rs.getDouble("medida"));
                vacu.setFechaCaduc(rs.getDate("fechaCaduca").toLocalDate());
                vacu.setNumSerieDosis(rs.getInt("nroSerieDosis"));
                vacu.getLaboratorio().setCuit(rs.getInt("cuitLaboratorio"));
                vacunas.add(vacu);
            }
            ps.close();
                 
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla vacuna");
             }
            return vacunas;
         }
        
}

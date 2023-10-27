
package Acceso_A_Datos;

import Entidades.Ciudadano;
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
public class CiudadanoData {
    private Connection con=null;

    public CiudadanoData() {
        con = Conexion.getConexion();
    }
   public void GuardarCiudadano(Ciudadano ciudadano){
       String sql = "INSERT INTO ciudadano(dni,nombreCompleto,email,celular,nota,esencial,sintomas)values(?,?,?,?,?,?,?)";
       try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.NO_GENERATED_KEYS);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getNombreComp());
            ps.setString(3, ciudadano.getEmail());
            ps.setLong(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getNota());
            ps.setBoolean(6, ciudadano.isEsencial());
            ps.setBoolean(7, ciudadano.isSintomas());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla ciudadano"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano " + ex.getMessage());
        }
   } 
       public Ciudadano buscarCiudadano(int dni){
        String sql = "select nombreCompleto,email,celular,nota,esencial,sintomas from ciudadano where dni = ?";
        Ciudadano ciudadano = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ciudadano = new Ciudadano();
                ciudadano.setDni(dni); 
                ciudadano.setNombreComp(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getLong("celular"));
                ciudadano.setNota(rs.getString("nota"));
                ciudadano.setEsencial(rs.getBoolean("esencial"));
                ciudadano.setSintomas(rs.getBoolean("sintomas"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano*-*");
        }
        return ciudadano;
    }
       public List<Ciudadano> listarciudadanos(){
        String sql = "select * from ciudadano";
        ArrayList<Ciudadano> ciudadanos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Ciudadano ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni")); 
                ciudadano.setNombreComp(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getLong("celular"));
                ciudadano.setNota(rs.getString("nota"));
                ciudadano.setEsencial(rs.getBoolean("esencial"));
                ciudadano.setSintomas(rs.getBoolean("sintomas"));
                ciudadanos.add(ciudadano);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla alumno");
        }
        return ciudadanos;
    }
       public Ciudadano modificarCiudadano(Ciudadano ciu){
       String sql = "UPDATE Ciudadano set nombreCompleto = ? ,email = ?, celular = ?, esencial = ?  WHERE dni= ?";
           try {
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, ciu.getNombreComp());
               ps.setString(2, ciu.getEmail());
               ps.setLong(3, ciu.getCelular());
               ps.setBoolean(4, ciu.isEsencial());
               ps.setInt(5, ciu.getDni());
               ps.executeUpdate();
               System.out.println("Ciudadano modificado con exito!");
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla ciudadano");
           }
         return ciu;
       }
}

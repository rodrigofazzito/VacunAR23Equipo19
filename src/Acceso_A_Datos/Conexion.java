
package Acceso_A_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* Rodrigo Fazzito */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String dB = "vacunar23";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection connection;
    private Conexion(){}
    public static Connection getConexion(){
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+dB,usuario,password);
                System.out.println("Conección exitosa");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "error al encontrar los driver "+ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error al conectar con el servidor "+ex.getMessage());
            }
            
        }
        return connection;
    }
}


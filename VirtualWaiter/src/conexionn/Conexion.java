package conexionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.login;

/**
 *
 * @author John
 */
public class Conexion {

    private Connection cnx = null;
    String bd = "VirtualWaiter";
    String url = "jdbc:postgresql://localhost/" + bd;
    String user = "postgres";
    String password = "123";
    Connection connection = null;

    public Connection Conexion() {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
             if (connection != null) {
                System.out.println("conecion exitosa");
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Erro en coneccion");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
       
    }

   
 public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }

}
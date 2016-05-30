
package base.de.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Este método es para establecer conexión con la base de datos.
 * @author igonzalezcastro
 */
public class conexion {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://10.0.0.254/igonzalezcastro", "igonzalezcastro", "igonzalezcastro");
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception e) {
            System.out.println("No se ha podido conectar"+e.getMessage());
        }
        return conectar;
    }

}

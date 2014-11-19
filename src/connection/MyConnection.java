package connection;

import tools.hslFiles;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0
 * @since 1.0
 */
public class MyConnection {

    public MyConnection() {
    }

    /**
     * Metodo que conecta ao banco de dados
     *
     * @since 1.0
     * @return Connection
     * @exception Exception e
     */
    public static Connection getConnection() {
        String db_adress = hslFiles.readAlias();
        String URL = "jdbc:mysql://" + db_adress + ":3309/samurai1";
        Connection c = null;
        try {
            Driver d = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(URL, "root", "hlss1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida, banco de bados não encontrado", "getConnection", JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
}

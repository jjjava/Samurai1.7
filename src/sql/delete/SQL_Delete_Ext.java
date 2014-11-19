package sql.delete;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class SQL_Delete_Ext {

    private static Connection theConn;
    private MyConnection con;

    public SQL_Delete_Ext() {
        con = new MyConnection();
    }

    public void deleteExtByID(int id_ext) {
        String sql = "DELETE FROM tb_ext WHERE tb_ext.id = " + id_ext;
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "deleteExtByID", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public void deleteExtByName(String name_ext) {
        String sql = "DELETE FROM tb_ext WHERE tb_ext.ext = '" + name_ext + "'";
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "deleteExtByName", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
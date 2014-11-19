package sql.insert;

import connection.MyConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class SQL_Insert_Ext {

    private static Connection theConn;
    private MyConnection con;

    public SQL_Insert_Ext() {
        con = new MyConnection();
    }

    public void insertExt(String ext, String info) {
        String sql = "INSERT INTO tb_ext ("
                + " tb_ext.ext ,  "
                + " tb_ext.info   "
                + " ) "
                + " VALUES (?,?) ";
        try {
            theConn = MyConnection.getConnection();
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(sql);

            ps.setString(1, ext);
            ps.setString(2, info);

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "Inserir ext", JOptionPane.ERROR_MESSAGE);
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
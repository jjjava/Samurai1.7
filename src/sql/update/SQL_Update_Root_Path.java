package sql.update;

/**
 *
 * @author Hudson
 */
import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class SQL_Update_Root_Path {

    private static Connection theConn;
    private MyConnection con;

    public SQL_Update_Root_Path() {
        con = new MyConnection();
    }

    public boolean updateRootPath(String root_path) {
        boolean valid = false;
        int check = 0;
        String sql = "UPDATE tb_settings SET root_path = ? WHERE id = ?";
        try {
            theConn = con.getConnection();
            PreparedStatement ps = con.getConnection().prepareStatement(sql);

            ps.setString(1, root_path);
            ps.setInt(2, 1);//where

            ps.executeUpdate();
            ps.close();
            check = 1;
        } catch (Exception e) {
            check = 0;
            JOptionPane.showMessageDialog(null, "Data connection lost.", "Update", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                    if (check == 1) {
                        valid = true;
                    }
                }
            } catch (Exception e) {
            }
        }
        return valid;
    }
}
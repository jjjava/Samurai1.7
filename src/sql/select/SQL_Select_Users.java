package sql.select;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson Schumaker
 * @since 1.5
 * @version 1.0
 */
public class SQL_Select_Users {

    private Connection theConn;

    public SQL_Select_Users() {
    }

    public boolean validUser(String user, String pass) {
        theConn = MyConnection.getConnection();
        boolean res = false;
        String sql = "SELECT  tb_user.login , tb_user.password"
                + "  FROM tb_user WHERE tb_user.login = '" + user + "'";
        String name = "bot@";
        String password = "f0g0";
        try {
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                password = rs.getString("password");
                name = rs.getString("login");
            }
            rs.close();
            stmt.close();
            if (pass.equals(password)) {
                res = true;
            } else {
                JOptionPane.showMessageDialog(null, "Password ou login errado(s).", "Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "Login", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public int getID(String login) {
        theConn = MyConnection.getConnection();
        String sql = "SELECT tb_user.id FROM tb_user WHERE tb_user.login = '" + login + "'";
        int id = 0;
        try {
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("id");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data connection lost.", "GetID", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
        return id;
    }
}
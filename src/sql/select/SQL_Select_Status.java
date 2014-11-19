package sql.select;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hudson
 */
public class SQL_Select_Status {

    private static Connection theConn;
    private MyConnection con;

    public SQL_Select_Status() {
        con = new MyConnection();
    }

    public int getCountDirIndex() {
        String sql = "SELECT COUNT(tb_dir.id) FROM tb_dir";
        int id = 0;
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("COUNT(tb_dir.id)");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public int getCountFileIndex() {
        String sql = "SELECT COUNT(tb_file.id) FROM tb_file";
        int id = 0;
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("COUNT(tb_file.id)");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public int getStatus() {
        String sql = "SELECT tb_settings.status FROM tb_settings";
        int id = 0;
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                id = rs.getInt("status");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public String getNameServer() {
        String sql = "SELECT tb_settings.name_server FROM tb_settings";
        String name = "?";
        try {
            theConn = MyConnection.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("name_server");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }
}

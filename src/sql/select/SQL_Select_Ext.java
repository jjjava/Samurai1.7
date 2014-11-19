package sql.select;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hudson
 */
public class SQL_Select_Ext {

    private static Connection theConn;
    private MyConnection con;

    public SQL_Select_Ext() {
        con = new MyConnection();
    }

    public ArrayList<String> getAllExt() {
        String sql = "SELECT tb_ext.ext FROM tb_ext";
        ArrayList<String> ext = new ArrayList<String>();
        try {
            theConn = con.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ext.add(rs.getString("ext"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
        return ext;
    }

    public String getNameByID(int id) {
        String sql = "SELECT tb_ext.ext FROM tb_ext WHERE tb_ext.id = " + id;
        String ext = "";
        try {
            theConn = con.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ext = rs.getString("ext");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
        return ext;
    }

    public int getIDbyName(String name) {
        String sql = "SELECT tb_ext.id FROM tb_ext WHERE tb_ext.name = '" + name + "'";
        int ext = 0;
        try {
            theConn = con.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ext = rs.getInt("id");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
        } finally {
            try {
                if (theConn != null) {
                    theConn.close();
                }
            } catch (Exception e) {
            }
        }
        return ext;
    }
}
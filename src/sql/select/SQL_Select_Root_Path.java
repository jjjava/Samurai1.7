
package sql.select;
import connection.MyConnection;
import java.sql.*;
/**
 *
 * @author Hudson
 */
public class SQL_Select_Root_Path
{
    private static Connection theConn;
    private MyConnection con;
    
    public SQL_Select_Root_Path()
    {
        con = new MyConnection();
    }
    public String getRootPath()
    {
       String sql= "SELECT tb_settings.root_path FROM tb_settings";
       String root_path = "C:/";
       try
       {
            theConn = con.getConnection();
            ResultSet rs;
            Statement stmt;
            stmt = theConn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next())
            {
               root_path = rs.getString("root_path");
            }
            rs.close();
            stmt.close();
       }
       catch (Exception e)
       {
       }
       finally
       {
            try
            {
                if (theConn != null)
                {
                    theConn.close();
                }
            }
            catch (Exception e)
            {
            }
       }
       return root_path;
    }
}

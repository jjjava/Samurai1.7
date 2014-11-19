package sql.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class SQL_Insert_Dir {

    private Connection theConn;

    public SQL_Insert_Dir(Connection theConn) {
        this.theConn = theConn;
    }

    public void insertDir(String name, String path) {
        String sql = "INSERT INTO tb_dir ("
                + " tb_dir.name ,  "
                + " tb_dir.path    "
                + " ) "
                + " VALUES (?,?) ";
        try {
            //theConn = MyConnection.getConnection();   
            PreparedStatement ps = theConn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, path);

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "Indexar pasta", JOptionPane.ERROR_MESSAGE);
        }
//        finally 
//        {   
//            try 
//            {   
//                if(theConn != null)
//                {    
//                    theConn.close();
//                }    
//            }   
//            catch (Exception e) 
//            {   
//                e.printStackTrace();
//            }   
//        }
    }
}
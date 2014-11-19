package sql.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class SQL_Insert_File {

    private Connection theConn;

    public SQL_Insert_File(Connection theConn) {
        this.theConn = theConn;
    }

    public void insertFile(String name, String path, String size, String ext) {
        String sql = "INSERT INTO tb_file ("
                + " tb_file.name ,  "
                + " tb_file.path ,  "
                + " tb_file.size ,  "
                + " tb_file.relevance, "
                + " tb_file.ext"
                + " ) "
                + " VALUES (?,?,?,?,?) ";
        try {
            PreparedStatement ps = theConn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, path);
            ps.setString(3, size);
            ps.setInt(4, 0);
            ps.setString(5, ext);


            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Conexão de dados perdida.", "Indexar arquivo", JOptionPane.ERROR_MESSAGE);
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
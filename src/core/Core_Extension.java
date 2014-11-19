
package core;

import interfaces.Extension;
import javax.swing.JOptionPane;
import sql.insert.SQL_Insert_Ext;

/**
 *
 * @author Hudson
 */
public class Core_Extension 
{
    private Extension extension;
    
    public Core_Extension(Extension extension)
    {
        this.extension = extension;
    }
    public void setExtension(String ext, String info)
    {
        SQL_Insert_Ext sql = new SQL_Insert_Ext();
        sql.insertExt(ext, info);
         JOptionPane.showMessageDialog(null,
                "Extensão salva.","Extensões",JOptionPane.INFORMATION_MESSAGE);
        extension.dispose();
    }
    
}

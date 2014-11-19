
package core;

import interfaces.DB_Set;
import javax.swing.JOptionPane;
import tools.hslFiles;

/**
 *
 * @author Hudson
 * @version 1.0
 * @since 1.0
 */
public class Core_DB_Set
{
    private DB_Set db_set;
    
    public Core_DB_Set(DB_Set db_set)
    {
        this.db_set = db_set;
    }
    public void setDBAdress()
    {
        db_set.setAdress(hslFiles.readAlias());
    }
    public void saveDBAdress()
    {
        hslFiles.saveAlias(db_set.getAdress());
        JOptionPane.showMessageDialog(null,
                "Alias.ini salvo.","DB config",JOptionPane.INFORMATION_MESSAGE);
        db_set.dispose();
    }
}

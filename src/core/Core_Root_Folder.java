/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import interfaces.Root_Folder;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sql.select.SQL_Select_Root_Path;
import sql.update.SQL_Update_Root_Path;

/**
 *
 * @author Hudson
 */
public class Core_Root_Folder 
{
    private Root_Folder config;
    public Core_Root_Folder()
    {
        
    }
    public Core_Root_Folder(Root_Folder config)
    {
        this.config = config;
    }
    public void selectRoot() 
    {
        JFileChooser jf_chooser = new JFileChooser(System.getProperty("user.dir"));
        jf_chooser.setDialogTitle("Escolha um compartilhamento.");
        jf_chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = jf_chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = jf_chooser.getSelectedFile();
            config.setRootPath(file.getAbsolutePath());
        }
    }
    public void setRoot(String root_path)
    {
        SQL_Update_Root_Path sql = new SQL_Update_Root_Path();
        if(sql.updateRootPath(root_path))
        {
            JOptionPane.showMessageDialog(null,"Pasta raiz configurada com sucesso.","Pasta raiz.",JOptionPane.INFORMATION_MESSAGE);
        }
        config.close();
    }
    public String getRoot()
    {
        SQL_Select_Root_Path sql = new SQL_Select_Root_Path();
        return sql.getRootPath();
    }
}
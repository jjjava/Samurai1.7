package tools;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import sql.select.SQL_Select_Ext;

/**
 *
 * @author Hudson
 */
public class hslFileFilter implements FileFilter {

    private String description;
    private ArrayList<String> extensions;

    public hslFileFilter() {
        SQL_Select_Ext sql_select_ext = new SQL_Select_Ext();
        extensions = sql_select_ext.getAllExt();
        description = "Arquivos suportados";
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        } else {
            String path = file.getAbsolutePath().toLowerCase();
            System.out.println(file.getAbsolutePath().toLowerCase());
            for (int i = 0; i < extensions.size(); i++) {
                String extension = extensions.get(i);
                if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getDescription() {
        return description;
    }
}
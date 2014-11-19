    package core;

import connection.MyConnection;
import java.io.File;
import java.sql.Connection;
import java.text.DecimalFormat;
import sql.insert.SQL_Insert_Dir;
import sql.insert.SQL_Insert_File;
import sql.select.SQL_Select_Root_Path;
import tools.hslFileFilter;
import tools.hslFiles;

/**
 *
 * @author Hudson
 */
public class hslEngine_File_Crawler {

    private Connection theConn;
    private Connection theConn2;
    private hslFileFilter filter;

    public hslEngine_File_Crawler() {
        theConn = MyConnection.getConnection();
        theConn2 = MyConnection.getConnection();
        filter = new hslFileFilter();
    }

    public boolean Crawler() {
        boolean valid = false;
        SQL_Select_Root_Path sql_select_root_path = new SQL_Select_Root_Path();
        String root_path = sql_select_root_path.getRootPath();
        File file = new File(root_path);
        if (file.exists()) {
            allList(file);
            valid = true;
        } else {
            file = new File("c:\\");
            allList(file);
            valid = true;
        }
        try {
            if (theConn != null) {
                theConn.close();
            }
            if (theConn2 != null) {
                theConn2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return valid;
    }

    private void allList(File file) {
        SQL_Insert_Dir sql_insert_dir = new SQL_Insert_Dir(theConn);
        SQL_Insert_File sql_insert_file = new SQL_Insert_File(theConn2);
        if (!file.isHidden()) {
            if (file.isDirectory()) {
                sql_insert_dir.insertDir(file.getName(), file.getAbsolutePath());

                File[] list = file.listFiles(filter);
                for (int i = 0; i < list.length; i++) {
                    allList(list[i]);
                }
            } else {
                String ext = hslFiles.getFileExtension(file.getName());
                if (((file.length() / 1024) / 1024) >= 1024) {
                    Long l = file.length();
                    String size = Long.toString(l);
                    double d = Double.parseDouble(size);

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    size = decimal.format(((d / 1024) / 1024) / 1024) + " GB";
                    sql_insert_file.insertFile(file.getName(), file.getAbsolutePath(), size, ext);
                } else if ((file.length() / 1024) >= 1024) {
                    Long l = file.length();
                    String size = Long.toString(l);
                    double d = Double.parseDouble(size);

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    size = decimal.format(((d / 1024) / 1024)) + " MB";
                    sql_insert_file.insertFile(file.getName(), file.getAbsolutePath(), size, ext);
                } else {
                    Long l = file.length();
                    String size = Long.toString(l);
                    double d = Double.parseDouble(size);

                    DecimalFormat decimal = new DecimalFormat("0.00");
                    size = decimal.format(((d / 1024))) + " KB";
                    sql_insert_file.insertFile(file.getName(), file.getAbsolutePath(), size, ext);
                }
            }
        }
    }
}
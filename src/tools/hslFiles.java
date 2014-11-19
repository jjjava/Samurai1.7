package tools;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hudson
 */
public class hslFiles {

    public hslFiles() {
    }

    public static ArrayList<String> getListFiles(String folder_path) {
        ArrayList<String> file_list = new ArrayList<String>();
        File folder = new File(folder_path);
        File files[] = folder.listFiles();

        for (int k = 0; k < files.length; k++) {
            if (files[k].isFile()) {
                if (!files[k].isHidden()) {
                    file_list.add(files[k].getName());
                    System.out.println(files[k].getName());
                }
            }
        }
        return file_list;
    }

    public static ArrayList<String> getListDirectories(String folder_path) {
        ArrayList<String> dir_list = new ArrayList<String>();
        File folder = new File(folder_path);
        File files[] = folder.listFiles();

        for (int k = 0; k < files.length; k++) {
            if (files[k].isDirectory()) {
                if (!files[k].isHidden()) {
                    dir_list.add(files[k].getName());
                    System.out.println(files[k].getName());
                }
            }
        }
        return dir_list;
    }

    public static String getFileExtension(String filename) {
        String ext[] = filename.split("\\.");
        int i = ext.length;
        String result = "";
        if (i > 1) {
            result = ext[i - 1];
        }
        return result;
    }

    public static void saveHTMLFile() {
        String html = ""
                + "<html>"
                + "<head>"
                + "<title>Visualização</title>"
                + "</head>"
                + "<body>"
                + "<img src=\"preview.png\">"
                + "</body>"
                + "</html>";
        File file = new File(System.getProperties().getProperty("user.dir") + "/preview.html");
        if (!file.exists()) {
            saveHTMLFileVoid();
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter buffer = new BufferedWriter(fileWriter);
                buffer.write(html);
                buffer.flush();
                buffer.close();
            } catch (IOException e) {
            }
        }
    }

    public static void saveHTMLFileVoid() {
        String html = ""
                + "<html>"
                + "<head>"
                + "<title>Visualização</title>"
                + "</head>"
                + "<body>"
                + "</body>"
                + "</html>";
        File file = new File(System.getProperties().getProperty("user.dir") + "/void.html");
        if (!file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter buffer = new BufferedWriter(fileWriter);
                buffer.write(html);
                buffer.flush();
                buffer.close();
            } catch (IOException e) {
            }
        }
    }

    public static void saveBat(String content) {
        File file = new File(System.getProperties().getProperty("user.dir") + "/folder.bat");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(content);
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
        }
    }

    public static void saveAlias(String content) {
        File file = new File(System.getProperties().getProperty("user.dir") + "/alias.ini");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(content);
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
        }
    }

    public static String readAlias() {
        BufferedReader in;
        String buffer = "";
        String path = System.getProperty("user.dir") + "/alias.ini";
        File alias = new File(path);
        if (!alias.exists()) {
            saveAlias("127.0.0.1");
        }
        try {
            in = new BufferedReader(new FileReader(path));
            String line;
            while ((line = in.readLine()) != null) {
                buffer += line;
            }
            in.close();
        } catch (Exception ex) {
            Logger.getLogger(hslFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buffer;
    }
}
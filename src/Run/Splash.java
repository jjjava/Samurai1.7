package Run;

import interfaces.About;
import interfaces.Login;
import interfaces.Plataform;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tools.hslSoundPlayer;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0
 * @since 1.5
 */
public final class Splash {

    public JProgressBar progress;
    public Thread thread;
    public static Random generator = new Random();
    public static JFrame frame;
    public static Login login;
    public SystemTray tray;
    public TrayIcon trayIcon;
    public static Image imageIcon;
    public Splash run;

    /**
     *
     * Construtor sobrecarregado
     *
     * @version 1.0
     */
    public Splash(String imgPath, String message, String icon) {
        frame = new JFrame("Carregando...");
        frame.setAlwaysOnTop(true);

        imageIcon = new javax.swing.ImageIcon(getClass().getResource("/res/srch_16.png")).getImage();
        tray = SystemTray.getSystemTray();
        run = this;

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);

        panel.setSize(450, 250);
        panel.setBounds(0, 0, 450, 250);
        JLabel texte = new JLabel(message);
        texte.setFont(new Font("Calibri", Font.BOLD, 34));
        texte.setForeground(Color.ORANGE);
        JLabel img = new JLabel();
        img.setIcon(new ImageIcon(getClass().getResource(icon)));
        progress = new JProgressBar(0, 100);
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        progress.setStringPainted(true);
        texte.setBounds(35, 10, 420, 70);
        img.setBounds(20, 100, 400, 105);
        progress.setBounds(0, 230, 450, 20);
        panel.add(texte);
        panel.add(img);
        panel.add(progress);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(480, 320);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screen.width - frame.getSize().width) / 2, (screen.height - frame.getSize().height) / 2);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);
        progress.setBounds(new Rectangle(10, 295, 460, 20));
        thread = new Thread(new Progression());
        thread.start();
        try {
            createTray(tray);
        } catch (AWTException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo main
     *
     * @since 1.5
     */
    public static void main(String[] args) throws URISyntaxException, AWTException {
        laf();
        login = new Login();
        Splash splash = new Splash("/res/srch_24.png", "HSLab", "/res/logo.PNG");
        login.setTrayIcone(splash);
    }

    /**
     * Metodo que cria o icon tray
     *
     * @param T SystemTray
     * @throws AWTException
     */
    public void createTray(SystemTray T) throws AWTException {
        //Cria um menu Popup para o trayIcon
        PopupMenu popupMenu = new PopupMenu();
        MenuItem menuItem = new MenuItem("Abrir");
        menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
                login.setTrayIcone(run);
            }
        });
        popupMenu.add(menuItem);
        //fim abrir
        menuItem = new MenuItem("Sobre");
        menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new About();
            }
        });

        popupMenu.add(menuItem);
        //fim Banco de dados
        menuItem = new MenuItem("Plataforma");
        menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Plataform();
            }
        });

        popupMenu.add(menuItem);
        popupMenu.add(new MenuItem("-"));

        menuItem = new MenuItem("Fechar");
        menuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int opt = JOptionPane.showConfirmDialog(null, "Fechar?", "Sair", JOptionPane.YES_NO_OPTION);
                if (opt == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });
        popupMenu.add(menuItem);

        //adiciona no tryIcon
        trayIcon = new TrayIcon(imageIcon, "Samurai Server 2011", popupMenu);
        trayIcon.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Login login = new Login();
                    login.setVisible(true);
                    login.setTrayIcone(run);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        T.add(trayIcon);
    }

    /**
     * Classe que controla o carregamento da interface
     * @see Runnable
     */
    public class Progression implements Runnable {

        @Override
        public void run() {
            for (int j = 1; j < 100; j++) {
                progress.setValue(j);
                if (j > 0 && j < 20) {
                    progress.setString("carregando inferface...");
                }
                if (j > 20 && j < 50) {
                    progress.setString("iniciando interface...");
                }
                if (j > 50 && j < 80) {
                    progress.setString("carregando módulos...");
                }
                if (j > 80 && j < 90) {
                    progress.setString("carregando filtros");
                }
                if (j > 90 && j < 100) {
                    progress.setString("Rodando...");
                }
                try {
                    thread.sleep(generator.nextInt(50));
                } catch (Exception e) {
                    e.printStackTrace();
                    frame.dispose();
                }
            }
            new hslSoundPlayer("done.wav").start();
            login.setVisible(true);
            frame.dispose();
            login.requestFocus();
        }
    }

    /**
     * Metodo que muDa a aparencia da interface
     *
     * @exception Exception e
     */
    private static void laf() {
        try {
            try {
                javax.swing.UIManager.setLookAndFeel("org.fife.plaf.VisualStudio2005.VisualStudio2005LookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(frame);
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
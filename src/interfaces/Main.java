/*
 * Main.java
 *
 * Created on 01/11/2011, 20:34:02
 */
package interfaces;

import Run.Splash;
import core.Core_Index;
import interfaces.internal.if_Monitoring;
import interfaces.internal.if_Starting;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import sql.select.SQL_Select_Status;

/**
 *
 * @author Hudson Schumaker
 */
public class Main extends javax.swing.JFrame {

    private DefaultMutableTreeNode root;
    private DefaultMutableTreeNode name;
    private DefaultMutableTreeNode monitoring;
    private DefaultMutableTreeNode database;
    private DefaultMutableTreeNode users;
    private DefaultTreeCellRenderer render;
    private SQL_Select_Status sql_status;
    private if_Starting if_start;
    private Splash run;

    public Main(Splash run) {
        this.run = run;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new Color(231, 227, 215));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        sql_status = new SQL_Select_Status();
        this.createTreeModel();
        initComponents();
        im_stop.setEnabled(false);
        this.setRenderIconsTree();
        //relaodStatus();
    }

    public void relaodStatus() {
//        jl_dirs.setText(sql_status.getCountDirIndex()+" Pastas indexadas.");
//        jl_files.setText(sql_status.getCountFileIndex()+" Arquivos indexados.");
    }

    private void createTreeModel() {
        root = new DefaultMutableTreeNode("Samurai Search Server 2011");
        name = new DefaultMutableTreeNode(sql_status.getNameServer());
        root.add(name);
        monitoring = new DefaultMutableTreeNode("Monitoramento");
        name.add(monitoring);
        database = new DefaultMutableTreeNode("Base de dados");
        name.add(database);
        users = new DefaultMutableTreeNode("Usuários");
        name.add(users);
    }

    private void setRenderIconsTree() {
        render = new DefaultTreeCellRenderer();
        render.setOpenIcon(new ImageIcon(getClass().getResource("/res/remov_16.png")));
        render.setClosedIcon(new ImageIcon(getClass().getResource("/res/add_16.png")));
        render.setLeafIcon(new ImageIcon(getClass().getResource("/res/new_16.png")));

        jTree.setCellRenderer(render);
    }

    public void createStartInternalFrame() {
        if_start = new if_Starting();
        if_start.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight());
        jDesktopPane.add(if_start);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        tb_on_off = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        bt_start = new javax.swing.JButton();
        bt_stop = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        bt_root_folder = new javax.swing.JButton();
        bt_database = new javax.swing.JButton();
        bt_ext = new javax.swing.JButton();
        bt_users = new javax.swing.JButton();
        bt_plataform = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree(root);
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_file = new javax.swing.JMenu();
        im_tray = new javax.swing.JMenuItem();
        im_logoff = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        im_exit = new javax.swing.JMenuItem();
        m_action = new javax.swing.JMenu();
        im_start = new javax.swing.JMenuItem();
        im_stop = new javax.swing.JMenuItem();
        im_refresh = new javax.swing.JMenuItem();
        im_schedule = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        im_on = new javax.swing.JMenuItem();
        im_off = new javax.swing.JMenuItem();
        m_edit = new javax.swing.JMenu();
        im_root_folder = new javax.swing.JMenuItem();
        im_database = new javax.swing.JMenuItem();
        im_ext = new javax.swing.JMenuItem();
        im_users = new javax.swing.JMenuItem();
        im_pref = new javax.swing.JMenuItem();
        im_reports = new javax.swing.JMenu();
        m_help = new javax.swing.JMenu();
        im_plataform = new javax.swing.JMenuItem();
        im_about = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        im_help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HSLAB - Samurai Search Server 2011");
        setBackground(new java.awt.Color(231, 227, 215));

        jToolBar.setBorder(null);
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        tb_on_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ball (Red).png"))); // NOI18N
        tb_on_off.setFocusable(false);
        tb_on_off.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb_on_off.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(tb_on_off);
        jToolBar.add(jSeparator4);

        bt_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/play_32.png"))); // NOI18N
        bt_start.setFocusable(false);
        bt_start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startActionPerformed(evt);
            }
        });
        jToolBar.add(bt_start);

        bt_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/splay_32.png"))); // NOI18N
        bt_stop.setFocusable(false);
        bt_stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stopActionPerformed(evt);
            }
        });
        jToolBar.add(bt_stop);

        bt_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ref_32.png"))); // NOI18N
        bt_refresh.setFocusable(false);
        bt_refresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_refresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });
        jToolBar.add(bt_refresh);
        jToolBar.add(jSeparator5);

        bt_root_folder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/foldr_32.png"))); // NOI18N
        bt_root_folder.setFocusable(false);
        bt_root_folder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_root_folder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_root_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_root_folderActionPerformed(evt);
            }
        });
        jToolBar.add(bt_root_folder);

        bt_database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/confg_32.png"))); // NOI18N
        bt_database.setFocusable(false);
        bt_database.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_database.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_databaseActionPerformed(evt);
            }
        });
        jToolBar.add(bt_database);

        bt_ext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/docs_32.png"))); // NOI18N
        bt_ext.setFocusable(false);
        bt_ext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_ext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_extActionPerformed(evt);
            }
        });
        jToolBar.add(bt_ext);

        bt_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/group_32.png"))); // NOI18N
        bt_users.setFocusable(false);
        bt_users.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_users.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_usersActionPerformed(evt);
            }
        });
        jToolBar.add(bt_users);

        bt_plataform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/apps_32.png"))); // NOI18N
        bt_plataform.setFocusable(false);
        bt_plataform.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_plataform.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_plataform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plataformActionPerformed(evt);
            }
        });
        jToolBar.add(bt_plataform);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSplitPane1.setDividerLocation(180);

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setRightComponent(jDesktopPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        m_file.setMnemonic('R');
        m_file.setText("Arquivo");

        im_tray.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        im_tray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/lgicn_16.png"))); // NOI18N
        im_tray.setMnemonic('B');
        im_tray.setText("Bandeja");
        im_tray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_trayActionPerformed(evt);
            }
        });
        m_file.add(im_tray);

        im_logoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        im_logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user_16.png"))); // NOI18N
        im_logoff.setMnemonic('L');
        im_logoff.setText("Logoff");
        im_logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_logoffActionPerformed(evt);
            }
        });
        m_file.add(im_logoff);
        m_file.add(jSeparator3);

        im_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        im_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/close_16.png"))); // NOI18N
        im_exit.setMnemonic('F');
        im_exit.setText("Fechar");
        im_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_exitActionPerformed(evt);
            }
        });
        m_file.add(im_exit);

        jMenuBar1.add(m_file);

        m_action.setMnemonic('A');
        m_action.setText("Ação");

        im_start.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        im_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/play_16.png"))); // NOI18N
        im_start.setMnemonic('I');
        im_start.setText("Iniciar indexação");
        im_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_startActionPerformed(evt);
            }
        });
        m_action.add(im_start);

        im_stop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        im_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/splay_16.png"))); // NOI18N
        im_stop.setMnemonic('P');
        im_stop.setText("Parar indexação");
        m_action.add(im_stop);

        im_refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        im_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ref_16.png"))); // NOI18N
        im_refresh.setMnemonic('T');
        im_refresh.setText("Atualizar indexação");
        m_action.add(im_refresh);

        im_schedule.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        im_schedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cal_16.png"))); // NOI18N
        im_schedule.setMnemonic('G');
        im_schedule.setText("Agenda");
        m_action.add(im_schedule);
        m_action.add(jSeparator2);

        im_on.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        im_on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ballgreen16.png"))); // NOI18N
        im_on.setMnemonic('O');
        im_on.setText("Online");
        m_action.add(im_on);

        im_off.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        im_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ballred16.png"))); // NOI18N
        im_off.setMnemonic('F');
        im_off.setText("Offline");
        im_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_offActionPerformed(evt);
            }
        });
        m_action.add(im_off);

        jMenuBar1.add(m_action);

        m_edit.setMnemonic('E');
        m_edit.setText("Editar");

        im_root_folder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        im_root_folder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/foldr_16.png"))); // NOI18N
        im_root_folder.setMnemonic('Z');
        im_root_folder.setText("Pasta Raiz");
        im_root_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_root_folderActionPerformed(evt);
            }
        });
        m_edit.add(im_root_folder);

        im_database.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        im_database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/confg_16.png"))); // NOI18N
        im_database.setMnemonic('B');
        im_database.setText("Banco de dados");
        im_database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_databaseActionPerformed(evt);
            }
        });
        m_edit.add(im_database);

        im_ext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        im_ext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/docs_16.png"))); // NOI18N
        im_ext.setMnemonic('X');
        im_ext.setText("Extensões");
        im_ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_extActionPerformed(evt);
            }
        });
        m_edit.add(im_ext);

        im_users.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        im_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/group_16.png"))); // NOI18N
        im_users.setMnemonic('U');
        im_users.setText("Usuários");
        m_edit.add(im_users);

        im_pref.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        im_pref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/prefs_16.png"))); // NOI18N
        im_pref.setMnemonic('F');
        im_pref.setText("Preferências");
        m_edit.add(im_pref);

        jMenuBar1.add(m_edit);

        im_reports.setMnemonic('L');
        im_reports.setText("Relatórios");
        im_reports.setToolTipText("");
        jMenuBar1.add(im_reports);

        m_help.setMnemonic('J');
        m_help.setText("Ajuda");

        im_plataform.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        im_plataform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/apps_16.png"))); // NOI18N
        im_plataform.setMnemonic('P');
        im_plataform.setText("Plataforma");
        im_plataform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_plataformActionPerformed(evt);
            }
        });
        m_help.add(im_plataform);

        im_about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        im_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/about_16.png"))); // NOI18N
        im_about.setMnemonic('S');
        im_about.setText("Sobre");
        im_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_aboutActionPerformed(evt);
            }
        });
        m_help.add(im_about);
        m_help.add(jSeparator1);

        im_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        im_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/sinfo_16.png"))); // NOI18N
        im_help.setMnemonic('T');
        im_help.setText("Tópicos de ajuda");
        m_help.add(im_help);

        jMenuBar1.add(m_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void im_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_im_exitActionPerformed

    private void im_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_startActionPerformed
        new Core_Index(this).start();
    }//GEN-LAST:event_im_startActionPerformed

    private void im_root_folderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_root_folderActionPerformed
        new Root_Folder();
}//GEN-LAST:event_im_root_folderActionPerformed

    private void im_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_aboutActionPerformed
        new About();
    }//GEN-LAST:event_im_aboutActionPerformed

    private void im_plataformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_plataformActionPerformed
        new Plataform();
    }//GEN-LAST:event_im_plataformActionPerformed

    private void im_databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_databaseActionPerformed
        new DB_Set();
    }//GEN-LAST:event_im_databaseActionPerformed

    private void im_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_offActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_im_offActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            if (nodeInfo.equals("Monitoramento")) {
                if_Monitoring if_monitoring = new if_Monitoring();
                if_monitoring.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight());
                jDesktopPane.add(if_monitoring);
            }
            if (nodeInfo.equals("Base de dados")) {
                JInternalFrame frame = new JInternalFrame("Base de Dados", true, true, true, true);
                frame.setIconifiable(true);
                frame.setFrameIcon(new ImageIcon(getClass().getResource("/res/confg_24.png")));
                frame.setSize(jDesktopPane.getWidth(), jDesktopPane.getHeight());
                jDesktopPane.add(frame);
                frame.setVisible(true);
            }
            if (nodeInfo.equals("Usuários")) {
            }
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void im_logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_logoffActionPerformed
        Login login = new Login();
        login.setTrayIcone(run);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_im_logoffActionPerformed

private void im_extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_extActionPerformed
    new Extension();
}//GEN-LAST:event_im_extActionPerformed

private void bt_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startActionPerformed
    new Core_Index(this).start();
}//GEN-LAST:event_bt_startActionPerformed

private void bt_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stopActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bt_stopActionPerformed

private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bt_refreshActionPerformed

private void bt_root_folderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_root_folderActionPerformed
    new Root_Folder();
}//GEN-LAST:event_bt_root_folderActionPerformed

private void bt_databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_databaseActionPerformed
    new DB_Set();
}//GEN-LAST:event_bt_databaseActionPerformed

private void bt_extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_extActionPerformed
    new Extension();
}//GEN-LAST:event_bt_extActionPerformed

private void bt_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_usersActionPerformed
}//GEN-LAST:event_bt_usersActionPerformed

private void bt_plataformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_plataformActionPerformed
    new Plataform();

}//GEN-LAST:event_bt_plataformActionPerformed

    private void im_trayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_trayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_im_trayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_database;
    private javax.swing.JButton bt_ext;
    private javax.swing.JButton bt_plataform;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_root_folder;
    private javax.swing.JButton bt_start;
    private javax.swing.JButton bt_stop;
    private javax.swing.JButton bt_users;
    private javax.swing.JMenuItem im_about;
    private javax.swing.JMenuItem im_database;
    private javax.swing.JMenuItem im_exit;
    private javax.swing.JMenuItem im_ext;
    private javax.swing.JMenuItem im_help;
    private javax.swing.JMenuItem im_logoff;
    private javax.swing.JMenuItem im_off;
    private javax.swing.JMenuItem im_on;
    private javax.swing.JMenuItem im_plataform;
    private javax.swing.JMenuItem im_pref;
    private javax.swing.JMenuItem im_refresh;
    private javax.swing.JMenu im_reports;
    private javax.swing.JMenuItem im_root_folder;
    private javax.swing.JMenuItem im_schedule;
    private javax.swing.JMenuItem im_start;
    private javax.swing.JMenuItem im_stop;
    private javax.swing.JMenuItem im_tray;
    private javax.swing.JMenuItem im_users;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JTree jTree;
    private javax.swing.JMenu m_action;
    private javax.swing.JMenu m_edit;
    private javax.swing.JMenu m_file;
    private javax.swing.JMenu m_help;
    private javax.swing.JToggleButton tb_on_off;
    // End of variables declaration//GEN-END:variables
}

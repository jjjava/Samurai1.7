/*
 * Login.java
 *
 * Created on 10/11/2011, 11:43:11
 */
package interfaces;

import Run.Splash;
import core.Core_Login;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.TrayIcon.MessageType;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0
 * @since 1.5
 */
public class Login extends javax.swing.JFrame {

    public Splash run;
    public Core_Login core;

    public Login() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        this.getContentPane().setBackground(new Color(231, 227, 215));
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        core = new Core_Login(this);
        this.setFocusTfLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        bt_ok = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samurai Server 2011");
        setBackground(new java.awt.Color(231, 227, 215));

        jPanel1.setBackground(new java.awt.Color(231, 227, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        jPanel1.setForeground(new java.awt.Color(231, 227, 215));
        jPanel1.setToolTipText("");

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });

        bt_ok.setText("OK");
        bt_ok.setPreferredSize(new java.awt.Dimension(75, 23));
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancelar");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_login, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_ok, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed

        this.dispose();
        run.trayIcon.displayMessage("Samurai Server 2011", "Executando em background...", MessageType.INFO);
}//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed

        core.Autentication();
}//GEN-LAST:event_bt_okActionPerformed

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed

        core.Autentication();
}//GEN-LAST:event_tf_passwordActionPerformed
    public void setTrayIcone(Splash run) {
        this.run = run;
    }

    public String getLogin() {
        return tf_login.getText();
    }

    public String getPassword() {
        String password = "";
        char pass[] = tf_password.getPassword();
        StringBuilder senha = new StringBuilder();
        for (int k = 0; k < pass.length; k++) {
            senha.append(pass[k]);
        }
        password = senha.toString();
        return password;
    }

    private void setFocusTfLogin() {
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                tf_login.requestFocus();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_login;
    private javax.swing.JPasswordField tf_password;
    // End of variables declaration//GEN-END:variables
}

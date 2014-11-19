
/*
 * DB_Set.java
 *
 * Created on 08/11/2011, 00:08:59
 */
package interfaces;

import core.Core_DB_Set;
import java.awt.Toolkit;

/**
 *
 * @author Hudson
 */
public class DB_Set extends javax.swing.JFrame 
{
    private Core_DB_Set core;
    public DB_Set() 
    {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        initComponents();
        
        core = new Core_DB_Set(this);
        core.setDBAdress();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void setAdress(String adress)
    {
        tf_adress.setText(adress);
    }
    public String getAdress()
    {
        return tf_adress.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_adress = new javax.swing.JTextField();
        bt_ok = new javax.swing.JButton();
        bt_canel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samurai Search Server 2011");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço do Banco de dados"));

        jLabel1.setText("Endereço do Banco de dados:");

        tf_adress.setToolTipText("Endereço no formato 127.0.0.1");

        bt_ok.setText("OK");
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        bt_canel.setText("Cancelar");
        bt_canel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_canelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_adress, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_canel)
                        .addGap(11, 11, 11))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ok)
                    .addComponent(bt_canel))
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

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
       
        core.saveDBAdress();
    }//GEN-LAST:event_bt_okActionPerformed

    private void bt_canelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_canelActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_bt_canelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_canel;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_adress;
    // End of variables declaration//GEN-END:variables
}

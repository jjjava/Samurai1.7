
/*
 * Extension.java
 *
 * Created on 26/01/2012, 23:25:37
 */
package interfaces;

import core.Core_Extension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class Extension extends javax.swing.JFrame {

    private Core_Extension core;

    public Extension() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        initComponents();

        core = new Core_Extension(this);

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_ext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_desc = new javax.swing.JTextArea();
        bt_ok = new javax.swing.JButton();
        bt_canel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samurai Search Server 2011");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Extensões de arquivos"));

        jLabel1.setText("Nova extensão:");

        tf_ext.setToolTipText("Digite a extensão sem o \".\"");

        jLabel2.setText("Descrição:");

        ta_desc.setColumns(20);
        ta_desc.setRows(5);
        ta_desc.setToolTipText("Limite de 512 caracteres.");
        jScrollPane1.setViewportView(ta_desc);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(tf_ext, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_canel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    if (tf_ext.getText().length() <= 0) {
        JOptionPane.showMessageDialog(null,
                "O campo \"Nova extensão\" está vazio.","Extensões",JOptionPane.ERROR_MESSAGE);
    } else {
        core.setExtension(tf_ext.getText(), ta_desc.getText());
    }
}//GEN-LAST:event_bt_okActionPerformed

private void bt_canelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_canelActionPerformed

    this.dispose();
}//GEN-LAST:event_bt_canelActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_canel;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_desc;
    private javax.swing.JTextField tf_ext;
    // End of variables declaration//GEN-END:variables
}

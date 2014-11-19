
/*
 * Plataform.java
 *
 * Created on 07/11/2011, 22:57:57
 */
package interfaces;

import java.awt.Toolkit;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hudson
 */
public class Plataform extends javax.swing.JFrame
{
    public Plataform() 
    {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/srch_24.png")));
        initComponents();
        try 
        {
            com.sun.management.OperatingSystemMXBean mxbean =  
                   (com.sun.management.OperatingSystemMXBean) 
                 ManagementFactory.getOperatingSystemMXBean();   
            
            java_version.setText("Versão do Java: "
                        +System.getProperty("java.version"));
            
            java_vendor.setText("Fabricante da máquina virtual: "
                       +System.getProperty("java.vendor"));
            
            java_vm_name.setText("Nome da máquina virtual: "
                        +System.getProperty("java.vm.name"));
            
            os_name.setText("Sistema operacional: "
                   +System.getProperty("os.name"));
            
            os_arch.setText("Arquitetura do sistema operacional: "
                   +System.getProperty("os.arch"));
            
            os_version.setText("Versão do sistema operacional: "
                      +System.getProperty("os.version"));
            
            user_name.setText("Nome do usuário: "
                    +System.getProperty("user.name"));
            
            user_home.setText("Local dos documentos dos usuário: "
                     +System.getProperty("user.home"));
            
            user_dir.setText("Local de instalação do Samurai Search 2011: "
                    +System.getProperty("user.dir"));
        
            host_name.setText("Nome da máquina: "
                     +InetAddress.getLocalHost().getHostName());
            
            host_ip.setText("IP da máquina: "
                    +InetAddress.getLocalHost().getHostAddress());
            
            Long  l = mxbean.getTotalPhysicalMemorySize();
            String size = Long.toString(l);
            double d = Double.parseDouble(size);
            DecimalFormat decimal = new DecimalFormat( "0.00" );
            size = decimal.format(((d/1024)/1024)/1024) +" GB";
            memory_ram.setText("Total memória RAM: "+size);
            
            processor_num.setText("Número de processadores: "
                         +Runtime.getRuntime().availableProcessors());
        } 
        catch (UnknownHostException ex) 
        {
            Logger.getLogger(Plataform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        java_version = new javax.swing.JLabel();
        java_vendor = new javax.swing.JLabel();
        java_vm_name = new javax.swing.JLabel();
        os_name = new javax.swing.JLabel();
        os_arch = new javax.swing.JLabel();
        os_version = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        user_home = new javax.swing.JLabel();
        user_dir = new javax.swing.JLabel();
        host_name = new javax.swing.JLabel();
        host_ip = new javax.swing.JLabel();
        memory_ram = new javax.swing.JLabel();
        processor_num = new javax.swing.JLabel();
        bt_ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samurai Search 2011 v1.7");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Plataforma"));

        java_version.setText("java.version");

        java_vendor.setText("java.vendor");

        java_vm_name.setText("java.vm.name");

        os_name.setText("os.name");

        os_arch.setText("os.arch");

        os_version.setText("os.version");

        user_name.setText("user.name");

        user_home.setText("user.home");

        user_dir.setText("user.dir");

        host_name.setText("host.name");

        host_ip.setText("host.ip");

        memory_ram.setText("memory.ram");

        processor_num.setText("processor.num");

        bt_ok.setMnemonic('O');
        bt_ok.setText("OK");
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(java_version)
                    .addComponent(java_vendor)
                    .addComponent(java_vm_name)
                    .addComponent(os_name)
                    .addComponent(os_arch)
                    .addComponent(os_version)
                    .addComponent(user_name)
                    .addComponent(user_home)
                    .addComponent(user_dir)
                    .addComponent(host_name)
                    .addComponent(host_ip)
                    .addComponent(memory_ram)
                    .addComponent(processor_num)
                    .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(635, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(java_version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(java_vendor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(java_vm_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(os_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(os_arch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(os_version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_dir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(host_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(host_ip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memory_ram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processor_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(bt_ok))
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

        this.dispose();
    }//GEN-LAST:event_bt_okActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel host_ip;
    private javax.swing.JLabel host_name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel java_vendor;
    private javax.swing.JLabel java_version;
    private javax.swing.JLabel java_vm_name;
    private javax.swing.JLabel memory_ram;
    private javax.swing.JLabel os_arch;
    private javax.swing.JLabel os_name;
    private javax.swing.JLabel os_version;
    private javax.swing.JLabel processor_num;
    private javax.swing.JLabel user_dir;
    private javax.swing.JLabel user_home;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}

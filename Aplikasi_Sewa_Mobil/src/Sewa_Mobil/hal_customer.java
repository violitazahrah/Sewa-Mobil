/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sewa_Mobil;

/**
 *
 * @author ACER
 */
public class hal_customer extends javax.swing.JFrame {

    /**
     * Creates new form hal_customer
     */
    public hal_customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new Sewa_Mobil.ButtonImage();
        info_peminjaman = new Sewa_Mobil.ButtonImage();
        info_mobilDanSewa = new Sewa_Mobil.ButtonImage();
        pinjam_kembalikanMobil = new Sewa_Mobil.ButtonImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, 70));

        info_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_peminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(info_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 570, 120));

        info_mobilDanSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_mobilDanSewaActionPerformed(evt);
            }
        });
        getContentPane().add(info_mobilDanSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 810, 100));

        pinjam_kembalikanMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjam_kembalikanMobilActionPerformed(evt);
            }
        });
        getContentPane().add(pinjam_kembalikanMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 820, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/hal_customer (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login_pelanggan ha = new login_pelanggan();
                ha.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void info_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_peminjamanActionPerformed
        // TODO add your handling code here:
        info_peminjaman ha = new info_peminjaman();
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_info_peminjamanActionPerformed

    private void info_mobilDanSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_mobilDanSewaActionPerformed
        // TODO add your handling code here:
        info_MobilDanSewa ha = new info_MobilDanSewa();
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_info_mobilDanSewaActionPerformed

    private void pinjam_kembalikanMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjam_kembalikanMobilActionPerformed
        // TODO add your handling code here:
        hal_pinjam ha = new hal_pinjam();
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pinjam_kembalikanMobilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hal_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hal_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hal_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hal_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hal_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sewa_Mobil.ButtonImage info_mobilDanSewa;
    private Sewa_Mobil.ButtonImage info_peminjaman;
    private javax.swing.JLabel jLabel1;
    private Sewa_Mobil.ButtonImage logout;
    private Sewa_Mobil.ButtonImage pinjam_kembalikanMobil;
    // End of variables declaration//GEN-END:variables
}
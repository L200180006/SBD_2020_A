
import bengkel.Transaksi;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GALIH
 */
public class halaman_utama extends javax.swing.JFrame {

    /**
     * Creates new form halaman_utama
     */
    public halaman_utama() {
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

        btn_transaksi = new javax.swing.JButton();
        btn_layanan = new javax.swing.JButton();
        btn_mobil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_pelanggan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_transaksi.setText("Transaksi");
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });

        btn_layanan.setText("Jenis Layanan");
        btn_layanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_layananActionPerformed(evt);
            }
        });

        btn_mobil.setText("Mobil");
        btn_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mobilActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bengkel/Mazda-logo-big.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setText("SM Garage");

        btn_pelanggan.setText("Pelanggan");
        btn_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_layanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_mobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_pelanggan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mobil)
                        .addGap(18, 18, 18)
                        .addComponent(btn_layanan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_transaksi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mobilActionPerformed
        // TODO add your handling code here:
        new mobil().setVisible(true);
         new mobil().setDefaultCloseOperation(new mobil().DISPOSE_ON_CLOSE);
        this.setVisible(false);

    }//GEN-LAST:event_btn_mobilActionPerformed

    private void btn_layananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_layananActionPerformed
        // TODO add your handling code here:
        new layanan().setVisible(true);
         new layanan().setDefaultCloseOperation(new layanan().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_btn_layananActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
        new Transaksi().setVisible(true);
         new Transaksi().setDefaultCloseOperation(new Transaksi().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pelangganActionPerformed
        // TODO add your handling code here:
        new pelanggan().setVisible(true);
         new pelanggan().setDefaultCloseOperation(new pelanggan().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_btn_pelangganActionPerformed

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
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_layanan;
    private javax.swing.JButton btn_mobil;
    private javax.swing.JButton btn_pelanggan;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class frameKondisi extends javax.swing.JFrame {
    
    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","nama","keterangan"};
    private String[] fieldEdit = {"nama","keterangan"};
    private String[] JudulKolom = {"ID","Nama","Keterangan"};
    private int[] LebarKolom = {50,150,250};
    private String SQL = "SELECT * FROM kondisi";
    
    private void refreshKondisi(){
        crud.settingJudulTabel(TableKondisi, JudulKolom);
        crud.tampilTabel(TableKondisi, SQL, JudulKolom);
        crud.settingLebarKolom(TableKondisi, LebarKolom);
    }
    
    private void cariData(String cari){
        String SQLCari = "";
        try {
            if (cari.isEmpty()){
                SQLCari = "SELECT * FROM kondisi";
            } else{
                SQLCari = "SELECT * FROM kondisi WHERE id = '"+cari+"'"+
                        "OR nama = '"+cari+"'"+
                        "OR keterangan = '"+cari+"'";
            }
            crud.settingJudulTabel(TableKondisi, JudulKolom);
            crud.tampilTabel(TableKondisi, SQLCari, JudulKolom);
            crud.settingLebarKolom(TableKondisi, LebarKolom);
        } catch (Exception e) {
        }
    }

    public frameKondisi() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshKondisi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        BHAPUS = new javax.swing.JButton();
        KO_NAMA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        KO_KET = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableKondisi = new javax.swing.JTable();
        BSIMPAN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        KO_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtLaporan = new javax.swing.JTextField();
        BUBAH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Filter Data");

        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });

        KO_NAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KO_NAMAActionPerformed(evt);
            }
        });

        jLabel3.setText("NAMA");

        KO_KET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KO_KETActionPerformed(evt);
            }
        });

        TableKondisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableKondisi);

        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });

        jLabel5.setText("KETERANGAN");

        jButton4.setText("Cetak Laporan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton4KeyReleased(evt);
            }
        });

        KO_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KO_IDActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        txtLaporan.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtLaporanInputMethodTextChanged(evt);
            }
        });
        txtLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaporanActionPerformed(evt);
            }
        });

        BUBAH.setText("UBAH");
        BUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUBAHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KO_KET)
                            .addComponent(KO_NAMA)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(KO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSIMPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(BHAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(KO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(KO_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(KO_KET, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BSIMPAN)
                        .addComponent(BUBAH))
                    .addComponent(BHAPUS))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("kondisi", "id", KO_ID.getText());
            refreshKondisi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void KO_NAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KO_NAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KO_NAMAActionPerformed

    private void KO_KETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KO_KETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KO_KETActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("kondisi", "id", KO_ID.getText())){
                JOptionPane.showMessageDialog(null, "ID Kondisi sudah ada");
            }else{
                String[] isiField = {KO_ID.getText(),KO_NAMA.getText(),KO_KET.getText()};
                crud.SimpanDinamis("kondisi", fieldSimpan, isiField);
            }
            refreshKondisi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (txtLaporan.getText().isEmpty()){
                crud.tampilLaporan("src/laporan/kondisi.jrxml", "SELECT * FROM kondisi");
                cariData(txtLaporan.getText());
            }
            else {
                String SQL = "SELECT * FROM kondisi WHERE id = '"+txtLaporan.getText()+"'"+
                "OR nama = '"+txtLaporan.getText()+"'"+
                "OR keterangan = '"+txtLaporan.getText()+"'";
                crud.tampilLaporan("src/laporan/kondisi.jrxml", SQL);
                cariData(txtLaporan.getText());
            }
        } catch (SQLException ex){
            Logger.getLogger(frameDivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed

    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyReleased
        cariData(txtLaporan.getText());             // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyReleased

    private void KO_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KO_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KO_IDActionPerformed

    private void txtLaporanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtLaporanInputMethodTextChanged

    }//GEN-LAST:event_txtLaporanInputMethodTextChanged

    private void txtLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaporanActionPerformed

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {KO_NAMA.getText(),KO_KET.getText()};
            crud.UbahDinamis("kondisi", "id", KO_ID.getText(), fieldEdit, valueField);
            refreshKondisi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

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
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKondisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField KO_ID;
    private javax.swing.JTextField KO_KET;
    private javax.swing.JTextField KO_NAMA;
    private javax.swing.JTable TableKondisi;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}

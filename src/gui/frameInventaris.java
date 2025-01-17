package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class frameInventaris extends javax.swing.JFrame {
    
    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","kode","jenis","merk","id_kategori","unit_bebas","unit_total","keterangan"};
    private String[] fieldEdit = {"kode","jenis","merk","id_kategori","unit_bebas","unit_total","keterangan"};
    private String[] JudulKolom = {"ID","Kode","Jenis","Merk","ID Kategori","Unit Bebas","Unit Total","Keterangan"};
    private int[] LebarKolom = {40,50,80,80,80,100,80,150};
    private String SQL = "SELECT * FROM inventaris";
    
    private void refreshInventaris(){
        crud.settingJudulTabel(TableInventaris, JudulKolom);
        crud.tampilTabel(TableInventaris, SQL, JudulKolom);
        crud.settingLebarKolom(TableInventaris, LebarKolom);
    }

    private void cariData(String cari){
        String SQLCari = "";
        try {
            if (cari.isEmpty()){
                SQLCari = "SELECT * FROM inventaris";
            } else{
                SQLCari = "SELECT * FROM inventaris WHERE id = '"+cari+"'"+
                        "OR kode = '"+cari+"'"+
                        "OR jenis = '"+cari+"'"+
                        "OR merk  = '"+cari+"'"+
                        "OR id_kategori  = '"+cari+"'"+
                        "OR unit_bebas  = '"+cari+"'"+
                        "OR unit_total  = '"+cari+"'"+
                        "OR keterangan = '"+cari+"'";
            }
            crud.settingJudulTabel(TableInventaris, JudulKolom);
            crud.tampilTabel(TableInventaris, SQLCari, JudulKolom);
            crud.settingLebarKolom(TableInventaris, LebarKolom);
        } catch (Exception e) {
        }
    }
    
    public frameInventaris() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshInventaris();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLaporan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        I_ID = new javax.swing.JTextField();
        I_KODE = new javax.swing.JTextField();
        I_JENIS = new javax.swing.JTextField();
        BSIMPAN = new javax.swing.JButton();
        I_MERK = new javax.swing.JTextField();
        BUBAH = new javax.swing.JButton();
        I_IDK = new javax.swing.JTextField();
        BHAPUS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInventaris = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        I_UNITB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        I_UNITT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        I_KET = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("JENIS");

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

        jLabel3.setText("KODE");

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

        jLabel4.setText("MERK");

        jLabel6.setText("Filter Data");

        jLabel5.setText("UNIT BEBAS");

        I_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_IDActionPerformed(evt);
            }
        });

        I_KODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_KODEActionPerformed(evt);
            }
        });

        I_JENIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_JENISActionPerformed(evt);
            }
        });

        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });

        I_MERK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_MERKActionPerformed(evt);
            }
        });

        BUBAH.setText("UBAH");
        BUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUBAHActionPerformed(evt);
            }
        });

        I_IDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_IDKActionPerformed(evt);
            }
        });

        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });

        TableInventaris.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableInventaris);

        jLabel7.setText("ID KATEGORI");

        I_UNITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_UNITBActionPerformed(evt);
            }
        });

        jLabel8.setText("UNIT TOTAL");

        I_UNITT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_UNITTActionPerformed(evt);
            }
        });

        jLabel9.setText("KETERANGAN");

        I_KET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_KETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(I_IDK)
                            .addComponent(I_MERK)
                            .addComponent(I_JENIS)
                            .addComponent(I_KODE)
                            .addComponent(I_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addComponent(I_UNITB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(47, 47, 47)
                                .addComponent(I_UNITT))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSIMPAN)
                                        .addGap(44, 44, 44)
                                        .addComponent(BUBAH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BHAPUS))
                                    .addComponent(I_KET))))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(I_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(I_UNITB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I_KODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(I_UNITT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(I_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(I_MERK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(I_IDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(I_KET))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUBAH)
                    .addComponent(BSIMPAN)
                    .addComponent(BHAPUS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (txtLaporan.getText().isEmpty()){
                crud.tampilLaporan("src/laporan/inventaris.jrxml", "SELECT * FROM inventaris");
                cariData(txtLaporan.getText());
            }
            else {
                String SQL = "SELECT * FROM inventaris WHERE id = '"+txtLaporan.getText()+"'"+
                "OR kode = '"+txtLaporan.getText()+"'"+
                "OR jenis = '"+txtLaporan.getText()+"'"+
                "OR merk = '"+txtLaporan.getText()+"'"+
                "OR id_kategori = '"+txtLaporan.getText()+"'"+
                "OR unit_bebas = '"+txtLaporan.getText()+"'"+
                "OR unit_total = '"+txtLaporan.getText()+"'"+
                "OR keterangan = '"+txtLaporan.getText()+"'";
                crud.tampilLaporan("src/laporan/kategori.jrxml", SQL);
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

    private void txtLaporanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtLaporanInputMethodTextChanged

    }//GEN-LAST:event_txtLaporanInputMethodTextChanged

    private void txtLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaporanActionPerformed

    private void I_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_IDActionPerformed

    private void I_KODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_KODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_KODEActionPerformed

    private void I_JENISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_JENISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_JENISActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("inventaris", "id", I_ID.getText())){
                JOptionPane.showMessageDialog(null, "ID Inventaris sudah ada");
            }else{
                String[] isiField = {I_ID.getText(),I_KODE.getText(),I_JENIS.getText(),I_MERK.getText(),I_IDK.getText(),I_UNITB.getText(),I_UNITT.getText(),I_KET.getText()};
                crud.SimpanDinamis("inventaris", fieldSimpan, isiField);
            }
            refreshInventaris();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void I_MERKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_MERKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_MERKActionPerformed

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {I_KODE.getText(),I_JENIS.getText(),I_MERK.getText(),I_IDK.getText(),I_UNITB.getText(),I_UNITT.getText(),I_KET.getText()};
            crud.UbahDinamis("inventaris", "id", I_ID.getText(), fieldEdit, valueField);
            refreshInventaris();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

    private void I_IDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_IDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_IDKActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("inventaris", "id", I_ID.getText());
            refreshInventaris();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void I_UNITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_UNITBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_UNITBActionPerformed

    private void I_UNITTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_UNITTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_UNITTActionPerformed

    private void I_KETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_KETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_KETActionPerformed

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
            java.util.logging.Logger.getLogger(frameInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInventaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField I_ID;
    private javax.swing.JTextField I_IDK;
    private javax.swing.JTextField I_JENIS;
    private javax.swing.JTextField I_KET;
    private javax.swing.JTextField I_KODE;
    private javax.swing.JTextField I_MERK;
    private javax.swing.JTextField I_UNITB;
    private javax.swing.JTextField I_UNITT;
    private javax.swing.JTable TableInventaris;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}

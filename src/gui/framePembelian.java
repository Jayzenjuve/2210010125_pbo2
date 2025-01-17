package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class framePembelian extends javax.swing.JFrame {
    
    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","tgl","id_divisi","nama_inventaris","unit","total_pembelian","keterangan"};
    private String[] fieldEdit = {"tgl","id_divisi","nama_inventaris","unit","total_pembelian","keterangan"};
    private String[] JudulKolom = {"ID","Tanggal","ID Divisi","Nama Inventaris","Unit","Total Pembelian","Keterangan"};
    private int[] LebarKolom = {40,70,100,180,60,140,180};
    private String SQL = "SELECT * FROM pembelian";
    
    private void refreshPembelian(){
        crud.settingJudulTabel(TablePembelian, JudulKolom);
        crud.tampilTabel(TablePembelian, SQL, JudulKolom);
        crud.settingLebarKolom(TablePembelian, LebarKolom);
    }

    private void cariData(String cari){
        String SQLCari = "";
        try {
            if (cari.isEmpty()){
                SQLCari = "SELECT * FROM pembelian";
            } else{
                SQLCari = "SELECT * FROM pembelian WHERE id = '"+cari+"'"+
                        "OR tgl = '"+cari+"'"+
                        "OR id_divisi = '"+cari+"'"+
                        "OR nama_inventaris  = '"+cari+"'"+
                        "OR unit  = '"+cari+"'"+
                        "OR total_pembelian  = '"+cari+"'"+
                        "OR keterangan = '"+cari+"'";
            }
            crud.settingJudulTabel(TablePembelian, JudulKolom);
            crud.tampilTabel(TablePembelian, SQLCari, JudulKolom);
            crud.settingLebarKolom(TablePembelian, LebarKolom);
        } catch (Exception e) {
        }
    }

    public framePembelian() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshPembelian();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        PB_ID = new javax.swing.JTextField();
        PB_IDD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PB_NI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PB_TB = new javax.swing.JTextField();
        BSIMPAN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PB_U = new javax.swing.JTextField();
        PB_KET = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        BUBAH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLaporan = new javax.swing.JTextField();
        BHAPUS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePembelian = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PB_TGL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PB_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_IDActionPerformed(evt);
            }
        });

        PB_IDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_IDDActionPerformed(evt);
            }
        });

        jLabel8.setText("TOTAL PEMBELIAN");

        PB_NI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_NIActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        PB_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_TBActionPerformed(evt);
            }
        });

        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });

        jLabel9.setText("KETERANGAN");

        jLabel2.setText("NAMA INVENTARIS");

        PB_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_UActionPerformed(evt);
            }
        });

        PB_KET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_KETActionPerformed(evt);
            }
        });

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

        BUBAH.setText("UBAH");
        BUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUBAHActionPerformed(evt);
            }
        });

        jLabel3.setText("ID DIVISI");

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

        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });

        jLabel4.setText("UNIT");

        TablePembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablePembelian);

        jLabel6.setText("Filter Data");

        jLabel10.setText("TANGGAL");

        PB_TGL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PB_TGLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PB_U)
                            .addComponent(PB_NI)
                            .addComponent(PB_IDD)
                            .addComponent(PB_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSIMPAN)
                                .addGap(16, 16, 16)
                                .addComponent(BUBAH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BHAPUS))
                            .addComponent(PB_KET)
                            .addComponent(PB_TB)
                            .addComponent(PB_TGL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PB_IDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(PB_TGL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(PB_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PB_NI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PB_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addComponent(PB_KET, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUBAH)
                    .addComponent(BSIMPAN)
                    .addComponent(BHAPUS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PB_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_IDActionPerformed

    private void PB_IDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_IDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_IDDActionPerformed

    private void PB_NIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_NIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_NIActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("pembelian", "id", PB_ID.getText())){
                JOptionPane.showMessageDialog(null, "ID Pembelian sudah ada");
            }else{
                String[] isiField = {PB_ID.getText(),PB_TGL.getText(),PB_IDD.getText(),PB_NI.getText(),PB_U.getText(),PB_TB.getText(),PB_KET.getText()};
                crud.SimpanDinamis("pembelian", fieldSimpan, isiField);
            }
            refreshPembelian();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void PB_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_UActionPerformed

    private void PB_KETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_KETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_KETActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (txtLaporan.getText().isEmpty()){
                crud.tampilLaporan("src/laporan/pembelian.jrxml", "SELECT * FROM pembelian");
                cariData(txtLaporan.getText());
            }
            else {
                String SQL = "SELECT * FROM pembelian WHERE id = '"+txtLaporan.getText()+"'"+
                "OR kode = '"+txtLaporan.getText()+"'"+
                "OR jenis = '"+txtLaporan.getText()+"'"+
                "OR merk = '"+txtLaporan.getText()+"'"+
                "OR id_kategori = '"+txtLaporan.getText()+"'"+
                "OR unit_bebas = '"+txtLaporan.getText()+"'"+
                "OR unit_total = '"+txtLaporan.getText()+"'"+
                "OR keterangan = '"+txtLaporan.getText()+"'";
                crud.tampilLaporan("src/laporan/pembelian.jrxml", SQL);
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

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {PB_TGL.getText(),PB_IDD.getText(),PB_NI.getText(),PB_U.getText(),PB_TB.getText(),PB_KET.getText()};
            crud.UbahDinamis("pembelian", "id", PB_ID.getText(), fieldEdit, valueField);
            refreshPembelian();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

    private void txtLaporanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtLaporanInputMethodTextChanged

    }//GEN-LAST:event_txtLaporanInputMethodTextChanged

    private void txtLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaporanActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("pembelian", "id", PB_ID.getText());
            refreshPembelian();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void PB_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_TBActionPerformed

    private void PB_TGLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PB_TGLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PB_TGLActionPerformed

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
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField PB_ID;
    private javax.swing.JTextField PB_IDD;
    private javax.swing.JTextField PB_KET;
    private javax.swing.JTextField PB_NI;
    private javax.swing.JTextField PB_TB;
    private javax.swing.JTextField PB_TGL;
    private javax.swing.JTextField PB_U;
    private javax.swing.JTable TablePembelian;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}

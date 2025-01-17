package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class frameRusak extends javax.swing.JFrame {

    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","id_divisi","id_inventaris","unit","keterangan","tgl_rusak"};
    private String[] fieldEdit = {"id_divisi","id_inventaris","unit","keterangan","tgl_rusak"};
    private String[] JudulKolom = {"ID","ID Divisi","ID Inventaris","Unit","Keterangan","Tanggal Rusak"};
    private int[] LebarKolom = {40,90,110,60,140,140};
    private String SQL = "SELECT * FROM rusak";
    
    private void refreshRusak(){
        crud.settingJudulTabel(TableRusak, JudulKolom);
        crud.tampilTabel(TableRusak, SQL, JudulKolom);
        crud.settingLebarKolom(TableRusak, LebarKolom);
    }

    private void cariData(String cari){
        String SQLCari = "";
        try {
            if (cari.isEmpty()){
                SQLCari = "SELECT * FROM rusak";
            } else{
                SQLCari = "SELECT * FROM rusak WHERE id = '"+cari+"'"+
                        "OR id_divisi = '"+cari+"'"+
                        "OR id_inventaris  = '"+cari+"'"+
                        "OR unit  = '"+cari+"'"+
                        "OR keterangan  = '"+cari+"'"+
                        "OR tgl_rusak = '"+cari+"'";
            }
            crud.settingJudulTabel(TableRusak, JudulKolom);
            crud.tampilTabel(TableRusak, SQLCari, JudulKolom);
            crud.settingLebarKolom(TableRusak, LebarKolom);
        } catch (Exception e) {
        }
    }
    
    public frameRusak() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshRusak();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLaporan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        R_ID = new javax.swing.JTextField();
        R_IDD = new javax.swing.JTextField();
        R_IDI = new javax.swing.JTextField();
        BSIMPAN = new javax.swing.JButton();
        R_U = new javax.swing.JTextField();
        BUBAH = new javax.swing.JButton();
        BHAPUS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRusak = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        R_TR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        R_KET = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID INVENTARIS");

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

        jLabel4.setText("UNIT");

        jLabel6.setText("Filter Data");

        jLabel5.setText("KETERANGAN");

        R_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_IDActionPerformed(evt);
            }
        });

        R_IDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_IDDActionPerformed(evt);
            }
        });

        R_IDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_IDIActionPerformed(evt);
            }
        });

        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });

        R_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_UActionPerformed(evt);
            }
        });

        BUBAH.setText("UBAH");
        BUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUBAHActionPerformed(evt);
            }
        });

        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });

        TableRusak.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableRusak);

        jLabel1.setText("ID");

        R_TR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_TRActionPerformed(evt);
            }
        });

        jLabel7.setText("TANGGAL RUSAK");

        R_KET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_KETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(R_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(R_IDD)
                                    .addComponent(R_IDI)
                                    .addComponent(R_U))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSIMPAN)
                                        .addGap(20, 20, 20)
                                        .addComponent(BUBAH)
                                        .addGap(18, 18, 18)
                                        .addComponent(BHAPUS))
                                    .addComponent(R_KET)
                                    .addComponent(R_TR))))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(R_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(R_TR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R_IDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(R_IDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(R_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(R_KET))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHAPUS)
                    .addComponent(BUBAH)
                    .addComponent(BSIMPAN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (txtLaporan.getText().isEmpty()){
                crud.tampilLaporan("src/laporan/rusak.jrxml", "SELECT * FROM rusak");
                cariData(txtLaporan.getText());
            }
            else {
                String SQL = "SELECT * FROM rusak WHERE id = '"+txtLaporan.getText()+"'"+
                "OR id_divisi = '"+txtLaporan.getText()+"'"+
                "OR id_inventaris = '"+txtLaporan.getText()+"'"+
                "OR unit = '"+txtLaporan.getText()+"'"+
                "OR keterangan = '"+txtLaporan.getText()+"'"+
                "OR tgl_rusak = '"+txtLaporan.getText()+"'";
                crud.tampilLaporan("src/laporan/rusak.jrxml", SQL);
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

    private void R_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_IDActionPerformed

    private void R_IDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_IDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_IDDActionPerformed

    private void R_IDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_IDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_IDIActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("rusak", "id", R_ID.getText())){
                JOptionPane.showMessageDialog(null, "ID Rusak sudah ada");
            }else{
                String[] isiField = {R_ID.getText(),R_IDD.getText(),R_IDI.getText(),R_U.getText(),R_KET.getText(),R_TR.getText()};
                crud.SimpanDinamis("rusak", fieldSimpan, isiField);
            }
            refreshRusak();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void R_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_UActionPerformed

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {R_IDD.getText(),R_IDI.getText(),R_U.getText(),R_KET.getText(),R_TR.getText()};
            crud.UbahDinamis("rusak", "id", R_ID.getText(), fieldEdit, valueField);
            refreshRusak();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("rusak", "id", R_ID.getText());
            refreshRusak();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void R_TRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_TRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_TRActionPerformed

    private void R_KETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_KETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_KETActionPerformed

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
            java.util.logging.Logger.getLogger(frameRusak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameRusak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameRusak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameRusak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameRusak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField R_ID;
    private javax.swing.JTextField R_IDD;
    private javax.swing.JTextField R_IDI;
    private javax.swing.JTextField R_KET;
    private javax.swing.JTextField R_TR;
    private javax.swing.JTextField R_U;
    private javax.swing.JTable TableRusak;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}

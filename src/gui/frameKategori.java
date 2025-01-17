package gui;
import configDatabase.configDB;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class frameKategori extends javax.swing.JFrame {
    
    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","kode","jenis","unit","keterangan"};
    private String[] fieldEdit = {"kode","jenis","unit","keterangan"};
    private String[] JudulKolom = {"ID","Kode","Jenis","Unit","Keterangan"};
    private int[] LebarKolom = {50,50,100,80,150};
    private String SQL = "SELECT * FROM kategori";
    
    private void refreshKategori(){
        crud.settingJudulTabel(TableKategori, JudulKolom);
        crud.tampilTabel(TableKategori, SQL, JudulKolom);
        crud.settingLebarKolom(TableKategori, LebarKolom);
    }
    
    private void cariData(String cari){
        String SQLCari = "";
        try {
            if (cari.isEmpty()){
                SQLCari = "SELECT * FROM kategori";
            } else{
                SQLCari = "SELECT * FROM kategori WHERE id = '"+cari+"'"+
                        "OR kode = '"+cari+"'"+
                        "OR jenis = '"+cari+"'"+
                        "OR unit  = '"+cari+"'"+
                        "OR keterangan = '"+cari+"'";
            }
            crud.settingJudulTabel(TableKategori, JudulKolom);
            crud.tampilTabel(TableKategori, SQLCari, JudulKolom);
            crud.settingLebarKolom(TableKategori, LebarKolom);
        } catch (Exception e) {
        }
    }

    public frameKategori() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
        refreshKategori();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSIMPAN = new javax.swing.JButton();
        BUBAH = new javax.swing.JButton();
        BHAPUS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        K_ID = new javax.swing.JTextField();
        K_KODE = new javax.swing.JTextField();
        K_JENIS = new javax.swing.JTextField();
        K_UNIT = new javax.swing.JTextField();
        K_KET = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableKategori = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        txtLaporan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
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

        jLabel1.setText("ID");

        jLabel2.setText("JENIS");

        jLabel3.setText("KODE");

        jLabel4.setText("UNIT");

        jLabel5.setText("KETERANGAN");

        K_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_IDActionPerformed(evt);
            }
        });

        K_KODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_KODEActionPerformed(evt);
            }
        });

        K_JENIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_JENISActionPerformed(evt);
            }
        });

        K_UNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_UNITActionPerformed(evt);
            }
        });

        K_KET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_KETActionPerformed(evt);
            }
        });

        TableKategori.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableKategori);

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

        jLabel6.setText("Filter Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSIMPAN)
                                .addGap(50, 50, 50)
                                .addComponent(BUBAH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BHAPUS))
                            .addComponent(K_UNIT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(K_KET, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(K_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(K_KODE, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(K_JENIS, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(K_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K_KODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(K_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(K_UNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(K_KET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHAPUS)
                    .addComponent(BUBAH)
                    .addComponent(BSIMPAN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("kategori", "id", K_ID.getText())){
                JOptionPane.showMessageDialog(null, "ID Kategori sudah ada");
            }else{
                String[] isiField = {K_ID.getText(),K_KODE.getText(),K_JENIS.getText(),K_UNIT.getText(),K_KET.getText()};
                crud.SimpanDinamis("kategori", fieldSimpan, isiField);
            }
            refreshKategori();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {K_KODE.getText(),K_JENIS.getText(),K_UNIT.getText(),K_KET.getText()};
            crud.UbahDinamis("kategori", "id", K_ID.getText(), fieldEdit, valueField);
            refreshKategori();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("kategori", "id", K_ID.getText());
            refreshKategori();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void K_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_K_IDActionPerformed

    private void K_KODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_KODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_K_KODEActionPerformed

    private void K_JENISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_JENISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_K_JENISActionPerformed

    private void K_UNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_UNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_K_UNITActionPerformed

    private void K_KETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_KETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_K_KETActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (txtLaporan.getText().isEmpty()){
                crud.tampilLaporan("src/laporan/kategori.jrxml", "SELECT * FROM kategori");
                cariData(txtLaporan.getText());
            }
            else {
                String SQL = "SELECT * FROM kategori WHERE id = '"+txtLaporan.getText()+"'"+
                "OR kode = '"+txtLaporan.getText()+"'"+
                "OR jenis = '"+txtLaporan.getText()+"'"+
                "OR unit = '"+txtLaporan.getText()+"'"+
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField K_ID;
    private javax.swing.JTextField K_JENIS;
    private javax.swing.JTextField K_KET;
    private javax.swing.JTextField K_KODE;
    private javax.swing.JTextField K_UNIT;
    private javax.swing.JTable TableKategori;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLaporan;
    // End of variables declaration//GEN-END:variables
}

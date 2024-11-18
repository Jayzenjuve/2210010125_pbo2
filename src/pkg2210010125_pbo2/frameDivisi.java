package pkg2210010125_pbo2;
import configDatabase.configDB;
import javax.swing.JOptionPane;

public class frameDivisi extends javax.swing.JFrame {

    private configDB crud; // Nama object secara global dari configDB
    private String[] fieldSimpan = {"id","kode","nama","kepala_divisi","kontak"};
    private String[] fieldEdit = {"kode","nama","kepala_divisi","kontak"};
    
    public frameDivisi() {
        initComponents();
        this.setLocationRelativeTo(null);
        crud = new configDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        D_ID = new javax.swing.JTextField();
        D_KODE = new javax.swing.JTextField();
        D_NAMA = new javax.swing.JTextField();
        D_KONTAK = new javax.swing.JTextField();
        D_KDIVISI = new javax.swing.JTextField();
        BSIMPAN = new javax.swing.JButton();
        BUBAH = new javax.swing.JButton();
        BHAPUS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("KODE");

        jLabel3.setText("NAMA");

        jLabel4.setText("KEPALA DIVISI");

        jLabel5.setText("KONTAK");

        D_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_IDActionPerformed(evt);
            }
        });

        D_KODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_KODEActionPerformed(evt);
            }
        });

        D_NAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_NAMAActionPerformed(evt);
            }
        });

        D_KONTAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_KONTAKActionPerformed(evt);
            }
        });

        D_KDIVISI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_KDIVISIActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BSIMPAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUBAH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BHAPUS))
                    .addComponent(D_KODE)
                    .addComponent(D_NAMA)
                    .addComponent(D_KDIVISI)
                    .addComponent(D_KONTAK)
                    .addComponent(D_ID))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(D_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(D_KODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(D_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(D_KDIVISI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(D_KONTAK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSIMPAN)
                    .addComponent(BUBAH)
                    .addComponent(BHAPUS))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_IDActionPerformed

    private void D_KODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_KODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_KODEActionPerformed

    private void D_NAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_NAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_NAMAActionPerformed

    private void D_KONTAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_KONTAKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_KONTAKActionPerformed

    private void D_KDIVISIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_KDIVISIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_KDIVISIActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {
            if(crud.duplikatKey("divisi", "id", D_ID.getText())){
                JOptionPane.showMessageDialog(null, "Kode DVD sudah ada");
            }else{
                String[] isiField = {D_ID.getText(),D_KODE.getText(),D_NAMA.getText(),D_KDIVISI.getText(),D_KONTAK.getText()};
                crud.SimpanDinamis("divisi", fieldSimpan, isiField);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void BUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUBAHActionPerformed
        try {
            String[] valueField = {D_KODE.getText(),D_NAMA.getText(),D_KDIVISI.getText(),D_KONTAK.getText()};
            crud.UbahDinamis("divisi", "id", D_ID.getText(), fieldEdit, valueField);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BUBAHActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            crud.HapusDinamis("divisi", "id", D_ID.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BHAPUSActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDivisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BUBAH;
    private javax.swing.JTextField D_ID;
    private javax.swing.JTextField D_KDIVISI;
    private javax.swing.JTextField D_KODE;
    private javax.swing.JTextField D_KONTAK;
    private javax.swing.JTextField D_NAMA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

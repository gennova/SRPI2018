/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.ui;

import com.init.pendidikanterakhir.PendidikanTerakhir;
import com.init.pformal.PendidikanFormal;
import com.init.pformal.PendidikanFormalTabelModel;
import com.init.tools.DaoFactory;
import com.init.tools.Session;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author laravel
 */
public class PendidikanFormalUI extends javax.swing.JFrame {

    private TableRowSorter sorter;

    /**
     * Creates new form PendidikanFormalUI
     */
    public PendidikanFormalUI() {
        initComponents();
        initApp();
        setLocationRelativeTo(null);
        loadtable();
    }

    private void loadtable() {
        if (Session.getSuster() != null) {
            PendidikanFormalTabelModel model = new PendidikanFormalTabelModel(DaoFactory.getFormalDao().getAllPendidikanFormalByIDSuster(Session.getSuster().getID()));
            sorter = new TableRowSorter(model);
            tbl_formal_suster.setModel(model);
            tbl_formal_suster.setRowSorter(sorter);
            tbl_formal_suster.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_formal_suster.getColumnModel().getColumn(1).setPreferredWidth(200);
        }
    }

    private void initApp() {
        Date now = GregorianCalendar.getInstance().getTime();
        TglMasuk.setDate(now);
        TglLulus.setDate(now);
        ComboPendidikan.removeAllItems();
        List<PendidikanTerakhir> list = DaoFactory.getPendidikanTerakhirDao().getAllPendidikan();
        list.forEach((pendidikanTerakhir) -> {
            ComboPendidikan.addItem(pendidikanTerakhir.getNamapendidikanterakhir());
        });
    }

    private void clearfield() {
        NamaSP.setText("");
        AlamatSP.setText("");
        txtID.setText("");
        initApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboPendidikan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NamaSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TglMasuk = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        TglLulus = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        AlamatSP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_formal_suster = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RIWAYAT PENDIDIKAN FORMAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setText("Tingkat Pendidikan");

        ComboPendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Nama Satuan Pendidikan");

        jLabel4.setText("Tahun Masuk");

        jLabel5.setText("Tahun Lulus");

        jLabel6.setText("Alamat Satuan Pendidikan");

        tbl_formal_suster.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_formal_suster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_formal_susterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_formal_suster);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Selected");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboPendidikan, 0, 281, Short.MAX_VALUE)
                            .addComponent(NamaSP)
                            .addComponent(AlamatSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TglMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(TglLulus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ComboPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NamaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TglLulus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AlamatSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AlamatSP, ComboPendidikan, NamaSP, TglLulus, TglMasuk, jLabel3, jLabel4, jLabel5, jLabel6});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (txtID.getText().equalsIgnoreCase("")) {
            PendidikanTerakhir pt = DaoFactory.getPendidikanTerakhirDao().getPendidikanByNama(ComboPendidikan.getSelectedItem().toString());
            String namaSP = NamaSP.getText();
            String alamatSP = AlamatSP.getText();
            String tglMasuk = sdf.format(TglMasuk.getDate());
            String tglLulus = sdf.format(TglLulus.getDate());
            PendidikanFormal formal = new PendidikanFormal();
            formal.setPendidikanTerakhir(pt);
            formal.setNamaSP(namaSP);
            formal.setAlamatSP(alamatSP);
            formal.setTglMasuk(tglMasuk);
            formal.setTglLulus(tglLulus);
            formal.setSuster(Session.getSuster());
            DaoFactory.getFormalDao().InsertFormal(formal);
        } else {
            int ID = Integer.parseInt(txtID.getText());
            PendidikanTerakhir pt = DaoFactory.getPendidikanTerakhirDao().getPendidikanByNama(ComboPendidikan.getSelectedItem().toString());
            String namaSP = NamaSP.getText();
            String alamatSP = AlamatSP.getText();
            String tglMasuk = sdf.format(TglMasuk.getDate());
            String tglLulus = sdf.format(TglLulus.getDate());
            PendidikanFormal formal = new PendidikanFormal();
            formal.setPendidikanTerakhir(pt);
            formal.setNamaSP(namaSP);
            formal.setAlamatSP(alamatSP);
            formal.setTglMasuk(tglMasuk);
            formal.setTglLulus(tglLulus);
            formal.setSuster(Session.getSuster());
            formal.setIDPendidikan(ID);
            DaoFactory.getFormalDao().UpdateFormal(formal);
        }

        clearfield();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_formal_susterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_formal_susterMouseClicked
        // TODO add your handling code here:
        int row = tbl_formal_suster.getSelectedRow();
        if (row >= 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            int id = Integer.parseInt(tbl_formal_suster.getValueAt(row, 0).toString());
            PendidikanFormal formal = DaoFactory.getFormalDao().getAllPendidikanFormalByID(id);
            txtID.setText(String.valueOf(formal.getIDPendidikan()));
            NamaSP.setText(formal.getNamaSP());
            ComboPendidikan.setSelectedItem(formal.getPendidikanTerakhir().getNamapendidikanterakhir());
            AlamatSP.setText(formal.getAlamatSP());
            try {
                TglMasuk.setDate(sdf.parse(formal.getTglMasuk()));
                TglLulus.setDate(sdf.parse(formal.getTglLulus()));
            } catch (ParseException ex) {
                Logger.getLogger(PendidikanFormalUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbl_formal_susterMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = tbl_formal_suster.getSelectedRow();
        if (row >= 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            int id = Integer.parseInt(tbl_formal_suster.getValueAt(row, 0).toString());
            PendidikanFormal formal = DaoFactory.getFormalDao().getAllPendidikanFormalByID(id);
            int opsi = JOptionPane.showConfirmDialog(null, "Anda yakin akan menghapus data", "PERINGATAN!", JOptionPane.OK_CANCEL_OPTION);
            if (opsi == JOptionPane.OK_OPTION) {
                DaoFactory.getFormalDao().DeleteFormal(formal);
                loadtable();
                clearfield();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PendidikanFormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendidikanFormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendidikanFormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendidikanFormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendidikanFormalUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatSP;
    private javax.swing.JComboBox<String> ComboPendidikan;
    private javax.swing.JTextField NamaSP;
    private com.toedter.calendar.JDateChooser TglLulus;
    private com.toedter.calendar.JDateChooser TglMasuk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_formal_suster;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

}

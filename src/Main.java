
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhe
 */
public class Main extends javax.swing.JFrame {
    
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setTanggal();
        selectData();
        tampilkanNamaKasir();
        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        totalHarga();
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
        jLabel1 = new javax.swing.JLabel();
        jLabelNamaKasir = new javax.swing.JLabel();
        jLabelTanggal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldNamaBarang = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldHargaBarang = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldBanyakBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextFieldIdBarang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonTotal = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(39, 174, 96));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kasir App v0.1");

        jLabelNamaKasir.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNamaKasir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNamaKasir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNamaKasir.setText("Christian Doxa Hamasiah");

        jLabelTanggal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTanggal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTanggal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTanggal.setText("14 Maret 2017 08:55:22");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diskon 15% pada pembelian diatas Rp100.000,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNamaKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jLabelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 80);

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(52, 152, 219));

        jTextFieldNamaBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNamaBarang.setToolTipText("Masukkan Nama Barang");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 180, 210, 50);

        jPanel6.setBackground(new java.awt.Color(52, 152, 219));

        jTextFieldHargaBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldHargaBarang.setToolTipText("Masukkan Harga Barang");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldHargaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldHargaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 270, 210, 50);

        jPanel7.setBackground(new java.awt.Color(52, 152, 219));

        jTextFieldBanyakBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldBanyakBarang.setToolTipText("Masukkan Banyak Barang");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldBanyakBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldBanyakBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 360, 210, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id Barang");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 60, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Harga Barang");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 240, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Banyak Barang");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 330, 130, 30);

        jPanel9.setBackground(new java.awt.Color(52, 152, 219));

        jTextFieldIdBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldIdBarang.setToolTipText("Masukkan Id Barang");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldIdBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldIdBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(10, 90, 210, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Barang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 150, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 230, 470);

        jPanel3.setBackground(new java.awt.Color(26, 188, 156));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(null);

        jButtonTotal.setBackground(new java.awt.Color(204, 0, 51));
        jButtonTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTotal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTotal);
        jButtonTotal.setBounds(370, 10, 150, 40);

        jButtonSave.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSave);
        jButtonSave.setBounds(10, 10, 80, 40);

        jButtonDelete.setBackground(new java.awt.Color(204, 0, 51));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelete);
        jButtonDelete.setBounds(100, 10, 80, 40);

        jButtonClear.setBackground(new java.awt.Color(204, 0, 51));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonClear);
        jButtonClear.setBounds(190, 10, 80, 40);

        jButtonPrint.setBackground(new java.awt.Color(204, 0, 51));
        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPrint);
        jButtonPrint.setBounds(280, 10, 80, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(230, 80, 530, 60);

        jPanel4.setBackground(new java.awt.Color(52, 152, 219));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Barang", "Nama Barang", "Harga Barang", "Banyak Barang", "Jumlah", "Tanggal Transaksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 530, 370);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total =");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(240, 0, 100, 40);

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setText("Rp100.000,00");
        jPanel4.add(jLabelTotal);
        jLabelTotal.setBounds(340, 0, 190, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(230, 140, 530, 410);

        setSize(new java.awt.Dimension(778, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        if ("".equals(jTextFieldIdBarang.getText()) || "".equals(jTextFieldNamaBarang.getText()) || "".equals(jTextFieldHargaBarang.getText()) || "".equals(jTextFieldBanyakBarang.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int harga = Integer.parseInt(jTextFieldHargaBarang.getText());
            int banyak = Integer.parseInt(jTextFieldBanyakBarang.getText());
            int jumlah = harga * banyak;
            String SQL = "INSERT INTO tb_transaksi (id_barang,nama_barang,harga_barang,banyak_barang,jumlah) "
                    + "VALUES('" + jTextFieldIdBarang.getText() + "','" + jTextFieldNamaBarang.getText() + "','"+ jTextFieldHargaBarang.getText() + "','"
                    + jTextFieldBanyakBarang.getText() + "','" + jumlah+"')";
            int status = ConnectionDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
                totalHarga();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris != -1) {
            jTextFieldIdBarang.setText(jTable1.getValueAt(baris, 0).toString());
            jTextFieldNamaBarang.setText(jTable1.getValueAt(baris, 1).toString());
            jTextFieldHargaBarang.setText(jTable1.getValueAt(baris, 2).toString());
            jTextFieldBanyakBarang.setText(jTable1.getValueAt(baris, 3).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris != -1) {
            String idBarang = jTable1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE id_barang='"+idBarang+"'";
            int status = ConnectionDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
                totalHarga();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldIdBarang.setText("");
        jTextFieldNamaBarang.setText("");
        jTextFieldHargaBarang.setText("");
        jTextFieldBanyakBarang.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}     ");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,null,true,null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        // TODO add your handling code here:
        totalHarga();
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void totalHarga() {
        int banyak = jTable1.getRowCount();
        int hasil = 0;
        for (int i = 0; i < banyak; i++) {
            hasil += Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        }
        if (hasil > 100000) {
            int disc = (int) (hasil * 0.15);
            hasil -= disc;
        }
        jLabelTotal.setText(String.valueOf(kursIndonesia.format(hasil)));
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    
    String nolJam = "";
    String nolMenit = "";
    String nolDetik = "";
    
    private void setTanggal(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kalender = new java.text.SimpleDateFormat("dd/MM/yyyy");
        
        ActionListener taskPerfomer = (ActionEvent e) -> {
            Date dt = new Date();
            int nilaiJam = dt.getHours();
            int nilaiMenit = dt.getMinutes();
            int nilaiDetik = dt.getSeconds();
            if (nilaiJam <= 9) {
                nolJam = "0";
            } else {
                nolJam = "";
            }
            if (nilaiMenit <= 9) {
                nolMenit = "0";
            } else {
                nolMenit = "";
            }
            if (nilaiDetik <= 9) {
                nolDetik = "0";
            } else {
                nolDetik = "";
            }
            //Membuat String jam, menit, dan detik
            String jam = nolJam + Integer.toString(nilaiJam);
            String menit = nolMenit + Integer.toString(nilaiMenit);
            String detik = nolDetik + Integer.toString(nilaiDetik);
            jLabelTanggal.setText(kalender.format(sekarang) + " " + "Jam " + jam +":" + menit + ":" + detik);
        };
        new Timer(100, taskPerfomer).start();
    }
    
    private void selectData(){
        String kolom[] = {"Id Barang","Nama Barang","Harga Barang","Banyak Barang","Jumlah","Tanggal Transaksi"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_transaksi";
        ResultSet rs = ConnectionDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String idBarang = rs.getString(2);
                String namaBarang = rs.getString(3);
                String hargaBarang = rs.getString(4);
                String banyakBarang = rs.getString(5);
                String jumlah = rs.getString(6);
                String tanggalTransaksi = rs.getString(7);
                String data[] = {idBarang, namaBarang, hargaBarang, banyakBarang, jumlah, tanggalTransaksi};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dtm);
    }
    
    private void tampilkanNamaKasir() {
        String SQL = "SELECT * FROM tb_kasir";
        ResultSet result = ConnectionDB.executeQuery(SQL);
        try {
            while(result.next()){
                String namaKasir = result.getString(1);
                jLabelNamaKasir.setText(namaKasir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNamaKasir;
    private javax.swing.JLabel jLabelTanggal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBanyakBarang;
    private javax.swing.JTextField jTextFieldHargaBarang;
    private javax.swing.JTextField jTextFieldIdBarang;
    private javax.swing.JTextField jTextFieldNamaBarang;
    // End of variables declaration//GEN-END:variables
}

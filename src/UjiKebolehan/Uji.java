/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjiKebolehan;

import javax.swing.JOptionPane;

/**
 *
 * @author tio
 */
public class Uji extends javax.swing.JFrame {

    /**
     * Creates new form Uji
     */
    public Uji() {
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

        rr = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Laki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        Keluar = new javax.swing.JButton();
        Oke = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TA = new javax.swing.JTextField();
        Saran2 = new javax.swing.JTextField();
        Saran1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 300, 50);
        getContentPane().add(Berat);
        Berat.setBounds(180, 170, 160, 26);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(180, 90, 370, 26);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(180, 130, 160, 26);

        rr.add(Laki);
        Laki.setText("LAKI - LAKI");
        getContentPane().add(Laki);
        Laki.setBounds(180, 220, 104, 23);

        rr.add(Perempuan);
        Perempuan.setText("PEREMPUAN");
        getContentPane().add(Perempuan);
        Perempuan.setBounds(340, 220, 107, 23);

        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(440, 270, 92, 29);

        Oke.setText("PROSES");
        Oke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeActionPerformed(evt);
            }
        });
        getContentPane().add(Oke);
        Oke.setBounds(180, 270, 90, 29);

        Hapus.setText("HAPUS");
        getContentPane().add(Hapus);
        Hapus.setBounds(310, 270, 86, 29);

        jLabel2.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 320, 210, 30);
        getContentPane().add(TA);
        TA.setBounds(410, 320, 120, 26);
        getContentPane().add(Saran2);
        Saran2.setBounds(180, 440, 360, 26);
        getContentPane().add(Saran1);
        Saran1.setBounds(180, 400, 360, 26);

        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 45, 16);

        jLabel4.setText("TINGGI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 44, 16);

        jLabel5.setText("BERAT BADAN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 180, 90, 16);

        jLabel6.setText("JENIS KELAMIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 230, 100, 16);

        jLabel7.setBackground(new java.awt.Color(0, 255, 204));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 370, 170, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void OkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeActionPerformed
        // TODO add your handling code here:
        try{
        int ti = Integer.valueOf(Tinggi.getText());
        int bt = Integer.valueOf(Berat.getText());
        int hasil = 0;
        
        if(Laki.isSelected()){
            hasil = (ti - 100)*1;
            
       }else if(Perempuan.isSelected()){
           hasil = (ti - 104)*1;
           
           
       }
        String temp = Integer.toString(hasil);
        if(hasil < bt){
            TA.setText(temp);
            Saran1.setText("Maaf " + Nama.getText()+" , Sepertinnya Anda OverWeight");
            Saran2.setText("Banyaklah Bertaubat");
        }else if(hasil > bt){
            TA.setText(temp);
            Saran1.setText("Maaf " + Nama.getText()+" , Sepertinnya Anda UnderWeight");
            Saran2.setText("Banyaklah mengkonsumsi jajan di kantin");
            
        }else{
            TA.setText(temp);
           Saran1.setText("Halo " + Nama.getText()+" , Berat badan Anda sudah IDEAL");
            Saran2.setText("Lanjutkan BANG"); 
        }}catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "kurang teliti bang");
        }        
    }//GEN-LAST:event_OkeActionPerformed

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
            java.util.logging.Logger.getLogger(Uji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Oke;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JTextField Saran1;
    private javax.swing.JTextField Saran2;
    private javax.swing.JTextField TA;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.ButtonGroup rr;
    // End of variables declaration//GEN-END:variables
}

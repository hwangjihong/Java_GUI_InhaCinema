package main;

import java.awt.Color;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 달나라공쥬
 */
public class ReserveFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReserveFrame
     */
    public ReserveFrame() {
        initComponents();
        btn_back.setBackground(new Color(255,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(125, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 350, 45));

        jButton3.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton3.setText("+");
        jButton3.setBorder(null);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 425, 45, 45));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 425, 60, 45));

        jButton4.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton4.setText("-");
        jButton4.setBorder(null);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 425, 45, 45));

        jComboBox2.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 350, 45));

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton1.setText("-");
        jButton1.setBorder(null);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 45, 45));

        jButton2.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton2.setText("+");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 360, 45, 45));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 60, 45));

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 340, 45));

        jButton5.setBackground(new java.awt.Color(40, 71, 192));
        jButton5.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("좌석 선택");
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 300, 45));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back1.png"))); // NOI18N
        btn_back.setContentAreaFilled(false);
        btn_back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back2.png"))); // NOI18N
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/reserve.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SeatFrame frame = new SeatFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
package main;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public class ReserveFrame extends javax.swing.JFrame {

    private User user;
    private Movie movie;
    
    public ReserveFrame() {
        initComponents();
        setLocationRelativeTo(null);
        btnBack.setBackground(new Color(255,0,0,0));
    }
    public ReserveFrame(User user, Movie movie) {
        this.user = user;
        this.movie = movie;
        initComponents();
        setLocationRelativeTo(null);
        btnBack.setBackground(new Color(255,0,0,0));
        
        lblTitle.setText(movie.getMovieTitle());
        lblTheme.setText(movie.getMovieTheme());
        lblRunTime.setText(movie.getRunTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/reserve.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        cbTime = new javax.swing.JComboBox<>();
        btnAdultCountM = new javax.swing.JButton();
        lblAdultCount = new javax.swing.JLabel();
        btnAdultCountP = new javax.swing.JButton();
        cbDate = new javax.swing.JComboBox<>();
        btnChildCountM = new javax.swing.JButton();
        btnChildCountP = new javax.swing.JButton();
        lblChildCount = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnPoster = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/poster/" + movie.getPoster())).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        lblRunTime = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTheme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(125, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTime.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        cbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 350, 45));

        btnAdultCountM.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnAdultCountM.setText("+");
        btnAdultCountM.setBorder(null);
        jPanel1.add(btnAdultCountM, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 425, 45, 45));

        lblAdultCount.setBackground(new java.awt.Color(255, 255, 255));
        lblAdultCount.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblAdultCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdultCount.setText("0");
        lblAdultCount.setOpaque(true);
        jPanel1.add(lblAdultCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 425, 60, 45));

        btnAdultCountP.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnAdultCountP.setText("-");
        btnAdultCountP.setBorder(null);
        jPanel1.add(btnAdultCountP, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 425, 45, 45));

        cbDate.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        cbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 350, 45));

        btnChildCountM.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnChildCountM.setText("-");
        btnChildCountM.setBorder(null);
        jPanel1.add(btnChildCountM, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 45, 45));

        btnChildCountP.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnChildCountP.setText("+");
        btnChildCountP.setBorder(null);
        jPanel1.add(btnChildCountP, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 360, 45, 45));

        lblChildCount.setBackground(new java.awt.Color(255, 255, 255));
        lblChildCount.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblChildCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChildCount.setText("0");
        lblChildCount.setOpaque(true);
        jPanel1.add(lblChildCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 60, 45));

        lblPrice.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 340, 45));

        btnSelect.setBackground(new java.awt.Color(40, 71, 192));
        btnSelect.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("좌석 선택");
        btnSelect.setBorder(null);
        btnSelect.setFocusable(false);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 300, 45));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back1.png"))); // NOI18N
        btnBack.setContentAreaFilled(false);
        btnBack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 80));

        pnPoster.setMinimumSize(new java.awt.Dimension(286, 429));
        pnPoster.setPreferredSize(new java.awt.Dimension(286, 429));
        jPanel1.add(pnPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 286, 429));

        lblRunTime.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        lblRunTime.setForeground(new java.awt.Color(255, 255, 255));
        lblRunTime.setText("시간");
        jPanel1.add(lblRunTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        lblTitle.setFont(new java.awt.Font("맑은 고딕", 0, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("제목");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, -1));

        lblTheme.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        lblTheme.setForeground(new java.awt.Color(255, 255, 255));
        lblTheme.setText("장르");
        jPanel1.add(lblTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        SeatFrame frame = new SeatFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainFrame frame = new MainFrame(user);
	frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**s
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
    private javax.swing.JButton btnAdultCountM;
    private javax.swing.JButton btnAdultCountP;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChildCountM;
    private javax.swing.JButton btnChildCountP;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cbDate;
    private javax.swing.JComboBox<String> cbTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdultCount;
    private javax.swing.JLabel lblChildCount;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRunTime;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnPoster;
    // End of variables declaration//GEN-END:variables
}

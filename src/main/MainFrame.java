package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import swing.ImageItem;

public class MainFrame extends javax.swing.JFrame {

    private  User user;

    public MainFrame() {
        initComponents();
        
        ArrayList<ImageItem> ImgItem = sldImage.getImgItem();
        
        for(int i = 0; i < ImgItem.size(); i++){
            Movie movie = ImgItem.get(i).getMovie();
            ImgItem.get(i).addMouseListener(new MouseAdapter() {      
                @Override
                public void mouseClicked(MouseEvent me) {
                    ReserveFrame frame = new ReserveFrame(user, movie);
                    frame.setVisible(true);
                    dispose();
            }               
        });
        }
    }
    
    public MainFrame(User user) {
        this();
        this.user = user;
        jLabel1.setText(user.getNickname() + "님 반갑습니다");
        setLocationRelativeTo(null); // 프레임 창 화면 가운데
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMypage = new javax.swing.JButton();
        sldImage = new swing.ImageSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InhaCinema");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("한컴 말랑말랑 Regular", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("반갑습니다");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 660, -1));

        btnMypage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/mypage1.png"))); // NOI18N
        btnMypage.setContentAreaFilled(false);
        btnMypage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/mypage2.png"))); // NOI18N
        btnMypage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMypageActionPerformed(evt);
            }
        });
        getContentPane().add(btnMypage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 80, 80));

        sldImage.setOpaque(false);
        getContentPane().add(sldImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1290, 697));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMypageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMypageActionPerformed
        // 마이페이지 버튼 클릭 이벤트
        Mypage frame = new Mypage(user);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMypageActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMypage;
    private javax.swing.JLabel jLabel1;
    private swing.ImageSlider sldImage;
    // End of variables declaration//GEN-END:variables
}

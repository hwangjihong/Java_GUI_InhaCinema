package main;

import java.awt.*;
import javax.swing.*;
import java.sql.SQLException;

public class LoginFrame extends javax.swing.JFrame {
   
    public LoginFrame() {
        initComponents();
        JCaptcha jct = new JCaptcha();      
        lblCaptcha.setIcon(new ImageIcon(jct.JCaptcha()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/login_register.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        txtID = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblCaptcha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("로그인");
        setLocation(new java.awt.Point(125, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setBackground(new java.awt.Color(67, 67, 67));
        txtID.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 153, 153));
        txtID.setText("아이디");
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.setFocusable(false);
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        pnBackground.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 300, 45));

        btnLogin.setBackground(new java.awt.Color(40, 71, 192));
        btnLogin.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("로그인");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnBackground.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 300, 45));

        lblRegister.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("회원가입");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        pnBackground.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 56, -1));

        txtPW.setBackground(new java.awt.Color(67, 67, 67));
        txtPW.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtPW.setForeground(new java.awt.Color(153, 153, 153));
        txtPW.setText("비밀번호");
        txtPW.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPW.setEchoChar((char) 0);
        txtPW.setFocusable(false);
        txtPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWFocusLost(evt);
            }
        });
        txtPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPWMouseClicked(evt);
            }
        });
        txtPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPWKeyTyped(evt);
            }
        });
        pnBackground.add(txtPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 300, 45));

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("로그인");
        pnBackground.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        lblCaptcha.setText("jLabel1");
        pnBackground.add(lblCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, 40));

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        // 회원가입 라벨 클릭 시
        RegisterFrame frame = new RegisterFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // txtID 텍스트 필드 클릭 시
        txtID.setFocusable(true);
        txtID.requestFocus();
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // txtID 텍스트 필드에 키가 입력될 시
        if(txtID.getText().length() > 16) evt.consume();
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtPWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPWKeyTyped
        // txtPW 텍스트 필드에 키가 입력될 시
        if(txtPW.getText().length() > 16) evt.consume();
    }//GEN-LAST:event_txtPWKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // 로그인 버튼 클릭 시
        String id = txtID.getText();
        String pw = txtPW.getText();
        System.out.println(pw);
        if(id.equals("아이디") && id.length() == 0){
            JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
        } else if(pw.equals("비밀번호") && pw.length() == 0){
            JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
        }else{
            DB db = new DB();
            String sql = "SELECT count(*)FROM users WHERE id = ? and pw = md5(?)";
            db.open(sql);
            try {
                db.stmt = db.connect.prepareStatement(sql);
                db.rs = db.stmt.executeQuery();
                while(db.rs.next()){
                System.out.println(db.rs.getString("count(*)"));}
            } catch (SQLException e) {
                System.out.println("asda");
            }
            
            db.close();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPWMouseClicked
        // txtPW 텍스트 필드가 클릭 시
        txtPW.setFocusable(true);
        txtPW.requestFocus();
    }//GEN-LAST:event_txtPWMouseClicked

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // txtID 텍스트 필드가 포커스가 풀릴 시
        if(txtID.getText().length() == 0) txtID.setText("아이디");
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        // txtID 텍스트 필드가 포커스 될 시
        if(txtID.getText().equals("아이디")) txtID.setText(null);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusGained
        // txtPW 텍스트 필가 포커스 될 시
        if(txtPW.getText().equals("비밀번호")){
            txtPW.setText(null);
            txtPW.setEchoChar('●');
        }
    }//GEN-LAST:event_txtPWFocusGained

    private void txtPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWFocusLost
        // txtPW 텍스트 필드가 포커스가 풀릴 시
        if(txtPW.getText().length() == 0){
            txtPW.setText("비밀번호");
            txtPW.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPWFocusLost

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCaptcha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPW;
    // End of variables declaration//GEN-END:variables
}

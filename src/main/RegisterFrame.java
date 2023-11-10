package main;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegisterFrame extends javax.swing.JFrame {
    
    public RegisterFrame() {
        initComponents();
    }
    
    private boolean checkDuplicatedId(String id){
        // 중복 확인
        int rs = 0;
        DB db = new DB();
        String sql = "select exists(select * from users where id = ?) as result";
        try{
            db.open(sql);
            db.stmt.setString(1, id);
            db.rs = db.stmt.executeQuery();
            while(db.rs.next()){
                rs = db.rs.getInt("result");
            }
            db.close();
        }catch(SQLException e){
            System.out.println("Register checkDuplicatedId SQLException : " + e.getMessage());
        }
        return rs == 1;
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
        txtNickName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        txtID = new javax.swing.JTextField();
        txtPWCheck = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("회원가입");
        setLocation(new java.awt.Point(125, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNickName.setBackground(new java.awt.Color(67, 67, 67));
        txtNickName.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtNickName.setForeground(new java.awt.Color(153, 153, 153));
        txtNickName.setText("닉네임");
        txtNickName.setToolTipText("");
        txtNickName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNickName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNickName.setFocusable(false);
        txtNickName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNickNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNickNameFocusLost(evt);
            }
        });
        txtNickName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNickNameMouseClicked(evt);
            }
        });
        txtNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNickNameKeyTyped(evt);
            }
        });
        pnBackground.add(txtNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 300, 45));

        btnRegister.setBackground(new java.awt.Color(40, 71, 192));
        btnRegister.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("회원가입");
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnBackground.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 300, 45));

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("로그인");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        pnBackground.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, -1));

        lblRegister.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("회원가입");
        pnBackground.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

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

        txtPWCheck.setBackground(new java.awt.Color(67, 67, 67));
        txtPWCheck.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtPWCheck.setForeground(new java.awt.Color(153, 153, 153));
        txtPWCheck.setText("비밀번호확인");
        txtPWCheck.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPWCheck.setEchoChar((char) 0);
        txtPWCheck.setFocusable(false);
        txtPWCheck.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWCheckFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWCheckFocusLost(evt);
            }
        });
        txtPWCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPWCheckMouseClicked(evt);
            }
        });
        txtPWCheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPWCheckKeyTyped(evt);
            }
        });
        pnBackground.add(txtPWCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 300, 45));

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // 로그인 라벨 클릭 시
        LoginFrame frame = new LoginFrame(); 
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // 회원가입 버튼 클릭 시
        String id = txtID.getText();
        String pw = txtPW.getText();
        String pwc = txtPWCheck.getText();
        String nickname = txtNickName.getText();

        if (id.equals("아이디")) {
            JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
        } else if (id.length() < 8) {
            JOptionPane.showMessageDialog(null, "아이디는 8자리 이상 입력해주세요.");
        } else if (pw.equals("비밀번호")) {
            JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
        } else if (pw.length() < 8) {
            JOptionPane.showMessageDialog(null, "비밀번호는 8자리 이상 입력해주세요.");
        } else if (nickname.equals("닉네임")) {
            JOptionPane.showMessageDialog(null, "닉네임을 입력해주세요.");
        } else if (nickname.length() < 5) {
            JOptionPane.showMessageDialog(null, "닉네임은 5자리 이상 입력해주세요.");
        } else if (!pw.equals(pwc)) {
            JOptionPane.showMessageDialog(null, "비밀번호 확인이 일치하지 않습니다.");
        } else if(checkDuplicatedId(id)){
            JOptionPane.showMessageDialog(null, "중복된 아이디가 있습니다.");
        } else{
            DB db = new DB();
            String sql = "insert into users (id, pw, nickname) values (?, md5(?), ?)";   
            try {
                db.open(sql);
                db.stmt.setString(1, id);
                db.stmt.setString(2, pw);
                db.stmt.setString(3, nickname);               
                db.stmt.executeUpdate();
                db.close();
                
                JOptionPane.showMessageDialog(null, "회원가입 되었습니다.");
                LoginFrame frame = new LoginFrame();
                frame.setVisible(true);
                dispose();
            } catch (SQLException e) {
                System.out.println("Register SQLException : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // 아이디 텍스트 필드 클릭 시
        txtID.setFocusable(true);
        txtID.requestFocus();
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPWMouseClicked
        // txtPW 텍스트 필드가 클릭 시
        txtPW.setFocusable(true);
        txtPW.requestFocus();
    }//GEN-LAST:event_txtPWMouseClicked

    private void txtPWCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPWCheckMouseClicked
        // txtPWCheck 텍스트 필드가 클릭 시
        txtPWCheck.setFocusable(true);
        txtPWCheck.requestFocus();
    }//GEN-LAST:event_txtPWCheckMouseClicked

    private void txtNickNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickNameMouseClicked
        // txtNickName 텍스트 필드가 클릭 시
        txtNickName.setFocusable(true);
        txtNickName.requestFocus();
    }//GEN-LAST:event_txtNickNameMouseClicked

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

    private void txtPWCheckFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWCheckFocusGained
        // txtPW 텍스트 필가 포커스 될 시
        if(txtPWCheck.getText().equals("비밀번호확인")){
            txtPWCheck.setText(null);
            txtPWCheck.setEchoChar('●');
        }
    }//GEN-LAST:event_txtPWCheckFocusGained

    private void txtPWCheckFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWCheckFocusLost
        // txtPW 텍스트 필드가 포커스가 풀릴 시
        if(txtPWCheck.getText().length() == 0){
            txtPWCheck.setText("비밀번호확인");
            txtPWCheck.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPWCheckFocusLost

    private void txtNickNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickNameFocusGained
        // txtNickName 텍스트 필드가 포커스 될 시
        if(txtNickName.getText().equals("닉네임")) txtNickName.setText(null);
    }//GEN-LAST:event_txtNickNameFocusGained

    private void txtNickNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickNameFocusLost
        // txtID 텍스트 필드가 포커스가 풀릴 시
        if(txtNickName.getText().length() == 0) txtNickName.setText("닉네임");
    }//GEN-LAST:event_txtNickNameFocusLost

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // txtID 텍스트 필드가 포커스가 풀릴 시
        if(txtID.getText().length() == 0) txtID.setText("아이디");
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // txtID 텍스트 필드에 키가 입력될 시
        if(txtID.getText().length() > 16) evt.consume();
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtPWKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPWKeyTyped
        // txtPW 텍스트 필드에 키가 입력될 시
        if(txtPW.getText().length() > 16) evt.consume();
    }//GEN-LAST:event_txtPWKeyTyped

    private void txtPWCheckKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPWCheckKeyTyped
        // txtPWCheck 텍스트 필드에 키가 입력될 시
        if(txtPWCheck.getText().length() > 16) evt.consume();
    }//GEN-LAST:event_txtPWCheckKeyTyped

    private void txtNickNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickNameKeyTyped
        // txtNickName 텍스트 필드에 키가 입력될 시
        if(txtNickName.getText().length() > 10) evt.consume();
    }//GEN-LAST:event_txtNickNameKeyTyped

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
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JPasswordField txtPWCheck;
    // End of variables declaration//GEN-END:variables
}

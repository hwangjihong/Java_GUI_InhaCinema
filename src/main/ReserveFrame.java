package main;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ReserveFrame extends javax.swing.JFrame {

    private User user = null;
    private Movie movie = null;
    private Screening screening = new Screening();
    private int totalPrice;
    
    public ReserveFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public ReserveFrame(User user, Movie movie) {
        this.user = user;
        this.movie = movie;
        initComponents();
        setLocationRelativeTo(null);
        
        lblTitle.setText(movie.getMovieTitle());
        lblTheme.setText(movie.getMovieTheme());
        lblRunTime.setText(movie.getRunTime());
        
        cbDateSetItem();
        cbTimeSetItem();
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
        lblOp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(125, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTime.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jPanel1.add(cbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 250, 45));

        btnAdultCountM.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnAdultCountM.setText("+");
        btnAdultCountM.setBorder(null);
        btnAdultCountM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdultCountM, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 420, 45, 45));

        lblAdultCount.setBackground(new java.awt.Color(255, 255, 255));
        lblAdultCount.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblAdultCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdultCount.setText("0");
        lblAdultCount.setOpaque(true);
        jPanel1.add(lblAdultCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 60, 45));

        btnAdultCountP.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnAdultCountP.setText("-");
        btnAdultCountP.setBorder(null);
        btnAdultCountP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdultCountP, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 45, 45));

        cbDate.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jPanel1.add(cbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 250, 45));

        btnChildCountM.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnChildCountM.setText("-");
        btnChildCountM.setBorder(null);
        btnChildCountM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });
        jPanel1.add(btnChildCountM, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 45, 45));

        btnChildCountP.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        btnChildCountP.setText("+");
        btnChildCountP.setBorder(null);
        btnChildCountP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });
        jPanel1.add(btnChildCountP, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 360, 45, 45));

        lblChildCount.setBackground(new java.awt.Color(255, 255, 255));
        lblChildCount.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblChildCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChildCount.setText("0");
        lblChildCount.setOpaque(true);
        jPanel1.add(lblChildCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 60, 45));

        lblPrice.setFont(new java.awt.Font("맑은 고딕", 0, 36)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 180, 45));

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
        jPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 300, 45));

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
        jPanel1.add(pnPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 286, 429));

        lblRunTime.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        lblRunTime.setForeground(new java.awt.Color(255, 255, 255));
        lblRunTime.setText("시간");
        jPanel1.add(lblRunTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        lblTitle.setFont(new java.awt.Font("맑은 고딕", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("제목");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        lblTheme.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        lblTheme.setForeground(new java.awt.Color(255, 255, 255));
        lblTheme.setText("장르");
        jPanel1.add(lblTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        lblOp.setFont(new java.awt.Font("맑은 고딕", 0, 36)); // NOI18N
        lblOp.setForeground(new java.awt.Color(255, 255, 255));
        lblOp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 40, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // 예매 버튼
        if(totalPrice <= 0){
            JOptionPane.showMessageDialog(null, "인원을 한 명이상 선택해주세요.");
            return;
        }

        screening.setScreeningDate((String )cbDate.getSelectedItem());
        screening.setScreeningTime((String )cbTime.getSelectedItem());
        screening.setChildCount(lblChildCount.getText());
        screening.setAdultCount(lblAdultCount.getText());
        screening.setTotalPrice(totalPrice);
        setScreeningCode(movie.getMovieCode(),screening.getScreeningDate(),screening.getScreeningTime());
        
        SeatFrame frame = new SeatFrame(user, movie, screening);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainFrame frame = new MainFrame(user);
	frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
    // 다른 라벨의 값을 가져오는 메서드
    private int getOtherLabelValue(JLabel currentLabel) {
        // 현재 라벨이 lblChildCount인 경우 lblAdultCount의 값 반환, 그렇지 않으면 lblChildCount의 값 반환
        return (currentLabel == lblChildCount) ? Integer.parseInt(lblAdultCount.getText()) : Integer.parseInt(lblChildCount.getText());
    }
    
    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        // 클릭된 버튼을 가져옴
        JButton clickedButton = (JButton) evt.getSource();
        // 클릭된 버튼에 따라 대상 라벨 선택
        JLabel targetLabel = (clickedButton == btnChildCountM || clickedButton == btnChildCountP) ? lblChildCount : lblAdultCount;
        
        int price = (targetLabel == lblChildCount) ? 10000 : 13000;

        // 대상 라벨의 현재 값
        int currentValue = Integer.parseInt(targetLabel.getText());

        // + 버튼이 클릭되고 최대 예매 인원(6명)을 초과하지 않는 경우
        if (clickedButton.getText().equals("+") && currentValue + getOtherLabelValue(targetLabel) < 6) {
            // 인원 증가
            targetLabel.setText(Integer.toString(currentValue + 1));
            // 가격 증가
            totalPrice = totalPrice+price;
        } 
        // - 버튼이 클릭되고 현재 값이 0보다 큰 경우
        else if (clickedButton.getText().equals("-") && currentValue > 0) {
            // 인원 감소
            targetLabel.setText(Integer.toString(currentValue - 1));
            // 가격 감소
            totalPrice = totalPrice-price;
        }
        // 총 가격 표기
        if(totalPrice <= 0){
            lblPrice.setText("");
            lblOp.setText("");
        }else{
            lblPrice.setText(Integer.toString(totalPrice));
            lblOp.setText("₩");
        }
    }//GEN-LAST:event_btnCountActionPerformed

    private void cbDateSetItem(){
        DB db = new DB();
        String sql = "SELECT DISTINCT screeningDate FROM screening WHERE movieCode = ?";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setInt(1, movie.getMovieCode());
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                cbDate.addItem(db.rs.getString("screeningDate"));
            }
        } catch(SQLException e) {
            System.out.println("cbDateSetItem SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    private void cbTimeSetItem(){
        DB db = new DB();
        String sql = "SELECT DISTINCT screeningTime FROM screening WHERE movieCode = ?";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setInt(1, movie.getMovieCode());
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                cbTime.addItem(db.rs.getString("screeningTime"));
            }
        } catch(SQLException e) {
            System.out.println("cbDateSetItem SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    private void setScreeningCode(int movieCode, String screeningDate, String screeningTime){
        DB db = new DB();
        String sql = "SELECT screeningCode FROM screening WHERE movieCode = ? AND screeningDate = ? AND screeningTime = ?";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setInt(1, movie.getMovieCode());
            db.stmt.setString(2, screeningDate);
            db.stmt.setString(3, screeningTime);
            db.rs = db.stmt.executeQuery();
            
            if(db.rs.next()) {
                screening.setScreeningCode(db.rs.getInt("screeningCode"));
            }
        } catch(SQLException e) {
            System.out.println("setScreeningCode SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
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
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRunTime;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnPoster;
    // End of variables declaration//GEN-END:variables
}

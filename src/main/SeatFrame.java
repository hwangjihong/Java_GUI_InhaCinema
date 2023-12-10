package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
public class SeatFrame extends javax.swing.JFrame {
    
    private User user = null;
    private Movie movie = null;
    private Screening screening = null;
    
    private int button_x, button_y;
    private ArrayList<Integer> reservedSeat = new ArrayList<>();
    private ArrayList<Integer> selectedSeat = new ArrayList<>();
    private int choiceCount, personnel = 0;
    
    public SeatFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public SeatFrame(User user, Movie movie, Screening screening) {
        this.user = user;
        this.movie = movie;
        this.screening = screening;
        
        initComponents();
        setLocationRelativeTo(null); 
        
        lblDate.setText(screening.getScreeningDate());
        lblTime.setText(screening.getScreeningTime());
        lblChild.setText(screening.getChildCount());
        lblAdult.setText(screening.getAdultCount());
        lblPrice.setText(Integer.toString(screening.getTotalPrice()));
        
        // 예매 인원 수
        personnel = Integer.parseInt(screening.getChildCount()) + Integer.parseInt(screening.getAdultCount());
        System.out.println(personnel);
        
        button_x = 620;
        button_y = 175;

        // 이미 예약 된 좌석번호 찾기
        this.getSeat();
        
        // 버튼 배치
        JToggleButton[][] jb = new JToggleButton[10][8];
        
        for(int i = 0; i < jb.length; i++){         
            for(int j = 0; j < jb[0].length; j++){
                int seatNum = j * 10 + i;   // 좌석번호
                jb[i][j] = new JToggleButton((char) (65 + j) + "" + i); // 아스키
                jb[i][j].setBorder(null);
                // 이미 예약 된 좌석의 배경이미지
                if(reservedSeat.contains(seatNum) == true){
                    jb[i][j].setText("");
                    jb[i][j].setEnabled(false);
                    jb[i][j].setIcon(new ImageIcon(getClass().getResource("/image/button/seat3.png")));
                } else{ //버튼 마우스 이벤트
                    jb[i][j].addMouseListener(new MouseAdapter() {
                    // 마우스 눌렀을 때 이벤트
                        public void mouseClicked(MouseEvent e) {
                            JToggleButton button = (JToggleButton) e.getSource();
                            if (personnel == choiceCount) {
                                // 예매인원의 좌석을 전부 선택했을때
                                System.out.println(personnel);
                                System.out.println(choiceCount);
                                if (selectedSeat.contains(seatNum)) {
                                    // 눌려있는 버튼을 또 눌렀을때
                                    choiceCount -= 1;
                                    selectedSeat.remove((Integer) (seatNum));
                                    button.setBackground(null);
                                } else {
                                    // 눌려있지 않는 버튼을 눌렀을때
                                    button.setSelected(false);
                                    JOptionPane.showMessageDialog(null, "모두 선택하셨습니다.");
                                }
                            } else {
                                // 아직 예매인원의 좌석을 전부 선택하지 않았을 때
                                if (selectedSeat.contains(seatNum)) {     // 이미 눌려있는 버튼을 눌렸을때
                                    choiceCount -= 1;
                                    selectedSeat.remove((Integer) (seatNum));
                                    button.setBackground(null);
                                } else {                                    // 눌려있지 않는 버튼을 눌렀을때
                                    choiceCount += 1;
                                    System.out.println(choiceCount);
                                    selectedSeat.add(seatNum);
                                    button.setBackground(new Color(40, 71, 192));
                                }
                            }
                        }
                        
                        // 커서가 올라갔을때
                        public void mouseEntered(MouseEvent e) {
                            JToggleButton button = (JToggleButton) e.getSource();
                            if(button.isSelected()==false && personnel!=choiceCount)    // 해당 버튼이 눌려있지 않으면서
                            {                                                           // 아직 인원을 채우지 않았을 때
                                button.setBackground(new Color(40,71,192));
                            }
                        }

                        // 커서가 벗어났을때
                        public void mouseExited(MouseEvent e) {
                            JToggleButton button = (JToggleButton) e.getSource();
                            if(button.isSelected()==false)
                            {
                                button.setBackground(null);
                            }

                        }
                        
                    });
                }
                pnBackground.add(jb[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(button_x , button_y, 40, 40));
                button_y += 52;
            }
            if(i == 2 || i == 6) button_x += 85; else button_x += 40;            
            button_y = 175;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        payment = new javax.swing.JDialog();
        pbPaymetnBackGound = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/payment.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnBackground = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/seat.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        lblOp = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblChild = new javax.swing.JLabel();
        lblAdult = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_select = new javax.swing.JButton();
        btn_select1 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        pnPoster = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/poster/" + movie.getPoster())).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, 180, 270, null);//background를 그려줌
            }
        };

        payment.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        payment.setModal(true);
        payment.setResizable(false);
        payment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbPaymetnBackGound.setPreferredSize(new java.awt.Dimension(600, 400));
        pbPaymetnBackGound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "은행선택", "국민은행", "우리은행", "기업은행", "신한은행", "농협은행", "하나은행", "카카오뱅크" }));
        pbPaymetnBackGound.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 150, -1));
        pbPaymetnBackGound.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 260, 110, -1));
        pbPaymetnBackGound.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 160, 200, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("YYYY");
        pbPaymetnBackGound.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("MM");
        pbPaymetnBackGound.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, -1));

        jButton1.setBackground(new java.awt.Color(40, 71, 192));
        jButton1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("결제");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pbPaymetnBackGound.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 348, 150, 40));

        payment.getContentPane().add(pbPaymetnBackGound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InhaCinema");
        setLocation(new java.awt.Point(125, 30));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOp.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblOp.setForeground(new java.awt.Color(255, 255, 255));
        lblOp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp.setText("₩ ");
        pnBackground.add(lblOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 553, 40, 25));

        lblPrice.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnBackground.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 553, 80, 25));

        lblDate.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText(" - - ");
        pnBackground.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 200, 25));

        lblTime.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText(" : ");
        pnBackground.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 25));

        lblChild.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblChild.setForeground(new java.awt.Color(255, 255, 255));
        lblChild.setText("0");
        pnBackground.add(lblChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 200, 25));

        lblAdult.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblAdult.setForeground(new java.awt.Color(255, 255, 255));
        lblAdult.setText("0");
        pnBackground.add(lblAdult, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 200, 25));

        jButton5.setBackground(new java.awt.Color(40, 71, 192));
        jButton5.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("결제");
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnBackground.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 300, 45));

        btn_select.setBackground(new java.awt.Color(67, 67, 67));
        btn_select.setBorder(null);
        btn_select.setEnabled(false);
        btn_select.setFocusable(false);
        btn_select.setSelected(true);
        pnBackground.add(btn_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 40, 40));

        btn_select1.setBackground(new java.awt.Color(40, 71, 192));
        btn_select1.setBorder(null);
        btn_select1.setFocusable(false);
        pnBackground.add(btn_select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 40, 40));

        btn_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back3.png"))); // NOI18N
        btn_back.setContentAreaFilled(false);
        btn_back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back4.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pnBackground.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 80));

        javax.swing.GroupLayout pnPosterLayout = new javax.swing.GroupLayout(pnPoster);
        pnPoster.setLayout(pnPosterLayout);
        pnPosterLayout.setHorizontalGroup(
            pnPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        pnPosterLayout.setVerticalGroup(
            pnPosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        pnBackground.add(pnPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 270));

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // 뒤로가기 버튼
        int userChoice = JOptionPane.showConfirmDialog(
                null,
                "예매 정보가 사라집니다. 계속하시겠습니까?",
                "확인",
                JOptionPane.YES_NO_OPTION
        );
        if (userChoice != JOptionPane.YES_OPTION) return;
 
        ReserveFrame frame = new ReserveFrame(user, movie);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // 결제 버튼
        if (personnel != choiceCount) {
            JOptionPane.showMessageDialog(null, "선택하신 좌석의 수가 올바르지 않습니다.");
            return;
        } else {
            //다이얼로그를 크기 정의
            payment.setSize(600,445);
            //다이얼로그를 화면 중앙에 위치시키기
            Dimension parentSize = this.getSize();
            Point parentLocation = this.getLocation();
            payment.setLocation(
                parentLocation.x + (parentSize.width - payment.getWidth()) / 2,
                parentLocation.y + (parentSize.height - payment.getHeight()) / 2
            );
            payment.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 찐 결제 버튼
        String uuid = UUID.randomUUID().toString(); // groupID 설정
        
        for(int seatCode : selectedSeat){   // 예매
            reserveInsert(seatCode,uuid);
        }
        payment.setVisible(false);
        MainFrame frame = new MainFrame(user);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // 이미 예매 된 좌석번호 추출
    public void getSeat() {
        DB db = new DB();
        String sql = "SELECT * FROM reservation where ScreeningCode = ? and canceled = 0;";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setInt(1, screening.getScreeningCode());
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                this.reservedSeat.add(db.rs.getInt("seatCode"));
            }
        } catch(SQLException e) {
            System.out.println("getSeat SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    // 예매 테이블에 예매 정보 INSERT
    public void reserveInsert(int seatCode, String uuid) {
        DB db = new DB();
        String sql = "INSERT INTO reservation (screeningcode, id, date, canceled, seatcode, groupId) VALUE (?, ?, NOW(), 0, ?, ?);";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setInt(1, screening.getScreeningCode());
            db.stmt.setString(2, user.getId());
            db.stmt.setInt(3, seatCode);
            db.stmt.setString(4, uuid);
            db.stmt.executeUpdate();
        } catch(SQLException e) {
            System.out.println("reserveInsert SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
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
            java.util.logging.Logger.getLogger(SeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_select1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblAdult;
    private javax.swing.JLabel lblChild;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblOp;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTime;
    private javax.swing.JDialog payment;
    private javax.swing.JPanel pbPaymetnBackGound;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnPoster;
    // End of variables declaration//GEN-END:variables
}

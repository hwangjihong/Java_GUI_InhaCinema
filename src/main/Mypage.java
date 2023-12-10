package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Mypage extends javax.swing.JFrame {

    User user;
    String ReDate, movieTitle, ScDate, ScTime, tiketGroupID;
    
    public Mypage() {
        initComponents();
    }
    
    public Mypage(User user) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        
        pnMain.add(pnMypage, "pnMypage");
        pnMain.add(pnReserveInfo, "pnReserveInfo");
        pnMain.add(pnCancel, "pnCancel");
        
        lblName.setText(user.getNickname());
        lblId.setText(user.getId());
        
        tbReserveInfo.getTableHeader().setFont(new Font("한컴 말랑말랑 Bold", Font.BOLD, 18));
        //tbReserveInfo.getTableHeader().setBackground(Color.blue);
        tbReserveInfo.getTableHeader().setForeground(Color.black);
        
        tbCancelInfo.getTableHeader().setFont(new Font("한컴 말랑말랑 Bold", Font.BOLD, 18));
        //tbReserveInfo.getTableHeader().setBackground(Color.blue);
        tbCancelInfo.getTableHeader().setForeground(Color.black);
        
        getReservationInfo();
        getCancelInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnMypage = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/mypage.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        btnReserveInfo = new javax.swing.JButton();
        btnMyInfo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnReserveInfo = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/reversveInfo.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        btnReserveInfo1 = new javax.swing.JButton();
        btnMyInfo1 = new javax.swing.JButton();
        pnTable = new javax.swing.JPanel();
        pnResrveTable = new javax.swing.JPanel();
        spReserveInfo = new javax.swing.JScrollPane();
        tbReserveInfo = new javax.swing.JTable();
        pnCancelTable = new javax.swing.JPanel();
        spCancelInfo = new javax.swing.JScrollPane();
        tbCancelInfo = new javax.swing.JTable();
        btnReserve = new javax.swing.JButton();
        btnCancelList = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnCancel = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/mypage.png")).getImage();
            public void paintComponent(Graphics g) {//그리는 함수
                g.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);//background를 그려줌
            }
        };
        btnCancel = new javax.swing.JButton();
        btnMyInfo2 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnReserveInfo3 = new javax.swing.JButton();
        lblSeatNum = new javax.swing.JLabel();
        lblMvTitle = new javax.swing.JLabel();
        lblMvTime = new javax.swing.JLabel();
        lblPoster = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnMain.setLayout(new java.awt.CardLayout());

        pnMypage.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnMypage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReserveInfo.setBackground(new java.awt.Color(40, 71, 192));
        btnReserveInfo.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
        btnReserveInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnReserveInfo.setText("예매 정보");
        btnReserveInfo.setBorder(null);
        btnReserveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveInfoActionPerformed(evt);
            }
        });
        pnMypage.add(btnReserveInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 240, 50));

        btnMyInfo.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
        btnMyInfo.setText("내 정보");
        btnMyInfo.setBorder(null);
        btnMyInfo.setEnabled(false);
        btnMyInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyInfoActionPerformed(evt);
            }
        });
        pnMypage.add(btnMyInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 240, 50));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back3.png"))); // NOI18N
        btnBack.setContentAreaFilled(false);
        btnBack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back4.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnMypage.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 90, 80));

        lblId.setFont(new java.awt.Font("맑은 고딕", 1, 40)); // NOI18N
        lblId.setText("ID");
        pnMypage.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 370, 60));

        lblName.setFont(new java.awt.Font("맑은 고딕", 1, 40)); // NOI18N
        lblName.setText("Name");
        pnMypage.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 235, 370, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/mypage.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnMypage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pnMain.add(pnMypage, "card2");

        pnReserveInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReserveInfo1.setBackground(new java.awt.Color(40, 71, 192));
        btnReserveInfo1.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
        btnReserveInfo1.setForeground(new java.awt.Color(255, 255, 255));
        btnReserveInfo1.setText("예매 정보");
        btnReserveInfo1.setBorder(null);
        btnReserveInfo1.setEnabled(false);
        pnReserveInfo.add(btnReserveInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 240, 50));

        btnMyInfo1.setBackground(new java.awt.Color(40, 71, 192));
        btnMyInfo1.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
        btnMyInfo1.setForeground(new java.awt.Color(255, 255, 255));
        btnMyInfo1.setText("내 정보");
        btnMyInfo1.setBorder(null);
        btnMyInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyInfoActionPerformed(evt);
            }
        });
        pnReserveInfo.add(btnMyInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 240, 50));

        pnTable.setLayout(new java.awt.CardLayout());

        pnResrveTable.setPreferredSize(new java.awt.Dimension(40, 380));

        tbReserveInfo.setFont(new java.awt.Font("한컴 말랑말랑 Regular", 0, 14)); // NOI18N
        tbReserveInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "예매날짜", "영화제목", "상영날짜", "상영시간"
            }
        )
        {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
    );
    tbReserveInfo.setRowHeight(35);
    tbReserveInfo.setShowHorizontalLines(true);
    tbReserveInfo.getTableHeader().setReorderingAllowed(false);
    tbReserveInfo.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbReserveInfoMouseClicked(evt);
        }
    });
    spReserveInfo.setViewportView(tbReserveInfo);

    javax.swing.GroupLayout pnResrveTableLayout = new javax.swing.GroupLayout(pnResrveTable);
    pnResrveTable.setLayout(pnResrveTableLayout);
    pnResrveTableLayout.setHorizontalGroup(
        pnResrveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 640, Short.MAX_VALUE)
        .addGroup(pnResrveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spReserveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
    );
    pnResrveTableLayout.setVerticalGroup(
        pnResrveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 380, Short.MAX_VALUE)
        .addGroup(pnResrveTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResrveTableLayout.createSequentialGroup()
                .addComponent(spReserveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    pnTable.add(pnResrveTable, "card2");

    tbCancelInfo.setFont(new java.awt.Font("한컴 말랑말랑 Regular", 0, 14)); // NOI18N
    tbCancelInfo.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "예매날짜", "영화제목", "취소날짜"
        }
    )
    {
        boolean[] canEdit = new boolean [] {
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    }
    );
    tbCancelInfo.setRowHeight(35);
    tbCancelInfo.setShowHorizontalLines(true);
    tbCancelInfo.getTableHeader().setReorderingAllowed(false);
    spCancelInfo.setViewportView(tbCancelInfo);

    javax.swing.GroupLayout pnCancelTableLayout = new javax.swing.GroupLayout(pnCancelTable);
    pnCancelTable.setLayout(pnCancelTableLayout);
    pnCancelTableLayout.setHorizontalGroup(
        pnCancelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnCancelTableLayout.createSequentialGroup()
            .addComponent(spCancelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    pnCancelTableLayout.setVerticalGroup(
        pnCancelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnCancelTableLayout.createSequentialGroup()
            .addComponent(spCancelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pnTable.add(pnCancelTable, "card3");

    pnReserveInfo.add(pnTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 640, 380));

    btnReserve.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 18)); // NOI18N
    btnReserve.setText("예매내역");
    btnReserve.setBorder(null);
    btnReserve.setEnabled(false);
    btnReserve.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnReserveActionPerformed(evt);
        }
    });
    pnReserveInfo.add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 100, 40));

    btnCancelList.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 18)); // NOI18N
    btnCancelList.setText("취소내역");
    btnCancelList.setBorder(null);
    btnCancelList.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelListActionPerformed(evt);
        }
    });
    pnReserveInfo.add(btnCancelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 100, 40));

    btnBack2.setBackground(new java.awt.Color(0, 0, 0));
    btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back3.png"))); // NOI18N
    btnBack2.setContentAreaFilled(false);
    btnBack2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back4.png"))); // NOI18N
    btnBack2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });
    pnReserveInfo.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 90, 80));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/reversveInfo.png"))); // NOI18N
    jLabel2.setText("jLabel1");
    jLabel2.setPreferredSize(new java.awt.Dimension(1280, 720));
    pnReserveInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

    pnMain.add(pnReserveInfo, "card3");

    pnCancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnCancel.setBackground(new java.awt.Color(153, 153, 153));
    btnCancel.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
    btnCancel.setForeground(new java.awt.Color(255, 255, 255));
    btnCancel.setText("예매 취소");
    btnCancel.setBorder(null);
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelActionPerformed(evt);
        }
    });
    pnCancel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 240, 50));

    btnMyInfo2.setBackground(new java.awt.Color(40, 71, 192));
    btnMyInfo2.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
    btnMyInfo2.setForeground(new java.awt.Color(255, 255, 255));
    btnMyInfo2.setText("내 정보");
    btnMyInfo2.setBorder(null);
    btnMyInfo2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnMyInfoActionPerformed(evt);
        }
    });
    pnCancel.add(btnMyInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 240, 50));

    btnBack1.setBackground(new java.awt.Color(0, 0, 0));
    btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back3.png"))); // NOI18N
    btnBack1.setContentAreaFilled(false);
    btnBack1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/back4.png"))); // NOI18N
    btnBack1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });
    pnCancel.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 90, 80));

    btnReserveInfo3.setBackground(new java.awt.Color(40, 71, 192));
    btnReserveInfo3.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
    btnReserveInfo3.setForeground(new java.awt.Color(255, 255, 255));
    btnReserveInfo3.setText("예매 정보");
    btnReserveInfo3.setBorder(null);
    btnReserveInfo3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnReserveInfoActionPerformed(evt);
        }
    });
    pnCancel.add(btnReserveInfo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 240, 50));

    lblSeatNum.setFont(new java.awt.Font("한컴 말랑말랑 Bold", 0, 24)); // NOI18N
    pnCancel.add(lblSeatNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 360, 40));

    lblMvTitle.setFont(new java.awt.Font("한컴 말랑말랑 Regular", 0, 24)); // NOI18N
    lblMvTitle.setText("Title");
    pnCancel.add(lblMvTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 250, 40));

    lblMvTime.setFont(new java.awt.Font("한컴 말랑말랑 Regular", 0, 24)); // NOI18N
    lblMvTime.setText("Date Time");
    pnCancel.add(lblMvTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 250, 40));
    pnCancel.add(lblPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 80, 120));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/cancel.png"))); // NOI18N
    jLabel3.setText("jLabel1");
    jLabel3.setPreferredSize(new java.awt.Dimension(1280, 720));
    pnCancel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

    pnMain.add(pnCancel, "card2");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // 뒤로가기 버튼
        MainFrame frame = new MainFrame(user);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReserveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveInfoActionPerformed
        // 예매정보 버튼
        CardLayout card = (CardLayout)pnMain.getLayout();
        card.show(pnMain, "pnReserveInfo");
    }//GEN-LAST:event_btnReserveInfoActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // 예매내역
        btnReserve.setEnabled(false);
        btnCancelList.setEnabled(true);
        CardLayout card = (CardLayout)pnTable.getLayout();
        card.next(pnTable);
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnCancelListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelListActionPerformed
        // 취소내역
        btnCancelList.setEnabled(false);
        btnReserve.setEnabled(true);
        CardLayout card = (CardLayout)pnTable.getLayout();
        card.next(pnTable);
    }//GEN-LAST:event_btnCancelListActionPerformed

    private void tbReserveInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReserveInfoMouseClicked
        // 영화 예매 항목 클릭
        if (evt.getClickCount() == 2) {     // 더블클릭 수행 시
            int row = tbReserveInfo.rowAtPoint(evt.getPoint());         // 해당 row
            int col = tbReserveInfo.columnAtPoint(evt.getPoint());      // col 추출

            if (row >= 0 && col >= 0) {
                CardLayout card = (CardLayout)pnMain.getLayout();
                card.show(pnMain, "pnCancel");

                lblSeatNum.setText("");   // 좌석 초기화
                getTiketInfo(tbReserveInfo.getValueAt(row, 0).toString());  // 티켓 정보 추출
            }
        }
    }//GEN-LAST:event_tbReserveInfoMouseClicked

    private void btnMyInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyInfoActionPerformed
        // 내 정보 버튼
        CardLayout card = (CardLayout)pnMain.getLayout();
        card.show(pnMain, "pnMypage");
    }//GEN-LAST:event_btnMyInfoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // 예매 취소 버튼
        int userChoice = JOptionPane.showConfirmDialog(
                null,
                "정말로 예매를 취소하시겠습니까?",
                "확인",
                JOptionPane.YES_NO_OPTION
        );
        if (userChoice != JOptionPane.YES_OPTION) return;
        
        // 예매 취소
        cancelTiket(tiketGroupID);
        
        // 프레임 갱신
        Mypage frame = new Mypage(user);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void getReservationInfo(){
        DB db = new DB();
        String sql = "SELECT r.groupID, MIN(r.date) AS ReservationDate, m.title AS MovieTitle, " +
                          "s.screeningDate AS ScreeningDate, s.screeningTime AS ScreeningTime " +
                          "FROM inhaCinema.reservation r " +
                          "JOIN inhaCinema.screening s ON r.ScreeningCode = s.screeningCode " +
                          "JOIN inhaCinema.movie m ON s.movieCode = m.code " +
                          "WHERE r.Id = ? AND r.canceled = 0 " +
                          "GROUP BY r.groupID, m.title, s.screeningDate, s.screeningTime";     // Screening, Movie, Reservation 3개의 테이블을 JOIN
        try {                                                                                  // 예매 취소가 안되어 있는 예매 정보 추출
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setString(1, user.getId());
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                DefaultTableModel rowData = (DefaultTableModel) tbReserveInfo.getModel();
                
                String reservationDate = db.rs.getString("ReservationDate"); // 예매 날짜
                String movieTitle = db.rs.getString("MovieTitle");           // 영화 제목
                String screeningDate = db.rs.getString("ScreeningDate");     // 상영 날짜
                String screeningTime = db.rs.getString("ScreeningTime");     // 상영 시간
                
                rowData.addRow(new Object[]{reservationDate, movieTitle, screeningDate, screeningTime});
            }
        } catch(SQLException e) {
            System.out.println("getSeat SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    private void getCancelInfo(){
        DB db = new DB();
        String sql = "SELECT r.groupID, MIN(r.date) AS ReservationDate, m.title AS MovieTitle, " +
                          "s.screeningDate AS ScreeningDate, s.screeningTime AS ScreeningTime, r.cancelTime AS CancelTime " +
                          "FROM inhaCinema.reservation r " +
                          "JOIN inhaCinema.screening s ON r.ScreeningCode = s.screeningCode " +
                          "JOIN inhaCinema.movie m ON s.movieCode = m.code " +
                          "WHERE r.Id = ? AND r.canceled = 1 " +
                          "GROUP BY r.groupID, m.title, s.screeningDate, s.screeningTime, r.cancelTime";     // Screening, Movie, Reservation 3개의 테이블을 JOIN
        try {                                                                                  // 예매 취소가 되어 있는 예매 정보 추출
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setString(1, user.getId());
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                DefaultTableModel rowData = (DefaultTableModel) tbCancelInfo.getModel();
                
                String reservationDate = db.rs.getString("ReservationDate"); // 예매 날짜
                String movieTitle = db.rs.getString("MovieTitle");           // 영화 제목
                String cancelTime = db.rs.getString("CancelTime");           // 취소 날짜, 시각
                
                rowData.addRow(new Object[]{reservationDate, movieTitle, cancelTime});
            }
        } catch(SQLException e) {
            System.out.println("getSeat SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    private String getGroupID(String date){
        DB db = new DB();
        String sql = "SELECT DISTINCT groupId FROM inhaCinema.reservation WHERE ID= ? AND date=?";      // groupID 추출
        String groupID = null;
        
        try {             
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setString(1, user.getId());     // 사용자 ID
            db.stmt.setString(2, date);         // groupId
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                tiketGroupID = groupID =  db.rs.getString("groupId");
                return groupID =  db.rs.getString("groupId");         // groupID
            }
        } catch(SQLException e) {
            System.out.println("getSeat SQLException : " + e.getMessage());
        } finally {
            db.close();
            return groupID;
        }
    }
    
    private void getTiketInfo(String date){
        DB db = new DB();
        String sql = "SELECT m.title AS MovieTitle, m.poster AS MoviePoster, s.screeningDate AS ScreeningDate, s.screeningTime AS ScreeningTime, r.seatCode AS SeatNum "+
                     "FROM inhaCinema.reservation r "+
                     "JOIN inhaCinema.screening s ON r.ScreeningCode = s.screeningCode "+
                     "JOIN inhaCinema.movie m ON s.movieCode = m.code "+
                     "WHERE r.groupId= ?";                      // Screening, Movie, Reservation 3개의 테이블을 JOIN
        try {                                                   // 해당 영화 티켓 추출
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setString(1, getGroupID(date));         // groupId
            db.rs = db.stmt.executeQuery();
            
            while(db.rs.next()) {
                String moviePoster = db.rs.getString("MoviePoster");         // 영화 포스터
                String movieTitle = db.rs.getString("MovieTitle");           // 영화 제목
                String screeningDate = db.rs.getString("ScreeningDate");     // 상영 날짜
                String screeningTime = db.rs.getString("ScreeningTime");     // 상영 시간
                int seatNum = db.rs.getInt("SeatNum");                       // 좌석 번호
                String seatName = (char)(65 + Math.floorDiv(seatNum, 10)) + Integer.toString(seatNum % 10);       // 좌석 번호를 변환

                String imagePath = "/image/poster/" + moviePoster;  // 포스터 이미지 경로

                // 이미지를 80x120 크기로 변환하여 ImageIcon 생성
                ImageIcon icon = createResizedImageIcon(imagePath, 80, 120);
                
                lblPoster.setIcon(icon);                                    // poster 이미지 삽입
                lblMvTitle.setText(movieTitle);                         // 영화 제목 삽입
                lblMvTime.setText(screeningDate + " | " + screeningTime);   // 영화 상영 날짜, 시간 삽입
                lblSeatNum.setText(lblSeatNum.getText() + " " + seatName);  // 좌석 삽입
            }
        } catch(SQLException e) {
            System.out.println("getSeat SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
    }
    
    // 이미지 아이콘 변환 메서드
    private static ImageIcon createResizedImageIcon(String imagePath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(Mypage.class.getResource(imagePath));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
    private void cancelTiket(String groupID){
        DB db = new DB();
        String sql = "UPDATE inhaCinema.reservation SET canceled = 1, cancelTime = NOW() WHERE groupID = ?";
        
        try {
            db.open();
            db.stmt = db.connect.prepareStatement(sql);
            db.stmt.setString(1, groupID);
            db.stmt.executeUpdate();
        } catch(SQLException e) {
            System.out.println("reserveInsert SQLException : " + e.getMessage());
        } finally {
            db.close();
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mypage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelList;
    private javax.swing.JButton btnMyInfo;
    private javax.swing.JButton btnMyInfo1;
    private javax.swing.JButton btnMyInfo2;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnReserveInfo;
    private javax.swing.JButton btnReserveInfo1;
    private javax.swing.JButton btnReserveInfo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMvTime;
    private javax.swing.JLabel lblMvTitle;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JLabel lblSeatNum;
    private javax.swing.JPanel pnCancel;
    private javax.swing.JPanel pnCancelTable;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMypage;
    private javax.swing.JPanel pnReserveInfo;
    private javax.swing.JPanel pnResrveTable;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane spCancelInfo;
    private javax.swing.JScrollPane spReserveInfo;
    private javax.swing.JTable tbCancelInfo;
    private javax.swing.JTable tbReserveInfo;
    // End of variables declaration//GEN-END:variables
}

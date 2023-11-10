package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import scrollBar.ScrollBar;

public class ImageSlider extends javax.swing.JPanel {

    private final MigLayout imageLayout;
    private ScrollBar sb = new ScrollBar();
    public ImageSlider() {
        initComponents();
        imageLayout = new MigLayout("aligny center", "25[]25");
        pnItem.setLayout(imageLayout);      
        sb.setOrientation(ScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sb);
        addImage();
    }
    public ScrollBar getSb(){
        return sb;
    }
    private void addImage() {
        pnItem.add(getItem(new ImageIcon(getClass().getResource("/Image/poster/movie-1.jpg")), 1), "w 286, h 476");
        pnItem.add(getItem(new ImageIcon(getClass().getResource("/Image/poster/movie-2.jpg")), 2), "w 286, h 476");
    }

    private ImageItem getItem(Icon icon, int movieID) {
        return new ImageItem(icon, imageLayout, movieID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane()
        ;
        pnItem = new javax.swing.JPanel(){
            Image img = new ImageIcon(getClass().getResource("/image/background/main.png")).getImage();
            @Override
            public void paintComponent(Graphics g)
            {
                g.drawImage(img, 0, 0, getSize().width, getSize().height, null);
            }
        };

        jScrollPane1.setBorder(null);

        javax.swing.GroupLayout pnItemLayout = new javax.swing.GroupLayout(pnItem);
        pnItem.setLayout(pnItemLayout);
        pnItemLayout.setHorizontalGroup(
            pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        pnItemLayout.setVerticalGroup(
            pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        if (pnItem != null) {
            pnItem.setBackground(color);
            jScrollPane1.getHorizontalScrollBar().setBackground(color);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnItem;
    // End of variables declaration//GEN-END:variables
}

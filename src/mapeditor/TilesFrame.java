/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeditor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Leandro
 */
public class TilesFrame extends javax.swing.JFrame {

    /**
     * Creates new form TilesFrame
     */
    public TilesFrame() {
        initComponents();
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnColorBackGround() {
        return btnColorBackGround;
    }

    public void setBtnColorBackGround(JButton btnColorBackGround) {
        this.btnColorBackGround = btnColorBackGround;
    }

    public JButton getBtnColorBorder() {
        return btnColorBorder;
    }

    public void setBtnColorBorder(JButton btnColorBorder) {
        this.btnColorBorder = btnColorBorder;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public void setBtnOk(JButton btnOk) {
        this.btnOk = btnOk;
    }

    public JRadioButton getBtnRadio128x128() {
        return btnRadio128x128;
    }

    public void setBtnRadio128x128(JRadioButton btnRadio128x128) {
        this.btnRadio128x128 = btnRadio128x128;
    }

    public JRadioButton getBtnRadio32x32() {
        return btnRadio32x32;
    }

    public void setBtnRadio32x32(JRadioButton btnRadio32x32) {
        this.btnRadio32x32 = btnRadio32x32;
    }

    public JRadioButton getBtnRadio48x48() {
        return btnRadio48x48;
    }

    public void setBtnRadio48x48(JRadioButton btnRadio48x48) {
        this.btnRadio48x48 = btnRadio48x48;
    }

    public JRadioButton getBtnRadio64x64() {
        return btnRadio64x64;
    }

    public void setBtnRadio64x64(JRadioButton btnRadio64x64) {
        this.btnRadio64x64 = btnRadio64x64;
    }

    public JRadioButton getBtnRadio96x96() {
        return btnRadio96x96;
    }

    public void setBtnRadio96x96(JRadioButton btnRadio96x96) {
        this.btnRadio96x96 = btnRadio96x96;
    }

    public JPanel getDimensionPanel() {
        return dimensionPanel;
    }

    public void setDimensionPanel(JPanel dimensionPanel) {
        this.dimensionPanel = dimensionPanel;
    }

    public JPanel getGridPanel() {
        return gridPanel;
    }

    public void setGridPanel(JPanel gridPanel) {
        this.gridPanel = gridPanel;
    }

    public JLabel getLabelColorBackground() {
        return labelColorBackground;
    }

    public void setLabelColorBackground(JLabel labelColorBackground) {
        this.labelColorBackground = labelColorBackground;
    }

    public JLabel getLabelColorBorder() {
        return labelColorBorder;
    }

    public void setLabelColorBorder(JLabel labelColorBorder) {
        this.labelColorBorder = labelColorBorder;
    }

    public JPanel getMainTilesPanel() {
        return mainTilesPanel;
    }

    public void setMainTilesPanel(JPanel mainTilesPanel) {
        this.mainTilesPanel = mainTilesPanel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTilesPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        dimensionPanel = new javax.swing.JPanel();
        btnRadio32x32 = new javax.swing.JRadioButton();
        btnRadio48x48 = new javax.swing.JRadioButton();
        btnRadio64x64 = new javax.swing.JRadioButton();
        btnRadio96x96 = new javax.swing.JRadioButton();
        btnRadio128x128 = new javax.swing.JRadioButton();
        gridPanel = new javax.swing.JPanel();
        btnColorBackGround = new javax.swing.JButton();
        btnColorBorder = new javax.swing.JButton();
        labelColorBorder = new javax.swing.JLabel();
        labelColorBackground = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTilesPanel.setBackground(new java.awt.Color(153, 153, 153));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titleLabel.setText("Settings Tiles");

        dimensionPanel.setBackground(new java.awt.Color(204, 204, 204));
        dimensionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimension"));

        btnRadio32x32.setText("32x32");
        btnRadio32x32.setActionCommand("32");
        btnRadio32x32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio32x32ActionPerformed(evt);
            }
        });

        btnRadio48x48.setText("48x48");
        btnRadio48x48.setActionCommand("48");
        btnRadio48x48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio48x48ActionPerformed(evt);
            }
        });

        btnRadio64x64.setText("64x64");
        btnRadio64x64.setActionCommand("64");
        btnRadio64x64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio64x64ActionPerformed(evt);
            }
        });

        btnRadio96x96.setText("96x96");
        btnRadio96x96.setActionCommand("96");
        btnRadio96x96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio96x96ActionPerformed(evt);
            }
        });

        btnRadio128x128.setText("128x128");
        btnRadio128x128.setActionCommand("128");

        javax.swing.GroupLayout dimensionPanelLayout = new javax.swing.GroupLayout(dimensionPanel);
        dimensionPanel.setLayout(dimensionPanelLayout);
        dimensionPanelLayout.setHorizontalGroup(
            dimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dimensionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRadio64x64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRadio32x32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadio48x48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadio96x96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadio128x128, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        dimensionPanelLayout.setVerticalGroup(
            dimensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dimensionPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnRadio32x32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadio48x48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadio64x64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadio96x96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRadio128x128)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        gridPanel.setBackground(new java.awt.Color(204, 204, 204));
        gridPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));

        btnColorBackGround.setText("Color Background ");

        btnColorBorder.setText("Color Border");

        labelColorBorder.setBackground(new java.awt.Color(255, 255, 255));
        labelColorBorder.setOpaque(true);

        labelColorBackground.setBackground(new java.awt.Color(255, 255, 255));
        labelColorBackground.setOpaque(true);

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridPanelLayout.createSequentialGroup()
                        .addComponent(btnColorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelColorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridPanelLayout.createSequentialGroup()
                        .addComponent(btnColorBackGround)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelColorBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelColorBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColorBackGround, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnColorBorder)
                    .addComponent(labelColorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOk.setText("Ok");

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout mainTilesPanelLayout = new javax.swing.GroupLayout(mainTilesPanel);
        mainTilesPanel.setLayout(mainTilesPanelLayout);
        mainTilesPanelLayout.setHorizontalGroup(
            mainTilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTilesPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(dimensionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTilesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainTilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTilesPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTilesPanelLayout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnCancel)
                        .addGap(105, 105, 105))))
        );
        mainTilesPanelLayout.setVerticalGroup(
            mainTilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTilesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(13, 13, 13)
                .addGroup(mainTilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimensionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(mainTilesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTilesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTilesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadio64x64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio64x64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio64x64ActionPerformed

    private void btnRadio48x48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio48x48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio48x48ActionPerformed

    private void btnRadio32x32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio32x32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio32x32ActionPerformed

    private void btnRadio96x96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio96x96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio96x96ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnColorBackGround;
    private javax.swing.JButton btnColorBorder;
    private javax.swing.JButton btnOk;
    private javax.swing.JRadioButton btnRadio128x128;
    private javax.swing.JRadioButton btnRadio32x32;
    private javax.swing.JRadioButton btnRadio48x48;
    private javax.swing.JRadioButton btnRadio64x64;
    private javax.swing.JRadioButton btnRadio96x96;
    private javax.swing.JPanel dimensionPanel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel labelColorBackground;
    private javax.swing.JLabel labelColorBorder;
    private javax.swing.JPanel mainTilesPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
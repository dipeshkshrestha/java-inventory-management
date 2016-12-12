


public class About extends javax.swing.JInternalFrame {

    
    public About() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        lblSoftVer = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();

        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yamaha-Logo.png"))); // NOI18N

        Panel.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("YAMAHA INVENTORY MANAGEMENT SYSTEM");
        Panel.add(lblTitle);
        lblTitle.setBounds(40, 200, 330, 30);

        lblCopyright.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCopyright.setText("Copyright © MAW Enterprises Pvt Ltd. All Rights Reserved.");
        Panel.add(lblCopyright);
        lblCopyright.setBounds(40, 250, 380, 15);

        lblSoftVer.setText("Software Version 1.0");
        Panel.add(lblSoftVer);
        lblSoftVer.setBounds(40, 230, 120, 14);

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userlogin.jpg"))); // NOI18N
        Panel.add(lblBG);
        lblBG.setBounds(0, 0, 500, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblSoftVer;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

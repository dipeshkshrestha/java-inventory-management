
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    private EntUser user;

    public MainMenu() {

        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);

        if (UserLogin.cmbUserRole.getSelectedItem().equals("Sales")) {
            menuAdmin.hide();
        }
        if (UserLogin.cmbUserRole.getSelectedItem().equals("Stock")) {
            menuSales.hide();
            menuAdmin.hide();
            menuSalesReport.hide();
            menuOutstanding.hide();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdmin = new javax.swing.JMenu();
        menuAddUser = new javax.swing.JMenuItem();
        menuStock = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuUpdateStock = new javax.swing.JMenuItem();
        menuDeleteStock = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuSearchStock = new javax.swing.JMenuItem();
        menuSales = new javax.swing.JMenu();
        menuAddSales = new javax.swing.JMenuItem();
        menuUpdateSales = new javax.swing.JMenuItem();
        menuDeleteSales = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuSearchSales = new javax.swing.JMenuItem();
        menuReports = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        menuSalesReport = new javax.swing.JMenuItem();
        menuOutstanding = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        menuWindow = new javax.swing.JMenu();
        menuCloseWindow = new javax.swing.JMenuItem();
        menuExitWindow = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YAMAHA INVENTORY MANAGEMENT SYSTEM");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainFrameWallpaper.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainFrame.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Administrator-icon.png"))); // NOI18N
        menuAdmin.setText("Admin");
        menuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdminActionPerformed(evt);
            }
        });

        menuAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-add-icon.png"))); // NOI18N
        menuAddUser.setText("Add User");
        menuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddUserActionPerformed(evt);
            }
        });
        menuAdmin.add(menuAddUser);

        jMenuBar1.add(menuAdmin);

        menuStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock-add-icon.png"))); // NOI18N
        menuStock.setText("Stock");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addnew.png"))); // NOI18N
        jMenuItem1.setText("Add Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuStock.add(jMenuItem1);

        menuUpdateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        menuUpdateStock.setText("Update Stock");
        menuUpdateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateStockActionPerformed(evt);
            }
        });
        menuStock.add(menuUpdateStock);

        menuDeleteStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        menuDeleteStock.setText("Delete Stock");
        menuDeleteStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteStockActionPerformed(evt);
            }
        });
        menuStock.add(menuDeleteStock);
        menuStock.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        jMenuItem2.setText("Category");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuStock.add(jMenuItem2);
        menuStock.add(jSeparator3);

        menuSearchStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        menuSearchStock.setText("Search Stock");
        menuSearchStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchStockActionPerformed(evt);
            }
        });
        menuStock.add(menuSearchStock);

        jMenuBar1.add(menuStock);

        menuSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash-register-icon.png"))); // NOI18N
        menuSales.setText("Sales");

        menuAddSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addnew.png"))); // NOI18N
        menuAddSales.setText("Add Sales");
        menuAddSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddSalesActionPerformed(evt);
            }
        });
        menuSales.add(menuAddSales);

        menuUpdateSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        menuUpdateSales.setText("Update Sales");
        menuUpdateSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateSalesActionPerformed(evt);
            }
        });
        menuSales.add(menuUpdateSales);

        menuDeleteSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        menuDeleteSales.setText("Delete Sales");
        menuDeleteSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteSalesActionPerformed(evt);
            }
        });
        menuSales.add(menuDeleteSales);
        menuSales.add(jSeparator2);

        menuSearchSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        menuSearchSales.setText("Search Sales");
        menuSearchSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchSalesActionPerformed(evt);
            }
        });
        menuSales.add(menuSearchSales);

        jMenuBar1.add(menuSales);

        menuReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reports-icon.png"))); // NOI18N
        menuReports.setText("Reports");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jMenuItem16.setText("Stock Report");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        menuReports.add(jMenuItem16);

        menuSalesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        menuSalesReport.setText("Sales Report");
        menuSalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalesReportActionPerformed(evt);
            }
        });
        menuReports.add(menuSalesReport);

        menuOutstanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        menuOutstanding.setText("Outstanding Report");
        menuOutstanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOutstandingActionPerformed(evt);
            }
        });
        menuReports.add(menuOutstanding);

        jMenuBar1.add(menuReports);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        jMenu8.setText("About");

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        jMenuItem19.setText("About");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuBar1.add(jMenu8);

        menuWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        menuWindow.setText("Windows");

        menuCloseWindow.setText("Close All");
        menuCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCloseWindowActionPerformed(evt);
            }
        });
        menuWindow.add(menuCloseWindow);

        menuExitWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        menuExitWindow.setText("Exit");
        menuExitWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitWindowActionPerformed(evt);
            }
        });
        menuWindow.add(menuExitWindow);

        jMenuBar1.add(menuWindow);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MainFrame))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        {
            Stocks s = new Stocks();

            MainFrame.removeAll();
            MainFrame.repaint();
            MainFrame.add(s);
            s.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuAddSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddSalesActionPerformed
        Sales s = new Sales();
        this.MainFrame.add(s);
        s.show();

    }//GEN-LAST:event_menuAddSalesActionPerformed

    private void menuSearchStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchStockActionPerformed
        StockDetail SD = new StockDetail();
        this.MainFrame.add(SD);
        SD.show();
    }//GEN-LAST:event_menuSearchStockActionPerformed

    private void menuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddUserActionPerformed
        Users U = new Users();
        this.MainFrame.add(U);
        U.show();
    }//GEN-LAST:event_menuAddUserActionPerformed

    private void menuSearchSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchSalesActionPerformed
        SalesDetails SD = new SalesDetails();
        this.MainFrame.add(SD);
        SD.show();
    }//GEN-LAST:event_menuSearchSalesActionPerformed

    private void menuCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseWindowActionPerformed
        this.MainFrame.removeAll();
        this.MainFrame.repaint();
    }//GEN-LAST:event_menuCloseWindowActionPerformed

    private void menuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdminActionPerformed

    }//GEN-LAST:event_menuAdminActionPerformed

    private void menuExitWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitWindowActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitWindowActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        StockReport SR = new StockReport();
        this.MainFrame.add(SR);
        SR.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void menuSalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalesReportActionPerformed
        SalesReport SaR = new SalesReport();
        this.MainFrame.add(SaR);
        SaR.show();
    }//GEN-LAST:event_menuSalesReportActionPerformed

    private void menuOutstandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOutstandingActionPerformed
        Outstanding OP = new Outstanding();
        this.MainFrame.add(OP);
        OP.show();
    }//GEN-LAST:event_menuOutstandingActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        About A = new About();
        this.MainFrame.add(A);
        A.show();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void menuUpdateSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateSalesActionPerformed
        SalesUpdateDelete SU = new SalesUpdateDelete();
        this.MainFrame.add(SU);
        SU.show();
    }//GEN-LAST:event_menuUpdateSalesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Category Cat = new Category();
        this.MainFrame.add(Cat);
        Cat.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuUpdateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateStockActionPerformed
        Stocks s = new Stocks();
        this.MainFrame.add(s);
        s.show();
    }//GEN-LAST:event_menuUpdateStockActionPerformed

    private void menuDeleteStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteStockActionPerformed
        Stocks s = new Stocks();
        this.MainFrame.add(s);
        s.show();
    }//GEN-LAST:event_menuDeleteStockActionPerformed

    private void menuDeleteSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteSalesActionPerformed
        SalesUpdateDelete SU = new SalesUpdateDelete();
        this.MainFrame.add(SU);
        SU.show();
    }//GEN-LAST:event_menuDeleteSalesActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuAddSales;
    private javax.swing.JMenuItem menuAddUser;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenuItem menuCloseWindow;
    private javax.swing.JMenuItem menuDeleteSales;
    private javax.swing.JMenuItem menuDeleteStock;
    private javax.swing.JMenuItem menuExitWindow;
    private javax.swing.JMenuItem menuOutstanding;
    private javax.swing.JMenu menuReports;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenuItem menuSalesReport;
    private javax.swing.JMenuItem menuSearchSales;
    private javax.swing.JMenuItem menuSearchStock;
    private javax.swing.JMenu menuStock;
    private javax.swing.JMenuItem menuUpdateSales;
    private javax.swing.JMenuItem menuUpdateStock;
    private javax.swing.JMenu menuWindow;
    // End of variables declaration//GEN-END:variables

}

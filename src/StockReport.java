import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class StockReport extends javax.swing.JInternalFrame {
    PreparedStatement ps, ps1; 
    String model []= new String [100];
    String CC []= new String [100];
    String color []= new String [100];
    int i, j, k, l, ref = 0;    
    public StockReport() {
        DbConnection.FillConnection();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DateChooserFrom = new com.toedter.calendar.JDateChooser();
        DateChooserTo = new com.toedter.calendar.JDateChooser();
        btnReload = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStock1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnPrint1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DateChooserFrom1 = new com.toedter.calendar.JDateChooser();
        DateChooserTo1 = new com.toedter.calendar.JDateChooser();
        btnReload1 = new javax.swing.JButton();
        search1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Stock Report");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yamaha-Logo.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Date", "Model", "Color", "Reg No.", "CC", "Engine Number", "Chasis Number"
            }
        ));
        jScrollPane1.setViewportView(tblStock);
        if (tblStock.getColumnModel().getColumnCount() > 0) {
            tblStock.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel5.setText("From");

        btnPrint.setText("Print Report");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel6.setText("To");

        DateChooserFrom.setDateFormatString("yyyy-MM-dd");

        DateChooserTo.setDateFormatString("yyyy-MM-dd");

        btnReload.setText("Reload Data");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReload)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(DateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search)))))
                        .addGap(0, 588, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReload)
                    .addComponent(btnPrint))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stock Report", jPanel1);

        tblStock1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Date", "Model", "Color", "Reg No.", "CC", "Engine Number", "Chasis Number"
            }
        ));
        jScrollPane2.setViewportView(tblStock1);
        if (tblStock1.getColumnModel().getColumnCount() > 0) {
            tblStock1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel7.setText("From");

        btnPrint1.setText("Print Report");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        jLabel8.setText("To");

        DateChooserFrom1.setDateFormatString("yyyy-MM-dd");

        DateChooserTo1.setDateFormatString("yyyy-MM-dd");

        btnReload1.setText("Reload Data");
        btnReload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReload1ActionPerformed(evt);
            }
        });

        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnReload1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(DateChooserFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(DateChooserTo1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search1)))))
                        .addGap(0, 588, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooserFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateChooserTo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReload1)
                    .addComponent(btnPrint1))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stock History Report", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        try
        {

            java.util.Date ss= DateChooserFrom.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String from=sdf.format(ss);

            java.util.Date ss1= DateChooserTo.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String to =sdf1.format(ss1);

            ps = DbConnection.cn.prepareStatement("SELECT Stock_ID, Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number FROM stock WHERE date >= '"+from+"' and date <= '"+to+"' ");

            ResultSet rs=ps.executeQuery();

            tblStock.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
           
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        try
        {
            ps=DbConnection.cn.prepareStatement("SELECT Stock_ID, Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number FROM stock ");
            ResultSet rs=ps.executeQuery();
            tblStock.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ex)
        {}
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
      MessageFormat header = new MessageFormat ("Report Print");
      MessageFormat footer = new MessageFormat ("Page[0,number,integer]");
      try
      {
        tblStock.print(JTable.PrintMode.NORMAL, header, footer);
      }

      catch (java.awt.print.PrinterException e)
        {
          System.err.format("Cannot Print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
          MessageFormat header = new MessageFormat ("Report Print");
      MessageFormat footer = new MessageFormat ("Page[0,number,integer]");
      try
      {
        tblStock.print(JTable.PrintMode.NORMAL, header, footer);
      }

      catch (java.awt.print.PrinterException e)
        {
          System.err.format("Cannot Print %s%n", e.getMessage());
        }

    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void btnReload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReload1ActionPerformed
        try
        {
            ps=DbConnection.cn.prepareStatement("SELECT Stock_ID, Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number FROM stock_backup ");
            ResultSet rs=ps.executeQuery();
            tblStock1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ex)
        {}

    }//GEN-LAST:event_btnReload1ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
    
        try
        {

            java.util.Date ss= DateChooserFrom1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String from=sdf.format(ss);

            java.util.Date ss1= DateChooserTo1.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String to =sdf1.format(ss1);

            ps = DbConnection.cn.prepareStatement("SELECT Stock_ID, Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number FROM stock_backup WHERE date >= '"+from+"' and date <= '"+to+"' ");

            ResultSet rs=ps.executeQuery();

            tblStock1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_search1ActionPerformed
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFrom;
    private com.toedter.calendar.JDateChooser DateChooserFrom1;
    private com.toedter.calendar.JDateChooser DateChooserTo;
    private com.toedter.calendar.JDateChooser DateChooserTo1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnReload1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTable tblStock;
    private javax.swing.JTable tblStock1;
    // End of variables declaration//GEN-END:variables
}

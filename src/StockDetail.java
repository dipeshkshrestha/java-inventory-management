import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class StockDetail extends javax.swing.JInternalFrame {

    PreparedStatement ps, ps1;
    String model[] = new String[100];
    String CC[] = new String[100];
    String color[] = new String[100];
    int i, j, k, l, ref = 0;
    DefaultTableModel dtm = new DefaultTableModel();

    public StockDetail() {
        initComponents();

        DbConnection.FillConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchPanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cmbSelectSearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox();
        cmbCC = new javax.swing.JComboBox();
        txtCount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbModel = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
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

        SearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        SearchPanel.setToolTipText("");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSelectSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "Model", "Color" }));

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cmbSelectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSelectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Date", "Model", "Color", "Reg No.", "CC", "Engine Number", "Chasis Number"
            }
        ));
        jScrollPane1.setViewportView(stockTable);

        btnReload.setText("Reload Data");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("CC");

        cmbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColorActionPerformed(evt);
            }
        });

        cmbCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCCActionPerformed(evt);
            }
        });

        txtCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCount.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Color");

        jLabel4.setText("Total Stock");

        cmbModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModelActionPerformed(evt);
            }
        });

        jLabel1.setText("Model");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReload)
                            .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReload))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            String searchlist = cmbSelectSearch.getSelectedItem().toString();
            ps = DbConnection.cn.prepareStatement("select Stock_ID,date, model, color, reg_no, engine_capacity, engine_number, chasis_number from stock where " + searchlist + "=?");
            ps.setString(1, txtSearch.getText());
            ResultSet rs = ps.executeQuery();
            stockTable.getColumnModel().getColumn(0).setHeaderValue("Stock ID");
            stockTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        try {
            ps = DbConnection.cn.prepareStatement("Select Stock_ID, date, model, color, reg_no, engine_capacity, engine_number, chasis_number from stock");
            ResultSet rs = ps.executeQuery();
            stockTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
        }

        try {
            DbConnection.FillConnection();
            i = 0;
            //st = cn.createStatement();
            PreparedStatement ps1 = DbConnection.cn.prepareStatement("Select model from model_details");

            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                model[i] = rs1.getString(1);
                i++;
            }
            for (j = 0; j < i; j++) {
                cmbModel.addItem(model[j]);
            }

            cmbModel.setSelectedItem(model[0]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }
        try {
            DbConnection.FillConnection();
            k = 0;
            //st = cn.createStatement();
            PreparedStatement ps1 = DbConnection.cn.prepareStatement("Select engine_capacity from enginecapacity");

            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                CC[k] = rs1.getString(1);
                k++;
            }
            for (j = 0; j < k; j++) {
                cmbCC.addItem(CC[j]);
            }

            cmbCC.setSelectedItem(CC[0]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }
        try {
            DbConnection.FillConnection();
            l = 0;
            //st = cn.createStatement();
            PreparedStatement ps1 = DbConnection.cn.prepareStatement("Select color from color_details");

            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                color[l] = rs1.getString(1);
                l++;
            }
            for (j = 0; j < l; j++) {
                cmbColor.addItem(color[j]);
            }

            cmbColor.setSelectedItem(CC[0]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }


    }//GEN-LAST:event_formInternalFrameOpened

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        try {
            ps = DbConnection.cn.prepareStatement("Select Stock_ID, Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number from stock");
            ResultSet rs = ps.executeQuery();
            stockTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnReloadActionPerformed

    private void cmbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColorActionPerformed

        try {
            String model = cmbModel.getSelectedItem().toString();
            String cc = cmbCC.getSelectedItem().toString();
            String color = cmbColor.getSelectedItem().toString();

            ps = DbConnection.cn.prepareStatement("SELECT COUNT(model)FROM stock WHERE model=? and engine_capacity=? and color=?");
            ps.setString(1, model);
            ps.setString(2, cc);
            ps.setString(3, color);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtCount.setText(rs.getString("count(model)"));

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_cmbColorActionPerformed

    private void cmbCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCCActionPerformed

        try {
            String model = cmbModel.getSelectedItem().toString();
            String cc = cmbCC.getSelectedItem().toString();
            String color = cmbColor.getSelectedItem().toString();

            ps = DbConnection.cn.prepareStatement("SELECT COUNT(model)FROM stock WHERE model=? and engine_capacity=? and color=?");
            ps.setString(1, model);
            ps.setString(2, cc);
            ps.setString(3, color);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtCount.setText(rs.getString("count(model)"));

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_cmbCCActionPerformed

    private void cmbModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModelActionPerformed

        try {
            String model = cmbModel.getSelectedItem().toString();
            String cc = cmbCC.getSelectedItem().toString();
            String color = cmbColor.getSelectedItem().toString();

            ps = DbConnection.cn.prepareStatement("SELECT COUNT(model)FROM stock WHERE model=? and engine_capacity=? and color=?");
            ps.setString(1, model);
            ps.setString(2, cc);
            ps.setString(3, color);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtCount.setText(rs.getString("count(model)"));

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_cmbModelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton btnReload;
    private javax.swing.JComboBox cmbCC;
    private javax.swing.JComboBox cmbColor;
    private javax.swing.JComboBox cmbModel;
    private javax.swing.JComboBox cmbSelectSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

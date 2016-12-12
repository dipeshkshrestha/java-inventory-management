
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Stocks extends javax.swing.JInternalFrame {

    PreparedStatement ps, ps1, ps2, ps11;
    int i, j, l, e, ref = 0;
    Statement st;

    String color[] = new String[100];
    String model[] = new String[100];
    String cc[] = new String[100];

    public Stocks() {

        initComponents();
        DbConnection.FillConnection();
        txtDate.setMinSelectableDate(new Date());
        txtDate.setMaxSelectableDate(new Date());
        txtDate.setDate(new Date());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new com.toedter.calendar.JDateChooser();
        lblCC = new javax.swing.JLabel();
        txtSP = new javax.swing.JTextField();
        cmbCC = new javax.swing.JComboBox();
        cmbModel = new javax.swing.JComboBox();
        txtEngineNo = new javax.swing.JTextField();
        cmbColor = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        lblRegNo = new javax.swing.JLabel();
        lblChasisNo = new javax.swing.JLabel();
        txtChasisNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtRegNo = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        lblSP = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock-add-icon.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(362, 450));
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

        txtDate.setDateFormatString("yyyy-MM-dd");
        txtDate.setMinSelectableDate(new java.util.Date(-62135786604000L));

        lblCC.setText("Engine Capacity");

        cmbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColorActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblRegNo.setText("Registration No.");

        lblChasisNo.setText("Chasis No.");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblModel.setText("Model");

        lblSP.setText("Selling Price");

        lblID.setText("Stock ID");

        lblDate.setText("Date");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblColor.setText("Color");

        lblEngineNo.setText("Engine No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModel)
                            .addComponent(lblSP)
                            .addComponent(lblID)
                            .addComponent(lblDate)
                            .addComponent(lblRegNo)
                            .addComponent(lblChasisNo)
                            .addComponent(lblColor)
                            .addComponent(lblEngineNo)
                            .addComponent(lblCC))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEngineNo)
                            .addComponent(txtChasisNo)
                            .addComponent(txtSP)
                            .addComponent(txtRegNo)
                            .addComponent(cmbCC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbModel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(cmbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(25, 25, 25)
                        .addComponent(btnEdit)
                        .addGap(25, 25, 25)
                        .addComponent(btnDelete)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegNo)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEngineNo)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChasisNo)
                    .addComponent(txtChasisNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCC)
                    .addComponent(cmbCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSP))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        setBounds(0, 0, 369, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        try {

            l = 0;

            ps1 = DbConnection.cn.prepareStatement("Select model from model_details");

            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                model[l] = rs1.getString(1);
                l++;
            }
            for (j = 0; j < l; j++) {
                cmbModel.addItem(model[j]);
            }
            cmbModel.setSelectedItem(model[0]);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }

        try {
            DbConnection.FillConnection();
            i = 0;
            ps1 = DbConnection.cn.prepareStatement("Select color from color_details");
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                color[i] = rs1.getString(1);
                i++;
            }
            for (j = 0; j < i; j++) {
                cmbColor.addItem(color[j]);
            }

            cmbColor.setSelectedItem(color[0]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }
        try {
            DbConnection.FillConnection();
            e = 0;

            ps1 = DbConnection.cn.prepareStatement("Select engine_capacity from enginecapacity");

            ResultSet rs2 = ps1.executeQuery();
            while (rs2.next()) {
                cc[e] = rs2.getString(1);
                e++;
            }
            for (j = 0; j < e; j++) {
                cmbCC.addItem(cc[j]);
            }

            cmbCC.setSelectedItem(cc[0]);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            dispose();
        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            ps = DbConnection.cn.prepareStatement("update stock set model = ?, Reg_No = ?, color = ?,  Engine_Number = ?, engine_capacity =?, chasis_number =?, selling_price=?, date=? where stock_id = ?");
            ps.setString(1, cmbModel.getSelectedItem().toString());
            ps.setString(2, txtRegNo.getText());
            ps.setString(3, cmbColor.getSelectedItem().toString());
            ps.setString(4, txtEngineNo.getText());
            ps.setString(5, cmbCC.getSelectedItem().toString());
            ps.setString(6, txtChasisNo.getText());
            ps.setString(7, txtSP.getText());
            ps.setString(8, ((JTextField) txtDate.getDateEditor().getUiComponent()).getText());
            ps.setString(9, txtID.getText());

            int edit = ps.executeUpdate();
            if (edit >= 1) {
                JOptionPane.showMessageDialog(null, "Record Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error in update\n" + ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to delete", "Delete", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                ps = DbConnection.cn.prepareStatement("delete from stock where Stock_Id = ?");
                ps.setString(1, txtID.getText());
                int del = ps.executeUpdate();
                if (del >= 1) {
                    JOptionPane.showMessageDialog(null, "Deleted");
                    txtID.setText("");
                    txtRegNo.setText("");
                    txtEngineNo.setText("");
                    txtChasisNo.setText("");
                    txtDate.setDate(null);
                    cmbColor.setSelectedIndex(0);
                    cmbCC.setSelectedIndex(0);
                    txtSP.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (((JTextField) txtDate.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date should be filled");
            return;
        }
        if (txtRegNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        if (!txtRegNo.getText().matches("[a-zA-Z0-9\\s]*")) {
            JOptionPane.showMessageDialog(null, "Invalid Format : Registration Number");
            return;
        }
        if (!txtSP.getText().matches("[0-9\\.|]*")) {
            JOptionPane.showMessageDialog(null, "Invalid Format : Selling Price");
            return;
        }

        if (txtEngineNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        if (txtChasisNo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        if (txtSP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        } else {
            try {

                String regno = txtRegNo.getText();

                ps = DbConnection.cn.prepareStatement("Select reg_no from stock");
                ResultSet rs = ps.executeQuery();
                int casecheck = 0;
                while (rs.next()) {

                    String casecheck1 = rs.getString("reg_no");

                    if (regno.equalsIgnoreCase(casecheck1)) {
                        JOptionPane.showMessageDialog(null, "Aready Exist");

                        casecheck = 1;
                        return;
                    }
                }

                if (casecheck == 0) {
                    DbConnection.FillConnection();
                }

                String strdata = "Insert into stock (Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number, Selling_Price) values (?,?,?,?,?,?,?,?)";

                ps = DbConnection.cn.prepareStatement(strdata);
                ps.setString(1, ((JTextField) txtDate.getDateEditor().getUiComponent()).getText());
                ps.setString(2, cmbModel.getSelectedItem().toString());
                ps.setString(3, cmbColor.getSelectedItem().toString());
                ps.setString(4, txtRegNo.getText());
                ps.setString(5, cmbCC.getSelectedItem().toString());
                ps.setString(6, txtEngineNo.getText());
                ps.setString(7, txtChasisNo.getText());
                ps.setString(8, txtSP.getText());
                int result = ps.executeUpdate();
                //
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Stock Added Successfully");

                } else {
                    JOptionPane.showMessageDialog(null, "New Stock not added");
                }

                //for history
                String strhistory = "Insert into stock_backup (Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number, Selling_Price) values (?,?,?,?,?,?,?,?)";

                ps11 = DbConnection.cn.prepareStatement(strhistory);
                ps11.setString(1, ((JTextField) txtDate.getDateEditor().getUiComponent()).getText());
                ps11.setString(2, cmbModel.getSelectedItem().toString());
                ps11.setString(3, cmbColor.getSelectedItem().toString());
                ps11.setString(4, txtRegNo.getText());
                ps11.setString(5, cmbCC.getSelectedItem().toString());
                ps11.setString(6, txtEngineNo.getText());
                ps11.setString(7, txtChasisNo.getText());
                ps11.setString(8, txtSP.getText());
                int history = ps11.executeUpdate();

            } catch (Exception en) {
                JOptionPane.showMessageDialog(null, en);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if (!txtID.getText().matches("[0-9\\.|]*")) {
            JOptionPane.showMessageDialog(null, "Invalid Format");
            cleartext();
            return;
        }
        try {
            int data = 0;
            PreparedStatement pstat1 = DbConnection.cn.prepareStatement("select * from stock where Stock_Id = ?");
            pstat1.setInt(1, Integer.parseInt(txtID.getText()));

            ResultSet rs = pstat1.executeQuery();
            while (rs.next()) {
                data = 1;
                txtDate.setDate(rs.getDate(2));
                cmbModel.setSelectedItem(rs.getString(3));
                cmbColor.setSelectedItem(rs.getString(4));
                txtRegNo.setText(rs.getString(5));
                cmbCC.setSelectedItem(rs.getString(6));
                txtEngineNo.setText(rs.getString(7));
                txtChasisNo.setText(rs.getString(8));
                txtSP.setText(rs.getString(9));

            }
            if (data == 0) {
                JOptionPane.showMessageDialog(null, "Stock not found / Wrong Stock ID");
                cleartext();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error inQuery section");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColorActionPerformed


    }//GEN-LAST:event_cmbColorActionPerformed
    public void cleartext() {
        txtDate.setDate(null);
        cmbModel.setSelectedIndex(0);
        cmbColor.setSelectedIndex(0);
        txtRegNo.setText("");
        cmbCC.setSelectedIndex(0);
        txtEngineNo.setText("");
        txtChasisNo.setText("");
        txtSP.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbCC;
    private javax.swing.JComboBox cmbColor;
    private javax.swing.JComboBox cmbModel;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblChasisNo;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblRegNo;
    private javax.swing.JLabel lblSP;
    private javax.swing.JTextField txtChasisNo;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSP;
    // End of variables declaration//GEN-END:variables
}

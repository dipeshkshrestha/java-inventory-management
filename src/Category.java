/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dipesh
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Category extends javax.swing.JInternalFrame {

    PreparedStatement ps, ps1, ps2, ps3, ps4, ps5, ps6;
    ResultSet rs, rs1, rs2, rs3, rs4, rs5, rs6;

    public Category() {

        initComponents();
        DbConnection.FillConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        model = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtNewModel = new javax.swing.JTextField();
        lblNewModel = new javax.swing.JLabel();
        btnUpdate2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        txtID2 = new javax.swing.JTextField();
        lblID2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblModel = new javax.swing.JTable();
        color = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNewColor = new javax.swing.JTextField();
        lblNewColor = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColor = new javax.swing.JTable();
        CC = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNewCC = new javax.swing.JTextField();
        lblNewCC = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        txtID1 = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCC = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Category");
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        lblNewModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewModel.setForeground(new java.awt.Color(255, 0, 0));
        lblNewModel.setText("ENTER MODEL");

        btnUpdate2.setText("Update");
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });

        btnAdd2.setText("Add");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnDelete2.setText("Delete");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        lblID2.setText("ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblID2)
                        .addGap(10, 10, 10)
                        .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(lblNewModel)
                                .addComponent(txtNewModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnUpdate2)
                                .addGap(5, 5, 5)
                                .addComponent(btnDelete2)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID2))
                .addGap(0, 0, 0)
                .addComponent(lblNewModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNewModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd2)
                    .addComponent(btnUpdate2)
                    .addComponent(btnDelete2))
                .addGap(10, 10, 10))
        );

        tblModel.setBackground(new java.awt.Color(204, 204, 255));
        tblModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MODEL"
            }
        ));
        tblModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblModelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblModel);

        javax.swing.GroupLayout modelLayout = new javax.swing.GroupLayout(model);
        model.setLayout(modelLayout);
        modelLayout.setHorizontalGroup(
            modelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        modelLayout.setVerticalGroup(
            modelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(modelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Model", model);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        lblNewColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewColor.setForeground(new java.awt.Color(255, 0, 0));
        lblNewColor.setText("ENTER COLOR");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

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

        lblID.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnUpdate)
                        .addGap(5, 5, 5)
                        .addComponent(btnDelete))
                    .addComponent(txtNewColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblID)
                .addGap(10, 10, 10)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNewColor)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNewColor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(txtNewColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(10, 10, 10))
        );

        tblColor.setBackground(new java.awt.Color(204, 204, 255));
        tblColor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COLOR"
            }
        ));
        tblColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColor);
        if (tblColor.getColumnModel().getColumnCount() > 0) {
            tblColor.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        javax.swing.GroupLayout colorLayout = new javax.swing.GroupLayout(color);
        color.setLayout(colorLayout);
        colorLayout.setHorizontalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        colorLayout.setVerticalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Color", color);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        lblNewCC.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNewCC.setForeground(new java.awt.Color(255, 0, 0));
        lblNewCC.setText("ENTER ENGINE CAPACITY");

        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnAdd1.setText("Add");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        lblID1.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblID1)
                .addGap(10, 10, 10)
                .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblNewCC)
                        .addComponent(txtNewCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnUpdate1)
                        .addGap(5, 5, 5)
                        .addComponent(btnDelete1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblNewCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNewCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1)
                    .addComponent(btnUpdate1)
                    .addComponent(btnDelete1))
                .addGap(10, 10, 10))
        );

        tblCC.setBackground(new java.awt.Color(204, 204, 255));
        tblCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Engine_Capacity"
            }
        ));
        tblCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCC);

        javax.swing.GroupLayout CCLayout = new javax.swing.GroupLayout(CC);
        CC.setLayout(CCLayout);
        CCLayout.setHorizontalGroup(
            CCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CCLayout.setVerticalGroup(
            CCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CCLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(CCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Engine Capacity", CC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshTable() {
        try {
            ps1 = DbConnection.cn.prepareStatement("SELECT Color FROM color_details ORDER BY Color ASC");
            rs1 = ps1.executeQuery();
            tblColor.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            ps = DbConnection.cn.prepareStatement("SELECT Color FROM color_details ORDER BY Color ASC");
            rs = ps.executeQuery();
            tblColor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try {
            ps1 = DbConnection.cn.prepareStatement("SELECT Engine_Capacity FROM enginecapacity ORDER BY engine_capacity ASC");
            rs1 = ps1.executeQuery();
            tblCC.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            ps2 = DbConnection.cn.prepareStatement("SELECT Model FROM model_details ORDER BY model ASC");
            rs2 = ps2.executeQuery();
            tblModel.setModel(DbUtils.resultSetToTableModel(rs2));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void tblColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColorMouseClicked
        try {
            int row = tblColor.getSelectedRow();
            String Color_click = (tblColor.getModel().getValueAt(row, 0).toString());
            ps3 = DbConnection.cn.prepareStatement("select * from color_details where color='" + Color_click + "'");
            rs3 = ps3.executeQuery();
            if (rs3.next()) {
                String a = rs3.getString("Color");
                String b = rs3.getString("ID");
                txtNewColor.setText(a);
                txtID.setText(b);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tblColorMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int delConfirm = JOptionPane.showConfirmDialog(null, "Are You sure to delete", "Yes/No", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (delConfirm == JOptionPane.YES_OPTION) {
            try {

                ps = DbConnection.cn.prepareStatement("delete from color_details where id = ?");
                ps.setInt(1, Integer.parseInt(txtID.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record has been deleted ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            refreshTable();
        }

        //cleartext();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtNewColor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields should not be empty");

        } else {
            try {

                String c = txtNewColor.getText();
                ps = DbConnection.cn.prepareStatement("Select color from color_details");
                rs = ps.executeQuery();
                int color = 0;
                while (rs.next()) {
                    String cl = rs.getString("Color");
                    // if(c.equals(cl))
                    if (cl.equalsIgnoreCase(c)) {
                        JOptionPane.showMessageDialog(null, "Aready Exist");
                        txtNewColor.setText("");
                        color = 1;
                        return;
                    }
                }

                if (color == 0) {

                    String strdata = "Insert into color_details (Color)values(?)";
                    ps = DbConnection.cn.prepareStatement(strdata);

                    ps.setString(1, txtNewColor.getText());
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "New Color Added Successfully");
                    cleartext();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        refreshTable();

    }

    public void cleartext() //to clear fields
    {
        txtNewColor.setText("");
        txtNewCC.setText("");
        txtNewModel.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            ps2 = DbConnection.cn.prepareStatement("update color_details set color = ? where id= ?");
            ps2.setString(1, txtNewColor.getText());
            ps2.setString(2, txtID.getText());

            int edit = ps2.executeUpdate();
            if (edit >= 1) {
                JOptionPane.showMessageDialog(null, "Record Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error in update\n" + ex);
        }
        refreshTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        try {
            ps2 = DbConnection.cn.prepareStatement("update enginecapacity set engine_capacity = ? where id= ?");
            ps2.setString(1, txtNewCC.getText());
            ps2.setString(2, txtID.getText());

            int edit = ps2.executeUpdate();
            if (edit >= 1) {
                JOptionPane.showMessageDialog(null, "Record Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error in update\n" + ex);
        }
        refreshTable();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        if (txtNewCC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields should not be empty");
            //return;
        } else {
            try {

                String c = txtNewCC.getText();
                ps = DbConnection.cn.prepareStatement("Select engine_capacity from enginecapacity");
                rs = ps.executeQuery();
                int cc = 0;
                while (rs.next()) {
                    String cl = rs.getString("engine_capacity");
                    // if(c.equals(cl))
                    if (cl.equalsIgnoreCase(c)) {
                        JOptionPane.showMessageDialog(null, "Aready Exist");
                        txtNewCC.setText("");
                        cc = 1;
                        return;
                    }
                }

                if (cc == 0) {

                    String strdata = "Insert into enginecapacity (engine_capacity)values(?)";
                    ps = DbConnection.cn.prepareStatement(strdata);

                    ps.setString(1, txtNewCC.getText());
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "New Engine Capacity Added Successfully");
                    cleartext();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        refreshTable();


    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        int delConfirm = JOptionPane.showConfirmDialog(null, "Are You sure to delete", "Yes/No", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (delConfirm == JOptionPane.YES_OPTION) {
            try {

                ps = DbConnection.cn.prepareStatement("delete from enginecapacity where id = ?");
                ps.setInt(1, Integer.parseInt(txtID.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record has been deleted ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "btnDelete\n" + e);
            }
            refreshTable();
        }


    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tblCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCCMouseClicked
        try {
            int row = tblCC.getSelectedRow();
            String CC_click = (tblCC.getModel().getValueAt(row, 0).toString());
            ps = DbConnection.cn.prepareStatement("select * from enginecapacity where engine_capacity='" + CC_click + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                String c = rs.getString("engine_capacity");
                String d = rs.getString("ID");
                txtNewCC.setText(c);
                txtID1.setText(d);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_tblCCMouseClicked

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed

        try {
            ps2 = DbConnection.cn.prepareStatement("update model_details set model = ? where id= ?");
            ps2.setString(1, txtNewModel.getText());
            ps2.setString(2, txtID.getText());

            int edit = ps2.executeUpdate();
            if (edit >= 1) {
                JOptionPane.showMessageDialog(null, "Record Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not updated");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error in update\n" + ex);
        }
        refreshTable();
    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        if (txtNewModel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields should not be empty");
            //return;
        } else {
            try {

                String c = txtNewModel.getText();
                ps = DbConnection.cn.prepareStatement("Select model from model_details");
                rs = ps.executeQuery();
                int model = 0;
                while (rs.next()) {
                    String cl = rs.getString("model");

                    if (cl.equalsIgnoreCase(c)) {
                        JOptionPane.showMessageDialog(null, "Aready Exist");
                        txtNewModel.setText("");
                        model = 1;
                        return;
                    }
                }

                if (model == 0) {

                    String strdata = "Insert into model_details (model)values(?)";
                    ps = DbConnection.cn.prepareStatement(strdata);

                    ps.setString(1, txtNewModel.getText());
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "New Model Added Successfully");
                    cleartext();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        refreshTable();


    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        int delConfirm = JOptionPane.showConfirmDialog(null, "Are You sure to delete", "Yes/No", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (delConfirm == JOptionPane.YES_OPTION) {
            try {

                ps = DbConnection.cn.prepareStatement("delete from model_details where id = ?");
                ps.setInt(1, Integer.parseInt(txtID.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record has been deleted ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "btnDelete\n" + e);
            }
            refreshTable();
        }


    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void tblModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblModelMouseClicked
        try {
            int row = tblModel.getSelectedRow();
            String Model_click = (tblModel.getModel().getValueAt(row, 0).toString());
            ps1 = DbConnection.cn.prepareStatement("select * from model_details where model='" + Model_click + "'");
            rs1 = ps1.executeQuery();
            if (rs1.next()) {
                String a = rs1.getString("model");
                String b = rs1.getString("ID");
                txtNewModel.setText(a);
                txtID2.setText(b);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tblModelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CC;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JPanel color;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblNewCC;
    private javax.swing.JLabel lblNewColor;
    private javax.swing.JLabel lblNewModel;
    private javax.swing.JPanel model;
    private javax.swing.JTable tblCC;
    private javax.swing.JTable tblColor;
    private javax.swing.JTable tblModel;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtNewCC;
    private javax.swing.JTextField txtNewColor;
    private javax.swing.JTextField txtNewModel;
    // End of variables declaration//GEN-END:variables
}

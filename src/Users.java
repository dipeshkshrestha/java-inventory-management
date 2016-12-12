import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Users extends javax.swing.JInternalFrame {

    PreparedStatement ps;
    
    
    public Users() {
        initComponents();
        DbConnection.FillConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnQuery = new javax.swing.JButton();
        lblPassword1 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userDetails = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-add-icon.png"))); // NOI18N
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

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 0))); // NOI18N

        lblPassword.setText("Password");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblRole.setText("user role");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Stock", "Sales" }));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblID.setText("USER ID");

        lblUsername.setText("Username");

        btnQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        lblPassword1.setText("Re-Password");

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnQuery)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblRole)
                            .addComponent(lblPassword1)
                            .addComponent(lblUsername))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(txtPassword1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblID)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Users", jPanel2);

        userDetails.setBackground(new java.awt.Color(204, 204, 255));
        userDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "User Role"
            }
        ));
        userDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(userDetails);

        jTabbedPane1.addTab("User Details", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            ps = DbConnection.cn.prepareStatement("update user_details set name = ?, username = ?, password = ?,  user_role = ? where user_id = ?");
            ps.setString(1, txtName.getText());
            ps.setString(2, txtUsername.getText());
            ps.setString(3, txtPassword.getText());
            ps.setString(4, cmbRole.getSelectedItem().toString());
            ps.setString(5, txtID.getText());

            int edit = ps.executeUpdate();
            if(edit >= 1)
            {
                JOptionPane.showMessageDialog(null, "Record Updated");
            }
            else{
                JOptionPane.showMessageDialog(null, "Record not updated");
            }

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "error in update\n" +ex);
        }
        refreshtable();
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    public void cleartext () //to clear fields
    {
        txtName.setText("");          
        txtUsername.setText("");
        txtPassword.setText("");
        txtPassword1.setText("");
        cmbRole.setSelectedIndex(0);
        
    }
    
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int delConfirm = JOptionPane.showConfirmDialog(null, "Are You sure to delete","Yes/No", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(delConfirm==JOptionPane.YES_OPTION)
        {
            try{
                
                ps = DbConnection.cn.prepareStatement("delete from user_details where user_id = ?");
                ps.setInt(1, Integer.parseInt(txtID.getText()));
                int result = ps.executeUpdate();
                if(result >= 1)
                {
                    JOptionPane.showMessageDialog(null, "Record has been deleted ");
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "btnDelete\n" +e);
            }
            refreshtable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals("") || (txtUsername.getText().equals("")) || (txtPassword.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Field should not be empty");
            return;
        }
        String name = txtName.getText();
        if(!name.matches("[a-zA-Z\\s]*"))
        {
            JOptionPane.showMessageDialog(null, "Invalid name format");
            return;
            
        }
        String username = txtUsername.getText();
        if(!username.matches("[a-zA-Z\\s]*"))
        {
            JOptionPane.showMessageDialog(null, "Invalid username format");
            return;
            
        }
        if(txtPassword.getText().equals(txtPassword1.getText()))
      
        {
            try {
                

                String strdata="Insert into user_details (name, username, password, user_role)values(?,?,?,?)";

                ps=DbConnection.cn.prepareStatement(strdata);

                ps.setString(1, txtName.getText());
                ps.setString(2, txtUsername.getText());
                ps.setString(3, txtPassword.getText());
                ps.setString(4, cmbRole.getSelectedItem().toString());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "New User Added Successfully");
                cleartext();

            }
            catch (Exception en)
            {
                JOptionPane.showMessageDialog(null, "\n" + en);
            }
        }
        else if (!txtPassword.getText().equals(txtPassword1.getText()))
        {
            JOptionPane.showMessageDialog(null, "Password doesn't Matched");
        }
        refreshtable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
        if(txtID.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter User ID");
                    return;
                }
         if(!txtID.getText().matches("[0-9\\.|]*"))
        {
            JOptionPane.showMessageDialog(null, "Invalid Format");
            cleartext();
            return;         
        }
        try{
            int data= 0;

            ps = DbConnection.cn.prepareStatement("select * from user_details where user_id = ? ");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                data = 1;

                txtName.setText(rs.getString(2));
                txtUsername.setText(rs.getString(3));
                txtPassword.setText(rs.getString(4));
                cmbRole.setSelectedItem(rs.getString(5));

            }
            if(data == 0)
            {
                JOptionPane.showMessageDialog(null, "Member Id not found ");
                cleartext();
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in search" +e);
            
        }
    }//GEN-LAST:event_btnQueryActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
                //LOAD DATA FROM DATABASE TABLE IN JTABLE
        try
        {
        ps=DbConnection.cn.prepareStatement("Select user_id, name, username, user_role From user_details");
        ResultSet rs=ps.executeQuery();
        userDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ex)
        {}
    }//GEN-LAST:event_formInternalFrameOpened

    private void refreshtable()
    {
        try
        {
        ps=DbConnection.cn.prepareStatement("Select user_id, name, username, user_role From user_details");
        ResultSet rs=ps.executeQuery();
        userDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error loading table");
        }
    }
    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnQuery;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTable userDetails;
    // End of variables declaration//GEN-END:variables
}

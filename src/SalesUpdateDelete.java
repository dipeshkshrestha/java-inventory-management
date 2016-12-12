
import java.io.PrintWriter;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SalesUpdateDelete extends javax.swing.JInternalFrame {
    
    int i, j, ref = 0;
        
        PreparedStatement ps, ps1, ps2, ps3, ps4, ps5, ps6;
        ResultSet rs2, rs3, rs4;
        String paymode = "";
        
        String regno []= new String [100];
        
    public SalesUpdateDelete() {
        initComponents();
        
        DbConnection.FillConnection();
        txtModel.setEnabled(false);
        txtCC.setEnabled(false);
        txtEngineNo.setEnabled(false);
        txtChasisNo.setEnabled(false);
        txtSP.setEnabled(false);
        txtColor.setEnabled(false);
        
        ButtonGroup BG= new ButtonGroup();
        BG.add(rbCash);
        BG.add(rbCredit); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtModel = new javax.swing.JTextField();
        lblEngineNo = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        txtEngineNo = new javax.swing.JTextField();
        lblSP = new javax.swing.JLabel();
        lblChasisNo = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtChasisNo = new javax.swing.JTextField();
        lblTotAmt = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        lblDisPer = new javax.swing.JLabel();
        txtChqNo = new javax.swing.JTextField();
        lblDisAmt = new javax.swing.JLabel();
        lblCC = new javax.swing.JLabel();
        lblVatPer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblVatAmt = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        txtSP = new javax.swing.JTextField();
        rbCash = new javax.swing.JRadioButton();
        txtQty = new javax.swing.JTextField();
        rbCredit = new javax.swing.JRadioButton();
        lblBillNo = new javax.swing.JLabel();
        txtTotAmt = new javax.swing.JTextField();
        lblRegNo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDisPer = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDisAmt = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        lblCustName = new javax.swing.JLabel();
        txtVatPer = new javax.swing.JTextField();
        cmbRegNo = new javax.swing.JComboBox();
        lblAddress = new javax.swing.JLabel();
        txtVatAmt = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblModel = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JTextField();
        lblPaymentMode = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblChqNo = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Update / Delete Sales");
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

        lblEngineNo.setText("Engine No.");

        lblContact.setText("Contact No.");

        lblSP.setText("Selling Price");

        lblChasisNo.setText("Chasis No.");

        lblQty.setText("QTY");

        lblTotAmt.setText("Total Amount");

        lblDisPer.setText("Discount %");

        lblDisAmt.setText("Amount after Discount");

        lblCC.setText("CC");

        lblVatPer.setText("VAT %");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblVatAmt.setText("VAT Amount");

        lblGrandTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGrandTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblGrandTotal.setText("Grand Total");

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        rbCash.setText("Cash");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });

        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });

        rbCredit.setText("Credit");
        rbCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditActionPerformed(evt);
            }
        });

        lblBillNo.setText("Bill No.");

        lblRegNo.setText("Registration No.");

        txtDisPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDisPerFocusLost(evt);
            }
        });

        lblDate.setText("Date");

        txtDate.setDateFormatString("yyyy-MM-dd");

        lblCustName.setText("Customer Name");

        txtVatPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVatPerFocusLost(evt);
            }
        });

        cmbRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegNoActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblModel.setText("Model");

        txtGrandTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGrandTotalFocusLost(evt);
            }
        });

        lblPaymentMode.setText("Payment Mode");

        lblBankName.setText("Bank Name");

        lblChqNo.setText("Cheque No.");

        Description.setText("Description");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblColor.setText("Color");

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Description)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBillNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDate)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVatAmt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGrandTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVatPer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDisAmt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDisPer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTotAmt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQty, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDisPer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDisAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVatPer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVatAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustName)
                                    .addComponent(lblPaymentMode)
                                    .addComponent(lblBankName)
                                    .addComponent(lblChqNo)
                                    .addComponent(lblEngineNo)
                                    .addComponent(lblAddress)
                                    .addComponent(lblRegNo)
                                    .addComponent(lblModel)
                                    .addComponent(lblColor)
                                    .addComponent(lblChasisNo))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtBankName, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(rbCash)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rbCredit))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtEngineNo, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(txtModel)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(lblCC)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                        .addComponent(cmbRegNo, javax.swing.GroupLayout.Alignment.LEADING, 0, 211, Short.MAX_VALUE)
                                                        .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtChasisNo, javax.swing.GroupLayout.Alignment.LEADING))))
                                            .addComponent(txtChqNo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 290, Short.MAX_VALUE))
                                    .addComponent(txtCName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(10, 10, 10)
                                .addComponent(btnEdit)
                                .addGap(10, 10, 10)
                                .addComponent(btnDelete)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBillNo)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDate)
                        .addComponent(btnSearch))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustName)
                    .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegNo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCC)
                            .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEngineNo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChasisNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChasisNo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblPaymentMode)
                            .addComponent(rbCash)
                            .addComponent(rbCredit))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBankName)
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChqNo)
                            .addComponent(txtChqNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(Description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContact))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSP))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQty))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotAmt))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDisPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisPer))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDisAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisAmt))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVatPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVatPer))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVatAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVatAmt))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrandTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete)
                            .addComponent(jButton1))
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {            
                PreparedStatement ps1 = (PreparedStatement) DbConnection.cn.prepareStatement("update sales set Date =? , cust_name =?, address=?, contact_no=?, reg_no=?, selling_price=?, model=?, cc=?, qty=?, "
                        + "total_amt=?, engine_no=?, dis_per=?, chasis_no=?, amt_after_dis=?, payment_mode=?, vat_per=?, bank_name=?, vat_amt=?, chq_no=?, grand_total=?, description=?, color=? where bill_no=?");
      
                ps1.setString(1, ((JTextField) txtDate.getDateEditor().getUiComponent()).getText());
                ps1.setString(2, txtCName.getText());
                ps1.setString(3, txtAddress.getText());
                ps1.setString(4, txtContact.getText());
                ps1.setString(5, cmbRegNo.getSelectedItem().toString());
                ps1.setString(6, txtSP.getText());
                ps1.setString(7, txtModel.getText());
                ps1.setString(8, txtCC.getText());
                ps1.setString(9, txtQty.getText());
                ps1.setString(10, txtTotAmt.getText());
                ps1.setString(11, txtEngineNo.getText());
                ps1.setString(12, txtDisPer.getText());
                ps1.setString(13, txtChasisNo.getText());
                ps1.setString(14, txtDisAmt.getText());
                ps1.setString(15, paymode);
                ps1.setString(16, txtVatPer.getText());
                ps1.setString(17, txtBankName.getText());
                ps1.setString(18, txtVatAmt.getText());
                ps1.setString(19, txtChqNo.getText());
                ps1.setString(20, txtGrandTotal.getText());
                ps1.setString(21, txtDescription.getText());
                ps1.setString(22, txtColor.getText());
                ps1.setString(23, txtID.getText());
            int edit = ps1.executeUpdate();
            if (edit >= 1)
            {
                JOptionPane.showMessageDialog(null, "Record Updated");
                        
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "Record Not updated");
            }
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "error in update" + ex);
            
        }
        cleartext();
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void rbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCashActionPerformed

        txtBankName.setEnabled(false);
        txtChqNo.setEnabled(false);

    }//GEN-LAST:event_rbCashActionPerformed

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        double SP = Double.parseDouble(txtSP.getText());
        double qty = 1;
        txtQty.setText("1");

        //        double DisPer = Double.parseDouble(txtDisPer.getText());
        //
        //        double VatPer = Double.parseDouble(txtVatPer.getText());
        //
        double TA = SP*qty; //Total Amount
        //        txtTotAmt.setText(String.valueOf(TA));
        //
        //        double TempAFD =TA * (DisPer/100); //Discount Calculation
        //        double AmtAfterDis = TA-TempAFD; // Discount Amount
        //        txtDisAmt.setText(String.valueOf(TA));
        //
        //        double TempVA = AmtAfterDis * (VatPer/100); // Vat Calculation
        //        double VatAmt = AmtAfterDis + TempVA; // Vat Amount
        //        txtVatAmt.setText(String.valueOf(VatAmt));
        //
        //        double GT = AmtAfterDis + VatAmt; // Grand Total

        txtTotAmt.setText(String.valueOf(TA));
        //        txtDisAmt.setText(String.valueOf(AmtAfterDis));
        //        txtVatAmt.setText(String.valueOf(VatAmt));
        //        txtGrandTotal.setText(String.valueOf(GT));
    }//GEN-LAST:event_txtQtyFocusLost

    private void rbCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCreditActionPerformed

        txtBankName.setEnabled(true);
        txtChqNo.setEnabled(true);
    }//GEN-LAST:event_rbCreditActionPerformed

    private void txtDisPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDisPerFocusLost
        if(txtDisPer.getText().length()<1) txtDisPer.setText("0.0");
        double SP = Double.parseDouble(txtSP.getText());
        double qty = Double.parseDouble(txtQty.getText());
        double DisPer = Double.parseDouble(txtDisPer.getText());
        double TA = SP*qty;
        double TempAFD =TA * (DisPer/100); //Discount Calculation
        double AmtAfterDis = TA-TempAFD; // Discount Amount

        txtDisAmt.setText(String.valueOf(AmtAfterDis));
        if(txtDisPer.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Discount Percentage");
        return;
        }
    }//GEN-LAST:event_txtDisPerFocusLost

    private void txtVatPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVatPerFocusLost
        double SP = Double.parseDouble(txtSP.getText());
        double qty = Double.parseDouble(txtQty.getText());
        double DisPer = Double.parseDouble(txtDisPer.getText());
        double TA = SP*qty;
        double TempAFD =TA * (DisPer/100); //Discount Calculation
        double AmtAfterDis = TA-TempAFD; // Discount Amount
        //double VatPer = Double.parseDouble(txtVatPer.getText());
        double VatPer = 13;
        txtVatPer.setText("13");
        double TempVA = AmtAfterDis * (VatPer/100); // Vat Calculation
        //double VatAmt = AmtAfterDis + TempVA; // Vat Amount
        txtVatAmt.setText(String.valueOf(TempVA));

    }//GEN-LAST:event_txtVatPerFocusLost

    private void cmbRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegNoActionPerformed
        try{
            PreparedStatement ps1 = DbConnection.cn.prepareStatement("select model, engine_capacity, selling_price, engine_number, chasis_number, color from stock where reg_no = ?");
            ps1.setString(1, cmbRegNo.getSelectedItem().toString());

            ResultSet rs2 = ps1.executeQuery();
            while(rs2.next())
            {
                txtModel.setText(rs2.getString("model"));
                txtCC.setText(rs2.getString("engine_capacity"));
                txtSP.setText(rs2.getString("selling_price"));
                txtEngineNo.setText(rs2.getString("engine_number"));
                txtChasisNo.setText(rs2.getString("chasis_number"));
                txtColor.setText(rs2.getString("color"));
            }

        }
        catch(Exception ex){

        }

    }//GEN-LAST:event_cmbRegNoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to delete", "Delete", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION)
        {
            try
            {  
                String entrytostock = "INSERT INTO stock (Date, Model, Color, Reg_No, Engine_Capacity, Engine_Number, Chasis_Number, Selling_Price) values (?,?,?,?,?,?,?,?)";
                
                
                ps = DbConnection.cn.prepareStatement(entrytostock);
                ps.setString(1, ((JTextField) txtDate.getDateEditor().getUiComponent()).getText());
                ps.setString(2, txtModel.getText());
                ps.setString(3, txtColor.getText());
                ps.setString(4, cmbRegNo.getSelectedItem().toString());
                ps.setString(5, txtCC.getText());
                ps.setString(6, txtEngineNo.getText());
                ps.setString(7, txtChasisNo.getText());
                ps.setString(8, txtSP.getText());

                ps.executeUpdate();
                
                ps = DbConnection.cn.prepareStatement("delete from sales where bill_no = ?");
                ps.setString(1, txtID.getText());
                int del = ps.executeUpdate();
                if (del >= 1)
                {
                    JOptionPane.showMessageDialog(null, "Deleted");     
                   cleartext();
                    
                }             
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error/n"+ e);
            }
            
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtGrandTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGrandTotalFocusLost
        double SP = Double.parseDouble(txtSP.getText());
        double qty = Double.parseDouble(txtQty.getText());
        double DisPer = Double.parseDouble(txtDisPer.getText());
        double TA = SP*qty;
        double TempAFD =TA * (DisPer/100); //Discount Calculation
        double AmtAfterDis = TA-TempAFD; // Discount Amount
        double VatPer = Double.parseDouble(txtVatPer.getText());
        double TempVA = AmtAfterDis * (VatPer/100); // Vat Calculation
        //double VatAmt = AmtAfterDis + TempVA; // Vat Amount
        double GT = AmtAfterDis + TempVA; // Grand Total
        txtGrandTotal.setText(String.valueOf(GT));
    }//GEN-LAST:event_txtGrandTotalFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            
            i = 0;
            
           ps6 = DbConnection.cn.prepareStatement("Select reg_no from stock_backup");
           
            
            ResultSet rs5 = ps6.executeQuery();
            while (rs5.next())
            {
               regno[i] = rs5.getString(1);
                i++;
            }
            for (j = 0; j < i; j++)
            {
                cmbRegNo.addItem(regno[j]);
            }
            
            cmbRegNo.setSelectedItem(regno[0]);
            
        } catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            //dispose();
        }  
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       if(txtID.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Bill No");
                    return;
                }
       if(!txtID.getText().matches("[0-9\\.|]*"))
        {
            JOptionPane.showMessageDialog(null, "Invalid Format");
            cleartext();
            return;         
        }
        try {
            int data= 0;
            
            PreparedStatement pstat1 = DbConnection.cn.prepareStatement("select * from sales where bill_no = ?");
            pstat1.setString(1, txtID.getText());

            ResultSet rs = pstat1.executeQuery();

            while (rs.next()) {
                data = 1;
                txtDate.setDate(rs.getDate("date"));
                txtCName.setText(rs.getString("cust_name"));
                txtAddress.setText(rs.getString("address"));                                                                               
                txtContact.setText(rs.getString("contact_no"));
                cmbRegNo.setSelectedItem(rs.getString("reg_no"));
                txtSP.setText(rs.getString("selling_price"));
                txtModel.setText(rs.getString("model"));
                txtCC.setText(rs.getString("cc"));                                               
                txtQty.setText(rs.getString("qty"));   
                txtColor.setText(rs.getString("color"));
                txtEngineNo.setText(rs.getString("engine_no"));
                txtTotAmt.setText(rs.getString("total_amt"));
                txtChasisNo.setText(rs.getString("chasis_no"));
                txtDisPer.setText(rs.getString("dis_per"));
                paymode = rs.getString("payment_mode");
                if (paymode.equals("Cash")) {
                    rbCash.setSelected(true);
                } 
                else 
                {
                    rbCredit.setSelected(true);
                }
                txtDisAmt.setText(rs.getString("amt_after_dis"));
                txtBankName.setText(rs.getString("bank_name"));
                txtVatPer.setText(rs.getString("vat_per"));
                txtChqNo.setText(rs.getString("chq_no"));
                txtVatAmt.setText(rs.getString("vat_amt"));                
                txtDescription.setText(rs.getString("description"));
                txtGrandTotal.setText(rs.getString("grand_total"));
                

            }
            if(data == 0)
            {
                JOptionPane.showMessageDialog(null, " Wrong Bill No ");
                cleartext();
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "error\n" + ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String s="Invoice\r\n";
    s=s+
                "Bill N0.:" +txtID.getText()+"\r\t\t\t\t\t"+ "Date:" +txtDate.getDate()+"\r\n"+
                "Customer Name:" +txtCName.getText()+"\r\n"+ 
                "Address:" +txtAddress.getText()+"\r\t\t\t\t"+ "Contact No.:"+txtContact.getText()+"\r\n"+ 
                "Registration No.:" +cmbRegNo.getSelectedItem().toString()+"\r\t\t\t\t"+ "Selling Price:" +txtSP.getText()+"\r\n"+ 
                "Model:" +txtModel.getText()+"\r\t"+ "CC:"+txtCC.getText()+"\r\t\t\t\t"+ "QTY.:"+txtQty.getText()+"\r\n"+
                "Color:" +txtColor.getText()+"\r\t\t\t\t\t"+ "Total Amount:"+txtTotAmt.getText()+"\r\n\n"+
                "Engine No.:" +txtEngineNo.getText()+"\r\t\t\t"+ "Discount Per:"+txtDisPer.getText()+"\r\n"+
                "Chasis No:" +txtChasisNo.getText()+"\r\t\t\t"+ "Amt after Dis:"+txtDisAmt.getText()+"\r\n"+
                "Payment Mode:" +paymode+"\r\t\t\t"+ "Vat Per.:"+txtVatPer.getText()+"\r\n"+
                "Bank Name:" +txtBankName.getText()+"\r\t\t\t"+ "Vat Amount:"+txtVatAmt.getText()+"\r\n"+
                "Cheque No:" +txtChqNo.getText()+"\r\t\t\t"+ "Grand Total:"+txtGrandTotal.getText()+"\r\n"
                ;
        try{
        PrintWriter writer = new PrintWriter("Invoice.txt");
        writer.write(s);
        writer.close();
        Runtime runTime = Runtime.getRuntime();
	Process process = runTime.exec("notepad temp.txt");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cleartext() //to clear fields
        {
            txtDate.setDate(null);
            txtCName.setText("");
            txtAddress.setText("");
            txtContact.setText("");
            cmbRegNo.setSelectedIndex(0);
            txtModel.setText("");
            txtCC.setText("");
            txtSP.setText("");
            txtQty.setText("");
            txtEngineNo.setText("");
            txtTotAmt.setText("");
            txtChasisNo.setText("");
            txtDisPer.setText("");
            txtDisAmt.setText("");
            txtTotAmt.setText("");
            txtBankName.setText("");
            txtVatPer.setText("");
            txtChqNo.setText("");
            txtVatAmt.setText("");
            txtDescription.setText("");
            txtGrandTotal.setText("");
            txtColor.setText("");

    }                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbRegNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblBillNo;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblChasisNo;
    private javax.swing.JLabel lblChqNo;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDisAmt;
    private javax.swing.JLabel lblDisPer;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPaymentMode;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblRegNo;
    private javax.swing.JLabel lblSP;
    private javax.swing.JLabel lblTotAmt;
    private javax.swing.JLabel lblVatAmt;
    private javax.swing.JLabel lblVatPer;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbCredit;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtChasisNo;
    private javax.swing.JTextField txtChqNo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDisAmt;
    private javax.swing.JTextField txtDisPer;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSP;
    private javax.swing.JTextField txtTotAmt;
    private javax.swing.JTextField txtVatAmt;
    private javax.swing.JTextField txtVatPer;
    // End of variables declaration//GEN-END:variables
}

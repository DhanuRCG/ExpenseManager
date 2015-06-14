/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epicsoft.expensemanager.view;

import com.epicsoft.expensemanager.controller.IncomeCategoryController;
import com.epicsoft.expensemanager.controller.PaymentMethodController;
import com.epicsoft.expensemanager.model.Income;
import com.epicsoft.expensemanager.model.IncomeCategory;
import com.epicsoft.expensemanager.controller.IncomeController;
import com.epicsoft.expensemanager.model.PaymentMethod;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class AddIncomeDialogbox extends javax.swing.JDialog {
    
    private static String user;

    /**
     * Creates new form AddIncomeDialogbox
     */
    public AddIncomeDialogbox(java.awt.Frame parent, boolean modal, String user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        dateChooser.setDate(new Date());
        try {
            fillIncomeCategoryComboBox();
            fillPaymentMethodComboBox();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddIncomeDialogbox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddIncomeDialogbox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        paymentMethodLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        paymentMethodComboBox = new javax.swing.JComboBox();
        incomeCategoryComboBox = new javax.swing.JComboBox();
        amountTextField = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        accountComboBox = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JLabel();
        saveAndNewButton = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Income");

        accLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accLabel.setText("Account");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setText("Date");

        amountLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amountLabel.setText("Amount");

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryLabel.setText("Category");

        paymentMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        paymentMethodLabel.setText("Payment Method");

        descriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descriptionLabel.setText("Description");

        paymentMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        incomeCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        accountComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/epicsoft/expensemanager/guiImages/CancelActive.png"))); // NOI18N
        cancelButton.setText("jLabel9");
        cancelButton.setPreferredSize(new java.awt.Dimension(90, 30));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        saveAndNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/epicsoft/expensemanager/guiImages/Save&NewInactive.png"))); // NOI18N
        saveAndNewButton.setText("jLabel8");
        saveAndNewButton.setPreferredSize(new java.awt.Dimension(90, 30));

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/epicsoft/expensemanager/guiImages/SaveInactive.png"))); // NOI18N
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accLabel)
                            .addComponent(amountLabel)
                            .addComponent(categoryLabel)
                            .addComponent(paymentMethodLabel)
                            .addComponent(descriptionLabel)
                            .addComponent(dateLabel))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descriptionTextField)
                            .addComponent(accountComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(amountTextField)
                            .addComponent(incomeCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentMethodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(25, 25, 25)
                        .addComponent(saveAndNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accLabel)
                    .addComponent(accountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateLabel)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(incomeCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentMethodLabel)
                    .addComponent(paymentMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(saveAndNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        String account = accountComboBox.getSelectedItem().toString();
        Date date = dateChooser.getDate();
        int amount = Integer.parseInt(amountTextField.getText());
        String category = incomeCategoryComboBox.getSelectedItem().toString();
        String paymentMethod = paymentMethodComboBox.getSelectedItem().toString();
        String description = descriptionTextField.getText();
        java.util.Date utilDate = date;
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Income income = new Income(account,sqlDate, category, amount, description, paymentMethod);
        
        try {
            int res = IncomeController.addIncome(income,"testuser","root","dhanu");
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Income Saved Successfully...", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Income saving failed...", "", JOptionPane.ERROR_MESSAGE);
            }
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IncomeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IncomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    /**
     * 
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    private void fillIncomeCategoryComboBox() throws ClassNotFoundException, SQLException{
        IncomeCategoryController iCC = new IncomeCategoryController();
        List<IncomeCategory> allIncomeCategories = iCC.getAllIncomeCategory(user, "", "");
        incomeCategoryComboBox.removeAllItems();
        for (IncomeCategory incomeCategory : allIncomeCategories) {
            incomeCategoryComboBox.addItem(incomeCategory);
        }
    }
    
    /**
     * 
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    private void fillPaymentMethodComboBox() throws ClassNotFoundException, SQLException{
        PaymentMethodController pmc = new PaymentMethodController();
        List<PaymentMethod> paymentMethods = pmc.getAllPaymentMethods(user, "", "");
        paymentMethodComboBox.removeAllItems();
        
        for (PaymentMethod paym : paymentMethods) {
            paymentMethodComboBox.addItem(paym);
        }
    }
    
    private void fillAccountComboBox() throws ClassNotFoundException, SQLException{
        IncomeCategoryController iCC = new IncomeCategoryController();
        List<IncomeCategory> allIncomeCategories = iCC.getAllIncomeCategory(user, "", "");
        incomeCategoryComboBox.removeAllItems();
        for (IncomeCategory incomeCategory : allIncomeCategories) {
            incomeCategoryComboBox.addItem(incomeCategory);
        }
    }
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
            java.util.logging.Logger.getLogger(AddIncomeDialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddIncomeDialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddIncomeDialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddIncomeDialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddIncomeDialogbox dialog = new AddIncomeDialogbox(new javax.swing.JFrame(), true, user);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLabel;
    private javax.swing.JComboBox accountComboBox;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel categoryLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JComboBox incomeCategoryComboBox;
    private javax.swing.JComboBox paymentMethodComboBox;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.JLabel saveAndNewButton;
    private javax.swing.JLabel saveButton;
    // End of variables declaration//GEN-END:variables
}

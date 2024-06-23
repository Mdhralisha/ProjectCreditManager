/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author DELL
 */
public class CreditRequest extends javax.swing.JFrame {

    /**
     * Creates new form CreditRequest
     */
    public CreditRequest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_customer = new javax.swing.JPanel();
        lbl_full_name = new javax.swing.JLabel();
        text_full_name = new javax.swing.JTextField();
        lbl_dob = new javax.swing.JLabel();
        text_dob = new javax.swing.JTextField();
        lbl_address = new javax.swing.JLabel();
        text_address = new javax.swing.JTextField();
        panel_property = new javax.swing.JPanel();
        lbl_valuation = new javax.swing.JLabel();
        text_valuation = new javax.swing.JTextField();
        lbl_property_type = new javax.swing.JLabel();
        text_property_type = new javax.swing.JTextField();
        lbl_valuation_date = new javax.swing.JLabel();
        text_valuation_date = new javax.swing.JTextField();
        panel_income = new javax.swing.JPanel();
        lbl_income_source = new javax.swing.JLabel();
        text_income_source = new javax.swing.JTextField();
        lbl_annual_income = new javax.swing.JLabel();
        text_annual_income = new javax.swing.JTextField();
        panel_credit = new javax.swing.JPanel();
        lbl_credit_type = new javax.swing.JLabel();
        text_credit_type = new javax.swing.JTextField();
        lbl_credit_amount = new javax.swing.JLabel();
        text_credit_amount = new javax.swing.JTextField();
        lbl_eligible = new javax.swing.JLabel();
        text_eligible = new javax.swing.JTextField();
        lbl_credit_status = new javax.swing.JLabel();
        text_credit_status = new javax.swing.JTextField();
        btn_add_request = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD CREDIT REQUEST | CREDIT MANAGER");

        panel_customer.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer_Details"));

        lbl_full_name.setText("Full Name:");

        text_full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_full_nameActionPerformed(evt);
            }
        });

        lbl_dob.setText("Date of Birth");

        text_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_dobActionPerformed(evt);
            }
        });

        lbl_address.setText("Permanent Address:");

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_full_name)
                    .addComponent(lbl_dob)
                    .addComponent(lbl_address))
                .addGap(37, 37, 37)
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_full_name)
                    .addComponent(text_dob)
                    .addComponent(text_address, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_full_name)
                    .addComponent(text_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dob)
                    .addComponent(text_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_address)
                    .addComponent(text_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panel_property.setBorder(javax.swing.BorderFactory.createTitledBorder("Property_Details"));

        lbl_valuation.setText("Property Valuation:");

        text_valuation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_valuationActionPerformed(evt);
            }
        });

        lbl_property_type.setText("Propert Type:");

        lbl_valuation_date.setText("Valuation Date:");

        text_valuation_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_valuation_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_propertyLayout = new javax.swing.GroupLayout(panel_property);
        panel_property.setLayout(panel_propertyLayout);
        panel_propertyLayout.setHorizontalGroup(
            panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_propertyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valuation)
                    .addComponent(lbl_valuation_date)
                    .addComponent(lbl_property_type))
                .addGap(35, 35, 35)
                .addGroup(panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_valuation_date)
                    .addComponent(text_valuation, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_property_type, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panel_propertyLayout.setVerticalGroup(
            panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_propertyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valuation)
                    .addComponent(text_valuation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_property_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_property_type, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valuation_date)
                    .addComponent(text_valuation_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel_income.setBorder(javax.swing.BorderFactory.createTitledBorder("Income  Details\n"));

        lbl_income_source.setText("Income Source:");

        text_income_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_income_sourceActionPerformed(evt);
            }
        });

        lbl_annual_income.setText("Annual Income");

        javax.swing.GroupLayout panel_incomeLayout = new javax.swing.GroupLayout(panel_income);
        panel_income.setLayout(panel_incomeLayout);
        panel_incomeLayout.setHorizontalGroup(
            panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_incomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_income_source)
                    .addComponent(lbl_annual_income))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_income_source, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(text_annual_income))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_incomeLayout.setVerticalGroup(
            panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_incomeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_income_source)
                    .addComponent(text_income_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_annual_income)
                    .addComponent(text_annual_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panel_credit.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit Details"));

        lbl_credit_type.setText("Credit Type:");

        text_credit_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_credit_typeActionPerformed(evt);
            }
        });

        lbl_credit_amount.setText("Credit Amount");

        lbl_eligible.setText("Is Eligible");

        text_eligible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_eligibleActionPerformed(evt);
            }
        });

        lbl_credit_status.setText("Credit Status:");

        javax.swing.GroupLayout panel_creditLayout = new javax.swing.GroupLayout(panel_credit);
        panel_credit.setLayout(panel_creditLayout);
        panel_creditLayout.setHorizontalGroup(
            panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_creditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_creditLayout.createSequentialGroup()
                        .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_credit_type)
                            .addComponent(lbl_credit_amount)
                            .addComponent(lbl_eligible))
                        .addGap(37, 37, 37)
                        .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_credit_type, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(text_credit_amount))
                            .addComponent(text_credit_status, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                    .addGroup(panel_creditLayout.createSequentialGroup()
                        .addComponent(lbl_credit_status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_eligible, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_creditLayout.setVerticalGroup(
            panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_creditLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_credit_type)
                    .addComponent(text_credit_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_credit_amount)
                    .addComponent(text_credit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eligible)
                    .addComponent(text_credit_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_creditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_credit_status)
                    .addComponent(text_eligible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btn_add_request.setText("Add Credit Request");
        btn_add_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_requestActionPerformed(evt);
            }
        });

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_credit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btn_add_request, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(panel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_property, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panel_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(panel_credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_request)
                    .addComponent(btn_close))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_full_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_full_nameActionPerformed

    private void text_valuationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_valuationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_valuationActionPerformed

    private void text_income_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_income_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_income_sourceActionPerformed

    private void text_valuation_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_valuation_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_valuation_dateActionPerformed

    private void text_credit_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_credit_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_credit_typeActionPerformed

    private void btn_add_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_requestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_requestActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_closeActionPerformed

    private void text_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_dobActionPerformed

    private void text_eligibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_eligibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_eligibleActionPerformed

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
            java.util.logging.Logger.getLogger(CreditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_request;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_annual_income;
    private javax.swing.JLabel lbl_credit_amount;
    private javax.swing.JLabel lbl_credit_status;
    private javax.swing.JLabel lbl_credit_type;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_eligible;
    private javax.swing.JLabel lbl_full_name;
    private javax.swing.JLabel lbl_income_source;
    private javax.swing.JLabel lbl_property_type;
    private javax.swing.JLabel lbl_valuation;
    private javax.swing.JLabel lbl_valuation_date;
    private javax.swing.JPanel panel_credit;
    private javax.swing.JPanel panel_customer;
    private javax.swing.JPanel panel_income;
    private javax.swing.JPanel panel_property;
    private javax.swing.JTextField text_address;
    private javax.swing.JTextField text_annual_income;
    private javax.swing.JTextField text_credit_amount;
    private javax.swing.JTextField text_credit_status;
    private javax.swing.JTextField text_credit_type;
    private javax.swing.JTextField text_dob;
    private javax.swing.JTextField text_eligible;
    private javax.swing.JTextField text_full_name;
    private javax.swing.JTextField text_income_source;
    private javax.swing.JTextField text_property_type;
    private javax.swing.JTextField text_valuation;
    private javax.swing.JTextField text_valuation_date;
    // End of variables declaration//GEN-END:variables
}

package hospitalproject;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dave
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        newpatient = new javax.swing.JButton();
        newpatientinform = new javax.swing.JButton();
        parmacy = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        hsignout = new javax.swing.JButton();
        tbill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1365, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newpatient.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        newpatient.setText("Add New Patient");
        newpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpatientActionPerformed(evt);
            }
        });
        getContentPane().add(newpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, -1));

        newpatientinform.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        newpatientinform.setText("Add Patient Information");
        newpatientinform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpatientinformActionPerformed(evt);
            }
        });
        getContentPane().add(newpatientinform, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        parmacy.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parmacy.setText("Pharmacy");
        parmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parmacyActionPerformed(evt);
            }
        });
        getContentPane().add(parmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 6, -1, -1));

        hsignout.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        hsignout.setText("SignOut");
        hsignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsignoutActionPerformed(evt);
            }
        });
        getContentPane().add(hsignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        tbill.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tbill.setText("Bills");
        tbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbillActionPerformed(evt);
            }
        });
        getContentPane().add(tbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dave\\Downloads\\pexels-pixabay-263402(1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpatientActionPerformed
        // TODO add your handling code here:
            new newPatient() .setVisible(true);
    }//GEN-LAST:event_newpatientActionPerformed

    private void hsignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsignoutActionPerformed
        // TODO add your handling code here:
        int a;
        a = JOptionPane.showConfirmDialog(null,"Are your sure you want to logout","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            {
            setVisible(false);
            new Login() .setVisible(true);
             }                
    }//GEN-LAST:event_hsignoutActionPerformed

    private void newpatientinformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpatientinformActionPerformed
        // TODO add your handling code here:
          new patientinfo() .setVisible(true);
    }//GEN-LAST:event_newpatientinformActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         int a;
        a = JOptionPane.showConfirmDialog(null,"Are your sure you want to close","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
                          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void parmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parmacyActionPerformed
        // TODO add your handling code here:
         new pharmacy() .setVisible(true);
    }//GEN-LAST:event_parmacyActionPerformed

    private void tbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbillActionPerformed
        // TODO add your handling code here:
        new Bills() .setVisible(true);
    }//GEN-LAST:event_tbillActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hsignout;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newpatient;
    private javax.swing.JButton newpatientinform;
    private javax.swing.JButton parmacy;
    private javax.swing.JButton tbill;
    // End of variables declaration//GEN-END:variables
}

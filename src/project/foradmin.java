/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static project.mycode.con;

/**
 *
 * @author amrit
 */
public class foradmin extends javax.swing.JFrame {

    /**
     * Creates new form foradmin
     */
    char[] a;
    public foradmin() {
        initComponents();
        setBounds(100, 200, 400, 400);
      
        jPasswordField2.setVisible(false);
        jPasswordField3.setVisible(false);
        jButton2.setVisible(false);
        mycode obj1=new mycode();
        obj1.get_connection_status();
         
        obj1.get_connection_status();
       try {
             
             Statement st= con.createStatement();
            String pass="select pass from admin";
            
            ResultSet result=st.executeQuery(pass);
              if(result.next())
              {
                  a=result.getString(1).toCharArray();
                  
              }
            
              }
       catch (SQLException ex) {
             Logger.getLogger(seats.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Enter Current Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(61, 11, 222, 26);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 40, 90, 23);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(60, 40, 220, 20);

        jLabel2.setText("Enter New Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 150, 30);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(60, 160, 230, 30);
        getContentPane().add(jPasswordField3);
        jPasswordField3.setBounds(60, 230, 230, 30);

        jLabel3.setText("Confirm New Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 200, 190, 20);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 270, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        myclass obj=new myclass();
        
        char[] c=jPasswordField1.getText().toCharArray();
        
        if(Arrays.equals(c, a))
        {
            JOptionPane.showMessageDialog(rootPane,"Login Successful");
             jPasswordField2.setVisible(true);
        jPasswordField3.setVisible(true);
        jButton2.setVisible(true);
        jPasswordField1.setVisible(false);
        jButton1.setVisible(false);}
        
        else{
        JOptionPane.showMessageDialog(rootPane,"Password wrong");}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        myclass obj=new myclass();
        char[] m=jPasswordField2.getText().toCharArray();
        char[] n=jPasswordField3.getText().toCharArray();
        
        if(Arrays.equals(m, n))
        {
        try {
             
             
             Statement st= con.createStatement();
            String pass="update admin set pass='"+jPasswordField2.getText()+"'";
            int result=st.executeUpdate(pass);
            
            
            
              if(result==1)
              {
                  
                  
              JOptionPane.showMessageDialog(rootPane, "Password changed successfully");
              
           this.setVisible(false);
        }
            }
        catch (SQLException ex) {
             Logger.getLogger(seats.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "Password mismatch");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(foradmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(foradmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(foradmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(foradmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new foradmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
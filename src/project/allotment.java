package project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static project.login.conn;
import static project.mycode.con;


public class allotment extends javax.swing.JFrame {

    public allotment() {
        initComponents();
        
        setBounds(400, 400, 800, 800);
        mycode obj1=new mycode();
        obj1.get_connection_status();
        jButton2.setEnabled(true);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("GET MERIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSE", "MECHANICAL", "ELECTRONIC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECT SEAT");

        jLabel2.setText("ID");

        jButton3.setText("VIEW AVAIL SEATS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("CATEGORY");

        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(421, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(jButton4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
        String cols[]={"id","name","fname","category","dob","rank","pass","firstprefer","secprefer","thirdprefer","seat_alloted"};
        DefaultTableModel jt=(DefaultTableModel)jTable1.getModel();
        jt.getDataVector().removeAllElements();
        jt.setColumnIdentifiers(cols);
        
         
        try {
          Statement  stmt = con.createStatement();
          ResultSet rs=stmt.executeQuery("select * from register1 order by rank");
            ResultSetMetaData rsmd=rs.getMetaData();
            
            int col=rsmd.getColumnCount();
            Object ob[]=new Object[col];
           while(rs.next())
            {
                 for(int i=0;i<col;i++)
            {
                ob[i]=rs.getObject(i+1);
              //JOptionPane.showMessageDialog(rootPane,"name:"+rs.getString(2)+"id:"+rs.getInt(1)+"subject:"+rs.getString(3)+"marks:"+rs.getInt(4));  
            }
              jt.addRow(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel jt=(DefaultTableModel)jTable1.getModel();
        int xx=jTable1.getSelectedRow();
        int x=(Integer)jt.getValueAt(xx, 0);
        //JOptionPane.showMessageDialog(rootPane, "rrr");
        getSelecteddata(x);
        String b=null;
        try {
         Statement   stmt = con.createStatement();
         String s="select * from register1 where id="+jTextField1.getText();
         ResultSet rs=stmt.executeQuery(s);
         if(rs.next())
         {
             b=rs.getString(11);
         }
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(b!=null)
        {
            jButton2.setEnabled(false);
        }
        else
        {
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
          
          
          
            
            
        int id=Integer.parseInt(jTextField1.getText());
            String t=jComboBox1.getSelectedItem().toString();
            String cat=jComboBox1.getSelectedItem().toString();
        int a=0;
            try {
            Statement st=con.createStatement();
            String s="select "+jTextField2.getText()+" from seats where COURSE='"+cat+"'";
            ResultSet rs= st.executeQuery(s);
            if(rs.next()){    
            a=rs.getInt(1);}
            
            if(a!=0){
            a=a-1;
            try {
            
            
          
            PreparedStatement stmt=con.prepareStatement("update seats set "+jTextField2.getText()+"=? where COURSE =?");
            stmt.setString(2,cat);
            stmt.setInt(1, a);
             stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "seats are not available in this branch try other");
                
            }
            }
            
        
         catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       if(a!=0) {
        try {
            // TODO add your handling code here:
            
          
            PreparedStatement stmt=con.prepareStatement("update register1 set seat_alloted=? where id =?");
            stmt.setInt(2,id);
            stmt.setString(1, t);
             stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
         String cols[]={"id","name","fname","category","dob","rank","pass","Firstprefer","Secprefer","Thirdprefer","seat_alloted"};
        DefaultTableModel jt=(DefaultTableModel)jTable1.getModel();
        jt.getDataVector().removeAllElements();
        jt.setColumnIdentifiers(cols);
        
         
        try {
          Statement  stmt = con.createStatement();
          ResultSet rs=stmt.executeQuery("select * from register1 order by rank");
            ResultSetMetaData rsmd=rs.getMetaData();
            
            int col=rsmd.getColumnCount();
            Object ob[]=new Object[col];
           while(rs.next())
            {
                 for(int i=0;i<col;i++)
            {
                ob[i]=rs.getObject(i+1);
              //JOptionPane.showMessageDialog(rootPane,"name:"+rs.getString(2)+"id:"+rs.getInt(1)+"subject:"+rs.getString(3)+"marks:"+rs.getInt(4));  
            }
              jt.addRow(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
          
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new avail().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
public void getSelecteddata(int x)
{
        try {
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from register1 where id="+x);
            while(rs.next())
        {
           
            int id=rs.getInt(1);
            
            jTextField1.setText("" +id);
            jTextField2.setText(rs.getString(4));
            
            
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(allotment.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(allotment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allotment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allotment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allotment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allotment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

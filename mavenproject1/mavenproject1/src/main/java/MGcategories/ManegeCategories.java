/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MGcategories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author hp
 */
public class ManegeCategories extends javax.swing.JFrame {

    /**
     * Creates new form ManegeCategories
     */
    public ManegeCategories() {
       
        
        Connection con=null;
        Statement st=null;
         ResultSet rs=null;
         
         
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver");
            String url=("jdbc:mysql://localhost:3306/login?useSSL=false");
            
             String username = "root";
	    String password = "1234";
           con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            rs=st.executeQuery("SELECT * FROM cat_table ");
            System.out.println("result"+rs);
          
           
          
        }catch (Exception e){
            
            e.printStackTrace();
        }  
    }
//     </editor-fold>
//     </editor-fold>

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        catname = new javax.swing.JTextField();
        catdescrip = new javax.swing.JTextField();
        catid = new javax.swing.JTextField();
        catadd = new javax.swing.JButton();
        catclear = new javax.swing.JButton();
        catdelete = new javax.swing.JButton();
        catedit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANEGE CATEGORIES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CAT ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DESCRIPTION");

        catadd.setBackground(new java.awt.Color(0, 0, 0));
        catadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catadd.setForeground(new java.awt.Color(242, 242, 242));
        catadd.setText("Add");
        catadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cataddActionPerformed(evt);
            }
        });

        catclear.setBackground(new java.awt.Color(0, 0, 0));
        catclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catclear.setForeground(new java.awt.Color(242, 242, 242));
        catclear.setText("Clear");

        catdelete.setBackground(new java.awt.Color(0, 0, 0));
        catdelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catdelete.setForeground(new java.awt.Color(242, 242, 242));
        catdelete.setText("Detele");

        catedit.setBackground(new java.awt.Color(0, 0, 0));
        catedit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catedit.setForeground(new java.awt.Color(242, 242, 242));
        catedit.setText("Edit");

        catTable.setBackground(new java.awt.Color(242, 242, 242));
        catTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CAT ID", "CAT DESCRIPTION", "CAT NAME"
            }
        ));
        jScrollPane1.setViewportView(catTable);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("CATEGORIES LIST");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("GO BILL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(catadd)
                                .addGap(195, 195, 195))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catedit)
                            .addComponent(catdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(catdelete)
                        .addGap(166, 166, 166)
                        .addComponent(catclear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(328, 328, 328)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addComponent(catname, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(557, 557, 557))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(catname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catadd)
                    .addComponent(catclear)
                    .addComponent(catdelete)
                    .addComponent(catedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cataddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cataddActionPerformed
     
        
         if(catid.getText().isEmpty()||catname.getText().isEmpty()||catdescrip.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Please Enter values");
        }
        else{
//             Connection con = null;
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            String url=("jdbc:mysql://localhost:3306/login?useSSL=false");
            
             String username = "root";
	    String password = "1234";
              Connection con = DriverManager.getConnection(url, username, password);
           
            PreparedStatement add=con.prepareStatement("INSERT INTO cat_table(catid, catname,catdescrip) VALUES (?, ?,?)");
            
            add.setInt(1,Integer.valueOf(catid.getText()));
           
            add.setString(2, catname.getText());
           
            add.setString(3, catdescrip.getText());
           
           
           
            int row = add.executeUpdate();
             System.out.println("executupdate ");
            con.close();
             JOptionPane.showMessageDialog(this, "Seller add Successfully..");
            
           
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cataddActionPerformed
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
            java.util.logging.Logger.getLogger(ManegeCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManegeCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManegeCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManegeCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManegeCategories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable catTable;
    private javax.swing.JButton catadd;
    private javax.swing.JButton catclear;
    private javax.swing.JButton catdelete;
    private javax.swing.JTextField catdescrip;
    private javax.swing.JButton catedit;
    private javax.swing.JTextField catid;
    private javax.swing.JTextField catname;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

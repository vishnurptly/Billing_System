/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MGsellers;


import java.lang.invoke.MethodHandles;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class Manegesellers extends javax.swing.JFrame {

   
    

    public Manegesellers() {
        initComponents();
        
        
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
           rs=st.executeQuery("SELECT * FROM seller");
              ResultSetMetaData rsm=rs.getMetaData();
              DefaultTableModel model =(DefaultTableModel)sellTable.getModel();
                        
             
          model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
          con.close();
          
        }catch (Exception e){
            
            e.printStackTrace();
            
        }
       
    

            
    
}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SELPASSWORD = new javax.swing.JTextField();
        SELID = new javax.swing.JTextField();
        SELNAME = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        GOBILL = new javax.swing.JButton();
        SELGENDER = new javax.swing.JComboBox<>();
        Editbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANEGE SELLERS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USER ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("GENDER");

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(242, 242, 242));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(0, 0, 0));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(242, 242, 242));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(0, 0, 0));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(242, 242, 242));
        clearbtn.setText("Clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        sellTable.setBackground(new java.awt.Color(242, 242, 242));
        sellTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sellTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellTable.setForeground(new java.awt.Color(242, 242, 242));
        sellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SELID", "SELNAME", "SELPASSWORD", "SELGENDER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellTable);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("SELLERS LISTS");

        GOBILL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOBILL.setText("GO BILL");
        GOBILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOBILLMouseClicked(evt);
            }
        });

        SELGENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", " " }));

        Editbtn.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Editbtn.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GOBILL)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addbtn)
                                .addGap(148, 148, 148)
                                .addComponent(Editbtn)
                                .addGap(163, 163, 163)
                                .addComponent(deletebtn)
                                .addGap(176, 176, 176)
                                .addComponent(clearbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SELID, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SELNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(125, 125, 125)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25)))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SELPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(SELGENDER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(115, 249, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(GOBILL))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(SELPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SELID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(SELNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SELGENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(deletebtn)
                    .addComponent(clearbtn)
                    .addComponent(Editbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
     
        
        if(SELID.getText().isEmpty()||SELNAME.getText().isEmpty()||SELPASSWORD.getText().isEmpty())
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
           
            PreparedStatement add=con.prepareStatement("INSERT INTO seller(SELID, SELNAME,SELPASSWORD,SELGENDER) VALUES (?, ?,?,?)");
            
            add.setInt(1,Integer.valueOf(SELID.getText()));
           
            add.setString(2, SELNAME.getText());
           
            add.setString(3, SELPASSWORD.getText());
           
            add.setString(4, SELGENDER.getSelectedItem().toString());
           
            int row = add.executeUpdate();
             System.out.println("executupdate ");
            
             JOptionPane.showMessageDialog(this, "Seller add Successfully..");
        con.close();
            
           
        }catch (Exception e){
            e.printStackTrace();
        }
         
        
             
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            String url=("jdbc:mysql://localhost:3306/login?useSSL=false");
            
             String username = "root";
	    String password = "1234";
              Connection con = DriverManager.getConnection(url, username, password);
          
            PreparedStatement add=con.prepareStatement("UPDATE seller SET SELNAME=?,SELPASSWORD=?,SELGENDER=? WHERE SELID=? ");
           
            add.setString(1, SELNAME.getText());
            add.setString(2, SELPASSWORD.getText());
            add.setString(3, SELGENDER.getSelectedItem().toString());
             add.setInt(4,Integer.valueOf(SELID.getText()));
            
            add.executeQuery();
          
            con.close();
         }catch(Exception e){
             System.out.println("please check the Sql queary");
         }
        
    }//GEN-LAST:event_EditbtnActionPerformed

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        
        SELID.setText("");
        SELNAME.setText("");
        SELPASSWORD.setText("");
       
    }//GEN-LAST:event_clearbtnMouseClicked

    private void GOBILLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOBILLMouseClicked
        new Billing_System.Billing().setVisible(true);
    }//GEN-LAST:event_GOBILLMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
      if(SELID.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Enter the Seller to be delete");
      }else{
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            String url=("jdbc:mysql://localhost:3306/login?useSSL=false");
            
             String username = "root";
	    String password = "1234";
              Connection con = DriverManager.getConnection(url, username, password);
          
             PreparedStatement add=con.prepareStatement ("DELETE FROM seller  WHERE SELID");
            add.setInt(1,Integer.valueOf(SELID.getText()));
            Statement stm=con.createStatement();
            add.executeQuery();
          
            
         }catch(Exception e){
             System.out.println("please check sql delete query ");
         }
      }

    }//GEN-LAST:event_deletebtnMouseClicked
        
  
    public static void main(String args[]) {
      
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manegesellers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editbtn;
    private javax.swing.JButton GOBILL;
    private javax.swing.JComboBox<String> SELGENDER;
    private javax.swing.JTextField SELID;
    private javax.swing.JTextField SELNAME;
    private javax.swing.JTextField SELPASSWORD;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sellTable;
    // End of variables declaration//GEN-END:variables
}

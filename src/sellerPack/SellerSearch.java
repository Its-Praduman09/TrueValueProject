/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellerPack;

import adminPack.AdminControl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author praduman09
 */
public class SellerSearch extends javax.swing.JFrame {

    /**
     * Creates new form SellerSearch
     */
    public SellerSearch() {
        initComponents();
               this.setSize(630,390);
        this.setBounds(1280, 150, 630,390);
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
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seller Search Window");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seller Search");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 20, 151, 32);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search For Seller Id:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 241, 32);

        idTxt.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        idTxt.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(idTxt);
        idTxt.setBounds(350, 140, 259, 55);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 270, 113, 42);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-1, -1, 680, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root","Badal@123");
            if(con!=null)
            {
                
                //JOptionPane.showMessageDialog(this, "Connection done");
                String id=idTxt.getText().trim();
                PreparedStatement pst=con.prepareStatement("SELECT * FROM truevaluedb.sellerreg WHERE id=?");
                pst.setString(1, id);
                ResultSet rst=pst.executeQuery(); //insert,update,delete,alter
                          //pst.executeQuery()---> only for select
                if(rst.next())
                {
                       JOptionPane.showMessageDialog(this, "Seller Search Found\n Seller Id :-"+rst.getString("id")+"\nSeller Name:-"+rst.getString("name")+"\nSeller Email:-"+rst.getString("email")+"\nSeller Address:-"+rst.getString("address")+"\nSeller City:-"+rst.getString("city")+"\nSeller State:-"+rst.getString("state")+"\nSeller City:-"+rst.getString("city")+"\nSeller Contry:-"+rst.getString("contry"));
                       new AdminControl().setVisible(true);
                       this.setVisible(false);
                       /* JOptionPane.showMessageDialog(this,"Record Found");
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("id"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("name"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("email"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("address"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("city"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("state"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("contry"));
                        JOptionPane.showMessageDialog(this,"id=>"+rst.getString("mobile"));*/
                 
                }
                  else
                        JOptionPane.showMessageDialog(this, "User not found");
            }
                else
                JOptionPane.showMessageDialog(this, "Connection failed");
        con.close();
        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SellerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

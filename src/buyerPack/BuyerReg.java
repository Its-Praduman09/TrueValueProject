/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyerPack;
import adminPack.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author praduman09
 */
public class BuyerReg extends javax.swing.JFrame {

    /**
     * Creates new form BuyerReg
     */
    public BuyerReg() {
        initComponents();
       this.setSize(804,784);
        this.setBounds(1050,100,804,784);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JComboBox<>();
        cityTxt = new javax.swing.JComboBox<>();
        stateTxt = new javax.swing.JComboBox<>();
        contryTxt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buyer Register Window");
        getContentPane().setLayout(null);

        idTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt);
        idTxt.setBounds(270, 140, 300, 40);

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUYER REGISTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 330, 47);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 670, 157, 42);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 50, 32);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 220, 70, 32);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 290, 110, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 340, 110, 32);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 410, 70, 24);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("State");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 480, 70, 32);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Contry");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 540, 120, 32);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Mobile");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 600, 80, 24);

        nameTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(nameTxt);
        nameTxt.setBounds(270, 210, 300, 40);

        emailTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(emailTxt);
        emailTxt.setBounds(270, 280, 300, 40);

        mobileTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(mobileTxt);
        mobileTxt.setBounds(270, 600, 300, 40);

        addressTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addressTxt.setForeground(new java.awt.Color(255, 255, 255));
        addressTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S-900", "MIG-69", "S-529", "PNT-77", "D-659" }));
        getContentPane().add(addressTxt);
        addressTxt.setBounds(270, 340, 300, 40);

        cityTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cityTxt.setForeground(new java.awt.Color(255, 255, 255));
        cityTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bhopal", "Indore", "Delhi", "Patna", "Mumbai", "Bangalore", "Hyderabad", "Pune", "Kolkata" }));
        getContentPane().add(cityTxt);
        cityTxt.setBounds(270, 410, 300, 40);

        stateTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        stateTxt.setForeground(new java.awt.Color(255, 255, 255));
        stateTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madhya Pradesh", "Telangana", "Karnataka", "Maharashtra", "Bihar" }));
        getContentPane().add(stateTxt);
        stateTxt.setBounds(270, 480, 300, 40);

        contryTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        contryTxt.setForeground(new java.awt.Color(255, 255, 255));
        contryTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Australia", "Pakistan", "China", "America" }));
        getContentPane().add(contryTxt);
        contryTxt.setBounds(270, 540, 300, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pink.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-50, 0, 830, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root","Badal@123");
            String id=idTxt.getText().trim();
            String name=nameTxt.getText();
            String email=emailTxt.getText();
            String address=addressTxt.getSelectedItem().toString();
            String city=cityTxt.getSelectedItem().toString();
            String state=stateTxt.getSelectedItem().toString();
            String contry=contryTxt.getSelectedItem().toString();
            String mobile=mobileTxt.getText();
            String query="INSERT INTO truevaluedb.buyerreg VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con. prepareStatement(query);
            pst.setString(1,id);
            pst.setString(2,name);
            pst.setString(3,email);
            pst.setString(4,address);
            pst.setString(5,city);
            pst.setString(6,state);
            pst.setString(7,contry);
            pst.setString(8,mobile);
            int Count=pst.executeUpdate();
            if(Count!=0)
            {
                JOptionPane.showMessageDialog(this, Count+ "Buyer Register Successfully");
        new AdminControl().setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(this, +Count+ "Value Add Failed Please Try Again");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

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
            java.util.logging.Logger.getLogger(BuyerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyerReg().setVisible(true);
                //this.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addressTxt;
    private javax.swing.JComboBox<String> cityTxt;
    private javax.swing.JComboBox<String> contryTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> stateTxt;
    // End of variables declaration//GEN-END:variables
}

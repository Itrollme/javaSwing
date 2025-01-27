/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.JDBCConnection;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Login_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login_JFrame
     */
    public Login_JFrame() {
        initComponents();
        /* Dowload The connertor for java & mysql database    */
        
        
        this.setLocationRelativeTo(null);
        // 0 border in the top
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLUE);// set color for border
        jPanel_title.setBorder(jpanel_title_border);
        // create a black border for the close  &  minimize jlabel
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        // create tbale for the username and password
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.WHITE);
        jPasswordField_password.setBorder(field_border);
        jTextField_userName.setBorder(field_border);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_userName = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel_username.setBackground(new java.awt.Color(255, 153, 51));
        jLabel_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_username.setText("Tài Khoản");
        jLabel_username.setAutoscrolls(true);

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_password.setText("Mật Khẩu");

        jTextField_userName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField_userName.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_userName.setText("UserName");
        jTextField_userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_userNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_userNameFocusLost(evt);
            }
        });

        jPasswordField_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_password.setText("jPasswordField1");
        jPasswordField_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusLost(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(0, 84, 140));
        jButton_login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginMouseExited(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_username)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_userName)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_close.setText(" x");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_minimize.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jPanel_title.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_minimize)
                        .addComponent(jLabel_close)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white); // di chuột vào màu trắng
        
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_userNameFocusGained
        // TODO add your handling code here:
        //create the text field on focus if the text is "username"
        if(jTextField_userName.getText().trim().toLowerCase().equals("userName")){
            jTextField_userName.setText("");
            jTextField_userName.setForeground(Color.BLACK);
            
        }
        //set a yellow border to the label icon
         Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_username.setBorder(jlabel_icon);
    }//GEN-LAST:event_jTextField_userNameFocusGained

    private void jTextField_userNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_userNameFocusLost
        // TODO add your handling code here:
        if(jTextField_userName.getText().trim().equals("") || jTextField_userName.getText().trim().toLowerCase().equals("username")){
           jTextField_userName.setText("username");
           jTextField_userName.setForeground(new Color(153,153,153));
           
    }//GEN-LAST:event_jTextField_userNameFocusLost
    jLabel_username.setBorder(null);
    
    }
    private void jPasswordField_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusGained
        // TODO add your handling code here:
        String pass  = String.valueOf(jPasswordField_password.getPassword());
        if(pass.trim().toLowerCase().equals("userName")){
            jPasswordField_password.setText("");
            jPasswordField_password.setForeground(Color.BLACK);
            
        }
        //set a yellow border to the label icon
         Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_password.setBorder(jlabel_icon);
    }//GEN-LAST:event_jPasswordField_passwordFocusGained

    private void jPasswordField_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusLost
        // TODO add your handling code here:
        String pass  = String.valueOf(jPasswordField_password.getPassword());
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password")){
           jPasswordField_password.setText("password");
           jPasswordField_password.setForeground(new Color(153,153,153));
    }                                             
    jLabel_password.setBorder(null);
        
    }//GEN-LAST:event_jPasswordField_passwordFocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs;
        String USERNAME = jTextField_userName.getText();
        String PASSWORD = String.valueOf(jPasswordField_password.getPassword());
        String query  = "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ? ";
        
        try {
            st = JDBCConnection.getJDBCConnection().prepareStatement(query);
            st.setString(1, USERNAME);
            st.setString(2, PASSWORD);
            rs = st.executeQuery();
           
            if(rs.next()){
                // show a form
                ListUserFrame form = new ListUserFrame();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                this.dispose();
            }else{
                // error message
                
                JOptionPane.showMessageDialog(null, "InValid Username / password", "login error", 2);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(Login_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        // TODO add your handling code here:
        jButton_login.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        // TODO add your handling code here:
        jButton_login.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton_loginMouseExited

    private void jButton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton_loginMouseClicked

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked
      
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
            java.util.logging.Logger.getLogger(Login_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}

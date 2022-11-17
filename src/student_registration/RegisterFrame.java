
package student_registration;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates form RegisterFrame
     */
    public RegisterFrame() {
        super("Sign Up Form");//HEADER OF THE SIGN-UP FORM 
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fullname = new javax.swing.JLabel();
        userna = new javax.swing.JLabel();
        regUName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        redBtn = new javax.swing.JButton();
        regEmail = new javax.swing.JTextField();
        regPass = new javax.swing.JTextField();
        regFname = new javax.swing.JTextField();
        passreg = new javax.swing.JLabel();
        emailreg = new javax.swing.JLabel();
        redBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        fullname.setBackground(new java.awt.Color(255, 255, 255));
        fullname.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("Full Name : ");

        userna.setBackground(new java.awt.Color(255, 255, 255));
        userna.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        userna.setForeground(new java.awt.Color(255, 255, 255));
        userna.setText("User Name :");

        regUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUNameActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
        );

        redBtn.setBackground(new java.awt.Color(51, 153, 255));
        redBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        redBtn.setForeground(new java.awt.Color(255, 255, 255));
        redBtn.setText("Sign Up");
        redBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBtnActionPerformed(evt);
            }
        });

        regEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmailActionPerformed(evt);
            }
        });

        regPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPassActionPerformed(evt);
            }
        });

        regFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regFnameActionPerformed(evt);
            }
        });

        passreg.setBackground(new java.awt.Color(255, 255, 255));
        passreg.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        passreg.setForeground(new java.awt.Color(255, 255, 255));
        passreg.setText("Password:");

        emailreg.setBackground(new java.awt.Color(255, 255, 255));
        emailreg.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        emailreg.setForeground(new java.awt.Color(255, 255, 255));
        emailreg.setText("Email : ");

        redBtn1.setBackground(new java.awt.Color(255, 102, 0));
        redBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        redBtn1.setForeground(new java.awt.Color(255, 255, 255));
        redBtn1.setText("Login");
        redBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registered Already ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(passreg)
                                .addGap(18, 18, 18)
                                .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailreg)
                                .addGap(18, 18, 18)
                                .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(fullname)
                                    .addGap(18, 18, 18)
                                    .addComponent(regFname, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(userna)
                                    .addGap(18, 18, 18)
                                    .addComponent(regUName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(redBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(redBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullname)
                            .addComponent(regFname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userna)
                            .addComponent(regUName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailreg))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passreg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redBtn)
                    .addComponent(redBtn1))
                .addGap(24, 24, 24))
        );

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Login");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUNameActionPerformed

    private void redBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBtnActionPerformed
        // Getting the user inputs from the GUI 
        String fname = regFname.getText();
        String uname = regUName.getText();
        String email = regEmail.getText();
        String password = String.valueOf(regPass.getText());
        
        //Checking if the required fields are empty
        if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "FullName Field not Filled", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (uname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username Field not Filled ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email Field not Filled ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password sh ould not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //start the login process
            userRegister(fname, uname, email, password);

        }

    }//GEN-LAST:event_redBtnActionPerformed

    private void regEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmailActionPerformed

    private void regPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPassActionPerformed

    private void regFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regFnameActionPerformed

    private void redBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBtn1ActionPerformed
        dispose();
        LoginFrame l = new LoginFrame(); //Connects the login button to the login frame 
        l.setLocationRelativeTo(null);
        l.setVisible(true);

    }//GEN-LAST:event_redBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailreg;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passreg;
    private javax.swing.JButton redBtn;
    private javax.swing.JButton redBtn1;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regFname;
    private javax.swing.JTextField regPass;
    private javax.swing.JTextField regUName;
    private javax.swing.JLabel userna;
    // End of variables declaration//GEN-END:variables
   

    //CODE TO INPUT THE ENTRY TO THE DATABASE 
    private void userRegister(String fname, String uname, String email, String password) {
        java.sql.Connection dbconn = DBConnection.connectDB();//CALL THE CLASS DB CONNECTION TO ACTIVATE 
        if (dbconn != null) {  //CHECKING IF THE CONNECTION IS AVAILBE 
            try {
                 //PREPARED STATEMENT IS THE STATEMENT THAT PERFORMS THE ACTION OF SAVING THE USER ENTRY TO THE DATABASE BY USING SQL STATEMENTS
                PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO user (fullname, username, email, password) VALUES(?, ?, ?, ?)");

                st.setString(1, fname);
                st.setString(2, uname);
                st.setString(3, email);
                st.setString(4, password);
//
                int res = st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your account has been Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("The connection is not available");
        }
    }
}

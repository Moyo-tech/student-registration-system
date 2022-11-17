package student_registration;

//IMPORITNG THE NECESSARY PACKAGES 
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//DEFINING THE CLASS THAT CONTAINS A FORM TO REGISTER STUDENTS TO THE RESPECTIVE COURSES 
public class Studreg extends javax.swing.JFrame {

    //EXTABLISHING THE  VARIABLES TO CONNECT TO THE DATABASE, CHECK THE RESULT AND ALSO CREATE THE SQL STATEMENTS 
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
/**
     * Creates form Studreg
     */
    public Studreg() {
        super("Register Student"); //HEADER FOR THE FRAME 
        initComponents();
        conn = (Connection) DBConnection.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studLname = new javax.swing.JTextField();
        studemail = new javax.swing.JTextField();
        studFname = new javax.swing.JTextField();
        studphone = new javax.swing.JTextField();
        studsch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studregAdminBtn = new javax.swing.JButton();
        studgrade = new javax.swing.JComboBox<>();
        studregBtn = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jTextField5.setText("jTextField1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField7.setText("jTextField1");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Grades : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("High School :");

        studLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studLnameActionPerformed(evt);
            }
        });

        studemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studemailActionPerformed(evt);
            }
        });

        studFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studFnameActionPerformed(evt);
            }
        });

        studphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studphoneActionPerformed(evt);
            }
        });

        studsch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studschActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER FOR ADMISSION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        studregAdminBtn.setBackground(new java.awt.Color(51, 153, 255));
        studregAdminBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studregAdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        studregAdminBtn.setText("View Admission");
        studregAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studregAdminBtnActionPerformed(evt);
            }
        });

        studgrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        studgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studgradeActionPerformed(evt);
            }
        });

        studregBtn.setBackground(new java.awt.Color(51, 153, 255));
        studregBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studregBtn.setForeground(new java.awt.Color(255, 255, 255));
        studregBtn.setText("Submit");
        studregBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studregBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studemail)
                            .addComponent(studLname)
                            .addComponent(studFname)
                            .addComponent(studgrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(studregBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studregAdminBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(studphone, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(studsch))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studFname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(studLname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(studemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(studgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(studphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studsch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studregAdminBtn)
                    .addComponent(studregBtn))
                .addGap(32, 32, 32))
        );

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

    private void studLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studLnameActionPerformed

    private void studemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studemailActionPerformed

    private void studFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studFnameActionPerformed

    private void studphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studphoneActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void studschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studschActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studschActionPerformed

    private void studregAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studregAdminBtnActionPerformed
        //VIEW ADMISSION BUTTON WHICH GOES BACK TO THE DASHBOARD 
        dispose();
        Dashboard d = new Dashboard();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_studregAdminBtnActionPerformed

    private void studgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studgradeActionPerformed

    private void studregBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studregBtnActionPerformed
        // TO insert the data into the database 
        try {
            stmt = (Statement) conn.createStatement();//SETTING THE SQL STATEMENT VARIABLE 

            //Getting the text from text field and storing into local variables
            String stdFname = studFname.getText();
            String stdLname = studLname.getText();
            String stdemail = studemail.getText();
            int stdgrade = Integer.parseInt((String) studgrade.getSelectedItem()); //CONVERTING THE STRING TO AN INTEGER BECAUSE IT IS GOING TO BE TESTED 
            String stdphone = studphone.getText();
            String stdschool = studsch.getText();

            //CHECKING IF ALL THE FIELDS ARE COMPLETELY FILLED 
            if (stdFname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "First Name Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (stdLname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Last Name Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (stdemail.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (stdphone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Phone Number Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (stdschool.isEmpty()) {
                JOptionPane.showMessageDialog(this, "High School Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);

            } //START THE REGISTRATION PROCESS:  THERE ARE 3 DIFFERENT TABLES IN THE DATABASE THE Computer science table, the global table(for global challenges
                                                 //and the studennt table(stands for business studies because the name could not be ammended)
            else {
                if (stdgrade >= 18 && stdgrade <= 20) { //INSERTING TO COMPUTER SCIENCE TABLE OF THE CONDITION IS MET 
                    String sql = "INSERT INTO computerscience(fname, lname, email, grade, phone, highschool)VALUES('" + stdFname + "', '" + stdLname + "', '" + stdemail + "', '" + stdgrade + "', '" + stdphone + "', '" + stdschool + "')";
                    stmt.executeUpdate(sql); //EXECUTING THE SQL
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                    System.out.println("RECORDED TO CS");
                    
                } else if (stdgrade >= 15 && stdgrade <= 17) { //INSERTING TO global challenges  TABLE OF THE CONDITION IS MET 
                    String sql = "INSERT INTO global(fname, lname, email, grade, phone, highschool)VALUES('" + stdFname + "', '" + stdLname + "', '" + stdemail + "', '" + stdgrade + "', '" + stdphone + "', '" + stdschool + "')";
                    stmt.executeUpdate(sql); //EXECUTING THE SQL
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                    System.out.println("RECORDED TO GC");
                    
                } else if (stdgrade >= 12 && stdgrade <= 14) { //INSERTING TO BUSINESS STUDIES  TABLE OF THE CONDITION IS MET 
                    String sql = "INSERT INTO student(fname, lname, email, grade, phone, highschool)VALUES('" + stdFname + "', '" + stdLname + "', '" + stdemail + "', '" + stdgrade + "', '" + stdphone + "', '" + stdschool + "')";
                    stmt.executeUpdate(sql); //EXECUTING THE SQL
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                    System.out.println("RECORDED TO BS");
                    
                } else { //IF A USER GRADES DOES NOT MEET THE ABOVE CONDITIONS WHICH MEANS IT'S LESSER AND THE USER CANNOT BE ADMITTED SO A REJECTION MESSAGE IS DISPLAYES 
                    JOptionPane.showMessageDialog(null, "SORRY YOU CAN'T BE ADMITTED, YOUR GRADE IS LOW");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
        }

    }//GEN-LAST:event_studregBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField studFname;
    private javax.swing.JTextField studLname;
    private javax.swing.JTextField studemail;
    private javax.swing.JComboBox<String> studgrade;
    private javax.swing.JTextField studphone;
    private javax.swing.JButton studregAdminBtn;
    private javax.swing.JButton studregBtn;
    private javax.swing.JTextField studsch;
    // End of variables declaration//GEN-END:variables
}

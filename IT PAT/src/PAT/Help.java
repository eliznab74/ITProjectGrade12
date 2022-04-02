package PAT;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Banzile Nhlebela
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help()
    {
        initComponents();
        //code to make screen apear in center of device screen
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
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
        WhiteBand = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnHelp = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnPass = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        btnStudents = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help");
        setName("Help"); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        WhiteBand.setBackground(new java.awt.Color(255, 255, 255));
        WhiteBand.setForeground(new java.awt.Color(255, 255, 255));
        WhiteBand.setPreferredSize(new java.awt.Dimension(731, 216));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ENJABULWENI SCHOOL");

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("\"Sifundza Kanyekanye\" - Together we Learn");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\eliznab74\\Pictures\\Badge.jpg")); // NOI18N

        javax.swing.GroupLayout WhiteBandLayout = new javax.swing.GroupLayout(WhiteBand);
        WhiteBand.setLayout(WhiteBandLayout);
        WhiteBandLayout.setHorizontalGroup(
            WhiteBandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteBandLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WhiteBandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(WhiteBandLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGap(333, 333, 333))
        );
        WhiteBandLayout.setVerticalGroup(
            WhiteBandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteBandLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WhiteBandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WhiteBandLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(104, 104, 104))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(WhiteBand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 680, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 680, 20));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        btnHelp.setBackground(new java.awt.Color(0, 0, 0));
        btnHelp.setForeground(new java.awt.Color(255, 204, 0));
        btnHelp.setText("Using 'Help'");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnProfile.setForeground(new java.awt.Color(255, 204, 0));
        btnProfile.setText("Your Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnPass.setBackground(new java.awt.Color(0, 0, 0));
        btnPass.setForeground(new java.awt.Color(255, 204, 0));
        btnPass.setText("Password");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMenu.setForeground(new java.awt.Color(255, 204, 0));
        btnMenu.setText("Main Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(0, 0, 0));
        btnReturn.setForeground(new java.awt.Color(255, 204, 0));
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        taDisplay.setBackground(new java.awt.Color(0, 0, 0));
        taDisplay.setColumns(20);
        taDisplay.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        taDisplay.setForeground(new java.awt.Color(255, 204, 0));
        taDisplay.setRows(5);
        taDisplay.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(255, 204, 0)));
        taDisplay.setDisabledTextColor(new java.awt.Color(255, 102, 0));
        taDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taDisplayKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taDisplay);

        btnStudents.setBackground(new java.awt.Color(0, 0, 0));
        btnStudents.setForeground(new java.awt.Color(255, 204, 0));
        btnStudents.setText("Students");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnLog.setBackground(new java.awt.Color(0, 0, 0));
        btnLog.setForeground(new java.awt.Color(255, 204, 0));
        btnLog.setText("Logging In");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(0, 0, 0));
        btnAbout.setForeground(new java.awt.Color(255, 204, 0));
        btnAbout.setText("About Us");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(0, 0, 0));
        btnNew.setForeground(new java.awt.Color(255, 204, 0));
        btnNew.setText("New Acc");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturn)
                    .addComponent(btnMenu)
                    .addComponent(btnHelp)
                    .addComponent(btnProfile)
                    .addComponent(btnPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLog, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAbout)
                        .addComponent(btnStudents)))
                .addGap(578, 578, 578))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnLog)
                        .addGap(18, 18, 18)
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudents)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnHelp)
                        .addGap(18, 18, 18)
                        .addComponent(btnPass)
                        .addGap(21, 21, 21)
                        .addComponent(btnMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnProfile)
                        .addGap(56, 56, 56)
                        .addComponent(btnReturn)
                        .addGap(2, 7, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 680, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        //close current screen
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open Help.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("Help.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open Students.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("Students.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        // TODO add your handling code here:
        //begin try-catch
        try
        {
            //open Password.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("Password.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnPassActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open NewAccount.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("NewAccount.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open MainMenu.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("MainMenu.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open LogIn.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("LogIn.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open EditProfile.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("EditProfile.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        //begine try-catch
        try
        {
            //open About.txt file for reading
            try(Scanner sc = new Scanner(new FileReader("About.txt")))
            {
                String temp = "";
                //while the file has another line
                while(sc.hasNextLine())
                {
                    //place that line in a string variable until whole file has been read
                    temp += sc.nextLine() + "\n";
                }
                //display all the lines
                taDisplay.setText(temp);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //end of try-catch
    }//GEN-LAST:event_btnAboutActionPerformed

    private void taDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taDisplayKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_taDisplayKeyTyped

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Help().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WhiteBand;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPass;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDisplay;
    // End of variables declaration//GEN-END:variables
}
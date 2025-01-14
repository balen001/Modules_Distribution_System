/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ukh_modules_distribution_system;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Balen
 */



public class LoginPage extends javax.swing.JFrame {
    
    public static int instIndex;
    public static int lecIndex;
    public static int stIndex;
    
    static String adminInputDir = "./Admin.txt";
    static String instructDir = "./Instructor.txt";   
    static String studentDir = "./student.txt";    
    static String lecturerDir = "./Lecturer.txt";
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginTopLbl = new javax.swing.JLabel();
        passPswrd = new javax.swing.JPasswordField();
        userTxt = new javax.swing.JTextField();
        loginCombo = new javax.swing.JComboBox<>();
        roleLbl = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        loginPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        loginTopLbl.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        loginTopLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginTopLbl.setText("Login");

        loginCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer", "Instructor", "Admin" }));
        loginCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginComboActionPerformed(evt);
            }
        });

        roleLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roleLbl.setForeground(new java.awt.Color(255, 255, 255));
        roleLbl.setText("Role");

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userTxt))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passPswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginTopLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginTopLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(passPswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginPanel.getAccessibleContext().setAccessibleName("LoginPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginComboActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String username = userTxt.getText();
        String pass = passPswrd.getText();
        
        
        int index;
        index =  loginCombo.getSelectedIndex();
        
        
        //if student is selected
        if (index == 0){
            
            ArrayList <Student> AllStudents = new ArrayList <Student>();
            
            try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(studentDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllStudents = (ArrayList<Student>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
            boolean auth0 = false;
            for(int i = 0 ; i < AllStudents.size(); i++){
                
                if(AllStudents.get(i).getUsername().equals(username) && AllStudents.get(i).getPass().equals(pass)){
                    stIndex = i; // to pass student index to studentFrame
                    JOptionPane.showMessageDialog(null, "Login successful");
                    studentFrame student = new studentFrame();
                    student.setVisible(true);
                    this.dispose();
                    auth0 = true;
                }
                
            
            }
            
            if(!auth0)
            {JOptionPane.showMessageDialog(null, "Wrong username/password");}
            
            
                
        }
        
        // if lecturer is selected
        else if (index == 1){
            
            ArrayList <Lecturer> AllLecturer = new ArrayList <Lecturer>();
            try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(lecturerDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllLecturer = (ArrayList<Lecturer>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
            
            boolean auth1 = false;
            
            for(int i = 0 ; i < AllLecturer.size(); i++){
                
                if(AllLecturer.get(i).getUsername().equals(username) && AllLecturer.get(i).getPassword().equals(pass)){
                    lecIndex = i; // to pass student index to lecturerFrame
                    JOptionPane.showMessageDialog(null, "Login successful");
                    lecturerFrame lecturer = new lecturerFrame();
                    lecturer.setVisible(true);
                    this.dispose();
                    auth1 = true;
                }
            
            }
            
            
            if(!auth1)
            {JOptionPane.showMessageDialog(null, "Wrong username/password");}
            
            
        }
        
        
        
        
        
        
        
        else if(index == 2)   //for Instructor
        {
            
            ArrayList <Instructor> AllInstructor = new ArrayList <Instructor>();
            
            try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(instructDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllInstructor = (ArrayList<Instructor>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
            
           boolean auth2 = false;
           for(int i = 0 ; i < AllInstructor.size(); i++){
                
                if(AllInstructor.get(i).getUsername().equals(username) && AllInstructor.get(i).getPassword().equals(pass)){
                    instIndex = i; // to pass student index to InstructorFrame
                    JOptionPane.showMessageDialog(null, "Login successful");
                    instructorFrame instructor = new instructorFrame();
                    instructor.setVisible(true);
                    this.dispose();
                    auth2 = true;
                }
            
            } 
           
           
           if(!auth2)
            {JOptionPane.showMessageDialog(null, "Wrong username/password");}
            
            
        }
        
        
        // if Admin is selected
        else if (index == 3){
        
        
            try{
            
                File file = new File(adminInputDir);
                Scanner scan = new Scanner(file);
                
                boolean auth3 = false;
                while(scan.hasNext()){
                    if(scan.next().equals(username) && scan.next().equals(pass)){
                     
                        JOptionPane.showMessageDialog(null, "Login successful");
                        adminPage admin = new adminPage();
                        admin.setVisible(true);
                        this.dispose();
                        auth3 = true;
                    }
                     
                }
                if(!auth3)
                {JOptionPane.showMessageDialog(null, "Wrong username/password");}
            
            }
            
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        
        }
        
        
        
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JComboBox<String> loginCombo;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTopLbl;
    private javax.swing.JPasswordField passPswrd;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}

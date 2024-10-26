/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ukh_modules_distribution_system;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Balen
 */
public class addLecturerForm extends javax.swing.JFrame {
    
    static String lecturerDir = "./Lecturer.txt";  // Lecturer file directory
    static String subjectDir = "./Subject.txt";  // Lecturer file directory
    /**
     * Creates new form addStudentFrame
     */
    public addLecturerForm() {
        initComponents();
        getComboList();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        lNameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addLucturerBtn = new javax.swing.JButton();
        nicTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        salaryTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JTextField();
        lecHoursTxt = new javax.swing.JTextField();
        lectureLbl = new javax.swing.JLabel();
        subjectCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");

        fNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        fNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fNameLbl.setText("Nickname :");

        lNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        lNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNameLbl.setText("Email:");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 255, 255));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLbl.setText("Salary:");

        phoneLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneLbl.setForeground(new java.awt.Color(255, 255, 255));
        phoneLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneLbl.setText("Phone:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Lecturer form");

        addLucturerBtn.setBackground(new java.awt.Color(0, 0, 0));
        addLucturerBtn.setForeground(new java.awt.Color(255, 255, 255));
        addLucturerBtn.setText("Add");
        addLucturerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLucturerBtnActionPerformed(evt);
            }
        });

        nicTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicTxtActionPerformed(evt);
            }
        });

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });

        lectureLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lectureLbl.setForeground(new java.awt.Color(255, 255, 255));
        lectureLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lectureLbl.setText("Lecture hours:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subject:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salaryTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneTxt, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(8, 8, 8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subjectCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lectureLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(lecHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addLucturerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl)
                    .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lectureLbl)
                    .addComponent(lecHoursTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(addLucturerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLucturerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLucturerBtnActionPerformed
        
        
        String nickname = nicTxt.getText();
        String email = emailTxt.getText();
        String salary = salaryTxt.getText();
        String phone = phoneTxt.getText();
        String address = addressTxt.getText();
        String username = usernameTxt.getText();
        String password = PasswordTxt.getText();
        String selectedSubject = subjectCombo.getSelectedItem().toString();
        String lectureHours = lecHoursTxt.getText();
        
        boolean auth = true;
        
        
        
        
        
        
        if (nickname.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nickname is empty");
            auth = false;
        }
        
        else if (email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Email is empty");
            auth = false;
        }
        
        else if (salary.isEmpty()){
            JOptionPane.showMessageDialog(null, "Salary is empty");
            auth = false;
        }
        
        else if (email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Email is empty");
            auth = false;
        }
        
        else if (phone.isEmpty()){
            JOptionPane.showMessageDialog(null, "Phone is empty");
            auth = false;
        }
        
        else if (address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Address is empty");
            auth = false;
        }
        
        else if (username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is empty");
            auth = false;
        }
        
        else if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is empty");
            auth = false;
        }
        
        else if (lectureHours.isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty lecture hours");
            auth = false;
        }
        
        else if (lectureHours.isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty lecture hours");
            auth = false;
        }
        
        else if (selectedSubject.isEmpty()){
            JOptionPane.showMessageDialog(null, "Subject is not selected");
            auth = false;
        }
        
        
        String [] splittedSubject = selectedSubject.split("\\s*,\\s*");
        String subjectID = splittedSubject[1];
        
        
        
        int lecHours = -1;
        double Salary = -1;
        
        
        // if data is available then parse it
        if(auth){
        
        
        try{
        lecHours = Integer.parseInt(lectureHours);
        }
        catch (NumberFormatException e){          // We have studied number format exception in class
            JOptionPane.showMessageDialog(null, "Invalid lecture hour!!");
            auth = false;
        }
        
        try{
        Salary = Double.parseDouble(salary);
        }
        catch (NumberFormatException e){          // We have studied number format exception in class
            JOptionPane.showMessageDialog(null, "Invalid salary!!");
            auth = false;
        }
        
        }// end of first check
        
        
        ArrayList <Lecturer> AllLecturer = new ArrayList <Lecturer>();
        
        Lecturer newLecturer = new Lecturer(nickname, email, Salary, address, phone, lecHours, username, password, subjectID);
        
        
        
        if(auth){
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
        
        
        
        
        // to write the data
        
        try {
            FileOutputStream fileOutput = new FileOutputStream(lecturerDir);
            ObjectOutputStream write = new ObjectOutputStream(fileOutput); 
		
            ArrayList <Lecturer> addLecturer = new ArrayList <Lecturer>();
            addLecturer = AllLecturer;
            addLecturer.add(newLecturer);
            write.writeObject(addLecturer);
            write.close();
            JOptionPane.showMessageDialog(null, "Lecturer Successfully added");
       	      
            write.close();
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "error");
	}
        
        }
        
        
        clearFields();
    }//GEN-LAST:event_addLucturerBtnActionPerformed

    
    private void clearFields(){
    
        nicTxt.setText("");
        salaryTxt.setText("");
        emailTxt.setText("");
        lecHoursTxt.setText("");
        phoneTxt.setText("");
        addressTxt.setText("");
        usernameTxt.setText("");
        PasswordTxt.setText("");
        subjectCombo.setSelectedIndex(0);
        
    }
    
    private void getComboList(){
    
        ArrayList <Subject> AllSubjects = new ArrayList <Subject>();
        
        try{
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(subjectDir));

            Object o;
            
           
            try{
                o = read.readObject();
                if(o != null)
                AllSubjects = (ArrayList<Subject>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
            }
            
				
	read.close();
        
        for(int i = 0; i < AllSubjects.size(); i++){
            String option = AllSubjects.get(i).getSubjectName()  + ", " + AllSubjects.get(i).getSubjectID();
            subjectCombo.addItem(option);
        }
	
        
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    
    
    }
    
    
    private void nicTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTxtActionPerformed

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
            java.util.logging.Logger.getLogger(addLecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addLecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addLecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addLecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addLecturerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JButton addLucturerBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JTextField lecHoursTxt;
    private javax.swing.JLabel lectureLbl;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JComboBox<String> subjectCombo;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}

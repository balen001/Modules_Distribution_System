/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ukh_modules_distribution_system;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ukh_modules_distribution_system.showStudentFrame.studentDir;





/**
 *
 * @author Balen
 */
public class instructorFrame extends javax.swing.JFrame {
    
    static String subjectDir = "./Subject.txt";  //file directory
    static String instructorDir = "./Instructor.txt";
    static String studentDir = "./student.txt";
    
    
     
    int instructIndex = LoginPage.instIndex; // get instructor ID from login page
    String instructorCourseID;
    
    
    ArrayList <Subject> AllSubject = new ArrayList <Subject>(); // to put all Subjects data into it
    ArrayList <Instructor> AllInstructor = new ArrayList <Instructor>(); // to put all instructors data into it
    ArrayList <Student> AllStudent = new ArrayList <Student>(); // to put all students data into it
    
    
    //model for the first table
    String subjectHeaders [] = new String[] {"Subject name", "Number of credits" , "Subject ID", "Program ID"};
    DefaultTableModel subjectModel;
    
    //model for the second table
    String studentHeaders [] = new String[] {"Student name", "Student ID"};
    DefaultTableModel studentModel;
    
    
    // got inspiration from https://www.tutorialspoint.com/how-to-create-defaulttablemodel-which-is-an-implementation-of-tablemodel
    // not copied
    
    
    
    
    
    
    
    /**
     * Creates new form showlecturerFrame
     */
    public instructorFrame() {
        initComponents();
        
        
        
        // we should set the table model directly when the frame appears
        subjectModel = new DefaultTableModel(subjectHeaders, 0);
        subjectTbl.setModel(subjectModel);
        
        studentModel = new DefaultTableModel(studentHeaders, 0);
        studentTbl.setModel(studentModel);
        
        
        
        
        
        this.setLocationRelativeTo(null); // Make the frame centered to the screen when we opened
        //https://coderanch.com/t/343686/java/setLocationRelativeTo
        
        listSubject();
        listStudents();
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTbl = new javax.swing.JTable();
        signOutBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teaching subject");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enrolled students in your subject");

        studentTbl = new javax.swing.JTable(){

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        studentTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(studentTbl);

        signOutBtn.setBackground(new java.awt.Color(0, 0, 0));
        signOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signOutBtn.setText("Sign out");
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        subjectTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(subjectTbl);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Welcome back");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signOutBtn)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signOutBtn)
                            .addComponent(jLabel3)
                            .addComponent(nameLbl))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        this.dispose();
        LoginPage login = new LoginPage();
        login.setVisible(true);
    }//GEN-LAST:event_signOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(instructorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new instructorFrame().setVisible(true);
            }
        });
    }
    
    private void listSubject(){
        
        try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(instructorDir));
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
        
        
        String instructorSubject = AllInstructor.get(instructIndex).getSubjectID();
        String name = AllInstructor.get(instructIndex).getNic();
        nameLbl.setText(name);
        
        
        //get the course
        
        try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(subjectDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllSubject = (ArrayList<Subject>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
        
        
        subjectModel.setRowCount(0); // reset the entire table
        for(int i = 0 ; i < AllSubject.size(); i++){
            
            
            if(AllSubject.get(i).getSubjectID().equals(instructorSubject)){
                
                Object[] info = {AllSubject.get(i).getSubjectName(), AllSubject.get(i).getNumberOfCredits() , AllSubject.get(i).getSubjectID() , AllSubject.get(i).getCourseID()};
                    
                subjectModel.addRow(info);
                
                instructorCourseID = AllSubject.get(i).getCourseID();
            }
        
        }
        
        
        
    
    }
    //list students
    private void listStudents(){
    
        
        try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(studentDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllStudent = (ArrayList<Student>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
        
        
        
        //put them in table
        
        if(!instructorCourseID.isEmpty()){
            
            
            
        studentModel.setRowCount(0); // reset the entire table
        
        
            for(int i = 0 ; i < AllStudent.size(); i++){
                
                
                if(AllStudent.get(i).getCourseID().equals(instructorCourseID)){
                  
                Object[] info = {AllStudent.get(i).getFirstName() + " " + AllStudent.get(i).getLastName()  , AllStudent.get(i).getStudentID()};

                studentModel.addRow(info);
                }    
            }
        }
        
        
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JTable studentTbl;
    private javax.swing.JTable subjectTbl;
    // End of variables declaration//GEN-END:variables
}

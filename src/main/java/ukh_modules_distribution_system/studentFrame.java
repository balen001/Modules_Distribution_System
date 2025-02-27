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
public class studentFrame extends javax.swing.JFrame {
    
    static String subjectDir = "./Subject.txt";  //file directory
    static String studentDir = "./student.txt";
    static String courseDir = "./Course.txt";
    
    
     
    //int instructIndex = LoginPage.stIndex; // get instructor ID from login page
    int studentIndex = LoginPage.stIndex;
    String studentCourseID;
    
    
    ArrayList <Subject> AllSubject = new ArrayList <Subject>(); // to put all Subjects data into it
    ArrayList <Course> AllCourse = new ArrayList <Course>(); // to put all instructors data into it
    ArrayList <Student> AllStudent = new ArrayList <Student>(); // to put all students data into it
    
    
    //model for the first table
    String subjectHeaders [] = new String[] {"Subject name", "Number of credits" , "Subject ID"};
    DefaultTableModel subjectModel;
    
    //model for the second table
    String programHeaders [] = new String[] {"Program name", "Program ID"};
    DefaultTableModel programModel;
    
    
    
    // got inspiration from https://www.tutorialspoint.com/how-to-create-defaulttablemodel-which-is-an-implementation-of-tablemodel
    // not copied
    
    
    
    
    
    
    
    /**
     * Creates new form showlecturerFrame
     */
    public studentFrame() {
        initComponents();
        
        
        
        // we should set the table model directly when the frame appears
        subjectModel = new DefaultTableModel(subjectHeaders, 0);
        subjectTbl.setModel(subjectModel);
        
        programModel = new DefaultTableModel(programHeaders, 0);
        programTbl.setModel(programModel);
        
        
        
        
        
        this.setLocationRelativeTo(null); // Make the frame centered to the screen when we opened
        //https://coderanch.com/t/343686/java/setLocationRelativeTo
        
        listProgram();
        listSubject();
        
        
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        programTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        subjectTbl = new javax.swing.JTable();
        signOutBtn = new javax.swing.JButton();
        welcomeLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        programTbl = new javax.swing.JTable(){

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        programTbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        programTbl.setForeground(new java.awt.Color(0, 0, 0));
        programTbl.setFocusable(false);
        programTbl.getTableHeader().setReorderingAllowed(false);
        programTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(programTbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Program");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enrolled Subjects");

        subjectTbl = new javax.swing.JTable(){

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
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
        jScrollPane2.setViewportView(subjectTbl);

        signOutBtn.setBackground(new java.awt.Color(0, 0, 0));
        signOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signOutBtn.setText("Sign out");
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        welcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(51, 102, 255));
        welcomeLbl.setText("Welcome back");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("j");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signOutBtn)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(170, 170, 170))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signOutBtn)
                    .addComponent(welcomeLbl)
                    .addComponent(nameLbl))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(12, 12, 12))
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

    private void programTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_programTblMouseClicked

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
            java.util.logging.Logger.getLogger(studentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new studentFrame().setVisible(true);
            }
        });
    }
    
    private void listSubject(){
        
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
        
        
        //String instructorSubject = AllInstructor.get(instructIndex).getSubjectID();
        
        
        //get the course
        
        
        
        subjectModel.setRowCount(0); // reset the entire table
        for(int i = 0 ; i < AllSubject.size(); i++){
            
            
            if(AllSubject.get(i).getCourseID().equals(studentCourseID)){
            
                Object[] info = {AllSubject.get(i).getSubjectName(), AllSubject.get(i).getNumberOfCredits() , AllSubject.get(i).getSubjectID()};
        
                subjectModel.addRow(info);
                
                
            }
        
        }
        
        
        
    
    }
    //list students
    private void listProgram(){
    
        
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
        
        
        //get courseID and name
        studentCourseID = AllStudent.get(studentIndex).getCourseID();
        String studentName = AllStudent.get(studentIndex).getFirstName() + " " + AllStudent.get(studentIndex).getLastName();
        nameLbl.setText(studentName);
        
        //get course Data
        try {
        
            ObjectInputStream read = new ObjectInputStream(new FileInputStream(courseDir));
            Object o; // an object of Object class (The parent of all objects)
            
            try{
                o = read.readObject();
                if(o != null)
                AllCourse = (ArrayList<Course>) o;
            }
            catch(IOException | ClassNotFoundException c){
                c.printStackTrace();
                
            }
            
            read.close();
        }
        
        catch(IOException outer){
            outer.printStackTrace();
            
        }
        
        programModel.setRowCount(0); // reset the entire table
        for(int i = 0 ; i < AllCourse.size(); i++){
        
            if(AllCourse.get(i).getCourseId().equals(studentCourseID))
            { 
                
                Object[] info = {AllCourse.get(i).getCourseName(), AllCourse.get(i).getCourseId()};

                programModel.addRow(info);
            
            }
        }
        
        
                  
            
        }
        
        
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable programTbl;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JTable subjectTbl;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}

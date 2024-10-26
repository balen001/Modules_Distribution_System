
package ukh_modules_distribution_system;

import java.io.*;



/**
 *
 * @author Balen
 */
public class Student implements Serializable {
    
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String pass;
    private String courseID;
    

    
    Student(String ID, String firstName, String lastName, String email, String phone, String address, String username, String pass, String courseID){
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = ID;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.pass = pass;
        this.courseID = courseID;
       
    }
    
   
    
    //setters and getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getStudentID() {
        return studentID;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public String getEmail() {
        return email;
    }

    
    public String getPhone() {
        return phone;
    }

    
    public String getAddress() {
        return address;
    }

    
    public String getUsername() {
        return username;
    }

    
    public String getPass() {
        return pass;
    }

    
    public String getCourseID() {
        return courseID;
    }
    
    
    
    
    
    
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public void setPass(String pass) {
        this.pass = pass;
    }

    
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    
    
    
    
 
    
    
    
    
    
    
    
    
}

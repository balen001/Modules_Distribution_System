
package ukh_modules_distribution_system;

import java.io.*;


/**
 *
 * @author Balen
 */
public abstract class Staff implements Serializable {
    
    protected String nic;
    protected String email;
    protected double salary;
    protected String address;
    protected String mobile;
    protected String subjectID;
    private String username;
    private String password;
    
    Staff(String nic, String email, double salary, String address,String mobile, String username , String password , String subjectID ){
    
        this.nic = nic;
        this.email = email;
        this.salary = salary;
        this.address = address;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.subjectID = subjectID;
        
    }
    
    
    //setters and getters

    public String getAddress() {
        return address;
    }
    
    public String getNic() {
        return nic;
    }

    
    public String getEmail() {
        return email;
    }

    
    public double getSalary() {
        return salary;
    }

    public String getSubjectID() {
        return subjectID;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    
    public String getUsername() {
        return username;
    }

    
    public String getPassword() {
        return password;
    }
    

    
    
    
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    

    
    
    

    
    

    
   
    
    
    
    
    
    
    
    
}

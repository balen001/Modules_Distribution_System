
package ukh_modules_distribution_system;

/**
 *
 * @author Balen
 */
public class Instructor extends Staff {
    
    
    private int practicalHours;
    
    Instructor(String nic, String email, double salary, String address,String mobile, int practicalHours, String username, String password, String subjectID){
    
        super(nic, email, salary, address, mobile, username, password, subjectID);
        
        this.practicalHours = practicalHours;
        
    }

    
    
    public int getPracticalHours() {
        return practicalHours;
    }

    public void setPracticalHours(int practicalHours) {
        this.practicalHours = practicalHours;
    }
    
    
    
    
    
    
    
}

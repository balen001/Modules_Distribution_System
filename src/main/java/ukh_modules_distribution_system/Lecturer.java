
package ukh_modules_distribution_system;

/**
 *
 * @author Balen
 */
public class Lecturer extends Staff{
    
    private int LectureHours;
    
   Lecturer(String nic, String email, double salary, String address,String mobile, int LectureHours, String username, String password , String subjectID){
    
        super(nic, email, salary, address, mobile, username, password, subjectID);
        
        this.LectureHours = LectureHours;
        
    }

    
    public int getLectureHours() {
        return LectureHours;
    }

    public void setLectureHours(int LectureHours) {
        this.LectureHours = LectureHours;
    }
    
    
    
    
}

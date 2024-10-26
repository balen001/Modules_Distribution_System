
package ukh_modules_distribution_system;

import java.io.*;

/**
 *
 * @author Balen
 */
public class Subject implements Serializable{
    
    private String subjectID;
    private String subjectName;
    private int numberOfCredits;
    private String CourseID;
    
    
    
    Subject(String subjName, int numOfCredits, String subjectID, String CourseID){
    
        this.subjectName = subjName;
        this.subjectID = subjectID;
        this.numberOfCredits = numOfCredits;
        this.CourseID = CourseID;
    }

   
    //setters and getters
    
    public String getSubjectID() {
        return subjectID;
    }

    
    public String getSubjectName() {
        return subjectName;
    }

    
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public String getCourseID() {
        return CourseID;
    }
    
    
    
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    
    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }
    
    
    
    
    
    
    
    
}


package ukh_modules_distribution_system;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Balen Ahmed
 */
public class Course implements Serializable{
    
    private String courseId;
    private String courseName;
    

    
    
    Course(String courseName, String courseId){
    
        this.courseName = courseName;
        this.courseId = courseId;
    
    }
    
    
    //setters and getters
    public String getCourseId() {
        return courseId;
    }

    
    public String getCourseName() {
        return courseName;
    }

   
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /*
    public String searchbyID(String CourseID){
        
        String courseN = null;
        if(this.courseId.equals(CourseID))
            courseN = this.courseName;
            
        return courseN;
    }
    
    */
    
     
    
}

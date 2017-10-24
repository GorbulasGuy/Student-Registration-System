package project1studentregsys;

/**
 *
 * @author matthew minor
 */
public class Online extends Course{
    //instance fields
    
    //constructor
    public Online(String name, String cRN, String number, String section, String credHours, String type, String teacher){
        super(name, cRN, number, section, credHours, type, teacher);
    }
    
    //methods
    @Override
    public String toString(){
        return "#" + getCourseCRN() + ": " + getCourseNum() + "-"+ getCourseSection() + " (" + getCourseName() + "), " + getTeacher() + ", " + getType();
    }
}

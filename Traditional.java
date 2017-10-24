package project1studentregsys;

/**
 *
 * @author matthew minor
 */
public class Traditional extends Course {
    //instance fields 
    private String days;
    private String startTime;
    private String endTime;
    private String location;
    
    //constructor
    public Traditional(String name, String cRN, String number, String section, String credHours, String startTime, String endTime, String days, String location, String type, String teacher){
        super(name, cRN, number, section, credHours, type, teacher);
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }
    
    //methods
    public String getDays() {
        return days;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public String getLocation(){
        return location;
    }
    @Override
    public String toString(){
        return "#" + getCourseCRN() + ": " + getCourseNum() + "-"+ getCourseSection() + " (" + getCourseName() + "), " + getTeacher() + ", " + getType() + ", " + getStartTime() + "-" + getEndTime() + ", " + getDays() + ", " + getLocation();
    }
}

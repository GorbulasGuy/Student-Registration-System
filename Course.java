package project1studentregsys;

/**
 *
 * @author matthew minor
 */
public abstract class Course {
    //instance fields
    private String courseName;
    private String courseNum;
    private String courseCRN;
    private String courseSection;
    private String courseHours;
    private String type;
    private String teacher;
    
    //construtor
    public Course(String name, String cCRN, String num, String section, String credhours, String type, String teacher){
        this.courseName = name;
        this.courseCRN = cCRN;
        this.courseNum = num;
        this.courseSection = section;
        this.courseHours = credhours;
        this.type = type;
        this.teacher = teacher;
    }

    //methods
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCRN() {
        return courseCRN;
    }
    public String getCourseNum() {
        return courseNum;
    }
    public String getCourseSection() {
        return courseSection;
    }
    public String getCourseHours() {
        return courseHours;
    }
    public String getType() {
        return type;
    }

    public String getTeacher() {
        return teacher;
    }
    
}

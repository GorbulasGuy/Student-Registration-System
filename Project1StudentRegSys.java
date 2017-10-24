package project1studentregsys;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matthew minor
 */
public class Project1StudentRegSys {

    public static void main(String[] args) throws IOException {
        //registered classes list
        List<Course> registeredClasses = new ArrayList<Course>();
        //creating a list of the couses 
        List<Course> courses = new ArrayList<Course>();
        //creating a boolean for the menu to keep running
        boolean done = false;
        //creating a string line
        String line;
//reading in the file
        try{
            //getting the file
            Scanner in = new Scanner(Paths.get("project1_input.csv"), "UTF-8");
            
            while(in.hasNext()){
               line = in.nextLine();
               String[] s = line.split(",");
               if(s.length > 8){
                   Traditional trad = new Traditional(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10]);
                   //System.out.println(trad.getCourseName() + ", " + trad.getCourseNum());
                   courses.add(trad);
               }
               else if(s.length <= 8){
                   Online on = new Online(s[0], s[1], s[2], s[3], s[4], s[5], s[6]);
                   //System.out.println(on.getCourseName() + ", " + on.getCourseNum());
                   courses.add(on);
               }
            }//end reading
        }//end try
        
        catch(Exception e){
            System.err.println(e.toString());
        }
//done reading in the file
//starting main loop
        while(done == false){
            //making a scanner 
            Scanner scan = new Scanner(System.in);
            System.out.print("1. Search Courses\n2. Register for Course\n3. View Trial Schedule\n4. Quit\n");
            String menuChoice = scan.nextLine();
            
            //if they want to search for a class
            if(menuChoice.equals("1")){
                System.out.println("Search by course number in format SS NNN (Example: CS 230): ");
                String courseSearch = scan.nextLine();
                
                for(Course c : courses){
                    Traditional tClass;
                    Online oClass;
                    String classType = c.getType();
                    //testing to see if course is traditional
                    if(classType.equals("Lecture")){
                        //cast course back into traditional
                        tClass = (Traditional) c;
                        
                        if(courseSearch.equals(c.getCourseNum())){
                            System.out.println(tClass.toString());
                        }
                    }
                    else if(classType.equals("World Wide Web") || classType.equals("Blended 51-99% online")){
                        oClass = (Online) c;
                        if(courseSearch.equals(c.getCourseNum())){
                            System.out.println(oClass.toString());
                        }
                    }
                }//end for loop
            }//end choice 1
            
            //if they want to register
            else if(menuChoice.equals("2")){
                System.out.println("Enter CRN number: ");
                String classRegFor = scan.nextLine();
                for(Course c : courses){
                    if(classRegFor.equals(c.getCourseCRN())){
                        registeredClasses.add(c);
                        System.out.println("Course added successfully!");
                    }
                }
            }//end choice 2
            
            //if they want to view their schedule
            else if(menuChoice.equals("3")){
                for(Course c : registeredClasses){
                    if(c instanceof Traditional){
                        Traditional t = (Traditional) c;
                        System.out.println(t.toString());
                    }
                    else if (c instanceof Online){
                        Online o = (Online) c;
                        System.out.println(o.toString());
                    }
                }
            }//end choice 3
            
            //if they want to quit
            else if(menuChoice.equals("4")){
                System.out.println("Thanks for using the student registration system!");
                done = true;
            }//end choice 4
            
            //if they enter something that is not an option
            else {
                System.out.println("That is not an option");
            }
        }//end main while loop
    }//end main method
}//end class
    


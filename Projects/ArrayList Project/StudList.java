import java.util.ArrayList;
import java.util.Scanner;
/**
 * ArrayList Project
 *
 * @Grace Jau
 * @version 1025
 */
public class StudList{
    ArrayList<Student>studList;
    /**
     * Constructor for objects of class StudList
     */
    public StudList(){
        studList = new ArrayList<Student>();
    }

    /**
     * comment
     */
    public void parseUserInput(String name, Student student){
        String fn = ""; String mn = ""; String ln = "";
        int i = name.indexOf(" ");
        int j = name.indexOf(" ", i+1);
        if (name.indexOf(",") == -1){
            fn = name.substring(0, i);
            j = name.indexOf(" ", i+1);
            mn = name.substring(i+1, j);
            ln = name.substring(j+1);
        }else{
            if (j == -1){
                ln = name.substring(0, i-1);
                fn = name.substring(i+1);
            }else{
                ln = name.substring(0, i-1);
                j = name.indexOf(" ", i+1);
                fn = name.substring(i+1, j);
                mn = name.substring(j+1);
            }
        }
        student.setFirstName(fn);
        student.setMiddleName(mn);
        student.setLastName(ln);
    }

    /**
     * comment
     */
    public void addStudent(String name, int num, double gpa){
        studList.add(new Student(name, num, gpa));
        parseUserInput(name, studList.get(studList.size()-1));
    }

    /**
     * comment
     */
    public void deleteStudent(int num, String ln){
        for (int i = 0; i < studList.size(); i++){
            if (studList.get(i).equals(ln)){
                studList.remove(i);
            }
        }
    }

    /**
     * comment
     */
    public void editStudentList(){

    }

    /**
     * comment
     */
    public void clearList(){
        studList.clear();
    }

    /**
     * comment
     */
    public void printAll(){
        if (studList.size()<=0){
            System.out.println("The student list is empty.");
        }else{
            for (int i = 0; i < studList.size(); i++){
                System.out.println(studList.get(i).getFullName()+"   "+studList.get(i).getStuNumber()+"   "+studList.get(i).getStuGPA());
            }
        }
    }

    /**
     * comment
     */
    public void printStudent(){

    }
}

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
        int studentExists = -1;
        for (int i = 0; i < studList.size(); i++){
            if (!ln.equals("")){
                if (studList.get(i).getLastName().equals(ln)){
                    studentExists = i;
                }
            }else{
                if (studList.get(i).getStuNumber() == num){
                    studentExists = i;
                }
            }
        }
        if (studentExists == -1){
            System.out.println("This student was not found in the student list.");
        }else{
            studList.remove(studentExists);
            System.out.println("The student has been deleted.");
        }
    }

    /**
     * comment
     */
    public void editStudentList(int num, String ln){
        Scanner in = new Scanner (System.in);
        int studentExists = -1;
        for (int i = 0; i < studList.size(); i++){
            if (!ln.equals("")){
                if (studList.get(i).getLastName().equals(ln)){
                    studentExists = i;
                }
            }else{
                if (studList.get(i).getStuNumber() == num){
                    studentExists = i;
                }
            }
        }
        if (studentExists == -1){
            System.out.println("This student was not found in the student list.");
        }else{
            Student student = studList.get(studentExists);
            for (int i = 0; i == 0; i = i){
                System.out.println("What would you like to update for this student?");
                System.out.println("1 Student name");
                System.out.println("2 Student GPA");
                System.out.println("3 Return to main menu");
                String statement = in.nextLine();
                if (statement.equals("1")){
                    System.out.println("Updated student name:");
                    String name = in.nextLine();
                    parseUserInput(name, student);
                    System.out.println("The student's name has been updated.");
                }else if (statement.equals("2")){
                    System.out.println("Updated student GPA:");
                    double gpa = in.nextDouble();
                    in.nextLine();
                    while (gpa < 0 || gpa > 5){
                        System.out.println("Please enter a number from 0 to 5.");
                        System.out.println("Updated student GPA:");
                        gpa = in.nextDouble();
                        in.nextLine();
                    }
                    if (gpa%0.01 >= 0.0050){
                        gpa += 0.01;
                    }
                    gpa -= gpa%0.01;
                    student.setStuGPA(gpa);
                    System.out.println("The student's gpa has been updated.");
                }else if (statement.equals("3")){
                    i = 1;
                }else{
                    System.out.println("That was not a valid command. Please try again.");
                }
                System.out.println();
            }
        }
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
    public void printStudent(int num, String ln){
        int studentExists = -1;
        for (int i = 0; i < studList.size(); i++){
            if (!ln.equals("")){
                if (studList.get(i).getLastName().equals(ln)){
                    studentExists = i;
                }
            }else{
                if (studList.get(i).getStuNumber() == num){
                    studentExists = i;
                }
            }
        }
        if (studentExists == -1){
            System.out.println("This student was not found in the student list.");
        }else{
            System.out.println(studList.get(studentExists).getFullName()+"   "+studList.get(studentExists).getStuNumber()+"   "+studList.get(studentExists).getStuGPA());
        }
    }

    /**
     * comment
     */
    public boolean studNumAlreadyExists(int num){
        for (int i = 0; i < studList.size(); i++){
            if (studList.get(i).getStuNumber() == num){
                return true;
            }
        }
        return false;
    }
}

import java.util.Scanner;
/**
 * ArrayList Project
 *
 * @Grace Jau
 * @version 1025
 */
public class StudListRunner
{
    public static void main(){
        StudList sl = new StudList();
        Scanner in = new Scanner (System.in);
        String statement = "";
        String name; int num; double gpa;
        while (!statement.equals("7")){
            System.out.println("Choose an option by entering the corresponding number");
            System.out.println("1 Add a student");
            System.out.println("2 Delete a student");
            System.out.println("3 Edit the list of students");
            System.out.println("4 Clear the list of students");
            System.out.println("5 Print all of the students' information");
            System.out.println("6 Print a student's information");
            System.out.println("7 Quit");
            System.out.println();
            statement = in.nextLine();
            if (statement.equals("1")){
                System.out.println("Student name:");
                name = in.nextLine();
                num = getStudentNum();
                gpa = getStudentGPA();
                sl.addStudent(name, num, gpa);
                System.out.println("The student has been added.");
            }else if (statement.equals("2")){
                int x = getNumOrString("last name");
                if (x == 0){
                    name = "";
                    num = getStudentNum();
                }else{
                    System.out.println("Student last name:");
                    name = in.nextLine();
                    num = 0;
                }
                sl.deleteStudent(num, name);
            }else if (statement.equals("3")){
                sl.editStudentList();
            }else if (statement.equals("4")){
                sl.clearList();
            }else if (statement.equals("5")){
                sl.printAll();
            }else if (statement.equals("6")){
                sl.printStudent();
            }else if (!statement.equals("7")){
                System.out.println("That was not a valid command. Please try again.");
            }
            System.out.println();
        }
        System.out.println("Exited the program.");
    }
    
    public static double getStudentGPA(){
        System.out.println("Student GPA:");
        Scanner in = new Scanner (System.in);
        double gpa = in.nextDouble();
        in.nextLine();
        if (gpa%0.01 >= 0.0050){
            gpa += 0.01;
        }
        gpa -= gpa%0.01;
        return gpa;
    }
    
    public static int getStudentNum(){
        System.out.println("Student number:");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        in.nextLine();
        while (num/1000000 != 0 || num/100000 <= 0){
             System.out.println("Please enter a six-digit number.");
             System.out.println("Student number:");
             num = in.nextInt();
             in.nextLine();
        }
        return num;
    }
    
    public static int getNumOrString(String nameOrLastName){
        while (true){
            System.out.println("Enter 0 if you would like to input the student's number.");
            System.out.println("Enter 1 if you would like to input the student's "+nameOrLastName);
            Scanner in = new Scanner (System.in);
            String s = in.nextLine();
            if (s.equals("0")){
                return 0;
            }else if (s.equals("1")){
                return 1;
            }
        }
    }
}

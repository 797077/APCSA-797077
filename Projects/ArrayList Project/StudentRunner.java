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
        while (!statement.equals("7")){
            System.out.println("Main Menu: Please enter the number of the option you would like to choose.");
            System.out.println("1. Add a student");
            System.out.println("2. Delete a student");
            System.out.println("3. Edit the list of students");
            System.out.println("4. Clear the list of students");
            System.out.println("5. Print all of the students' information");
            System.out.println("6. Print a student's information");
            System.out.println("7. Exit");
            System.out.println();
            statement = in.nextLine();
            if (statement.equals("1")){
                System.out.println("Please enter the new student's name.");
                String name = in.nextLine();
                sl.addStudent(name);
                System.out.println("The student has been added.");
            }else if (statement.equals("2")){
                sl.deleteStudent();
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
}

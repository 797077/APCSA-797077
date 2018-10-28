/**
 * ArrayList Project
 *
 * @Grace Jau
 * @version 1025
 */
public class Student
{
    /**
     * Instance variables of class Student
     */
    private String firstName;
    private String middleName;
    private String lastName;
    private int stuNumber;
    private double stuGPA;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        firstName = "";
        middleName = "";
        lastName = "";
        stuNumber = 0;
        stuGPA = 0.0;
    }

    /**
     * Student Methods
     *
     */
    public void setStuNumber(int sn)
    {
        stuNumber = sn;
    }
    public int getStuNumber()
    {
        return stuNumber;
    }
    public void setStuGPA(double sn)
    {
        stuGPA = sn;
    }
    public double getStuGPA()
    {
        return stuGPA;
    }
    public void setFirstName(String sn)
    {
        firstName = sn;
    }
    public void setMiddleName(String sn)
    {
        middleName = sn;
    }
    public void setLastName(String sn)
    {
        lastName = sn;
    }
    public String getFullName()
    {
        return lastName+", "+firstName+" "+middleName;
    }
}

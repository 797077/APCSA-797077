
/**
 * SimpleCalc
 *
 * @author (Grace Jau)
 * @version (822)
 */
public class CalculatorClass
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class CalculatorClass
     */
    public CalculatorClass()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double add(int n1, int n2)
    {
        // put your code here
        return n1 + n2;
    }
    public double subtract(int n1, int n2)
    {
        // put your code here
        return n1 - n2;
    }
    public double multiply(int n1, int n2)
    {
        // put your code here
        return n1 * n2;
    }
    public void divide(double n1, double n2)
    {
        // put your code here
        if(n2 != 0){
            System.out.println(n1 / n2);
        }
        else{
            System.out.println("answer does not exist");
        }
    }
    public int moduloDivide(int n1, int n2)
    {
        // put your code here
        return n1 % n2;
    }
}

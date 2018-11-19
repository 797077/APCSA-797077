
/**
 * SimpleCalc
 *
 * @author (Grace Jau)
 * @version (822)
 */
public class CalculatorClassRunner
{
    // instance variables - replace the example below with your own
    public static void main(){
        CalculatorClass answer = new CalculatorClass();
        System.out.println(answer.add(32, 5));
        System.out.println(answer.subtract(32, 5));
        System.out.println(answer.multiply(32, 5));
        answer.divide(32, 0);
        System.out.println(answer.moduloDivide(32, 5));
    }


}

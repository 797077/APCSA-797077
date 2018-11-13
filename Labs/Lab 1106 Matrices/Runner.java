
/**
 * Matrices Lab
 *
 * @author (Grace Jau)
 * @version (1106)
 */
public class Runner{
    public static void main(){
        GridTester gt = new GridTester();//creates new GridTester object and runs all of the methods
        gt.loadArray();
        gt.printAll();
        System.out.println(gt.findGreatest());
        System.out.println(gt.numberOfGreatest());
        System.out.println(gt.findAvg());
    }
}

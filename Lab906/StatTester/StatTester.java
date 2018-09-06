
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (Grace Jau) 
 * @version (906)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;
    
    // Constructor
    public StatTester(){
        nums = new int[100];
        
    }
    
    
    //  Methods
    public void loadArray(){
        for(int i = 0; i < 100; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){
            if(i%10==0){
                System.out.println(nums[i] + ", ");
            }
            System.out.print(nums[i] + ", ");
        }
    }
    
}

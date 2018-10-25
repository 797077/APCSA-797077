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
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){
            if((i+1)%10==0){
                System.out.println(nums[i] + ", ");
            }else{
                System.out.print(nums[i] + ", ");
            }
        }
        Arrays.sort(nums);
        System.out.println();
        for(int i = 0; i < nums.length; i++){
            if((i+1)%10==0){
                System.out.println(nums[i] + ", ");
            }else{
                System.out.print(nums[i] + ", ");
            }
        }
    }
    public int getSum(){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
        }
        return total;
    }
    public double getMean(){
        double total = getSum();
        return total/nums.length;
    }
    public double getMedian(){
        if(nums.length%2==0){
            return (double)(nums[nums.length/2]+nums[nums.length/2-1])/2;
        }else{
            return nums[nums.length/2];
        }
    }
    public void getMode(){
        int[] mode = new int[nums.length];
        int c = 0;
        int changedNums = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                if((i-changedNums)>=c){
                    if((i-changedNums)>c){
                        for(int m = 0; m < i; m++){
                            mode[m] = 0;
                        }
                        c = i-changedNums;
                    }
                    mode[i-1] = nums[i-1];
                }
                changedNums = i;
            }
        }
        if((nums.length-changedNums)>=c){
            if((nums.length-changedNums)>c){
                for(int m = 0; m < mode.length; m++){
                    mode[m] = 0;
                }
            }
            mode[nums.length-1] = nums[nums.length-1];
        }
        for(int i = 0; i < mode.length; i++){
            if(mode[i]!=0){
                System.out.print(mode[i]+", ");
            }
        }
        System.out.println();
    }
}

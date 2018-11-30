import java.util.ArrayList;
/**
 *
 *
 * @author (Grace Jau)
 * @version (1130)
 */
public class ArrayInt
{
    // instance variable
    private ArrayList<Integer>num;

    /**
     * Constructor for objects of class ArrayInts
     */
    public ArrayInt()
    {
        num = new ArrayList<Integer>();
    }

    /**
     * Takes two ArrayLists of integers and turns one ArrayList into the sum
     *
     */
    public void addNumbers(ArrayList<Integer> n1, ArrayList<Integer> n2){
        ArrayList<Integer> k1;
        ArrayList<Integer> k2;
        if (n1.size() > n2.size()){//checks to see which integer is greater
            k1 = n1;
            k2 = n2;
        }else{
            k1 = n2;
            k2 = n1;
        }
        for (int i = 0; i < k2.size() ; i++){
            int newDigit = n1.get(i) + k2.get(i);
            if (newDigit > 9){// checks to see if a digit needs to be carried to the next place value
                newDigit -= 10;
                if (i > k1.size()-2){
                    k1.add(0);
                }
                k1.set(i+1, k1.get(i+1)+1);
            }
            k1.set(i, newDigit);
        }
    }
    
    /**
     * prints the integer in the ArrayList
     *
     */
    public void printInt(){
        for (int i = num.size()-1; i >=0 ; i--){// traverses the ArrayList
            System.out.print(num.get(i));
        }
        System.out.println();
    }
    
    /**
     * takes an integer as a parameter and adds it to the ArrayList num
     *
     */
    public void addNumberToList(int n)
    {
        int i = 0;
        while (n > 0){
            if (i > num.size()-1){//checks to see if there are more digits in n than there are in the ArrayList
                num.add(n%10);
            }else{
                int newDigit = (num.get(i) + (n % 10));
                if (newDigit > 9){//checks to see if the program needs to carry a digit over to the next place value
                    newDigit -= 10;
                    if (i > num.size()-2){
                        num.add(0);
                    }
                    num.set(i+1, num.get(i+1)+1);
                }
                num.set(i, newDigit);
            }
            n /= 10;
            i++;
        }
    }
    
    /**
     * turns an integer into an ArrayList of its digits
     *
     */
    public void setListToNumber(int n)
    {
        while (n > 0){
            num.add(n % 10);
            n /= 10;
        }
    }
}

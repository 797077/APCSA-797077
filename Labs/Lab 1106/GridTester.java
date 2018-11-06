
/**
 * Matrices Lab
 *
 * @author (Grace Jau)
 * @version (1106)
 */
public class GridTester{
    int[][] grid;
    /**
     * Constructor for objects of class Matrices
     */
    public GridTester(){
        grid = new int[10][10];
    }
    
    /**
     * traverses array and sets each index to a value from 1 to 100
     */
    public void loadArray(){
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                grid[i][j] = (int)(Math.random()*100)+1;
            }
        }
    }
    
    /**
     * traverses array and prints each value in a 10x10 grid
     */
    public void printAll(){
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
    
    /**
     * traverses the array and adds each value to int sum
     */
    public int sumAll(){
        int sum = 0;
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                sum += grid[i][j];
            }
        }
        return sum;
    }
    
    /**
     * traverses the array to find the greatest value in the array
     */
    public int findGreatest(){
        int greatest = 0;
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                if (grid[i][j]>greatest){
                    greatest = grid[i][j];
                }
            }
        }
        return greatest;
    }
    
    /**
     * finds the greatest value and traverses the array to determine how many times the value exists in the array
     */
    public int numberOfGreatest(){
        int greatest = findGreatest();
        int numOfTimes = 0;
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                if (grid[i][j]==greatest){
                    numOfTimes++;
                }
            }
        }
        return numOfTimes;
    }
    
    /**
     * finds the sum of the values in the array and divides by the length of the array
     */
    public double findAvg(){
        double sum = sumAll();
        return sum/100;
    }
}

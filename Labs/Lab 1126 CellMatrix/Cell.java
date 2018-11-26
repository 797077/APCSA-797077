
/**
 * @author (Grace Jau) 
 * @version (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }
    
    public int getSum(){//traverses neighbors and returns the sum of the integer values of each neigboring cell
        int sum = 0;
        for (int i = 0; i < neighbors.length; i++){
            if (neighbors[i] != null){
                sum += neighbors[i].getInt();
            }
        }
        return sum;
    }
    
    public void addNeighbor(Cell cell){//takes a cell as a parameter and adds it to an empty spot in neighbors
        for (int i = 0; i < neighbors.length; i++){
            if (neighbors[i] == null){
                neighbors[i] = cell;
                i = neighbors.length;
            }
        }
    }
    
    public int getInt(){// returns the integer for each cell
        return x;
    }
}

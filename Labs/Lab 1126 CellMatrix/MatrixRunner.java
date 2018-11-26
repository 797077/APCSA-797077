
/**
 * 
 * 
 * @author (Grace Jau) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    //runs the methods
    public static void main(){
      CellMatrix cm = new CellMatrix(3, 4);
      cm.loadMatrix();
      cm.printMatrix();
      cm.loadNeighbors();
      System.out.println(cm.getGreatestNeighbors());
    }
}

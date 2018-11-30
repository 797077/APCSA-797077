/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testFixUnderwater(){
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
    }
  
  public static void testMirrorVerticalRToL(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.mirrorVerticalRightToLeft();
      myPic.explore();
    }
  
  public static void testMirrorHorizontal(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.mirrorHorizontal();
      myPic.explore();
    }
    
  public static void testMirrorHorizontalBToT(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.mirrorHorizontalBToT();
      myPic.explore();
    }

  public static void testMirrorDiagonal(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.mirrorDiagonal();
      myPic.explore();
  }
    
    /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.keepOnlyBlue();
      myPic.explore();
    }
  
  public static void testNegate(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.negate();
      myPic.explore();
    }
    
  public static void testGrayscale(){
      Picture myPic = new Picture("myPicture.jpg");
      myPic.explore();
      myPic.grayscale();
      myPic.explore();
    }
    
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
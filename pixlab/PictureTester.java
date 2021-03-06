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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorDiagonal()
  {
      Picture beach = new Picture("beach.jpg");
      beach.mirrorDiagonal();
      beach.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testmirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.mirrorHorizontalBotToTop();
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
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorGull()
  {
      Picture seagull = new Picture("seagull.jpg");
      seagull.mirrorSeagull();
      seagull.explore();
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
  public static void testEdgeDetection2()
  {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection2(10);
      swan.explore();
    }
  /*
   * Colin Lam's changes
   */
  public static void testKeepOnlyBlue()
  {
      Picture ilios = new Picture("ilios.jpg");
      ilios.keepOnlyBlue();
      ilios.explore();
  }
  public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      beach.negate();
      beach.explore();
  }
  public static void testGrayscale()
  {
      Picture beach = new Picture("beach.jpg");
      beach.grayscale();
      beach.explore();
  }
  public static void testFixUnderwater()
  {
      Picture water = new Picture("water.jpg");
      water.fixUnderwater();
      water.explore();
    }
  public static void testCopy()
  {
      Picture ocean = new Picture("beach.jpg");
      Picture seagull = new Picture("seagull.jpg");
      ocean.copy(seagull,233,450,233,229,317,352);
      ocean.copy(seagull,233,50,233,229,323,350);
      ocean.explore();
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
    testNegate();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testmirrorHorizontalBotToTop();
    //testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    //testCollage();
    testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
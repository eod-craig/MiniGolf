package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;
 

 public class scoredetialTest{

 @Test
   public void test() {
      Round test = new Round();
      
      int [] ArrayTest = {1,2,3,4};
      int[] Array = test.scoredetial();
      assertArrayEquals(Array, ArrayTest);
    
   }
 }
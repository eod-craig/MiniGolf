package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;
 

 public class enterScoreTest{

 @Test
   public void test() {
     Round test = new Round();
      int output = test.enterScore(3);
      assertEquals(3, output);
   }
 }
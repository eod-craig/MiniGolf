package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;
 

 public class currentScoreTest{

 @Test
   public void test() {
      Round test = new Round();
      int output = test.currentScore(3);
      assertEquals(output, 3);
      
   }
 }
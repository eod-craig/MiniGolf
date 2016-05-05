package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;
 

 public class numberOfHolesPlayedTest{

 @Test
   public void test() {
      Round test = new Round();
      int testHoles = 5;
      int output = test.numberOfHolesPlayed();
      assertEquals(testHoles, output);
   } 
 }
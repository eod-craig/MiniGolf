package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;
 

 public class numberOfHolesPlayedTest{

 @Test
   public void test() {
      Round test = new Round();
      
      int output = test.numberOfHolesPlayed(3);
      assertEquals(3, output);
   } 
 }
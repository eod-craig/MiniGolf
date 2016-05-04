package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;



public class getCourseNameTest {

   @Test
   public void test() {
      Round test = new Round();
      String output = test.getcourseName("Mini");
      assertEquals("Mini", output);
   }

}

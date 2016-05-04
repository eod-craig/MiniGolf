package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;

public class getPlayerNameTest {

   @Test
   public void test() {
      Round test = new Round();
      String output = test.getplayerName("John Doe");
      assertEquals("John Doe", output);
   }

}

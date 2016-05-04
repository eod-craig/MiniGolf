package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;

public class getTimeEndTest {

   @Test
   public void test() {
      Round test = new Round();
      String output = test.gettimeEnd("4pm");
      assertEquals("4pm", output);
   }

}

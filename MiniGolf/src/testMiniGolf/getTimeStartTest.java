package testMiniGolf;

import static org.junit.Assert.*;

import org.junit.Test;

public class getTimeStartTest {

   @Test
   public void test() {
      Round test = new Round();
      String output = test.gettimeStart("1pm");
      assertEquals("1pm", output);
   }

}

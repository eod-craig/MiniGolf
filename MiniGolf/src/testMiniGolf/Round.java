package testMiniGolf;

public class Round {
   //All properties are strings and can be convert when needed.
   //Course Name property
   private String courseName;
   public String getcourseName(String courseName)
   {
       return courseName;
   }
   
   //method 1
   public void setcourseName(String value) {
       this.courseName = value;
   }
   //Player Name Property
   private String playerName;
   public String getplayerName(String playerName) {
       return playerName;
   }
   
   //method 2
   public void setplayerName(String value) {
       this.playerName = value;
   }
   //Time the round start property
   private String timeStart;
   public String gettimeStart(String timeStart) {
       return timeStart;
   }
   
   //method 3
   public void settimeStart(String value) {
       this.timeStart = value;
   }
   //Time the round ends property
   private String timeEnd;
   public String gettimeEnd(String timeEnd) {
       return timeEnd;
   }
   
   //method 4
   public void settimeEnd(String value) {
       this.timeEnd = value;
   }
       
       public int currentScore(int score)
       {
        /*Display the user's score so far (this is the number 
         *of strokes above or below par, for the holes played so far)
          */
           
           //Display score in a custom developed messagebox.
           //Get the par value of the hole from a collection of par numbers
                  
       return score;
       }
       
       public int numberOfHolesPlayed (int holes) 
       {
           //Returns the number of completed holes in this round;
           
           //Should retrieve this value Player hole collection
           return holes;
       }
       
       //method 5
       public int  enterScore(int strokes)
       {
        /* Enter a score for the next hole.  
         *(Note the current design doesn't allow a player to skip holes, 
         * they must be played in order);  
         */
       //Enters the strokes from the user entered value to Collection.
           return strokes;
       }
       
       public int[] scoredetial(int [] Array)
       {  /*
           *Returns the array of strokes per hole.  
           *This method gets called by the final hole's swipe-station, to print 
           *out the players scorecard 
           *(which has pre-printed coupons reverse side.)
           *After this method is invoked the round object can be disposed of.
           */
           
           return Array;
       }
}

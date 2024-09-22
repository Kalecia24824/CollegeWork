import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Purpose to turn a user input into a line of string*/ 
      
      //First: Declare variables// 
      String userInput; 
      int abbrevOne; 
      int abbrevTwo; 
      int abbrevThree; 
      int abbrevFour;
      int abbrevFive; 

      
     //Print to the screen by asking the user for input// 
     System.out.println("Enter text:");
     userInput = scnr.nextLine();
     abbrevOne = userInput.indexOf("BFF");
     abbrevTwo = userInput.indexOf("IDK"); 
     abbrevThree = userInput.indexOf("JK");
     abbrevFour = userInput.indexOf("TMI");
     abbrevFive = userInput.indexOf("TTYL");
     
     //Read the text inputted by user and print to the screen//
     System.out.println("You entered: " + userInput); 
     
     //Now, we need to input five if statements for the abbreviations to determine if they exist//
      if (userInput.indexOf("BFF") >= 0) { 
         System.out.println("BFF: best friend forever");
      }
      if (userInput.indexOf("IDK") >= 0) {
         System.out.println("IDK: I don't know");
      }
      if (userInput.indexOf("JK") >= 0) {
         System.out.println("JK: just kidding");
      }
      if (userInput.indexOf("TMI") >= 0) {
         System.out.println("TMI: too much information");
      }
      if (userInput.indexOf("TTYL") >= 0) { 
         System.out.println("TTYL: talk to you later");
      }
   }
}
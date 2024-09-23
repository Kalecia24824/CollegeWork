import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);

       // Declare variables
       String userText;
       boolean isPalindrome = true;
       int startIndex = 0;
       int endIndex;

       // Get user input using nextLine()
       System.out.println("Please enter a word: ");
       userText = scnr.nextLine();
       endIndex = userText.length() - 1;

       // Create a while loop to check if the string is a palindrome
       while (startIndex < endIndex) {
           if (userText.charAt(startIndex) != userText.charAt(endIndex)) {
               isPalindrome = false;
               break;
           }
           startIndex++;
           endIndex--;
       }

       // Print the result
       if (isPalindrome) {
           System.out.println("The string is a palindrome.");
       } else {
           System.out.println("The string is not a palindrome.");
       }
   }
}

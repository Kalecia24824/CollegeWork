//Including documentation for Scanner class 
import java.util.Scanner;

public class Salary {
   public static void main(String [] args) {
     
    //declaring an the variable wage of type int  
      int wage;

      Scanner scnr = new Scanner(System.in);
      wage = scnr.nextInt();

      System.out.println("Salary is ");
      
      System.out.println(wage * 40 * 52);
   }//end of main
}//end of class
import java.util.Scanner; 

public class ContactList {
    
    //declare GLOBAL variables 
    final static int SIZE = 20; 
    
    //create a Scanner GLOBAL object 
    static Scanner scnr = new Scanner(System.in);
    
     public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     
     //declare local variable 
     int number; // the contact's phone number 
     int contactIndex; // index for the contact 
     String contactPair;//to pair the name and phone number 
     String mySearchString; 
     String myResultString; 
     
     //create the contact name  array
     String [ ] contactName = new String [SIZE]; 
     
     //create array for phone number 
     String [ ] phoneNumber = new String [SIZE];
     
     //Use a for loop 
     
     number = scnr.nextInt();
     
     for (int i = 0; i < number; i++) {
      
      contactPair = scnr.next();
      contactIndex = contactPair.indexOf(",");
      contactName[i] = contactPair.substring(0, contactIndex);
      phoneNumber[i] = contactPair.substring(contactIndex + 1);
      
     }//end of for loop 
    
    mySearchString = scnr.next(); 
   
    myResultString = 	getPhoneNumber(contactName, phoneNumber, mySearchString, number);
      
      System.out.println(myResultString);
    
   }//end of main 
   
   //Write our function defintion getPhoneNumber
   //Purpose: Given the contact name and the phone number array
    //Find the index of the specificed phone number 
    //Return type: String and Int (index of phone number associated with the contact)
    //Parameter List: nameArr, phoneNumberArr, contactName and arraySize 
    public static String getPhoneNumber (String [ ] nameArr, String [ ] phoneNumberArr, String contactName, int arraysize) {
     
     //declare local variables 
     String result = "None"; 0
     
     //Use a loop 
     for (int i = 0; i < arraysize; i++) {
      
       if (contactName.equals(nameArr[i]) ) {
         
         return phoneNumberArr[i];
          
       }//end of if loop
      
     }//end of for loop
     
     
        
       return result; 
    }//end of getPhoneNumber
}//end of class 
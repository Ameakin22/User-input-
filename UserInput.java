
package userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
   
        
        
        
        System.out.println("Please enter the following information so I can sell it for a profit!"); //This line prints out the Statement asking the user to enter information
        System.out.println("First name: "); 
        Scanner sc = new Scanner(System.in);   //This line of code is a scanner which allows the user to input an answer to the inofrmation.
        String first = sc.nextLine();  //This makes the user able to type their answer on the next line
        
     
        System.out.println("Last name: ");   
        String second = sc.nextLine();
        System.out.println("Grade: ");
        String third = sc.nextLine();  
        System.out.println("Student ID: ");
        String forth = sc.nextLine();
        
        System.out.println(" ");     //Prints a blank line between the questions and the users information
        System.out.println("Your Information: ");
        System.out.println("        First Name: "+first);    //prints First name then the users input
        System.out.println("        Last Name: "+second);
        System.out.println("        Grade: "+third);
        System.out.println("        Student ID: "+forth);
        
        
       
        
        
       
        
     
        
       
        
    }
    
}
 
        
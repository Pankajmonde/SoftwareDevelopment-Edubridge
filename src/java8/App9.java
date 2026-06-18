package java8;

 

import java.util.Scanner; 

public class App9 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String result;int ch;
        do {
        System.out.println("Welcome to Edubridge , Book Your Seats we offering Job oriented courses!!!"); 
        System.out.println("1.Software Development"); 
        System.out.println("2.Service Desk Analyst"); 
        System.out.println("3.ICO"); 
        System.out.println("4.Exit");
        System.out.println("Enter your choice:"); 
        
         ch = sc.nextInt(); 
        
        // Modern Java switch expression with arrow syntax and text blocks
         result = switch(ch) { 
            case 1 -> """
                     Course Name: Software Development
                     Duration: 6 Month
                     Fees: 1.5 lakh
                     """; 
            case 2 -> """
                     Course Name: Service Desk Analyst
                     Duration: 4 Month
                     Fees: 2000
                     """; 
            case 3 -> """
                     Course Name: ICO
                     Duration: 1 month
                     Fees: 500
                     """; 
            case 4 ->""" 
            		 
            		Exit
            			""";
            default -> "Invalid choice"; 
        };
        System.out.println("Course Details:\n" + result); // Fixed typo 'Corse'
       
         }
        
        while(ch!=4); 
        
        
    } 
}
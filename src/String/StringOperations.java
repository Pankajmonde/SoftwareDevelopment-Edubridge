package String;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- STRING MENU ----");
            
            System.out.println("1. Length");
            System.out.println("2. Concatenation");
            System.out.println("3. Lowercase");
            System.out.println("4. Uppercase");
            System.out.println("5. Reverse");
            System.out.println("6. Palindrome");
            System.out.println("7. Compare");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(choice) {

            case 1:
                System.out.println("Enter string:");
                String s1 = sc.nextLine();
                System.out.println("Length = " + s1.length());
                break;

            case 2:
                System.out.println("Enter first string:");
                String a = sc.nextLine();
                System.out.println("Enter second string:");
                String b = sc.nextLine();
                System.out.println("Concatenation = " + a.concat(b));
                break;

            case 3:
                System.out.println("Enter string:");
                String s2 = sc.nextLine();
                System.out.println("Lowercase = " + s2.toLowerCase());
                break;

            case 4:
                System.out.println("Enter string:");
                String s3 = sc.nextLine();
                System.out.println("Uppercase = " + s3.toUpperCase());
                break;

            case 5:
                System.out.println("Enter string:");
                String s4 = sc.nextLine();
                String rev = "";

                for(int i = s4.length()-1; i >= 0; i--) {
                    rev = rev + s4.charAt(i);
                }

                System.out.println("Reverse = " + rev);
                break;

            case 6:
                System.out.println("Enter string:");
                String s5 = sc.nextLine();
                String rev2 = "";

                for(int i = s5.length()-1; i >= 0; i--) {
                    rev2 = rev2 + s5.charAt(i);
                }

                if(s5.equals(rev2))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 7:
                System.out.println("Enter first string:");
                String c = sc.nextLine();
                System.out.println("Enter second string:");
                String d = sc.nextLine();

                if(c.equals(d))
                    System.out.println("Strings are equal");
                else
                    System.out.println("Strings are not equal");
               break;

            case 8:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
            }

        } while(choice != 8);

        sc.close();
    }
}
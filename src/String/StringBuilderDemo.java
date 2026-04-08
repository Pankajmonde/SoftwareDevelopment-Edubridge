package String;
import java.util.Scanner;


public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int choice;

        do {
            System.out.println("\n--- StringBuilder Menu ---");
            System.out.println("1. Append String");
            System.out.println("2. Insert String");
            System.out.println("3. Delete String");
            System.out.println("4. Replace String");
            System.out.println("5. Reverse String");
            System.out.println("6. Display String");
            System.out.println("7. Length of String");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter string to append: ");
                    String str1 = sc.nextLine();
                    sb.append(str1);
                    System.out.println("Updated String: " + sb);
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter string to insert: ");
                    String str2 = sc.nextLine();

                    if (index >= 0 && index <= sb.length()) {
                        sb.insert(index, str2);
                        System.out.println("Updated String: " + sb);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();

                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();

                    if (start >= 0 && end <= sb.length() && start < end) {
                        sb.delete(start, end);
                        System.out.println("Updated String: " + sb);
                    } else {
                        System.out.println("Invalid range!");
                    }
                    break;

                case 4:
                    System.out.print("Enter start index: ");
                    int s = sc.nextInt();

                    System.out.print("Enter end index: ");
                    int e = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter replacement string: ");
                    String rep = sc.nextLine();

                    if (s >= 0 && e <= sb.length() && s < e) {
                        sb.replace(s, e, rep);
                        System.out.println("Updated String: " + sb);
                    } else {
                        System.out.println("Invalid range!");
                    }
                    break;

                case 5:
                    sb.reverse();
                    System.out.println("Reversed String: " + sb);
                    break;

                case 6:
                    System.out.println("Current String: " + sb);
                    break;

                case 7:
                    System.out.println("Length: " + sb.length());
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
package Task;
import java.util.ArrayList;
import java.util.Scanner;

class Book {

    int id;
    String name;
    String author;
    int price;

    Book(int id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + author + "\t" + price);
    }
}

public class BookManagement{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();

                    books.add(new Book(id, name, author, price));

                    System.out.println("Book Added Successfully!");

                    break;

                case 2:

                    if (books.isEmpty()) {
                        System.out.println("No Books Available.");
                    } else {

                        System.out.println("\nID\tNAME\tAUTHOR\tPRICE");

                        for (Book b : books) {
                            b.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {

                        if (b.id == searchId) {

                            System.out.println("Book Found:");
                            b.display();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < books.size(); i++) {

                        if (books.get(i).id == deleteId) {

                            books.remove(i);

                            deleted = true;

                            System.out.println("Book Deleted Successfully.");

                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}
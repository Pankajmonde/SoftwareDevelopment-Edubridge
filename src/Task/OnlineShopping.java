
import java.util.Scanner;

class Product {

    int id;
    String name;
    int price;
    int qty;

    Product(int id, String name, int price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + price + "\t" + qty);
    }
}

public class OnlineShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product products[] = new Product[100];
        int count = 0;

        int choice;

        do {

            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Delete Product");
            System.out.println("4. Generate Bill");
            System.out.println("5. Bill Summary");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Product Name: ");
                String name = sc.next();

                System.out.print("Enter Product Price: ");
                int price = sc.nextInt();

                System.out.print("Enter Product Quantity: ");
                int qty = sc.nextInt();

                products[count] = new Product(id, name, price, qty);
                count++;

                System.out.println("Product Added Successfully");
                break;

            case 2:

                if (count == 0) {
                    System.out.println("No Products Available");
                } else {

                    System.out.println("\nID\tNAME\tPRICE\tQTY");

                    for (int i = 0; i < count; i++) {
                        products[i].display();
                    }
                }

                break;

            case 3:

                System.out.print("Enter Product ID to Delete: ");
                int deleteId = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (products[i].id == deleteId) {

                        for (int j = i; j < count - 1; j++) {
                            products[j] = products[j + 1];
                        }

                        count--;
                        found = true;

                        System.out.println("Product Deleted");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product Not Found");
                }

                break;

            case 4:

                int grandTotal = 0;

                System.out.println("\n----- BILL -----");

                for (int i = 0; i < count; i++) {

                    int total = products[i].price * products[i].qty;

                    System.out.println(
                            products[i].name + " : " +
                            products[i].price + " x " +
                            products[i].qty + " = " +
                            total);

                    grandTotal += total;
                }

                System.out.println("-------------------");
                System.out.println("Total Bill = " + grandTotal);

                break;

            case 5:

                int totalProducts = count;
                int totalAmount = 0;

                for (int i = 0; i < count; i++) {
                    totalAmount += products[i].price * products[i].qty;
                }

                System.out.println("\n----- BILL SUMMARY -----");
                System.out.println("Total Products : " + totalProducts);
                System.out.println("Total Amount   : " + totalAmount);

                break;

            case 6:

                System.out.println("Thank You For Shopping");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
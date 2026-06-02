package Task;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Price: ₹" + price +
                ", Quantity: " + quantity);
    }
}


public class Ecommerce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[10];
        int count = 0;

        double totalSales = 0;
        int totalOrders = 0;

        int choice;

        do {
            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Purchase Product");
            System.out.println("5. Calculate Inventory Value");
            System.out.println("6. Generate Order Summary");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < products.length) {

                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();

                        sc.nextLine(); // consume newline

                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Product Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Product Quantity: ");
                        int quantity = sc.nextInt();

                        products[count] = new Product(id, name, price, quantity);
                        count++;

                        System.out.println("Product Added Successfully!");
                    } else {
                        System.out.println("Inventory is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        System.out.println("\n===== PRODUCT LIST =====");
                        for (int i = 0; i < count; i++) {
                            products[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (products[i].id == searchId) {
                            System.out.println("\nProduct Found:");
                            products[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();

                    System.out.print("Enter Quantity to Purchase: ");
                    int purchaseQty = sc.nextInt();

                    boolean purchased = false;

                    for (int i = 0; i < count; i++) {

                        if (products[i].id == productId) {

                            if (products[i].quantity >= purchaseQty) {

                                double bill = products[i].price * purchaseQty;

                                products[i].quantity -= purchaseQty;

                                totalSales += bill;
                                totalOrders++;

                                System.out.println("\nPurchase Successful!");
                                System.out.println("Product Name : " + products[i].name);
                                System.out.println("Quantity     : " + purchaseQty);
                                System.out.println("Total Bill   : ₹" + bill);

                            } else {
                                System.out.println("Insufficient Stock!");
                            }

                            purchased = true;
                            break;
                        }
                    }

                    if (!purchased) {
                        System.out.println("Product Not Found!");
                    }

                    break;

                case 5:
                    double inventoryValue = 0;

                    for (int i = 0; i < count; i++) {
                        inventoryValue += products[i].price * products[i].quantity;
                    }

                    System.out.println("Total Inventory Value = ₹" + inventoryValue);
                    break;

                case 6:
                    System.out.println("\n===== ORDER SUMMARY =====");

                    System.out.println("Total Orders Placed : " + totalOrders);
                    System.out.println("Total Sales Amount  : ₹" + totalSales);

                    System.out.println("\nCurrent Product Stock:");

                    if (count == 0) {
                        System.out.println("No Products Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            products[i].display();
                        }
                    }

                    break;

                case 7:
                    System.out.println("Thank You for Using Online Shopping System!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
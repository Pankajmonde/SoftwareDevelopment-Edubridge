package Threading;


class Order {

    int orderId;
    String customerName;
    String foodItem;
    String status;

    Order(int orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.status = "Received";
    }
}

class ChefThread extends Thread {

    Order order;

    ChefThread(Order order) {
        this.order = order;
    }

    @Override
    public void run() {

        System.out.println("---------------------------------");
        System.out.println("Order Received");
        System.out.println("Order ID : " + order.orderId);
        System.out.println("Customer : " + order.customerName);
        System.out.println("Food Item : " + order.foodItem);

        order.status = "Preparing";

        System.out.println("Chef " + Thread.currentThread().getName()
                + " started preparing " + order.foodItem);

        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        order.status = "Completed";

        System.out.println("Chef " + Thread.currentThread().getName()
                + " completed Order " + order.orderId);

        System.out.println("Order Status : " + order.status);
    }
}

public class RestaurantManagement {

    public static void main(String[] args) {

        Order o1 = new Order(101, "Pankaj", "Pizza");
        Order o2 = new Order(102, "Rahul", "Burger");
        
        ChefThread c1 = new ChefThread(o1);
        ChefThread c2 = new ChefThread(o2);
      
        c1.setName("Chef-A");
        c2.setName("Chef-B");

        c1.start();
        c2.start();
        
    }
}
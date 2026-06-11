package Threading;

class Atm {

    int balance = 1000;

    
    public void deposit(String name, int amount) {

        synchronized (this) {

            balance = balance + amount;

            System.out.println(name + " deposited ₹" + amount);
            System.out.println("Balance = " + balance);
            System.out.println("Current Thread = " + Thread.currentThread().getName());
            System.out.println("--------------------------------");
        }
    }

   
    public void withdraw(String name, int amount) {

        synchronized (this) {

            if (balance >= amount) {

                balance = balance - amount;

                System.out.println(name + " withdrew ₹" + amount);
                System.out.println("Balance = " + balance);
                System.out.println("Current Thread = " + Thread.currentThread().getName());

            } else {

                System.out.println(name + " : Insufficient Balance");
            }

            System.out.println("--------------------------------");
        }
    }

   
    public void checkBalance(String name) {

        synchronized (this) {

            System.out.println(name + " checked balance");
            System.out.println("Current Balance = " + balance);
            System.out.println("Current Thread = " + Thread.currentThread().getName());
            System.out.println("--------------------------------");
        }
    }
}


class Customer1 extends Thread {

    Atm atm;

    Customer1(Atm atm) {
        this.atm = atm;
    }

    public void run() {

        atm.deposit("Sam", 2000);
        atm.withdraw("Sam", 500);
        atm.checkBalance("Sam");

    }
}


class Customer2 extends Thread {

    Atm atm;

    Customer2(Atm atm) {
        this.atm = atm;
    }

    public void run() {

        atm.deposit("John", 3000);
        atm.withdraw("John", 1000);
        atm.checkBalance("John");

    }
}

public class Test6 {

    public static void main(String[] args) {

        Atm atm = new Atm();

        Customer1 c1 = new Customer1(atm);
        Customer2 c2 = new Customer2(atm);

       

        c1.start();
        c2.start();

    }
}
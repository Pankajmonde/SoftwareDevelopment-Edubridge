package Threading;

class ATM {

    int balance = 10000;

    synchronized void deposit(int amount) {

        balance = balance + amount;

        System.out.println(Thread.currentThread().getName()
                + " Deposited: " + amount);

        System.out.println("Balance = " + balance);
    }

    synchronized void withdraw(int amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " Withdraw: " + amount);

            System.out.println("Balance = " + balance);

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " Insufficient Balance");

        }
    }

    synchronized void checkBalance() {

        System.out.println(Thread.currentThread().getName()
                + " Final Balance = " + balance);
    }
}

class Cust1 extends Thread {

    ATM atm;

    Cust1(ATM atm) {
        this.atm = atm;
    }

    public void run() {

        atm.deposit(5000);
        atm.withdraw(2000);
        atm.checkBalance();

    }
}


class Cust2 extends Thread {

    ATM atm;

    Cust2(ATM atm) {
        this.atm = atm;
    }

    public void run() {

        atm.withdraw(3000);
        atm.deposit(1000);
        atm.checkBalance();

    }
}


class Cust3 extends Thread {

    ATM atm;

    Cust3(ATM atm) {
        this.atm = atm;
    }

    public void run() {

        atm.withdraw(4000);
        atm.checkBalance();

    }
}

public class ATMDemo {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Cust1 c1 = new Cust1(atm);
        Cust2 c2 = new Cust2(atm);
        Cust3 c3 = new Cust3(atm);

        c1.setName("Customer-1");
        c2.setName("Customer-2");
        c3.setName("Customer-3");

        c1.start();
        c2.start();
        c3.start();
    }
}
package ExceptionHandling;

import java.util.Scanner;

public class Test2 {

    static public void show() throws PositiveException, NegativeException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int x = sc.nextInt();

        if (x > 0) {
            throw new PositiveException("x value is greater than 0");
        }
        else if (x < 0) {
            throw new NegativeException("x value is smaller than 0");
        }
        else {
            System.out.println("Number zero");
        }
    }

    public static void main(String[] args) {

        try {
            show();
        }
        catch (PositiveException e) {
            e.printStackTrace();
        }
        catch (NegativeException e) {
            e.printStackTrace();
        }
    }
}
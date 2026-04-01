package Loops;

import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {

        // 1 to 10
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("----10 to 1------");

        // 10 to 1
        int j = 10;

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        // Sum of numbers
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range how many numbers you want to add:");
        int n = sc.nextInt();

        int count = 1;
        int sum = 0;

        do {
            sum = sum + count;
            count++;
        } while (count <= n);

        System.out.println("sum is: " + sum);

        sc.close();
    }
}
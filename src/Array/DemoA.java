package Array;

import java.util.*;

public class DemoA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input elements
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
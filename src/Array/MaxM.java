
package Array;

public class MaxM {

    public static void main(String[] args) {

        int a[] = {100, 300, 50, 900, 200};

        int max = a[0];
        int min = a[0];

        for(int x : a) {
            if(x > max) {
                max = x;
            }
            if(x < min) {
                min = x;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

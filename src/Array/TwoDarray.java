package Array;
import java.util.Scanner;

public class TwoDarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for rows");
        int row = sc.nextInt();

        System.out.println("Enter the size for column");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        System.out.println("---------Enter Elements------------");

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("--------Print Data----------");

        for(int i=0; i<row;i++) {
            for(int j =0; j<col;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
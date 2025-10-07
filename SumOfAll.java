import java.util.Scanner;
import java.util.SortedMap;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = h.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = h.nextInt();

        int[][] Matrix = new int[rows][columns];

        //input:
        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Matrix[i][j] = h.nextInt();
            }
        }

        //output:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += Matrix[i][j];
            }
        }

        System.out.println("The sum of all the elements of the matrix is: " + sum);
    }
}

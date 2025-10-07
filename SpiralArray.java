import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        //Initialization of n and m:
        System.out.println("Enter n row: ");
        int n = h.nextInt();
        System.out.println("Enter m column: ");
        int m = h.nextInt();

        //Matrix:
        int[][] matrix = new int[n][m];


        //Input values for the matrix:
        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = h.nextInt();
            }
        }

        //Output of the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\nThe Spiral Matrix is : ");

        //Variables:
        int rowStart = 0;
        int rowEnd = n-1;
        int columnStart = 0;
        int columnEnd = m-1;

        //To print the spiral order:


    }
}

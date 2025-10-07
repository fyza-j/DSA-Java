import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = h.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = h.nextInt();

        int[][] Matrix = new int[rows][columns];

        //input:
        System.out.println("enter the values for the matrix: ");
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

        //min:
        int min = Matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (Matrix[i][j] < min) {
                    min = Matrix[i][j];
                }
            }
        }
        System.out.println("Minimum number in the matrix is: " + min);
    }
}
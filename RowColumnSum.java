import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = h.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = h.nextInt();

        int[][] matrix = new int[rows][columns];

        //input:
        System.out.println("enter values for the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = h.nextInt();
            }
        }

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        //Calculate the row sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("The sum of row " + i + " is: " + rowSum);
        }

        //Calculate the column sum
        for (int j = 0; j < columns; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("The sum of column " + j + " is: " + columnSum);
        }
    }
}

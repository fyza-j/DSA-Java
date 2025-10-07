import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = h.nextInt();
        System.out.println("Enter the number of column: ");
        int column = h.nextInt();

        int[][] Matrix = new int[row][column];

        //Input:
        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Matrix[i][j] = h.nextInt();
            }
        }

        //Output:
        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (Matrix[i][j] > max) {
                    max = Matrix[i][j];
                }
            }
        }
        System.out.println("Max number in the matrice is: " + max);
    }
}

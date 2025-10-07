import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = h.nextInt();
        System.out.println("\nEnter number of Columns: ");
        int columns = h.nextInt();

        int[][] number = new int[rows][columns];

        //input:
        System.out.println("\nEnter the numbers: ");
        //Rows Loop
        for (int i=0; i < rows; i++){
            // Columns Loop
            for (int j = 0; j < columns; j++) {
                number[i][j] = h.nextInt(); //takes input for i,j position
            }
        }

        //output:
        // Rows Loop:
        for (int i = 0; i < rows; i++) {
            // Columns Loop:
            for (int j = 0; j < columns; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number you want to find in the array: ");
        int x = h.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (number[i][j] == x) {
                    System.out.println("X is found at: " + "(" + i + ", " + j + ")");
                }
            }
        }
    }
}

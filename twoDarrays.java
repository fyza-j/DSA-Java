import java.util.Scanner;

public class twoDarrays {
    public static void main() {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter the no rows: ");
        int row = h.nextInt();

        System.out.println("Enter the no columns: ");
        int col = h.nextInt();

        int[][] arr = new int[row][col];
        System.out.print("\nEnter the elements of the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = h.nextInt();
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nEnter the value you want to find: ");
        int target = h.nextInt();
        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (target == arr[i][j]) {
                    System.out.println(
                            "\nYour target value " + target + " was found at " + "[" + i + "]" + "[" + j + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("\nYour value was not found. You're useless.");
        }
    }
}

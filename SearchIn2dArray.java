import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        int[][] array = {
                {1, 3, 4, 56},
                {56, 4, 3, 1},
                {14, 10},
                {22, 6, 10, 9, 10}
        };
        System.out.println("Array: " + Arrays.deepToString(array));

        System.out.println("Enter the element you want to find: ");
        int target = h.nextInt();
        int[] answer = search(array, target);
        System.out.println(Arrays.toString(answer));

        System.out.println(Arrays.toString(max(array)));
    }

    static int[] search(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return new int[]{max};
    }
}

import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {10, 12, 14, 15, 21}
        };
//        int target = 9;

        int length = matrix.length;
        System.out.println(length);
        int[] ans = MatrixSearch(matrix, 9);
        System.out.println(Arrays.toString(ans));
    }

    static int[] MatrixSearch(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0){
            if (matrix[row][column] == target) {
                return new int[] {row, column};
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] {-1, -1};
    }
}

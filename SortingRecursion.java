import java.util.Arrays;

public class SortingRecursion {
    public static boolean isSorted(int arr[], int index) {

        // Base case: reached the second last element
        if (index == arr.length - 1) {
            return true;
        }

        // Check current pair
        if (arr[index] <= arr[index + 1]) {
            // So far sorted → check the rest
            return isSorted(arr, index + 1);
        } else {
            // Found an out-of-order pair
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr, 0)); // should print true
    }
}

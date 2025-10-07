import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int[] array = {-18, -14, -9, -1, 0, 2, 4, 5, 6, 7, 102, 105, 900};
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Enter the number you want to find: ");
        int target = 900; // = h.nextInt();
        int ans = binarySearch(array, target);

        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while (start <= end){
            //find the middle element

            int mid = start + (end-start)/2;

            if (target < array[mid]) {
                end = mid -1;
            } else if (target > array[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

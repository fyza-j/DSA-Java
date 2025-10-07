import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int[] nums = {2, 5, 65,7,77, 23,16,2,30,98,99,31,23,3,43};
        System.out.println("List: " + Arrays.toString(nums));

        System.out.println("enter the number that you want to find: ");
        int target = h.nextInt();

        boolean answer = linearSearch(nums, target);

        System.out.println(target + " was found at index: " + answer);
    }
//    static int linearSearch(int[] array, int target){
//        if (array.length == 0) {
//            return -1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            int element = array[i];
//            if (element == target) {
//                return i;
//            }
//        }
//        return -1;
//    }

    static boolean linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {19, 34, -9, 0, 1,10, 11, -34};
        Scanner h = new Scanner(System.in);
        System.out.println("List: " + Arrays.toString(array));

        System.out.println("enter the number that you want to find: ");
        int target = h.nextInt();

        int answer = linearSearch(array, target);
        System.out.println(answer);
    }
    static int linearSearch(int[] array, int target){
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == target) {
                return array[i];
            }
        }
        return -1;
    }
}

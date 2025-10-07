import java.util.Scanner;

public class ceilingOfNumber {
    public static void main(String[] args) {
//        Scanner h = new Scanner(System.in);

        int[] arr = {1, 2, 4, 5, 6, 7, 10, 19, 20, 23, 45};

        int target = 9;

        int ans = ceilingNum(arr, target);
        System.out.println(ans);
    }

    private static int ceilingNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < mid) {
                end = mid -1;
            } else if (target > mid){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

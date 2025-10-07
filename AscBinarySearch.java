public class AscBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 66, 701, 778};
        int target = 5;
        int ans = AscendingSearch(arr, target);
        System.out.println(ans);
    }

    private static int AscendingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] < arr[start+1]) {
                System.out.println("The arrays is ascending!");
                if (target < mid) {
                    end = mid -1;
                } else {
                    start = end +1;
                }
            } else {
                if (target > mid) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 6, 5, 3, 2, 1, 0};
        int target = 5;

        int ans = search(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    public static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);

        int firstTry = OrderAgnosticBinarySearch(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return OrderAgnosticBinarySearch(arr, target, peak + 1, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because mid+1 element > mid-element
            }
        }
        // return AFTER loop ends
        return start;
    }


    public static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

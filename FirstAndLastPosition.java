public static void main(String[] args) {
    int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 9, 10};

    int[] ans = SearchRange(arr, 5);

    System.out.println("First position: " + ans[0]);
    System.out.println("Last postion: " + ans[1]);
}

public static int[] SearchRange(int[] arr, int target) {
    int[] ans = {-1, -1};

    ans[0] = FindBinarySearch(arr, target, true);
    ans[1] = FindBinarySearch(arr, target, false);


    return ans;
}

private static int FindBinarySearch(int[] arr, int target, boolean isFirst) {
    int ans = -1;
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            ans = mid;
            if (isFirst) {
                end = mid - 1; // this means, keep searching left
            } else {
                start = mid + 1; // this means keep searching right
            }
        }
    }
    return ans;
}

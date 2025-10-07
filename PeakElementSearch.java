public class PeakElementSearch {
    public static void main(String[] args) {
        int[] arr = {100, 3, 20, 4, 1, 0};
//        int peak = 0;

        int ans = peakElement(arr);
        System.out.println(ans);
    }

    private static int peakElement(int[] arr) {
        int end = arr.length -1;

        if (arr[0] >= arr[1]) {
            return 0;
        }

        for (int i = 1; i < end; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
}
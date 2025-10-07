public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {89, 0 , -9, 9, 4, 1};

        selectSort(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

    static void selectSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

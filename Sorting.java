import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Bubble Sorat:
        for (int i = 0; i < arr.length - 1; i++) { // n - 1 counter loop
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[i] > arr[i + 1]) {
                    //swap:
                    int temp = arr[j];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        // Selection Sort:
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // Insertion sort:
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            // placement:
            arr[j+ 1]  = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}

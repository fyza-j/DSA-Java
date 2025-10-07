import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        insertion(arr);   // <-- call selection, not bubble
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[i] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    //this finds the biggest number in the unsorted part and put it at the end of that part
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;    // shrinking unsorted part
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    // this finds the index of the largest element in that part
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {   // fixed: start from given 'start'
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    // this swaps two elements of the array
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

//
//
//    // your bubble() is fine, ignore it
//    static void bubble(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if (arr[j] < arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
}

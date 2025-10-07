public class sortingArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
    static void bubble(int[] arr){
        // Runt he steps each time
        for (int counter = 0; counter < arr.length; counter++) {
            // For each step, max item will at the last respective index
            for (int j = 1; j < arr.length - counter; j++) {
                /// swap if the  item is smaller than the previous one
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j-1] = temp;
            }
        }
    }
}

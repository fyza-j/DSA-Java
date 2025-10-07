import java.util.Arrays;
import java.util.Scanner;

public class practiceMinMax {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num = h.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = h.nextInt();
        }

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number is: " + max);

        int min = 1000000000;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number is: " + min);
    }
}

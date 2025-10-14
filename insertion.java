import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("\nEnter the size of the array: ");
        int size = h.nextInt();

        int[] array = new int[size];
        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = h.nextInt();
        }

        System.out.println("Original Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nEnter the target index: ");
        int targetIndex = h.nextInt();

        System.out.println("\nEnter the value");
        int value = h.nextInt();

        int[] newArray = new int[size + 1];

        for (int i = 0; i < targetIndex; i++) {
            newArray[i] = array[i];
        }

        newArray[targetIndex] = value;

        for (int i = targetIndex; i < size; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("\nNew array is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
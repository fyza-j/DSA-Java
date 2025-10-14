import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("\nEnter the array size: ");
        int size = h.nextInt();

        int[] array = new int[size];
        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = h.nextInt();
        }

        System.out.println("Before Deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter the index value you want to delete: ");
        int index = h.nextInt();

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;

        System.out.println("After deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
    }
}
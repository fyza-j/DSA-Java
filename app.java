import java.util.Scanner;

public class app {
    public static void main() {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = h.nextInt();

        int[] arr = new int[size];
        System.out.print("\nEnter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = h.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the value you want to find: ");
        int target = h.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("\nYour target value " + target + " was found at " + i);
                found = true;
            }

        }
        if (!found) {
            System.out.println("\nYour value was not found. You're useless.");
        }
    }
}
import java.util.ArrayList;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = h.nextInt();

        int[] marks = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            marks[i] = h.nextInt();
        }

        //output

        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nNumbers: " + marks[i]);
        }

        //find x
        System.out.println("Enter the number you want to find: ");
        int x = h.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("\nx found at index: " + i);
            }
        }

        int[][] array = {
                {2,8,3},
                {3,8,2},
                {8,3,2}
        };

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.println(list);
    }
}
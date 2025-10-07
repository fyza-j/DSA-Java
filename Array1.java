import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 5;
        numbers[2] = 20;
        numbers[3] = 3;
        numbers[4] = 15;

//        int[] numbers = {10, 5, 20, 3, 15};

        int max = numbers[0];

        System.out.println("The max of this array is: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}

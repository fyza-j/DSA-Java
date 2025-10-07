public class Recursion {
    public static void printNum(int n) {
        if (n == 0) { // base case
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }
    public static void printNum2(int n2) {
        if (n2 == 6) { // base case
            return;
        }
        System.out.println(n2);
        printNum2(n2 +1);
    }

    // Fibonacci:
    public static void printFib(int a, int b, int n3){
        if (n3 == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n3-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Print numbers from 6 to 1: ");
        printNum(n); // n = 6

        int n2 = 1;
        System.out.println("Print numbers from 1 to 5: ");
        printNum2(n2);

        // Fibonacci
        int a = 0, b = 1;
        int n3 = 7;
        System.out.println("Fibonacci Sequence: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFib(a, b, n3-2);
    }
}


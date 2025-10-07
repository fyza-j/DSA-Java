public class FunctionsAndMethods {
    public static void main(String[] args) {
        int a = 20, b = 10;

        swap(a, b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}

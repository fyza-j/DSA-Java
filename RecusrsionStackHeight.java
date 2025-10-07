public class RecusrsionStackHeight {
    public static int calcHeight(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return calcHeight(x, n/2) * calcHeight(x, n/2);
        } else {
            return calcHeight(x, n/2) * calcHeight(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcHeight(x, n);
        System.out.println(ans);
    }
}

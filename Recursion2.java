public class Recursion2 {
    public static int calcFactorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        }

        //So every factorial depends on the factorial of a smaller number
        //To solve this problem, solve a smaller version of the same problem first.
        //Keep breaking the number down (n - 1)
        //
        //Go all the way down to 1
        //
        //Then come back up and multiply everything.
        int factNum1 = calcFactorial(n-1);
        int factN = n * factNum1;
        return factN; // returning the actual factorial of the number n
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}

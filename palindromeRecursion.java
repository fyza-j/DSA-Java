public class palindromeRecursion {

    public static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;                   // Base case
        if (s.charAt(l) != s.charAt(r)) return false; // Mismatch
        return isPalindrome(s, l + 1, r - 1);      // Move inward
    }

    public static void main(String[] args) {
        String str1 = "abba";
        String str2 = "racecar";
        String str3 = "hello";

        System.out.println(str1 + " → " + isPalindrome(str1, 0, str1.length() - 1));
        System.out.println(str2 + " → " + isPalindrome(str2, 0, str2.length() - 1));
        System.out.println(str3 + " → " + isPalindrome(str3, 0, str3.length() - 1));
    }
}
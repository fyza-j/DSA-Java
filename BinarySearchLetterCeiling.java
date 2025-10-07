public class BinarySearchLetterCeiling {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'f', 'j', 't', 'x', 'z'};
        char target = 'g';

        char ans = letterCeiling(letters, target);
        System.out.println(ans);
    }

    private static char letterCeiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (letters[mid] == target) {
                return letters[mid];
            } else if (target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
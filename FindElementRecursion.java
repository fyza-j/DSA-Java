public class FindElementRecursion {
    public static int first = -1;
    public static int last = -1;

    public static void findElement(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
            return;
        }
        char currChar = str.charAt(index);

        if (currChar == element) {
            if (first == -1) {
                first = index;
            }
            last = index; // update last every time you see the element
        }

        findElement(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abssaaachaaeeaadaf";
        System.out.println(str);
        findElement(str, 0, 'a');
    }
}

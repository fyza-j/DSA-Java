public class RemoveDuplicateRec {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        //Base Case:
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currCHar = str.charAt(index);
        if (map[currCHar - 'a']) {
            removeDuplicates(str, index + 1, newString);
        } else {
            newString += currCHar;
            map[currCHar - 'a'] = true;
            removeDuplicates(str, index+1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        System.out.println(str);
        removeDuplicates(str, 0, "");
    }
}

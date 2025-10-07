public class subSeqRecursion {
    public static void subsequences(String str, int index, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        //to be
        subsequences(str, index +1, newString+currChar);

        //or not to be
        subsequences(str, index+1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}

/*
EXECUTION TRACE for "abc":

Call 1: subsequences("abc", 0, "")
├─ Choice 1: Include 'a' → subsequences("abc", 1, "a")
│  ├─ Choice 1: Include 'b' → subsequences("abc", 2, "ab")
│  │  ├─ Choice 1: Include 'c' → subsequences("abc", 3, "abc") → prints "abc"
│  │  └─ Choice 2: Skip 'c' → subsequences("abc", 3, "ab") → prints "ab"
│  └─ Choice 2: Skip 'b' → subsequences("abc", 2, "a")
│     ├─ Choice 1: Include 'c' → subsequences("abc", 3, "ac") → prints "ac"
│     └─ Choice 2: Skip 'c' → subsequences("abc", 3, "a") → prints "a"
└─ Choice 2: Skip 'a' → subsequences("abc", 1, "")
   ├─ Choice 1: Include 'b' → subsequences("abc", 2, "b")
   │  ├─ Choice 1: Include 'c' → subsequences("abc", 3, "bc") → prints "bc"
   │  └─ Choice 2: Skip 'c' → subsequences("abc", 3, "b") → prints "b"
   └─ Choice 2: Skip 'b' → subsequences("abc", 2, "")
      ├─ Choice 1: Include 'c' → subsequences("abc", 3, "c") → prints "c"
      └─ Choice 2: Skip 'c' → subsequences("abc", 3, "") → prints ""

Output: abc, ab, ac, a, bc, b, c, (empty string)
*/
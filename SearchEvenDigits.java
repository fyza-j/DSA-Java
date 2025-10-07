//public class SearchEvenDigits {
//    public static void main(String[] args) {
//        int[] nums = {12, 5, 3, 456, 1991, 3209, 89898, 89, 0 , 3, 7865432};
//        System.out.println(digits(nums));
//    }
//
//    static int findNumbers(int[] nums){
//        int count = 0;
//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // function to check whether a num contains even digits or not
//    static boolean even(int num){
//        int numberOfDigits = digits(num);
//        return numberOfDigits % 2 == 0;
//    }
//
////    static int digits2(int[] num){
////        if (num < 0) {
////            num = num * -1;
////        }
////        return num;
//    }
//
//    //to count number of digits
//    static int digits(int num){
//        if (num < 0) {
//            num = num * -1;
//        }
//
//        if (num == 0) {
//            return 1;
//        }
//
//        int count = 0;
//
//        while (num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
//}
//
//public void main() {
//}

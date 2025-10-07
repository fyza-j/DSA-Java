import java.util.*;

public class BitMasking {
    public static void main(String[] args) {
    Scanner h = new Scanner(System.in);

    int n = 6;
    int pos = 3;
    int bitMask = 1<<pos;
    int notBitMask = ~(bitMask);
    int oper = h.nextInt(); //update bit to 1 else update bit to 0

    // Get bit
        System.out.println("Get Bit: ");
        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero.");
        } else {
            System.out.println("Bit was one.");
        }
    // Set bit
        System.out.println("Set Bit: ");
        int newNumber = bitMask | n;
        System.out.println(newNumber);

    // Clear bit
        System.out.println("Clear Bit: ");
        newNumber = notBitMask & n;
        System.out.println(newNumber);

    // Update Bit
        System.out.println("Update Bit: ");
        if (oper == 1) {
            newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}

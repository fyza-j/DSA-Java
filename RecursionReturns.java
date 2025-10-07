public class RecursionReturns {

    // Let's trace printNum(3) with detailed explanations
    public static void printNum(int n) {
        System.out.println("→ Entering printNum(" + n + ")");

        if (n == 0) {
            System.out.println("→ Base case reached! n=0, returning immediately");
            return; // This exits the current function call
        }

        System.out.println("→ About to print: " + n);
        System.out.println(n);

        System.out.println("→ About to call printNum(" + (n-1) + ")");
        printNum(n - 1); // The program PAUSES here until this call finishes

        System.out.println("→ Back in printNum(" + n + "), finished with recursive call");
        System.out.println("→ Exiting printNum(" + n + ")");
        // Function ends here and returns to whoever called it
    }

    // Example with a function that actually returns a VALUE
    public static int factorial(int n) {
        System.out.println("→ Calculating factorial(" + n + ")");

        if (n <= 1) {
            System.out.println("→ Base case: factorial(" + n + ") = 1");
            return 1; // Returns the VALUE 1
        }

        System.out.println("→ Need to calculate: " + n + " * factorial(" + (n-1) + ")");
        int result = n * factorial(n - 1); // WAITS for factorial(n-1) to return a value
        System.out.println("→ Got result: factorial(" + n + ") = " + result);

        return result; // Returns the calculated value
    }

    public static void main(String[] args) {
        System.out.println("=== UNDERSTANDING RETURNS ===\n");

        System.out.println("1. CALL STACK for printNum(3):");
        System.out.println("Watch how the program 'stacks up' function calls...\n");
        printNum(3);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("2. CALL STACK VISUALIZATION:");
        System.out.println("Think of it like a stack of plates:\n");

        visualizeCallStack();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("3. FACTORIAL with RETURN VALUES:");
        System.out.println("See how values get passed back up:\n");

        int result = factorial(4);
        System.out.println("Final result: " + result);
    }

    public static void visualizeCallStack() {
        System.out.println("When printNum(3) runs:");
        System.out.println();

        System.out.println("CALL STACK GROWS (going down):");
        System.out.println("┌─────────────────┐");
        System.out.println("│  printNum(3)    │ ← prints '3', calls printNum(2)");
        System.out.println("├─────────────────┤");
        System.out.println("│  printNum(2)    │ ← prints '2', calls printNum(1)");
        System.out.println("├─────────────────┤");
        System.out.println("│  printNum(1)    │ ← prints '1', calls printNum(0)");
        System.out.println("├─────────────────┤");
        System.out.println("│  printNum(0)    │ ← BASE CASE! returns immediately");
        System.out.println("└─────────────────┘");
        System.out.println();

        System.out.println("CALL STACK SHRINKS (going back up):");
        System.out.println("┌─────────────────┐");
        System.out.println("│  printNum(3)    │ ← gets control back, finishes");
        System.out.println("├─────────────────┤");
        System.out.println("│  printNum(2)    │ ← gets control back, finishes");
        System.out.println("├─────────────────┤");
        System.out.println("│  printNum(1)    │ ← gets control back, finishes");
        System.out.println("└─────────────────┘");
        System.out.println();

        System.out.println("WHAT 'RETURN' MEANS:");
        System.out.println("• When printNum(0) hits 'return', it exits immediately");
        System.out.println("• Control goes back to printNum(1) right after the recursive call");
        System.out.println("• printNum(1) finishes and returns to printNum(2)");
        System.out.println("• This continues until all functions finish");
        System.out.println("• It's like unwinding a stack of plates, one by one");
    }
}

/*
DETAILED EXPLANATION OF WHAT "RETURN" DOES:

1. CALL STACK CONCEPT:
   - Every time you call a function, Java puts it on a "stack"
   - The stack keeps track of which function called which
   - When a function returns, Java goes back to the previous function

2. WHAT HAPPENS AT "return":
   - The current function immediately stops executing
   - Control goes back to the line AFTER the recursive call
   - If there's no more code after the recursive call, the function ends
   - Java then "pops" back to the previous function on the stack

3. WHY YOUR FUNCTIONS WORK:

   printNum(3):
   - Calls printNum(2), WAITS for it to finish
   - printNum(2) calls printNum(1), WAITS for it to finish
   - printNum(1) calls printNum(0), WAITS for it to finish
   - printNum(0) hits base case and returns (finishes immediately)
   - Now printNum(1) can finish and return to printNum(2)
   - Now printNum(2) can finish and return to printNum(3)
   - Finally printNum(3) finishes

4. IMPORTANT TIMING:
   - In your printNum functions, you print BEFORE the recursive call
   - So all printing happens on the "way down" the stack
   - The returns just "unwind" the stack without doing more work

   If you moved the print AFTER the recursive call:
   printNum(n-1);  // recursive call first
   System.out.println(n);  // print after

   Then it would print: 1, 2, 3 (in reverse order!)
   Because printing would happen on the "way back up" the stack

5. MEMORY MANAGEMENT:
   - Each function call uses memory for its parameters (n, n2, etc.)
   - When a function returns, that memory is freed
   - This is why recursion can cause "stack overflow" with too many calls
*/
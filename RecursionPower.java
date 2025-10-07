public class RecursionPower {
    public static int calcPower(int x, int n) {
        if (n == 0) {// Base Case 1
            return 1;
        }

        if (x == 0) {// Base Case 2
            return 0;
        }

        int xPowerNminus1 = calcPower(x, n-1);
        int xPowerN = x * xPowerNminus1;
        return xPowerN;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}


/*
DETAILED EXECUTION TRACE FOR calcPower(2, 5):

LINE-BY-LINE EXECUTION ORDER:

1. main() calls calcPower(2, 5)

2. calcPower(2, 5):
   - Check: if (n == 0) → false (5 ≠ 0)
   - Check: if (x == 0) → false (2 ≠ 0)
   - Line: int xPowerNminus1 = calcPower(x, n-1);
   - Calls calcPower(2, 4) and WAITS

3. calcPower(2, 4):
   - Check: if (n == 0) → false (4 ≠ 0)
   - Check: if (x == 0) → false (2 ≠ 0)
   - Line: int xPowerNminus1 = calcPower(x, n-1);
   - Calls calcPower(2, 3) and WAITS

4. calcPower(2, 3):
   - Check: if (n == 0) → false (3 ≠ 0)
   - Check: if (x == 0) → false (2 ≠ 0)
   - Line: int xPowerNminus1 = calcPower(x, n-1);
   - Calls calcPower(2, 2) and WAITS

5. calcPower(2, 2):
   - Check: if (n == 0) → false (2 ≠ 0)
   - Check: if (x == 0) → false (2 ≠ 0)
   - Line: int xPowerNminus1 = calcPower(x, n-1);
   - Calls calcPower(2, 1) and WAITS

6. calcPower(2, 1):
   - Check: if (n == 0) → false (1 ≠ 0)
   - Check: if (x == 0) → false (2 ≠ 0)
   - Line: int xPowerNminus1 = calcPower(x, n-1);
   - Calls calcPower(2, 0) and WAITS

7. calcPower(2, 0):
   - Check: if (n == 0) → TRUE! (0 == 0)
   - Line: return 1; → RETURNS 1

8. calcPower(2, 1): RESUMES
   - xPowerNminus1 = 1 (from calcPower(2, 0))
   - Line: int xPowerN = x * xPowerNminus1; → xPowerN = 2 * 1 = 2
   - Line: return xPowerN; → RETURNS 2

9. calcPower(2, 2): RESUMES
   - xPowerNminus1 = 2 (from calcPower(2, 1))
   - Line: int xPowerN = x * xPowerNminus1; → xPowerN = 2 * 2 = 4
   - Line: return xPowerN; → RETURNS 4

10. calcPower(2, 3): RESUMES
    - xPowerNminus1 = 4 (from calcPower(2, 2))
    - Line: int xPowerN = x * xPowerNminus1; → xPowerN = 2 * 4 = 8
    - Line: return xPowerN; → RETURNS 8

11. calcPower(2, 4): RESUMES
    - xPowerNminus1 = 8 (from calcPower(2, 3))
    - Line: int xPowerN = x * xPowerNminus1; → xPowerN = 2 * 8 = 16
    - Line: return xPowerN; → RETURNS 16

12. calcPower(2, 5): RESUMES
    - xPowerNminus1 = 16 (from calcPower(2, 4))
    - Line: int xPowerN = x * xPowerNminus1; → xPowerN = 2 * 16 = 32
    - Line: return xPowerN; → RETURNS 32

13. main(): RESUMES
    - ans = 32 (from calcPower(2, 5))
    - Line: System.out.println(ans); → PRINTS "32"

TERMINAL OUTPUT: 32

KEY INSIGHTS ABOUT THIS POWER FUNCTION:
1. It uses the mathematical fact: x^n = x * x^(n-1)
2. The base case x^0 = 1 stops the recursion
3. Each function multiplies x by the result of the smaller power
4. The final calculation builds up: 1 → 2 → 4 → 8 → 16 → 32
5. Only main() prints; all recursive calls just calculate and return values

WHY TWO BASE CASES?
- if (n == 0): Any number to power 0 is 1 (mathematical rule)
- if (x == 0): Zero to any power is 0 (prevents unnecessary recursive calls)
*/
public class HanoiRecursion {
    // MAIN:
    public static void main(String[] args) {
        int n = 3;
        towerOfhanoi(n, "Source", "Helper", "Destination");
    }
    public static void towerOfhanoi(int n, String src, String helper, String dest){

        if (n == 1) {
            System.out.println("Transer disk " + n + " from " + src + "  to " + dest);
            return;
        }
        //Step-1:
        towerOfhanoi(n-1, src, dest, helper);
        System.out.println("Transer disk " + n + " from " + src + "  to " + dest);
        towerOfhanoi(n-1, helper, src, dest);
    }
}

/*
EXECUTION TRACE for n=3:

towerOfhanoi(3, "Source", "Helper", "Destination")
│
├─ STEP 1: Move top 2 disks to Helper
│  towerOfhanoi(2, "Source", "Destination", "Helper")
│  ├─ STEP 1: Move top 1 disk to Destination
│  │  towerOfhanoi(1, "Source", "Helper", "Destination")
│  │  → "Transfer disk 1 from Source to Destination"
│  ├─ STEP 2: Move disk 2 to Helper
│  │  → "Transfer disk 2 from Source to Helper"
│  └─ STEP 3: Move disk 1 from Destination to Helper
│     towerOfhanoi(1, "Destination", "Source", "Helper")
│     → "Transfer disk 1 from Destination to Helper"
│
├─ STEP 2: Move largest disk (3) to Destination
│  → "Transfer disk 3 from Source to Destination"
│
└─ STEP 3: Move 2 disks from Helper to Destination
   towerOfhanoi(2, "Helper", "Source", "Destination")
   ├─ STEP 1: Move disk 1 to Source
   │  towerOfhanoi(1, "Helper", "Destination", "Source")
   │  → "Transfer disk 1 from Helper to Source"
   ├─ STEP 2: Move disk 2 to Destination
   │  → "Transfer disk 2 from Helper to Destination"
   └─ STEP 3: Move disk 1 to Destination
      towerOfhanoi(1, "Source", "Helper", "Destination")
      → "Transfer disk 1 from Source to Destination"

FINAL OUTPUT:
Transfer disk 1 from Source to Destination
Transfer disk 2 from Source to Helper
Transfer disk 1 from Destination to Helper
Transfer disk 3 from Source to Destination
Transfer disk 1 from Helper to Source
Transfer disk 2 from Helper to Destination
Transfer disk 1 from Source to Destination
*/

/*
THE KEY INSIGHT:
To move n disks, you need to:
1. Get the top n-1 disks out of the way (move to helper)
2. Move the bottom disk where it needs to go
3. Put those n-1 disks back on top (move from helper to destination)

Notice how the roles of src, helper, dest keep swapping!
- In step 1: dest becomes the helper for moving n-1 disks
- In step 3: src becomes the helper for moving n-1 disks

This is the beautiful recursive pattern - each smaller problem
uses the same 3-step strategy!
*/
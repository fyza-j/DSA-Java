public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},   // Person 1 has wealth = 6
                {3, 2, 1},   // Person 2 has wealth = 6
                {5, 1, 2}    // Person 3 has wealth = 8
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = column

        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;  // reset sum for each person
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // check if this person is richest so far
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

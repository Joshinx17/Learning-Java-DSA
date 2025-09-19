// Leetcode Problem: 1672. Richest Customer Wealth- https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth_LC {
    public static void main(String[] args) {
        int[][] lst = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(lst));

    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) { //can also use enhanced for-loop
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) { //can also use enhanced for-loop
                sum = sum + accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}




// Sample Solution: 

// public class MaxWealth_LC {
//     public static void main(String[] args) {
//         int[][] lst = { { 1, 2, 3 }, { 3, 2, 1 } };
//         System.out.println(maximumWealth(lst));
//     }

//     public static int maximumWealth(int[][] accounts) {
//         int maxWealth = Integer.MIN_VALUE;
//         for (int[] person : accounts) {
//             int sum = 0;
//             for (int wealth : person) {
//                 sum += wealth;
//             }
//             maxWealth = Math.max(sum, maxWealth);
//         }
//         return maxWealth;
//     }
// }


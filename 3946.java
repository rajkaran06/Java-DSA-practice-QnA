
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] free = new int[n];

        int cheapest = Integer.MAX_VALUE;

        // Calculate free items for each item
        for (int i = 0; i < n; i++) {
            cheapest = Math.min(cheapest, items[i][1]);

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    free[i]++;
                }
            }
        }

        int[] dp = new int[budget + 1];

        // 0/1 Knapsack
        for (int i = 0; i < n; i++) {
            int price = items[i][1];

            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j],
                        dp[j - price] + free[i] + 1);
            }
        }

        int ans = 0;

        // Buy remaining items at cheapest price
        for (int j = 0; j <= budget; j++) {
            ans = Math.max(ans,
                    dp[j] + (budget - j) / cheapest);
        }

        return ans;
    }
}

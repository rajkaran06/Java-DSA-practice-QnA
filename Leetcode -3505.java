
import java.util.*;

class Solution {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();

    HashMap<Integer, Integer> delayed = new HashMap<>();

    int leftSize = 0, rightSize = 0;
    long leftSum = 0, rightSum = 0;

    void prune(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty()) {
            int val = heap.peek();

            if (delayed.getOrDefault(val, 0) == 0)
                break;

            heap.poll();

            delayed.put(val, delayed.get(val) - 1);
        }
    }

    void balance() {
        while (leftSize > rightSize + 1) {
            prune(left);

            int val = left.poll();
            leftSize--;
            leftSum -= val;

            right.offer(val);
            rightSize++;
            rightSum += val;
        }

        while (leftSize < rightSize) {
            prune(right);

            int val = right.poll();
            rightSize--;
            rightSum -= val;

            left.offer(val);
            leftSize++;
            leftSum += val;
        }

        prune(left);
        prune(right);
    }

    void add(int val) {
        prune(left);

        if (left.isEmpty() || val <= left.peek()) {
            left.offer(val);
            leftSize++;
            leftSum += val;
        } else {
            right.offer(val);
            rightSize++;
            rightSum += val;
        }

        balance();
    }

    void remove(int val) {
        prune(left);
        prune(right);

        delayed.put(val, delayed.getOrDefault(val, 0) + 1);

        if (!left.isEmpty() && val <= left.peek()) {
            leftSize--;
            leftSum -= val;

            if (val == left.peek())
                prune(left);
        } else {
            rightSize--;
            rightSum -= val;

            if (!right.isEmpty() && val == right.peek())
                prune(right);
        }

        balance();
    }

    long getCost() {
        prune(left);
        prune(right);

        long median = left.peek();

        return median * leftSize - leftSum
             + rightSum - median * rightSize;
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int m = n - x + 1;

        long[] cost = new long[m];

        // First window
        for (int i = 0; i < x; i++) {
            add(nums[i]);
        }

        cost[0] = getCost();

        // Sliding window
        for (int i = x; i < n; i++) {
            remove(nums[i - x]);
            add(nums[i]);

            cost[i - x + 1] = getCost();
        }

        // DP
        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];

        for (int i = 0; i <= k; i++) {
            Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;

        for (int j = 0; j <= k; j++) {
            for (int i = 1; i <= n; i++) {

                dp[j][i] = dp[j][i - 1];

                if (j > 0 && i >= x) {
                    if (dp[j - 1][i - x] != INF) {
                        dp[j][i] = Math.min(
                            dp[j][i],
                            dp[j - 1][i - x] + cost[i - x]
                        );
                    }
                }
            }
        }

        return dp[k][n];
    }
}

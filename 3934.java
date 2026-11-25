
import java.util.*;

class Solution {

    static final long MOD1 = 1000000007;
    static final long MOD2 = 998244353;
    static final long BASE = 233;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        long[] h1 = new long[n + 1];
        long[] h2 = new long[n + 1];

        long[] p1 = new long[n + 1];
        long[] p2 = new long[n + 1];

        p1[0] = 1;
        p2[0] = 1;

        for (int i = 0; i < n; i++) {
            p1[i + 1] = p1[i] * BASE % MOD1;
            p2[i + 1] = p2[i] * BASE % MOD2;

            h1[i + 1] = (h1[i] * BASE + nums[i]) % MOD1;
            h2[i + 1] = (h2[i] * BASE + nums[i]) % MOD2;
        }

        int left = 1, right = n;
        int ans = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (check(mid, n, h1, h2, p1, p2)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    boolean check(int len, int n, long[] h1, long[] h2,
                  long[] p1, long[] p2) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = len; i <= n; i++) {

            long a = (h1[i] - h1[i - len] * p1[len] % MOD1 + MOD1) % MOD1;

            long b = (h2[i] - h2[i - len] * p2[len] % MOD2 + MOD2) % MOD2;

            long hash = (a << 32) | b;

            map.put(hash, map.getOrDefault(hash, 0) + 1);
        }

        for (int count : map.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}

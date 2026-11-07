
import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        int[] ans = new int[m];

        PriorityQueue<int[]> idle = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            if (a[1] != b[1])
                return a[1] - b[1];
            return a[2] - b[2];
        });

        for (int i = 0; i < n; i++) {
            idle.offer(new int[]{servers[i], i});
        }

        for (int j = 0; j < m; j++) {
            while (!busy.isEmpty() && busy.peek()[0] <= j) {
                int[] s = busy.poll();
                idle.offer(new int[]{s[1], s[2]});
            }

            if (!idle.isEmpty()) {
                int[] s = idle.poll();

                ans[j] = s[1];

                busy.offer(new int[]{
                    j + tasks[j], s[0], s[1]
                });
            } else {
                int[] s = busy.poll();

                ans[j] = s[2];

                busy.offer(new int[]{
                    s[0] + tasks[j], s[1], s[2]
                });
            }
        }

        return ans;
    }
}

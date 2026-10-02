class Solution {
    public int findRadius(int[] houses, int[] heater) {
        Arrays.sort(heater);
        int ans = 0;
        for(int house:houses){
            int left = 0;
            int right = heater.length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(heater[mid]<house) left = mid+1;
                else right = mid-1;

            }
            int dist1 = Integer.MAX_VALUE;
             int dist2 = Integer.MAX_VALUE;
             if(left<heater.length) dist1 = heater[left] - house;
             if(right>=0) dist2 = house-heater[right];
             int closest = Math.min(dist1,dist2);
             ans = Math.max(ans,closest);
        }
        return ans;
    }

}

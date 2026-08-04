public class maxrowsum {
    public static void main(String[] args) {
        int [][] arr= {{6,4,5,3,6},{5,4,6,7,1},{3,6,5,7,9}};
        int maxSum = Integer.MIN_VALUE;
        int row =-1;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j = 0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum= sum;
                row = i;
            }
        }
        System.out.println(row+" "+maxSum);
    }
}

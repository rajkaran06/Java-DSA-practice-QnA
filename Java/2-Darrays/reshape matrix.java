class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows=nums.length;
        int columns = nums[0].length;
        if((rows*columns)!=(r*c)) return nums;
        int [][] result = new int [r][c];
        int rowNumber = 0;
        int colNumber = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[rowNumber][colNumber]=nums[i][j];
                colNumber++;
                if(colNumber==c){
                    colNumber =0;
                    rowNumber++;
                }
            }
        }
        return result; 
    }
}

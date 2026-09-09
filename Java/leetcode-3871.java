class Solution {
    public long countCommas(long n) {
        long ans =0;
        long power = 1000; //kyuki 1000 hi vo phle no. h jisme sbse phle cooma aayega usse phle koi comma wala no. nhi 

        while(power <= n){
            ans +=n-power +1;//dry rum to understand
            power*= 1000;// Because every new comma comes after another 3 digits.
        }
        return ans;
    }
}

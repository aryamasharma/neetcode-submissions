class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //int[] left = new int[n];
        //int[] right = new int[n];
        boolean[] hasGreater = new boolean[n];

        int maxIndex = 0;
        int maxDiff = 0;

       hasGreater[n- 1] = false;

        for(int i = n - 2; i >= 0 ; i--){
            if(prices[i + 1] > prices[i]){
                hasGreater[i] = true;
            }else{
                hasGreater[i] = hasGreater[i+1];
            }
        }

        int minSoFar = prices[0];

        for(int i = 0; i < n; i++){
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }
            
            int difference = prices[i] - minSoFar;
            if (difference > maxDiff) {
                maxDiff = difference;
            }
        }

        return maxDiff;
    }
}

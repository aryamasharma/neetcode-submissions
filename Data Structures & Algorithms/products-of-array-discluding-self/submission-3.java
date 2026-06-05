class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // eg: [1,2,3,0,4]
        int[] res = new int[n]; // [0,0,0,24,0]
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1; //nothing to the left of first index [1,0,0,0,0]
        suff[n-1] = 1; //nothing to the right of last index [0,0,0,0,1]

        for(int i = 1; i < n; i++){
            pref[i] = nums[i-1]*pref[i-1]; //[1,1,2,6,0]
        }

        for(int i = n - 2; i >= 0; i--){
            suff[i] = nums[i+1]*suff[i+1]; //[0,0,0,4,1]
        }

        for(int i = 0; i < n; i++){
            res[i] = pref[i] * suff[i];
        }

        return res;
    }
}  

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            pairs.put(nums[i],i);
        }
        
        for(int i = 0; i < nums.length; i++){
            int y = target - nums[i];
            if(pairs.containsKey(y) && pairs.get(y) != i){
                return new int[] {i, pairs.get(y)};
            }
        }

        return new int[] {-1,-1};
    }
}

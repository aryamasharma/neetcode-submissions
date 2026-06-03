class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int reqNum = target - nums[i];
            if(map.get(reqNum) != null && map.get(reqNum) != i ){
                index[0] = map.get(reqNum);
                index[1] = i;
            }

            map.put(nums[i],i);
        }
        return index;
    }
}

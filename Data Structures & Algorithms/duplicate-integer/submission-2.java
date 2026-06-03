class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numHash = new HashSet<Integer>();

        for(int num: nums){
            if(!numHash.add(num)) return true;
        }
        return false;
    }
}
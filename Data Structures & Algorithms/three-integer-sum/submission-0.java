class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<List<Integer>>();

        Arrays.sort(nums);

        for(int leftPointer = 0; leftPointer < nums.length - 2; leftPointer++){
            int leftNum = nums[leftPointer];

            int middlePointer = leftPointer + 1;
            int rightPointer = nums.length - 1;

            while(middlePointer < rightPointer){
                int middleNum = nums[middlePointer];
                int rightNum = nums[rightPointer];

                int sum = leftNum + middleNum + rightNum;

                if(sum == 0){
                    triplets.add(Arrays.asList(leftNum, middleNum, rightNum));
                    middlePointer++;
                    rightPointer--;
                }else if(sum < 0){
                    middlePointer++;
                }else{
                    rightPointer--;
                }
            }
        }

        return new ArrayList<>(triplets);
    }
}

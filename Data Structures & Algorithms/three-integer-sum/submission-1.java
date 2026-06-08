class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int leftPointer = 0; leftPointer < nums.length - 2; leftPointer++){
            int leftNum = nums[leftPointer];

            if(leftPointer > 0 && leftNum == nums[leftPointer - 1]){
                continue;
            }

            int middlePointer = leftPointer + 1;
            int rightPointer = nums.length - 1;

            while(middlePointer < rightPointer){
                int middleNum = nums[middlePointer];
                int rightNum = nums[rightPointer];

                int sum = leftNum + middleNum + rightNum;

                if(sum == 0){
                    res.add(Arrays.asList(leftNum, middleNum, rightNum));
                    middlePointer++;
                    rightPointer--;

                    while (middlePointer < rightPointer && nums[middlePointer] == nums[middlePointer - 1]) {
                        middlePointer++;
                    }
                }else if(sum < 0){
                    middlePointer++;
                }else{
                    rightPointer--;
                }
            }
        }

        return res;
    }
}

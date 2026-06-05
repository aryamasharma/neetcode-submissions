class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for(int num: nums){
            set.add(num);
        }

        int longestSequence = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                if(currentStreak > longestSequence){
                    longestSequence = currentStreak;
                }
            }
        }

        return longestSequence;
    }
}

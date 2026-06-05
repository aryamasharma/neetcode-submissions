class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i); //(NUMBER, INDEX)
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int currNumber = entry.getKey();
            int currIndex = entry.getValue();
            int reqNumber = target - currNumber;

            if(map.containsKey(reqNumber) && map.get(reqNumber) != currIndex){
                int nextIndex = map.get(reqNumber);
                if(currIndex > nextIndex){
                    return new int[]{nextIndex + 1, currIndex + 1};
                }else{
                    return new int[]{currIndex + 1, nextIndex + 1};
                }
                
            }
        }

        return new int[]{};
    }
}

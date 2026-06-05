class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        

        for(int num : nums){
            int value = map.getOrDefault(num,0) + 1;
            map.put(num, value);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        int[] result = new int[k];

        for(int i = 0; i< k; i++){
            result[i] = queue.poll()[1];
        }

        return result;
    }
}

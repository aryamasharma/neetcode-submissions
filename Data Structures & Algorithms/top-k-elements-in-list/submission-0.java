class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for(int num : nums){
            frequency.putIfAbsent(num, 0);
            int count = frequency.get(num);
            count += 1;
            frequency.put(num, count);       
            }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            queue.add(new int[]{entry.getValue(), entry.getKey()});

            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k ; i++){
            result[i] = queue.poll()[1];
        }

        return result;
        }


    }

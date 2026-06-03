class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()){
            return false;
       }

       HashMap<Character, Integer> map = new HashMap<>();

       for(char c: s.toCharArray()){
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                int count = map.get(c);
                map.put(c,count+1);
            }
       }

        for(char c: t.toCharArray()){
            if(map.get(c) == null){
                return false;
            }else{
                int count = map.get(c);
                map.put(c, count-1);

                if(map.get(c) < 0){
                    return false;
                }

            }
        }

        return true;

    }
}

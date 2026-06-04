class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();

        for(String str: strs){
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String codeWord = new String(sorted);

            map.computeIfAbsent(codeWord, k -> new ArrayList<>()).add(str);
        }
        
        List<List<String>> listOfLists = new ArrayList<>(map.values());
        return listOfLists;
    }
}

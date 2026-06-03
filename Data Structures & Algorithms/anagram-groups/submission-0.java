class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String word : strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            groups.putIfAbsent(sortedString, new ArrayList<>());
            groups.get(sortedString).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}

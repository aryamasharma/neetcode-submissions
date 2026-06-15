class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;

        char[] characters = s.toCharArray();
        HashSet<Character> isUnique = new HashSet<Character>();

        for(int right = 0; right < s.length(); right++){
            while(isUnique.contains(characters[right])){
                isUnique.remove(characters[left]);
                left++;
            }

            isUnique.add(characters[right]);
            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;

        
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] scharArray = s.toCharArray();
        char[] tcharArray = t.toCharArray();
        Arrays.sort(scharArray);
        Arrays.sort(tcharArray);

        String sorteds = new String(scharArray);
        String sortedt = new String(tcharArray);
        return sorteds.equalsIgnoreCase(sortedt);
    }
}

class Solution {

    public String encode(List<String> strs) {
        String rtrnString = "";
        for(String str: strs){
            rtrnString += str.length() + "#" + str;
        }

        System.out.println(rtrnString);
        return rtrnString;

    }

    public List<String> decode(String str) {
        List<String> original = new ArrayList<String>();
        char[] chars = str.toCharArray();
        String newString = "";

        int i = 0;

        while(i < chars.length){
            int j = i;

            while(chars[j] != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length; 

            original.add(str.substring(i,j));

            i = j;
        }

        return original;
    }
}

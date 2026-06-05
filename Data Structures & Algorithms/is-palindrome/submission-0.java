class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] characters = s.toCharArray();
        String forwardS = "";
        String backwardS =  "";

        for(Character c : characters){
            if(Character.isLetter(c) || Character.isDigit(c)){
                forwardS += c;
            }
        }


        for(int i = s.length() - 1 ; i >= 0; i--){
            Character c = characters[i];
            if(Character.isLetter(c) || Character.isDigit(c)){
                backwardS += c;
            }
        }

        if(forwardS.equals(backwardS)) return true;

        return false;
        
    }
}

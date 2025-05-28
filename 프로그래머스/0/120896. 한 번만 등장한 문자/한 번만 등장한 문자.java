class Solution {
    public String solution(String s) {
        int[] count = new int[26]; 
       
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);          
            int index = ch - 'a';           
            count[index]++; 
        }

        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(count[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        char chars[] = my_string.toCharArray();
        
        for(int i = c-1; i < my_string.length(); i+=m){            
            sb.append(chars[i]);
        }
        
        return sb.toString();
    }
}
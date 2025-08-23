import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        String[] str = new String[n];
        
        for(int i = 0; i < n; i++) {
            str[i] = my_string.substring(i);
        }
        
        Arrays.sort(str);
        
        return str;
    }
}
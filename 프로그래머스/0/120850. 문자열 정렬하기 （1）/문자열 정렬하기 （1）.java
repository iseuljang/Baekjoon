import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                list.add(Character.getNumericValue(c)); 
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
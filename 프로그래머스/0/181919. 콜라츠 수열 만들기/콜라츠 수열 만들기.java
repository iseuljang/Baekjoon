import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(true) {
            list.add(n);
            if(n == 1) break; 
            if(n % 2 == 0) {
                n /= 2;
            }else {
                n = 3 * n + 1;
            }
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
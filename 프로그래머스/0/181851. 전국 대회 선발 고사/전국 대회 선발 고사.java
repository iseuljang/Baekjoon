import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>(); 
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                map.put(rank[i], i); 
            }
        }
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        int a = map.get(keys.get(0));
        int b = map.get(keys.get(1));
        int c = map.get(keys.get(2));
        
        return 10000 * a + 100 * b + c;
    }
}
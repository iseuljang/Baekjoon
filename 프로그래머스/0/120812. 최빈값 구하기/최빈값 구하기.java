import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = Collections.max(map.values());

        int mode = -1;
        int count = 0;
        for(int key : map.keySet()) {
            if(map.get(key) == maxCount) {
                mode = key;
                count++;
            }
        }

        if(count > 1) return -1;
        return mode;
    }
}
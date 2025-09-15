import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        int[] sorted = emergency.clone();
        Arrays.sort(sorted); 
        
        for(int i = 0; i < n; i++) {
            int rank = n - i; 
            
            for(int j = 0; j < n; j++) {
                if(emergency[j] == sorted[i]) {
                    answer[j] = rank;
                    break;
                }
            }
        }
        
        return answer;
    }
}
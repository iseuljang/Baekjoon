import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numList = new ArrayList<>();
        for(String str : intStrs){
            String numStr = str.substring(s,s+l);
            int num = Integer.parseInt(numStr);
            if(num > k){
                numList.add(num);
            }            
        }
                
        int[] answer = new int[numList.size()];
        for(int i = 0; i < numList.size(); i++){
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}
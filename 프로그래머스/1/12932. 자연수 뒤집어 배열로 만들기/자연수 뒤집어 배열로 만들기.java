import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> digits = new ArrayList<>();
        
        while(n > 0) {
            digits.add((int)(n % 10)); 
            n /= 10;
        }
        
        int[] answer = new int[digits.size()];
        for(int i = 0; i < digits.size(); i++) {
            answer[i] = digits.get(i);
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for(int start = -1000; start <= 1000; start++) {
            int sum = 0;
            for(int i = 0; i < num; i++) {
                sum += (start + i);
            }
            
            if(sum == total) {
                for(int i = 0; i < num; i++) {
                    answer[i] = start + i;
                }
                break;
            }
        }
        
        return answer;
    }
}
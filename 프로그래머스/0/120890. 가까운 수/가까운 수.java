class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = 99;

        for(int i = 0; i < array.length; i++) {
            int diff = array[i] - n;
            if(diff < 0) {
                diff = -diff; 
            }
            if(diff < minDiff || (diff == minDiff && array[i] < answer)) {
                minDiff = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}
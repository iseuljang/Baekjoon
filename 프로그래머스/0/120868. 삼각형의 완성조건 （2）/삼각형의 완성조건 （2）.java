class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        int answer = 0;

        for(int c = max + 1; c < a + b; c++) {
            answer++;
        }

        for(int c = max - min + 1; c <= max; c++) {
            answer++;
        }

        return answer;
    }
}
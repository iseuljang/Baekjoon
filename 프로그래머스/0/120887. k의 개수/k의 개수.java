class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k + '0'); 

        for(int n = i; n <= j; n++) {
            String numStr = String.valueOf(n);
            for(char c : numStr.toCharArray()) {
                if(c == target) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
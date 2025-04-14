class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < numLog.length; i++) {
            int j = numLog[i] - numLog[i - 1];
            if(j == 1) {
                answer.append("w");
            }else if (j == -1) {
                answer.append("s");
            }else if (j == 10) {
                answer.append("d");
            }else if (j == -10) {
                answer.append("a");
            }
        }
        return answer.toString();
    }
}
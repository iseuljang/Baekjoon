class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int secondLast = num_list[len - 2];
        
        int newNum = 0;
        if(last > secondLast) {
            newNum = last - secondLast;
        }else {
            newNum = last * 2;
        }
        
        int[] answer = new int[len + 1];
        for(int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        answer[len] = newNum;

        return answer;
    }
}
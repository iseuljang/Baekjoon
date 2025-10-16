class Solution {
    public int solution(int n) {
        int a = 6;
        int b = n;

        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int c = a;
        int d = (6 * n) / c; 
        int answer = d / 6;    

        return answer;
    }
}
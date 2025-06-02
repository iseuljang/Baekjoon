class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[strArr.length];

        for(String str : strArr) {
            count[str.length()]++;
        }

        int max = 0;
        for(int c : count) {
            if(c > max) {
                max = c;
            }
        }

        return max;
    }
}
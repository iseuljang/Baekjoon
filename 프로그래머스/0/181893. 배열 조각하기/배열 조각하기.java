import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for(int i = 0; i < query.length; i++) {
            int idx = query[i];
            if(i % 2 == 0) {
                end = start + idx + 1;
            }else {
                start = start + idx;
            }
        }

        return Arrays.copyOfRange(arr, start, end);
    }
}
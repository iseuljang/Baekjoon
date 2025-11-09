import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = (n == 1) ? 0 : a;
        int end = (n == 2) ? num_list.length - 1 : b;

        if(n == 4) {
            int size = (end - start) / c + 1;
            int[] result = new int[size];
            int idx = 0;
            for(int i = start; i <= end; i += c) {
                result[idx++] = num_list[i];
            }
            return result;
        }

        return Arrays.copyOfRange(num_list, start, end + 1);
    }
}
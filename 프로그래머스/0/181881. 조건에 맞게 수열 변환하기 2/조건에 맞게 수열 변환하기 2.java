import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            boolean changed = false; 

            for(int i = 0; i < arr.length; i++) {
                int old = arr[i]; 

                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }

                if(arr[i] != old) changed = true; 
            }

            if(!changed) break; 
            count++;
        }

        return count;
    }
}
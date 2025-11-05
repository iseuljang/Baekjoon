class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7]; 
        int[] dice = {a, b, c, d};
        
        for(int num : dice) {
            count[num]++;
        }

        int size = 0; 
        for(int i = 1; i <= 6; i++) {
            if(count[i] > 0) size++;
        }

        if(size == 1) {
            for(int i = 1; i <= 6; i++) {
                if(count[i] == 4) return 1111 * i;
            }
        }

        if(size == 2) {
            int p = 0, q = 0;
            boolean isThreeOne = false;
            for(int i = 1; i <= 6; i++) {
                if(count[i] == 3) { p = i; isThreeOne = true; }
                else if(count[i] == 1) q = i;
            }
            if(isThreeOne) {
                return (int) Math.pow(10 * p + q, 2);
            }

            int[] pair = new int[2];
            int idx = 0;
            for(int i = 1; i <= 6; i++) {
                if(count[i] == 2) pair[idx++] = i;
            }
            int p2 = pair[0], q2 = pair[1];
            return (p2 + q2) * Math.abs(p2 - q2);
        }

        if(size == 3) {
            int p = 0;
            int[] others = new int[2];
            int idx = 0;
            for(int i = 1; i <= 6; i++) {
                if(count[i] == 2) p = i;
                else if(count[i] == 1) others[idx++] = i;
            }
            return others[0] * others[1];
        }

        if(size == 4) {
            for(int i = 1; i <= 6; i++) {
                if(count[i] == 1) return i; 
            }
        }

        return 0; 
    }
}
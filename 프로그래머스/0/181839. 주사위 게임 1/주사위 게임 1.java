class Solution {
    public int solution(int a, int b) {
        boolean aOdd = a % 2 != 0;
        boolean bOdd = b % 2 != 0;
        
        if(aOdd && bOdd) { 
            return a * a + b * b;
        }else if(aOdd || bOdd) { 
            return 2 * (a + b);
        }else { 
            return Math.abs(a - b);
        }
    }
}
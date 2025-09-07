import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] bArr = before.toCharArray();
        char[] aArr = after.toCharArray();
        
        Arrays.sort(bArr);
        Arrays.sort(aArr);
        
        return Arrays.equals(bArr, aArr) ? 1 : 0;
    }
}
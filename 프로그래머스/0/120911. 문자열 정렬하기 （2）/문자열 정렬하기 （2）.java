import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String low = my_string.toLowerCase();
        char[] chars = low.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
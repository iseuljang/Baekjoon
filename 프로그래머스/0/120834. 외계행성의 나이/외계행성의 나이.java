class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            sb.append((char)('a' + (str.charAt(i) - '0')));
        }
        
        return sb.toString();
    }
}
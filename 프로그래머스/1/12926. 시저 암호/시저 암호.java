class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == ' ') {          
                answer.append(' ');
                continue;
            }
            
            if(c >= 'A' && c <= 'Z') { 
                char moved = (char)((c - 'A' + n) % 26 + 'A');
                answer.append(moved);
            }else if(c >= 'a' && c <= 'z') { 
                char moved = (char)((c - 'a' + n) % 26 + 'a');
                answer.append(moved);
            }
        }
        return answer.toString();
    }
}
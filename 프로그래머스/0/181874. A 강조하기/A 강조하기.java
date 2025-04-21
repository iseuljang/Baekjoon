class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(c == 'a'){
                answer.append('A');
            }else if(Character.isUpperCase(c) && c != 'A'){
                answer.append(Character.toLowerCase(c));
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
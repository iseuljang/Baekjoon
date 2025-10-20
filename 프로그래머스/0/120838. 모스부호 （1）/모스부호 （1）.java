class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        String[] letters = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String code : letters) {
            for(int i = 0; i < morse.length; i++) {
                if(morse[i].equals(code)) {
                    sb.append((char) ('a' + i));
                    break;
                }
            }
        }

        return sb.toString();
    }
}
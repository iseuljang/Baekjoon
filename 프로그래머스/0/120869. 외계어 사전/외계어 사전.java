import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] spellChars = String.join("", spell).toCharArray();
        Arrays.sort(spellChars);
        String sortedSpell = new String(spellChars);

        for(String word : dic) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);

            if(sortedSpell.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}
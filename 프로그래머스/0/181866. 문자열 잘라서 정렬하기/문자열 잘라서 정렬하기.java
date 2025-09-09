import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");

        List<String> list = new ArrayList<>();
        for(String s : splitArr) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }

        Collections.sort(list);

        return list.toArray(new String[0]);
    }
}
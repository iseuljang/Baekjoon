class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ "); 
        int x = 0;   
        int num = 0; 

        for(String term : terms) {
            if(term.contains("x")) {
                if(term.equals("x")) {
                    x += 1;
                }else {
                    x += Integer.parseInt(term.replace("x", ""));
                }
            }else {
                num += Integer.parseInt(term);
            }
        }

        if(x != 0 && num != 0) {
            return (x == 1 ? "x" : x + "x") + " + " + num;
        }else if(x != 0) {
            return x == 1 ? "x" : x + "x";
        }else {
            return String.valueOf(num);
        }
    }
}
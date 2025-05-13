class Solution {
    public int solution(int hp) {
        int one = hp / 5;         
        hp %= 5;                      

        int two = hp / 3;         
        hp %= 3;                      

        int three = hp;             

        return one + two + three;
    }
}
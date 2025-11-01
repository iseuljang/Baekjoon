class Solution {
    public int solution(int balls, int share) {
        double result = 1;

        for(int i = 1; i <= share; i++) {
            result = result * (balls - i + 1) / i;
        }

        return (int)result;
    }
}
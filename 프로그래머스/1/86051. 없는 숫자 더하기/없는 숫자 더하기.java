class Solution {
    public int solution(int[] numbers) {
        int total = 45;  
        int sum = 0;
        
        for(int n : numbers) {
            sum += n;
        }
        
        return total - sum;
    }
}
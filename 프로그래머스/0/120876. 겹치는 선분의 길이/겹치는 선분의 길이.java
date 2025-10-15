class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201]; 
        int answer = 0;

        for(int[] line : lines) {
            int start = line[0];
            int end = line[1];
            for(int i = start; i < end; i++) { 
                arr[i + 100]++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 2) answer++;
        }

        return answer;
    }
}
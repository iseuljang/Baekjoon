class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len-1-i; j++){
                int a = Math.abs(numlist[j] - n);
                int b = Math.abs(numlist[j+1] - n);
                
                if(a > b || (a == b && numlist[j] < numlist[j+1])){
                    int temp = numlist[j];
                    numlist[j] = numlist[j+1];
                    numlist[j+1] = temp;                    
                }
            }
        }
        
        return numlist;
    }
}
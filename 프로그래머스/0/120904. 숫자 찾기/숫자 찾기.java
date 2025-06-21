class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        String strK = String.valueOf(k);
        if(n.indexOf(strK) != -1){
            return n.indexOf(strK) + 1;
        }else{
            return -1;   
        }        
    }
}
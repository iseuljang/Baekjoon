class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            return 1;
        }else if(arr1.length == arr2.length){
            int num1 = 0;
            int num2 = 0;
            for(int a1 : arr1){
                num1 += a1;
            }
            for(int a2 : arr2){
                num2 += a2;
            }
            if(num1 > num2){
                return 1;
            }else if(num1 < num2){
                return -1;
            }else{
                return 0;
            }
        }else{
            return -1;
        }
    }
}
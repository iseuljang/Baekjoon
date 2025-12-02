class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hall = new int[k];   
        int size = 0;              

        for(int i = 0; i < score.length; i++) {
            if(size < k) {
                hall[size] = score[i];
                size++;
            }else {
                int minIndex = 0;
                for(int j = 1; j < k; j++) {
                    if(hall[j] < hall[minIndex]) {
                        minIndex = j;
                    }
                }
                if(score[i] > hall[minIndex]) {
                    hall[minIndex] = score[i];
                }
            }

            for(int a = 0; a < size; a++) {
                for(int b = a + 1; b < size; b++) {
                    if(hall[a] > hall[b]) {
                        int temp = hall[a];
                        hall[a] = hall[b];
                        hall[b] = temp;
                    }
                }
            }
            answer[i] = hall[0];
        }
        return answer;
    }
}
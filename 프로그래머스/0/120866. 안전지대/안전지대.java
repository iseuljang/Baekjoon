class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] range = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    for(int x = i-1; x <= i+1; x++){
                        for(int y = j-1; y <= j+1; y++){
                            if(x >= 0 && y >= 0 && x < n && y < n){
                                range[x][y] = 1;
                            }                            
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(range[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
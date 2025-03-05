import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        boolean[][] arr = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String str = in.next();
            for(int j = 0; j < M; j++) {
                arr[i][j] = (str.charAt(j) == 'W');
            }
        }

        int min = 64;
        for(int x = 0; x <= N - 8; x++) {
            for(int y = 0; y <= M - 8; y++) {
                int count = 0;
                boolean TF = arr[x][y];

                for(int i = x; i < x + 8; i++) {
                    for(int j = y; j < y + 8; j++) {
                        if(arr[i][j] != TF) count++;
                        TF = !TF;
                    }
                    TF = !TF;
                }

                min = Math.min(min, Math.min(count, 64 - count));
            }
        }
        System.out.println(min);
    }
}
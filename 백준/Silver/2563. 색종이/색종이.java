import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[101][101];
        int total = 0;
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            for(int i = x; i < x + 10; i++)
                for(int j = y; j < y + 10; j++)
                    if(!arr[i][j]) { arr[i][j] = true; total++; }
        }
        System.out.print(total);
    }
}
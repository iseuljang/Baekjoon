import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();

        int[] coins = {25, 10, 5, 1}; // 동전 단위 (쿼터, 다임, 니켈, 페니)

        while (t-- > 0) {
            int c = Integer.parseInt(br.readLine());
            for (int coin : coins) {
                sb.append(c / coin).append(" ");
                c %= coin;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}